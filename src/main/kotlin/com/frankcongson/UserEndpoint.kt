package com.frankcongson

import com.google.gson.Gson
import spark.Spark.get
import spark.Spark.post

class UserEndpoint {

    private val userService = UserService()

    init {
        endpoints()
    }

    private fun endpoints() {
        post("/users") { req, res ->

            res.type("application/json")
            val user = Gson().fromJson(req.body(), User::class.java)
            userService.addUser(user)
            Gson().toJson(StandardResponse(status = StatusResponse.SUCCESS, message = null, data = null))
        }

        get("/users") { req, res ->
            res.type("application/json")
            Gson().toJson(StandardResponse(status = StatusResponse.SUCCESS, message = null, data = Gson().toJsonTree(userService.getUsers())))
        }
    }
}

package com.frankcongson

import spark.Spark.get

class HelloWorldEndpoint {

    init {
        endpoints()
    }

    private fun endpoints() {
        get("/hello") { req, res -> "Hello, world" }
        get("/hello/:name") { req, res -> "Hello, ${req.params(":name")}" }
    }
}

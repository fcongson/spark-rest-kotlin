package com.frankcongson

import spark.Spark.get

fun main(args: Array<String>) {
    get("/hello") { req, res -> "Hello, world" }
    get("/hello/:name") { req, res -> "Hello, ${req.params(":name")}" }
}

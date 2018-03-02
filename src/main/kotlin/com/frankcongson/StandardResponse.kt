package com.frankcongson

import com.google.gson.JsonElement

data class StandardResponse(
        val status: StatusResponse,
        val message: String?,
        val data: JsonElement?
) {

}

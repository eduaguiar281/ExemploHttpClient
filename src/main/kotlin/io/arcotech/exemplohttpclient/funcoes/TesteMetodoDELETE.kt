package io.arcotech.exemplohttpclient.funcoes

import io.ktor.client.request.*
import io.ktor.client.statement.*

suspend fun TesteMetodoDELETE(id: Long){
    val client = CreateHttpClient()
    val httpResponse:HttpResponse = client.delete("http://localhost:8080/perguntas/$id")
    println(httpResponse.status)

}
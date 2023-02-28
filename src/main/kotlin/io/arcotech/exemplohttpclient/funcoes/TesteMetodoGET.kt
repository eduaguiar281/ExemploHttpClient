package io.arcotech.exemplohttpclient.funcoes

import io.arcotech.exemplohttpclient.dtos.Content
import io.arcotech.exemplohttpclient.dtos.PerguntaView
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

suspend fun TesteMetodoGET(){
    val client = CreateHttpClient()
    val response: HttpResponse = client.get("http://localhost:8080/perguntas")
    val stringBody: String = response.body()
    val conteudo: Content<PerguntaView> = response.body()

    println(response.status)
    println(stringBody)
    println(conteudo)
}






package io.arcotech.exemplohttpclient.funcoes

import io.arcotech.exemplohttpclient.dtos.Content
import io.arcotech.exemplohttpclient.dtos.PerguntaView
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

suspend fun TesteMetodoGET(){
    val client = HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                prettyPrint = true
                isLenient = true
            })
        }
    }
    val response: HttpResponse = client.get("http://localhost:8080/perguntas")
    val stringBody: String = response.body()
    val conteudo: Content<PerguntaView> = response.body()

    println(response.status)
    println(stringBody)
    println(conteudo)
}




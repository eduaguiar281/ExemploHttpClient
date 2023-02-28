package io.arcotech.exemplohttpclient.funcoes

import io.arcotech.exemplohttpclient.dtos.NivelPergunta
import io.arcotech.exemplohttpclient.dtos.NovaPerguntaForm
import io.arcotech.exemplohttpclient.dtos.PerguntaView
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

suspend fun TesteMetodoPOST(){
    val client = CreateHttpClient()
    val novaPergunta = NovaPerguntaForm(
        "Quanto é 4 + 4",
        NivelPergunta.BASICO,
        "Matemática",
        "Eduardo"
    )
    val response : HttpResponse = client.post("http://localhost:8080/perguntas"){
        contentType(ContentType.Application.Json)
        setBody(novaPergunta)
    }
    println(response.status)
    val perguntaView: PerguntaView = response.body()
    println(perguntaView)
    println(response.headers.get("Location"))
}
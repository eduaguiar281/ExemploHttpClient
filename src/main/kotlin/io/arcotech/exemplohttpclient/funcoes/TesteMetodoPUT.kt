package io.arcotech.exemplohttpclient.funcoes

import io.arcotech.exemplohttpclient.dtos.AlteraPerguntaForm
import io.arcotech.exemplohttpclient.dtos.PerguntaView
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

suspend fun TesteMetodoPUT(pergunta: PerguntaView){
    val client = CreateHttpClient()
    val alteraPergunta = AlteraPerguntaForm(
        pergunta.id,
        "Quanto é 5 x 5",
        pergunta.nivelPergunta,
        pergunta.categoria,
        "Edileuza"
    )
    val response : HttpResponse = client.put("http://localhost:8080/perguntas"){
        contentType(ContentType.Application.Json)
        setBody(alteraPergunta)
    }
    println(response.status)
    val perguntaView: PerguntaView = response.body()
    println(perguntaView)

}
package io.arcotech.exemplohttpclient.dtos

import kotlinx.serialization.Serializable

@Serializable
data class AlteraPerguntaForm (
    val id: Long,
    val pergunta: String,
    val nivelPergunta: NivelPergunta,
    val categoria: String? = null,
    val autor: String? = null
)

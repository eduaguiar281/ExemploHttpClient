package io.arcotech.exemplohttpclient.dtos

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class PerguntaView (
    val id: Long?,
    val pergunta: String,
    val nivelPergunta: NivelPergunta,
    val categoria: String? = null,
    val autor: String? = null,
    val dataHoraCadastro: LocalDateTime
)
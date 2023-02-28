package io.arcotech.exemplohttpclient

import io.arcotech.exemplohttpclient.funcoes.TesteMetodoGETById
import io.arcotech.exemplohttpclient.funcoes.TesteMetodoPOST
import io.arcotech.exemplohttpclient.funcoes.TesteMetodoPUT

suspend fun main() {
    val perguntaView = TesteMetodoGETById(12)
    TesteMetodoPUT(perguntaView)

}
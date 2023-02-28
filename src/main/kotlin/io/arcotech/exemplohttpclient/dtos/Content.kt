package io.arcotech.exemplohttpclient.dtos

import kotlinx.serialization.Serializable

@Serializable
data class Content<T>(val content: List<T>)

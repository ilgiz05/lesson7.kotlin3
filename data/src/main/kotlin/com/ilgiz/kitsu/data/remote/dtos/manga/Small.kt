package com.ilgiz.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.ilgiz.kitsu.domain.models.manga.SmallModel

data class Small(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun Small.toDomain() = SmallModel(width, height)
package com.ilgiz.kitsu.data.remote.apiservices

import com.ilgiz.kitsu.data.remote.dtos.auth.AuthDto
import com.ilgiz.kitsu.data.remote.dtos.auth.TokenDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationApiService {
    @POST("token")
    suspend fun authenticate(
        @Body authDto: AuthDto
    ): TokenDto

}
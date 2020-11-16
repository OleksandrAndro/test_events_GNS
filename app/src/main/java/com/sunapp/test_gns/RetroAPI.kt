package com.sunapp.test_gns

import retrofit2.Call
import retrofit2.http.GET

interface RetroAPI {

    @GET("events")

    fun getEvents() : Call<List<GitEvent>>
}
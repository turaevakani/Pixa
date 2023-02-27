package com.geektech.pixa

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {
    @GET("api/")
    fun getImages(@Query("key") key: String="33857110-1b28bb88a032444ccfd4adf76",
    @Query("q") pictureWord: String,
    @Query("per_page") perPage: Int=3,
    @Query("page") page: Int): Call<PixaModel>
}
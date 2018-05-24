package com.candytake.candycity.network

import com.candytake.candycity.bean.PostBean
import retrofit2.Call
import retrofit2.http.GET

interface WpService {

    @GET("posts")
    fun listPosts(): Call<List<PostBean>>
}
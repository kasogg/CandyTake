package com.candytake.candycity.network

import com.candytake.candycity.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServiceFactory private constructor() {
    private val wpService: WpService
    private val BASE_URL = "http://candytake.com/wp-json/wp/v2/"

    private object Holder {
        val INSTANCE = ServiceFactory()
    }

    companion object {
        fun getWpService(): WpService {
            return Holder.INSTANCE.wpService
        }
    }

    init {
        val okHttpClient = OkHttpClient().newBuilder()
                .addInterceptor(HttpLoggingInterceptor().setLevel(
                        if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
                        else HttpLoggingInterceptor.Level.NONE
                ))
                .build()

        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()

        wpService = retrofit.create(WpService::class.java)
    }

}
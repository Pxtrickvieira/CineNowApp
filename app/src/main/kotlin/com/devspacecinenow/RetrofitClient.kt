package com.devspacecinenow

import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL: String = "https://api.themoviedb.org/3/movie/"

object RetrofitClient {

    private val httpClient: OkHttpClient
        get() {
            val clienteBuilder = OkHttpClient.Builder()
            val token = BuildConfig.API_KEY

            clienteBuilder.addInterceptor { chain ->
                val original: Request = chain.request()
                val requestBuilder: Request.Builder = original.newBuilder()
                    .header("Authorization", "Bearer $token")
                val request: Request = requestBuilder.build()
                chain. proceed(request)
            }
            return clienteBuilder.build()

        }

    val retrofitInstance: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(httpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


}
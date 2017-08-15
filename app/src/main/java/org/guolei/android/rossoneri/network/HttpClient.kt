package org.guolei.android.rossoneri.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by mountain on 2017/08/02.
 */
object HttpClient {
    val retrofit: Retrofit
    get() = Retrofit.Builder()
            .baseUrl("https://api.dribbble.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
}
package org.guolei.android.rossoneri.network

import org.guolei.android.rossoneri.model.Shot
import retrofit2.http.Query
import retrofit2.Callback
import retrofit2.http.GET
import io.reactivex.Observable

/**
 * Created by mountain on 2017/08/02.
 */
interface ShotApi {

    @GET("$API_VERSION/shots/?access_token=$ACCESS_TOKEN&per_page=24")
    fun fetchShots(@Query("list") type: String, @Query("page") page: Int): Observable<List<Shot>>

    enum class Type private constructor(key: String) {
        ANIMATED("animated"),
        ATTACHMENTS("attachments"),
        DEBUTS("debuts"),
        PLAYOFFS("playoffs"),
        REBOUNDS("rebounds"),
        TEAMS("teams");

        var key: String
            internal set

        init {
            this.key = key
        }
    }

    companion object {
        const val  API_VERSION = "v1"
        const val  ACCESS_TOKEN = "67f7f46ae24ee28dac71ee61f97f2fb665f31fca2f9c4ff0dac49836011b3a32"
    }
}
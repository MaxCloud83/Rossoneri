package org.guolei.android.rossoneri.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by mountain on 2017/08/02.
 */
class Artist:Serializable {
    var id:Int = 0

    var name:String? = null

    @SerializedName("avatar_url")
    var avatarUrl:String? = null

    var location:String? = null

    @SerializedName("followers_count")
    var followersCount:Int = 0

    @SerializedName("followings_count")
    var followingsCount:Int = 0

    @SerializedName("comments_received_count")
    var commentsReceivedCount:Int = 0

    @SerializedName("likes_received_count")
    var likesReceivedCount:Int = 0

    @SerializedName("shots_count")
    var shotsCount:Int = 0
}
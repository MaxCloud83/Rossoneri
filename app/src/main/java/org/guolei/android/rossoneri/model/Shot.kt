package org.guolei.android.rossoneri.model

import android.provider.MediaStore
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by mountain on 2017/08/02.
 */
class Shot :Serializable {
    var id:Int = 0

    var title:String? = null

    @SerializedName("likes_count")
    var likesCount:Int = 0

    @SerializedName("views_count")
    var viewsCount:Int = 0

    @SerializedName("comments_count")
    var commentCount:Int = 0

    var description:String? = null

    @SerializedName("images")
    var image:Image? = null

    @SerializedName("user")
    var artlist:Artist? = null
}
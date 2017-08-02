package org.guolei.android.rossoneri.page

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import org.guolei.android.rossoneri.R
import org.guolei.android.rossoneri.model.Shot
import org.guolei.android.rossoneri.network.HttpClient
import org.guolei.android.rossoneri.network.ShotApi

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(" '金' > '愛' = " + ("金" > "愛"))
        println(" '愛' > '金' = " + ("愛" > "金"))

        println(" '金' > '愛' = " + ("金" > '愛'.toString()))
        println(" '愛' > '金' = " + ("愛" > '金'.toString()))

        println(" '金' > '愛' = " + ('金'.toString() > '愛'.toString()))
        println(" '愛' > '金' = " + ('愛'.toString() > '金'.toString()))

        //Test
        HttpClient.retrofit.create(ShotApi::class.java)
                .fetchShots(ShotApi.Type.ANIMATED.key, 1)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe( object : Observer<List<Shot>> {
                    override fun onNext(t: List<Shot>) {
                        Log.d("通信 -> ", "成功");

                    }

                    override fun onError(e: Throwable) {
                        Log.d("通信 -> ", "失敗" + e.toString())
                    }

                    override fun onComplete() {
                        Log.d("通信 -> ", "onComplete")
                    }

                    override fun onSubscribe(d: Disposable) {

                    }

                })

    }
}

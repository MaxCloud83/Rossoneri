package org.guolei.android.rossoneri.page

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.guolei.android.rossoneri.R

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

    }
}

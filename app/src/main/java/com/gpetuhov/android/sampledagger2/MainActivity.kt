package com.gpetuhov.android.sampledagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

// MainActivity just holds MainFragment
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

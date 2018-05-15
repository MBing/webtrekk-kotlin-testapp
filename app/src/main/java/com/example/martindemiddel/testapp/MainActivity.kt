package com.example.martindemiddel.testapp

import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.os.Bundle

import com.webtrekk.webtrekksdk.Webtrekk

class MainActivity : AppCompatActivity() {
    private lateinit var webtrekk: Webtrekk

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webtrekk = Webtrekk.getInstance()
        webtrekk.initWebtrekk(application)
        Log.i("Track init", "tracking is initialized")
    }

    override fun onStart() {
        super.onStart()
        webtrekk.track()
        Log.i("Track is made", "tracking is happening")
    }
}

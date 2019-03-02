package com.kusumi.katsumi.gokutranslator.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.kusumi.katsumi.gokutranslator.R

class InfoActivity(): AppCompatActivity() {
    private val TAG: String = this::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: start InfoActivity")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
    }
}
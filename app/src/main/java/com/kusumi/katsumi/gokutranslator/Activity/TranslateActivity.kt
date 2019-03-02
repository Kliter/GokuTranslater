package com.kusumi.katsumi.gokutranslator.Activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.kusumi.katsumi.gokutranslator.R
import com.kusumi.katsumi.gokutranslator.Util.StringUtil

class TranslateActivity(): AppCompatActivity() {
    private val TAG = this::class.java.toString()

    //widgets
    private lateinit var etTranslate: EditText
    private lateinit var btnTranslate: Button
    private lateinit var tvTranslate: TextView
    private lateinit var ivInfo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: start TranslateActivity")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translate)

        init()
    }

    private fun init() {
        Log.d(TAG, "init")

        etTranslate = findViewById(R.id.etTranslate)
        btnTranslate = findViewById(R.id.btnTranslate)
        tvTranslate = findViewById(R.id.tvTranslated)
        ivInfo = findViewById(R.id.info)

        ivInfo.setOnClickListener{
            Log.d(TAG, "onClick: ivInfo")

            // Prevent repeated push.
            ivInfo.isEnabled = false
            Handler().postDelayed({ivInfo.isEnabled = true}, 500)

            val intent: Intent = Intent(applicationContext, InfoActivity::class.java)
            startActivity(intent)
        }

        btnTranslate.setOnClickListener{
            Log.d(TAG, "onClick: btnTranslate")

            val translatedString: String = StringUtil.translate(etTranslate.text.toString())
            tvTranslate.text = translatedString
        }
    }


}

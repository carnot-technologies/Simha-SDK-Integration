package com.carnot.simhasdkintegration

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.carnot.lib.traclytics.activities.SplashActivity

class MainActivity : Activity() {

     val INTENT_APP_SOURCE = "app-source"
     val INTENT_PACKAGE_NAME = "package-name"
     val INTENT_API_KEY = "apikey"
     val INTENT_PHONE = "phone"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, SplashActivity::class.java).apply {
            putExtra(INTENT_APP_SOURCE, "akshaya-agri")
            putExtra(INTENT_PACKAGE_NAME, "akshaya.agri")
            putExtra(INTENT_API_KEY, "f47ef9dc16ff4605a881a39dc7c4086a") // API-key used to call Carnot Simha api's
            putExtra(INTENT_PHONE, "1234567890") // mobile number provided by user
        })
    }

}
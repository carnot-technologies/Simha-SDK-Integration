package com.carnot.traclytics

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.carnot.lib.traclytics.activities.SplashActivity
import com.carnot.lib.traclytics.activities.newScreens.Settings.LogoutForLib
import com.carnot.lib.traclytics.activities.newScreens.Settings.SettingsActivity
import com.google.firebase.installations.FirebaseInstallations
import io.reactivex.disposables.Disposable
import l.h

class MainActivity : Activity() {

     val INTENT_APP_SOURCE = "app-source"
     val INTENT_PACKAGE_NAME = "package-name"
     val INTENT_API_KEY = "apikey"
     val INTENT_PHONE = "phone"

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        startActivity(Intent(this, SplashActivity::class.java).apply {
//            putExtra(INTENT_APP_SOURCE, "akshaya-agri")
//            putExtra(INTENT_PACKAGE_NAME, "akshaya.agri")
//            putExtra(INTENT_API_KEY, "f47ef9dc16ff4605a881a39dc7c4086a") // API-key used to call Carnot Simha api's
//            putExtra(INTENT_PHONE, "8956739110")
//            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);// mobile number provided by user
//        })
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogoutForLib.performLogoutFromSettings(this, object: h {
            override fun onSubscribe(disposable: Disposable?) {
                super.onSubscribe(disposable)
            }
            override fun onNext(o: Any?) {
                super.onNext(o)
            }

            override fun onComplete() {
                super.onComplete()
                startSDK()
            }
            override fun onError(e: Throwable?) {
                super.onError(e)
            }
        })

//        startSDK()

    }

    private fun startSDK() {
        Toast.makeText(this,"Logout Done.", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, SplashActivity::class.java).apply {
            putExtra(INTENT_APP_SOURCE, "akshaya-agri")
            putExtra(INTENT_PACKAGE_NAME, "akshaya.agri")
            putExtra(INTENT_API_KEY, "f47ef9dc16ff4605a881a39dc7c4086a") // API-key used to call Carnot Simha api's
            putExtra(INTENT_PHONE, "8956739110")
        })
    }

}
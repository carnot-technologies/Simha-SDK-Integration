package com.carnot.traclytics

import com.carnot.lib.traclytics.MyApplication
import timber.log.Timber

class MyApp : MyApplication() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}
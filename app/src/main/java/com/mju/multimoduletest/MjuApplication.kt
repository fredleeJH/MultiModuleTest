package com.mju.multimoduletest

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MjuApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
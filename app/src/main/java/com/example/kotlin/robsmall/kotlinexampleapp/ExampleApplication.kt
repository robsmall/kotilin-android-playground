package com.example.kotlin.robsmall.kotlinexampleapp

import android.app.Application
import butterknife.ButterKnife

class ExampleApplication : Application() {
  override fun onCreate() {
    super.onCreate()
    ButterKnife.setDebug(BuildConfig.DEBUG)
  }
}

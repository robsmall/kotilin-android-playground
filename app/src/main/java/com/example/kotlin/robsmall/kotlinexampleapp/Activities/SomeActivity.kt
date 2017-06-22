package com.example.kotlin.robsmall.kotlinexampleapp.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import butterknife.ButterKnife
import com.example.kotlin.robsmall.kotlinexampleapp.R

/**
 * Lets come up with something to do with this...
 */
class SomeActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.some_activity)
    ButterKnife.bind(this)
  }
}

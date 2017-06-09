package com.example.kotlin.robsmall.kotlinexampleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class MainActivity : AppCompatActivity() {
  @BindView(R.id.sample_button) lateinit var sampleButton: TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    ButterKnife.bind(this)

    sampleButton.text = "Toast to me!"
  }

  @OnClick(R.id.sample_button)
  fun onSampleClick() {
    Toast.makeText(this, "Button clicked, w00t!", Toast.LENGTH_SHORT).show()
  }
}

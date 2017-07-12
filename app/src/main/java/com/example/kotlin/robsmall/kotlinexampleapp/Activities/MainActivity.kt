package com.example.kotlin.robsmall.kotlinexampleapp.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.example.kotlin.robsmall.kotlinexampleapp.R

class MainActivity : AppCompatActivity() {
  @BindView(R.id.sample_button) lateinit var sampleButton: Button

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    ButterKnife.bind(this)
    sampleButton.text = "To infinity, and beyond!"
  }

  @OnClick(R.id.sample_button)
  fun onSampleButtonClick() {
    Toast.makeText(this, "Button clicked, w00t!\nGoing to new Activity.", Toast.LENGTH_SHORT).show()

    val params = mutableMapOf(
        INTENT_MESSAGE_PARAM to "O HAI!"
    )

    val intent = Intent(SomeActivityIntent(params))
    startActivity(intent)
  }
}

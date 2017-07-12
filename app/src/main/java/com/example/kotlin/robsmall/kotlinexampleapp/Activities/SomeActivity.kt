package com.example.kotlin.robsmall.kotlinexampleapp.Activities

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.example.kotlin.robsmall.kotlinexampleapp.R

/**
 * SomeActivity Intent creation to add any amount of params from a map.
 *
 * This could be done easier by just serializing using Gson... but what is the fun in that when we
 * are playing around with the language!
 */
const val INTENT_MESSAGE_PARAM = "intent.message"

fun Context.SomeActivityIntent(params: Map<String, String>): Intent {
  return Intent(this, SomeActivity::class.java).apply {
    for (param in params) {
      putExtra(param.key, param.value)
    }
  }
}

/**
 * Lets come up with something to do with this...
 */
class SomeActivity : AppCompatActivity() {
  @BindView(R.id.message_text) lateinit var messageText: TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.some_activity)
    ButterKnife.bind(this)
    setUpActivity()
  }

  /** Set up the activity's state.*/
  private fun setUpActivity() {
    // Use the safe call, which will just return null for the whole call stream. We could use "!!"
    // instead if we would rather throw a NPE.
    supportActionBar?.setDisplayHomeAsUpEnabled(true)

    // Wow, this is pretty crazy. No need to call getInent here to get the intent object?
    // TODO: What is going on here? Look into it when you have internet!
    val message = intent.getStringExtra(INTENT_MESSAGE_PARAM)
    messageText.setText(message)
  }

  override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
    android.R.id.home -> consume { finish() }
    else -> super.onOptionsItemSelected(item)
  }

  /** Function that consumes the passed in function {@code func} and returns {@code true}. */
  inline fun consume(func: () -> Unit): Boolean {
    func()
    return true
  }
}

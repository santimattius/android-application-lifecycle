package io.github.santimattius.android.application.lifecycle.activities

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity

abstract class BaseActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "${this::class.simpleName} onCreate: Activity created")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "${this::class.simpleName} onStart: Activity started")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "${this::class.simpleName} onResume: Activity resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "${this::class.simpleName} onPause: Activity paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "${this::class.simpleName} onStop: Activity stopped")
    }

    companion object {
        private const val TAG = "BaseActivity"
    }
}
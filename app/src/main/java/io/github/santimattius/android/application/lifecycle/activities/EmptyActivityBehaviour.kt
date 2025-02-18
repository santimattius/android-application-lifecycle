package io.github.santimattius.android.application.lifecycle.activities

import android.app.Activity
import android.util.Log
import io.github.santimattius.android.application.lifecycle.composite.ActivityBehaviour
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class EmptyActivityBehaviour : ActivityBehaviour {
    override fun onStart(activity: Activity) {
        //simulate min 100ms delay
        runBlocking { delay(100) }
        Log.d(this::class.simpleName, "onStart: ${activity::class.simpleName} started")
    }
}

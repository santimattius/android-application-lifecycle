package io.github.santimattius.android.application.lifecycle.activities

import android.app.Activity
import android.util.Log
import io.github.santimattius.android.application.lifecycle.composite.ActivityBehaviour

class ActivityBlocker : ActivityBehaviour {
    override fun onStart(activity: Activity) {
        Log.d(this::class.simpleName, "onStart: ${activity::class.simpleName} started")
        Thread.sleep(2000)
    }
}
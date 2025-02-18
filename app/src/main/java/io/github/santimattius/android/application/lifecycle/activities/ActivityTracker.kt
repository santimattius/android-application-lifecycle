package io.github.santimattius.android.application.lifecycle.activities

import android.app.Activity
import android.util.Log
import io.github.santimattius.android.application.lifecycle.composite.ActivityBehaviour

class ActivityTracker : ActivityBehaviour {
    override fun onStart(activity: Activity) {
        Log.d(this::class.simpleName, "onStart: ${activity::class.simpleName} started")
    }

    override fun onResume(activity: Activity) {
        Log.d(this::class.simpleName, "onResume: ${activity::class.simpleName} resumed")
    }

    override fun onPause(activity: Activity) {
        Log.d(this::class.simpleName, "onPause: ${activity::class.simpleName} paused")
    }

    override fun onStop(activity: Activity) {
        Log.d(this::class.simpleName, "onStop: ${activity::class.simpleName} stopped")
    }

    override fun onDestroy(activity: Activity) {
        Log.d(this::class.simpleName, "onDestroy: ${activity::class.simpleName} destroyed")
    }
}
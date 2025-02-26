package io.github.santimattius.android.application.lifecycle.callbacks

import android.app.Activity
import android.util.Log
import io.github.santimattius.app.lifecycle.core.DefaultActivityLifecycleCallbacks

class MyActivityLifecycleCallbacks : DefaultActivityLifecycleCallbacks {

    override fun onActivityStarted(activity: Activity) {
        super.onActivityStarted(activity)
        Log.d(this::class.simpleName, "onActivityStarted: ${activity::class.simpleName} started")
    }

    override fun onActivityResumed(activity: Activity) {
        super.onActivityResumed(activity)
        Log.d(this::class.simpleName, "onActivityResumed: ${activity::class.simpleName} resumed")
    }
}
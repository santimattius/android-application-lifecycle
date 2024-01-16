package io.github.santimattius.android.application.lifecycle

import android.app.Activity
import android.util.Log
import io.github.santimattius.app.lifecycle.core.ApplicationLifecycle

class MyAppLifecycle : ApplicationLifecycle() {
    override fun onAppForeground(activity: Activity) {
        Log.d(this::class.simpleName, "onAppForeground: Application resumed")
    }

    override fun onAppBackground(activity: Activity) {
        Log.d(this::class.simpleName, "onAppBackground: Application paused")
    }
}
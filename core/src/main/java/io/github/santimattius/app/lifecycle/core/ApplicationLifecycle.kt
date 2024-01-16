package io.github.santimattius.app.lifecycle.core

import android.app.Activity

abstract class ApplicationLifecycle : DefaultActivityLifecycleCallbacks {

    private var numStarted = 0

    override fun onActivityStarted(activity: Activity) {
        if (numStarted == 0) {
            onAppForeground(activity)
        }
        numStarted += 1
    }

    override fun onActivityStopped(activity: Activity) {
        numStarted -= 1
        if (numStarted == 0) {
            onAppBackground(activity)
        }
    }

    abstract fun onAppForeground(activity: Activity)

    abstract fun onAppBackground(activity: Activity)
}
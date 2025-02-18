package io.github.santimattius.android.application.lifecycle.callbacks

import android.app.Activity
import io.github.santimattius.app.lifecycle.core.DefaultActivityLifecycleCallbacks

class MyActivityLifecycleCallbacks : DefaultActivityLifecycleCallbacks {

    override fun onActivityStarted(activity: Activity) {
        super.onActivityStarted(activity)

    }
}
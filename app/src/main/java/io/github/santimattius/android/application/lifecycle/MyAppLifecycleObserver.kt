package io.github.santimattius.android.application.lifecycle

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import io.github.santimattius.app.lifecycle.core.ApplicationLifecycleObserver

class MyAppLifecycleObserver : ApplicationLifecycleObserver() {
    override fun onAppForeground(owner: LifecycleOwner) {
        Log.d(this::class.simpleName, "onAppForeground: Application resumed")
    }

    override fun onAppBackground(owner: LifecycleOwner) {
        Log.d(this::class.simpleName, "onAppBackground: Application paused")
    }
}
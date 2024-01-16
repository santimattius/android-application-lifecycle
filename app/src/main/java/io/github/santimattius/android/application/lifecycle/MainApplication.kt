package io.github.santimattius.android.application.lifecycle

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(MyAppLifecycle())
        ProcessLifecycleOwner.get().lifecycle.addObserver(MyAppLifecycleObserver())
    }
}
package io.github.santimattius.android.application.lifecycle

import android.app.Application
import io.github.santimattius.android.application.lifecycle.callbacks.MyActivityLifecycleCallbacks

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        //DefaultActivityBehaviour.addBehaviour(ActivityBlocker())
        registerActivityLifecycleCallbacks(MyActivityLifecycleCallbacks())
        //ProcessLifecycleOwner.get().lifecycle.addObserver(MyAppLifecycleObserver())
    }
}
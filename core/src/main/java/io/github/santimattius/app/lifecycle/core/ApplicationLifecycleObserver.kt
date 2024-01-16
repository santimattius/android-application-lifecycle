package io.github.santimattius.app.lifecycle.core

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

abstract class ApplicationLifecycleObserver : DefaultLifecycleObserver {

    override fun onStart(owner: LifecycleOwner) {
        onAppForeground(owner)
    }

    override fun onPause(owner: LifecycleOwner) {
        onAppBackground(owner)
    }

    abstract fun onAppForeground(owner: LifecycleOwner)

    abstract fun onAppBackground(owner: LifecycleOwner)

}
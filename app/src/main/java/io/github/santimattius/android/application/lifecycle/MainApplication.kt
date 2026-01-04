package io.github.santimattius.android.application.lifecycle

import android.app.Application
import android.os.StrictMode
import io.github.santimattius.android.application.lifecycle.activities.ActivityBlocker
import io.github.santimattius.android.application.lifecycle.composite.DefaultActivityBehaviour

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DefaultActivityBehaviour.addBehaviour(ActivityBlocker())
        //registerActivityLifecycleCallbacks(MyActivityLifecycleCallbacks())
        //ProcessLifecycleOwner.get().lifecycle.addObserver(MyAppLifecycleObserver())
        StrictMode.setThreadPolicy(
            StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyDialog()
                .penaltyFlashScreen()
                .build()
        )
    }
}
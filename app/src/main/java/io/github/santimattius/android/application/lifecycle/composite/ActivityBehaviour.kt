package io.github.santimattius.android.application.lifecycle.composite

import android.app.Activity

interface ActivityBehaviour {

    fun onStart(activity: Activity){}

    fun onResume(activity: Activity){}

    fun onPause(activity: Activity){}

    fun onStop(activity: Activity){}

    fun onDestroy(activity: Activity){}

}
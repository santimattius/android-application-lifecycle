package io.github.santimattius.android.application.lifecycle.composite

import android.util.Log
import androidx.activity.ComponentActivity
import androidx.annotation.CallSuper
import io.github.santimattius.android.application.lifecycle.tools.timeInMs
import kotlin.time.measureTimedValue

abstract class CompositeActivity : ComponentActivity() {
    private val behaviours = mutableListOf<ActivityBehaviour>()

    init {
        behaviours.addAll(DefaultActivityBehaviour.behaviours)
    }

    @CallSuper
    override fun onStart() {
        super.onStart()
        val time = measureTimedValue {
            for (activityBehaviour in behaviours) {
                activityBehaviour.onStart(this)
            }
        }
        Log.i("Benchmark", "onStart: ${time.timeInMs()}")
    }

    @CallSuper
    override fun onResume() {
        super.onResume()
        val time = measureTimedValue {
            for (activityBehaviour in behaviours) {
                activityBehaviour.onResume(this)
            }
        }
        Log.i("Benchmark", "onResume: ${time.timeInMs()}")
    }

    @CallSuper
    override fun onPause() {
        super.onPause()
        val time = measureTimedValue {
            for (activityBehaviour in behaviours) {
                activityBehaviour.onPause(this)
            }
        }
        Log.i("Benchmark", "onPause: ${time.timeInMs()}")
    }

    @CallSuper
    override fun onStop() {
        super.onStop()
        val time = measureTimedValue {
            for (activityBehaviour in behaviours) {
                activityBehaviour.onStop(this)
            }
        }
        Log.i("Benchmark", "onStop: ${time.timeInMs()}")
    }

    @CallSuper
    override fun onDestroy() {
        val time = measureTimedValue {
            for (activityBehaviour in behaviours) {
                activityBehaviour.onDestroy(this)
            }
        }
        super.onDestroy()
        removeBehaviours()
        Log.i("Benchmark", "onDestroy: ${time.timeInMs()}")
    }

    protected fun addBehaviour(activityBehaviour: ActivityBehaviour) {
        behaviours.add(activityBehaviour)
    }

    private fun removeBehaviours() {
        behaviours.clear()
    }
}
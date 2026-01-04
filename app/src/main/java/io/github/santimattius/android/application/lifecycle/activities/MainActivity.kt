package io.github.santimattius.android.application.lifecycle.activities

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.lifecycle.viewmodel.viewModelFactory
import io.github.santimattius.android.application.lifecycle.MyAppLifecycleObserver
import io.github.santimattius.android.application.lifecycle.callbacks.MyActivityLifecycleCallbacks
import io.github.santimattius.android.application.lifecycle.composite.CompositeActivity
import io.github.santimattius.android.application.lifecycle.recommendations.MyViewModel
import io.github.santimattius.android.application.lifecycle.ui.component.MainContent
import io.github.santimattius.android.application.lifecycle.ui.theme.AndroidapplicationLifecycleTheme

class MainActivity : CompositeActivity() {

    private val lifecycleCallbacks = MyActivityLifecycleCallbacks()
    private val myAppLifecycleObserver = MyAppLifecycleObserver()
    private val viewModel by viewModels<MyViewModel> { viewModelFactory { MyViewModel() } }

    init {
        addBehaviour(ActivityTracker())
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            registerActivityLifecycleCallbacks(lifecycleCallbacks)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(myAppLifecycleObserver)
        viewModel.state.observe(this){ state ->
            Log.d(this::class.simpleName, "onCreate: $state")
        }
        setContent {
            AndroidapplicationLifecycleTheme {
                MainContent(text = "Main Screen") {
                    val intent = Intent(this, NextActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            unregisterActivityLifecycleCallbacks(lifecycleCallbacks)
        }
    }
}
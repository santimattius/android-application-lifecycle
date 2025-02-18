package io.github.santimattius.android.application.lifecycle.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import io.github.santimattius.android.application.lifecycle.composite.CompositeActivity
import io.github.santimattius.android.application.lifecycle.ui.component.MainContent
import io.github.santimattius.android.application.lifecycle.ui.theme.AndroidapplicationLifecycleTheme

class MainActivity : CompositeActivity() {

    init {
        addBehaviour(ActivityTracker())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidapplicationLifecycleTheme {
                MainContent(text = "Main Screen") {
                    val intent = Intent(this, NextActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
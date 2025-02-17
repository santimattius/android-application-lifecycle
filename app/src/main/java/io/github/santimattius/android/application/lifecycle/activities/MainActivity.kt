package io.github.santimattius.android.application.lifecycle.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.github.santimattius.android.application.lifecycle.ui.component.MainContent
import io.github.santimattius.android.application.lifecycle.ui.theme.AndroidapplicationLifecycleTheme

class MainActivity : ComponentActivity() {
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
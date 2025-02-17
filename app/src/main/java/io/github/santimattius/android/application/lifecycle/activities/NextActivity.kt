package io.github.santimattius.android.application.lifecycle.activities

import android.os.Bundle
import androidx.activity.compose.setContent
import io.github.santimattius.android.application.lifecycle.ui.component.MainContent
import io.github.santimattius.android.application.lifecycle.ui.theme.AndroidapplicationLifecycleTheme

class NextActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidapplicationLifecycleTheme {
                MainContent(
                    text = "Next Screen",
                    button = "go to back"
                ) {
                    onBackPressedDispatcher.onBackPressed()
                }
            }
        }
    }
}

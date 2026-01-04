package io.github.santimattius.android.application.lifecycle.tools

import kotlin.time.TimedValue

fun <T> TimedValue<T>.timeInMs(): Double {
    return duration.inWholeMilliseconds / 1000.0
}

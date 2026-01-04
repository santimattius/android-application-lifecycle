package io.github.santimattius.android.application.lifecycle.recommendations

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MyViewModel : ViewModel() {
    private val _state = MutableLiveData<String>()
    val state: LiveData<String> get() = _state
    private val _state2 = MutableStateFlow<String>("Initial State")
    val state2: StateFlow<String> = _state2

    fun updateState(newState: String) {
        _state.value = newState
    }
    fun updateState2(newState: String) {
        _state2.value = newState
    }
}

package io.github.santimattius.android.application.lifecycle.composite

import io.github.santimattius.android.application.lifecycle.activities.EmptyActivityBehaviour

object DefaultActivityBehaviour {

    private val _behaviours: MutableList<ActivityBehaviour> =
        listOf(EmptyActivityBehaviour() ).toMutableList()

    val behaviours: List<ActivityBehaviour>
        get() = _behaviours.toList()

    fun addBehaviour(activityBehaviour: ActivityBehaviour) {
        _behaviours.add(activityBehaviour)
    }

    fun removeBehaviour(activityBehaviour: ActivityBehaviour) {
        _behaviours.remove(activityBehaviour)
    }

    fun removeBehaviours() {
        _behaviours.clear()
    }
}


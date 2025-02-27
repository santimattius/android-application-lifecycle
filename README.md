# Android Application Lifecycle

This repository contains examples of the application lifecycle in Android, including how to identify foreground and background events, as well as strategies to avoid overriding lifecycle methods in `Activity` and `Fragment`.

## Contents

- **Detecting Foreground and Background Events**
- **Using LifecycleOwner and LifecycleObserver** to avoid overriding lifecycle methods
- **Implementations with ProcessLifecycleOwner and Jetpack Lifecycle**

## Example 1: Detect Foreground and Background in an Application

To identify when the application enters the background or foreground, we can use `ProcessLifecycleOwner`:

```kotlin
class AppLifecycleObserver : DefaultLifecycleObserver {
    override fun onStart(owner: LifecycleOwner) {
        Log.d("AppLifecycle", "App in foreground")
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.d("AppLifecycle", "App in background")
    }
}
```

And register it in `Application`:

```kotlin
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ProcessLifecycleOwner.get().lifecycle.addObserver(AppLifecycleObserver())
    }
}
```

More details in the article: [Foreground and Background Events in Android: How Can You Effectively Identify Them?](https://medium.com/@santimattius/detect-when-our-app-is-sent-to-the-foreground-or-background-on-android-how-can-you-effectively-fb9e539796ea)

---

## (NEW) Example 2: Avoid Overriding Lifecycle Methods in Activity/Fragment
<!--
Instead of overriding methods like `onResume()` or `onPause()`, we can use a `LifecycleObserver` within the `ViewModel`:

```kotlin
class MyViewModel : ViewModel(), DefaultLifecycleObserver {
    override fun onResume(owner: LifecycleOwner) {
        Log.d("MyViewModel", "Screen in foreground")
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.d("MyViewModel", "Screen in background")
    }
}
```

And register it in `Fragment`:

```kotlin
class MyFragment : Fragment() {
    private val viewModel: MyViewModel by viewModels()
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycle.addObserver(viewModel)
    }
}
```

More details in the article: [Stop Override Activity/Fragment Lifecycle Methods in Android]()
-->
## Contributions

If you have improvements or new examples, they are welcome! Open an issue or a pull request with your contribution.

## License

This repository is licensed under the MIT License.


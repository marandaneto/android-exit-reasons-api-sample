# Android Process Exit Reasons API Sample

It's just a sample with a Single Activity that fetches the last process exit's reason using the new Android R API [ApplicationExitInfo](https://developer.android.com/reference/kotlin/android/app/ApplicationExitInfo) and prints it on the screen.

The textView has an `OnClickListener` that you can switch ways of crashing the App.

- RuntimeException (UncaughtExceptionHandler)
- System.exit
- ANR
- NDK segfault

Restart the App. and look at the reason :)

[Android 11: Developer Preview 3](https://android-developers.googleblog.com/2020/04/android-11-developer-preview-3.html)

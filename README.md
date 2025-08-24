# TODO List App !

[![test](https://github.com/blocoio/android-template/workflows/test/badge.svg?branch=master)](https://github.com/blocoio/android-template/actions?query=workflow%3Atest+branch%3Amaster)
[![lint](https://github.com/blocoio/android-template/workflows/lint/badge.svg?branch=master)](https://github.com/blocoio/android-template/actions?query=workflow%3Alint+branch%3Amaster)

<img src="https://play-lh.googleusercontent.com/92xIZAW-mdwucFX1v8kyTXlLVgZfLczHv8XCVOH1tFc0M3cTRI4q9qJLUM96PqCrgWjc" align="left" width="200" hspace="10" vspace="10">

A simple TODO List Android application built with Kotlin and Jetpack Compose, demonstrating modern Android development best practices such as MVVM architecture, Room database, Kotlin Coroutines & Flows, and proper state management.


## Features
- TODO list with add/search functionality using Jetpack Compose.
- Local database with state handling after rotation.
- MVVM architecture with Kotlin Coroutines & Flows.
- Error handling for invalid input (“Error” case).
- Loading indicator while adding TODO.



# Project Structure
* "data": Stores, retrieves, and provides data from local databases or remote sources.
* "di": Package contains classes and modules that configure and provide dependencies (e.g., database, repository, network services) to the rest of the app.
* "navigation" : Logic for managing in-app navigation between different screens.
* "ui": The ui package organizes all user interface–related classes and composables.
* "viewmodel": Manage UI state, business logic, and communicate with repositories while surviving configuration changes.


## Tech-Stack

This project we are using many popular libraries and tools in the Android ecosystem. Most of
the libraries are in the stable version.

* Tech-stack
    * [Kotlin](https://kotlinlang.org/)
        + [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - perform background operations
        + [Kotlin Flow](https://kotlinlang.org/docs/flow.html) - data flow across all app layers, including views
        + [Kotlin Serialization](https://kotlinlang.org/docs/serialization.html) - parse [JSON](https://www.json.org/json-en.html)
    * [Jetpack](https://developer.android.com/jetpack)
        * [Compose](https://developer.android.com/jetpack/compose) - modern, native UI kit
        * [Navigation](https://developer.android.com/topic/libraries/architecture/navigation/) - in-app navigation
        * [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - perform an action when
          lifecycle state changes
        * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - store and manage UI-related
          data in a lifecycle-aware way
        * [Room](https://developer.android.com/jetpack/androidx/releases/room) - store analytics data
* Modern Architecture
    * [MVVM](https://developer.android.com/topic/architecture) - code pattern
    * [Android Architecture components](https://developer.android.com/topic/libraries/architecture)
      ([ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
      , [Kotlin Flow](https://kotlinlang.org/docs/flow.html)
    * [Android KTX](https://developer.android.com/kotlin/ktx) - Jetpack Kotlin extensions
* UI
    * [Material Design 3](https://m3.material.io/) - application design system providing UI components



## APK

The generated release APK can be found at

TodoApp\app\release\app-release.apk 



## License
© 2025 Singlepoint Solutions. All Rights Reserved.


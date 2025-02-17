# Alter on KMP

A library for handling alerts across platforms, particularly useful for iOS where standard toast messages are not supported.

## Installation

### Step 1: Add Dependency

Modify your `tomp` file:

```toml
[versions]
alertKmp = "2.0.0"

[libraries]
alert-kmp = { module = "io.github.khubaibkhan4:alert-kmp", version.ref = "alertKmp" }
```

### Step 2: Update SDK Configuration

Modify your SDK settings:

```toml
android-compileSdk = "35"
android-targetSdk = "35"
```

### Step 3: Add Implementation in `composeApp/build.gradle.kts`

```kotlin
dependencies {
    implementation(libs.alert.kmp)
}
```

## Usage

You can use this library in two ways:

### Method 1: Using `createNotification`

```kotlin
val notification = createNotification(NotificationType.TOAST)
notification.show("Hello, World!")
```

### Method 2: Using `Notify`

```kotlin
Notify(message = "Hello World!", duration = NotificationDuration.SHORT)
```

## Features

- Supports cross-platform alert handling
- Works seamlessly on iOS and Android
- Easy-to-use API for toast and alert notifications

## License
MIT License
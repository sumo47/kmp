# Alter on kmp
* use this library to use alter all specially on ios , tost not support on ios
* in tomp file - 
  - [versions]
    alertKmp = "2.0.0"

    [libraries]
     alert-kmp = { module = "io.github.khubaibkhan4:alert-kmp", version.ref = "alertKmp" }
  - change sdk - 
     - android-compileSdk = "35"
     - android-targetSdk = "35"
* composeApp - build gradle - 
  - implementation(libs.alert.kmp)

* two way to use alert 
  1. val notification = createNotification(NotificationType.TOAST)
                notification.show("Hello, World!")

  2. Notify(message= "Hellow World!", duration=NotificationDuration.SHORT)
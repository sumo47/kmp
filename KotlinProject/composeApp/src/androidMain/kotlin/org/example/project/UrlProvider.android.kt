package org.example.project

actual class UrlProvider {
    actual fun getUrl():String {
        return "https://developer.android.com/"
    }
}
package org.example.project

actual class UrlProvider {
    actual fun getUrl(): String {
        return "https://www.java.com/en/"
    }
}
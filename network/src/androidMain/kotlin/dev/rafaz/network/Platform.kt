package dev.rafaz.network

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.android.Android
import org.koin.core.module.Module

actual fun Module.targetDependencies() {
    single<HttpClientEngine> {
        Android.create()
    }
}
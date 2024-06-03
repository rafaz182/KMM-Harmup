package dev.rafaz.network

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.android.Android
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun targetModule(): Module {
    return module {
        single<HttpClientEngine> {
            Android.create()
        }
    }
}
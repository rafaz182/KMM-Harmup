package dev.rafaz.network

import org.koin.core.module.Module
import org.koin.dsl.module

fun networkDi(baseUrl: String): Module {
    return module {
        targetDependencies()

    }
}
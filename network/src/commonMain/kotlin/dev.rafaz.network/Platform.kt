package dev.rafaz.network

import io.ktor.client.engine.HttpClientEngine
import org.koin.core.module.Module


expect fun getEngine(): HttpClientEngine

expect fun Module.targetDependencies()
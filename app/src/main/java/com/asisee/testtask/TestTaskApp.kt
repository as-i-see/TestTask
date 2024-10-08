package com.asisee.testtask

import android.app.Application
import com.asisee.testtask.di.DataModule
import com.asisee.testtask.di.DomainModule
import com.asisee.testtask.di.UiModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module

class TestTaskApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@TestTaskApp)
            modules(DataModule().module, UiModule().module, DomainModule().module)
        }
    }
}
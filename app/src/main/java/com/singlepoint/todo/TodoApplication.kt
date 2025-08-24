package com.singlepoint.todo

import android.app.Application
import com.singlepoint.todo.di.AppModule
import com.singlepoint.todo.di.AppModuleImpl

class TodoApplication : Application() {

    companion object {
        lateinit var appModule: AppModule
    }

    override fun onCreate() {
        super.onCreate()
        appModule = AppModuleImpl(this)
    }
}

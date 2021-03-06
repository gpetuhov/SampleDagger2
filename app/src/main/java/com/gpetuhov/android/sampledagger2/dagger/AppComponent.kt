package com.gpetuhov.android.sampledagger2.dagger

import android.app.Application
import com.gpetuhov.android.sampledagger2.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

// In this example Dagger component must have 2 extra modules:
// AndroidInjectionModule and AndroidBuilder.
@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AndroidBuilder::class,
    AppModule::class
])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application) : Builder

        fun build(): AppComponent
    }

    fun inject(application: App)
}
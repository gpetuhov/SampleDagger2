package com.gpetuhov.android.sampledagger2.dagger

import com.gpetuhov.android.sampledagger2.provider.HelloWorldTextProvider
import com.gpetuhov.android.sampledagger2.provider.TextProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun providesTextProvider(): TextProvider {
        return HelloWorldTextProvider()
    }
}
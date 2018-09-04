package com.gpetuhov.android.sampledagger2

import android.app.Application
import android.support.v4.app.Fragment
import com.gpetuhov.android.sampledagger2.dagger.AppComponent
import com.gpetuhov.android.sampledagger2.dagger.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

// As usual, we should have our Application class,
// but here it must also implement HasSupportFragmentInjector interface.
class App : Application(), HasSupportFragmentInjector {

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    // Component is created as usual, but here it is not returned by static method.
    // Instead, everything is injected by AndroidSupportInjection class (see its usage in MainFragment).
    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .application(this)
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = fragmentDispatchingAndroidInjector
}
package com.gpetuhov.android.sampledagger2.dagger

import com.gpetuhov.android.sampledagger2.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

// We must add this module for proper injections inside the MainFragment.
@Module
abstract class AndroidBuilder {

    @ContributesAndroidInjector
    abstract fun bindMainFragment(): MainFragment
}
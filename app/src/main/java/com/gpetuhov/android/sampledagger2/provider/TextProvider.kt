package com.gpetuhov.android.sampledagger2.provider

// This is an abstraction of a text provider, that is used in MainFragment.
// Concrete implementation is provided inside Dagger module.
interface TextProvider {
    fun getText(): String
}
package com.gpetuhov.android.sampledagger2.provider

// This is the implementation of the TextProvider interface.
// It is provided in AppModule.
class HelloWorldTextProvider : TextProvider {
    override fun getText(): String {
        return "Hello world!!!!!!!"
    }
}
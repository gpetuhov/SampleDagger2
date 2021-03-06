package com.gpetuhov.android.sampledagger2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gpetuhov.android.sampledagger2.provider.TextProvider
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

// This is where the injection is used
class MainFragment : Fragment() {

    // We specify text provider as an abstract interface.
    // Concrete implemenation is injected by Dagger
    @Inject lateinit var textProvider: TextProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        // This is where all injections are executed.
        // Here we use AndroidSupportInjection instead of App.getAppComponent().inject(this)
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    // If we use Kotlin Extensions to address views inside a fragment,
    // then we should do it here, not in onCreateView, or we will get NPE
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = textProvider.getText()
    }
}
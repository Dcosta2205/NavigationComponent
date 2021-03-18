package com.xyz.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import kotlinx.android.synthetic.main.fragment_specify_amount.*

class FragmentSpecifyAmount : Fragment(R.layout.fragment_specify_amount) {

    private lateinit var navController: NavController
    private var recipientName = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recipientName = arguments?.getString("recipient")!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvRecipientName.text = recipientName
    }
}
package com.xyz.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_choose_recipient.*

class FragmentChooseRecipient : Fragment(R.layout.fragment_choose_recipient),
    View.OnClickListener {

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        initListeners()
    }

    private fun initListeners() {
        btnNext.setOnClickListener(this)
        btnCancel.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnNext -> {
                val bundle = bundleOf("recipient" to etRecipient.text.toString())
                navController.navigate(
                    R.id.action_fragmentChooseRecipient_to_fragmentSpecifyAmount,
                    bundle
                )
            }
            R.id.btnCancel -> {

            }
        }
    }
}
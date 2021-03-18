package com.xyz.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

class FragmentMain : Fragment(R.layout.fragment_main), View.OnClickListener {

    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        navController = Navigation.findNavController(view)
    }

    private fun initListeners() {
        btnViewTransaction.setOnClickListener(this)
        btnSendMoney.setOnClickListener(this)
        btnViewBalance.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnViewTransaction -> {
                navController.navigate(R.id.action_fragmentMain_to_fragmentViewTransaction)
            }
            R.id.btnSendMoney -> {
                navController.navigate(R.id.action_fragmentMain_to_fragmentChooseRecipient)
            }

            R.id.btnViewBalance -> {
                navController.navigate(R.id.action_fragmentMain_to_fragmentViewBalance)
            }
        }
    }
}
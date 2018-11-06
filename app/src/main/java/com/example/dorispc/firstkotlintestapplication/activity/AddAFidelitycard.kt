package com.example.dorispc.firstkotlintestapplication.activity

import android.content.Context
import android.content.Intent

class AddAFidelitycard : BaseActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            val intent = Intent(context, AddAUserActivity::class.java)
            return intent
        }
    }
}

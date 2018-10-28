package com.example.dorispc.firstkotlintestapplication.activity

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.dorispc.firstkotlintestapplication.R

class AddAUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_a_user)

    }



    /*companion object {

        fun newIntent(context: Context): Intent {
            val intent = Intent(context, AddAUserActivity::class.java)
            return intent
        }
    }*/

}

package com.example.dorispc.firstkotlintestapplication.activity

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dorispc.firstkotlintestapplication.R
import com.example.dorispc.firstkotlintestapplication.bo.User

class MainActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user: User = intent.getParcelableExtra("user")
        Toast.makeText(this, user.firstname, Toast.LENGTH_LONG).show()
    }

    companion object {
        fun newIntent(context: Context): Intent {
            val intent = Intent(context, MainActivity::class.java)
            return intent
        }
    }
}

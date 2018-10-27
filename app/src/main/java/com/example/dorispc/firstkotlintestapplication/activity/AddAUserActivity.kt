package com.example.dorispc.firstkotlintestapplication.activity

import android.content.Context
import android.content.Intent
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.dorispc.firstkotlintestapplication.R
import com.example.dorispc.firstkotlintestapplication.bo.User
import kotlinx.android.synthetic.main.activity_add_auser.*

class AddAUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_auser)
    }

    fun addANewUser(){
        val name: String = (this.findViewById(R.id.etNameAddAUSer) as EditText).text.toString()
        val firstname: String = (this.findViewById(R.id.etFirstnameAddAUSer) as EditText).text.toString()
        val email: String = (this.findViewById(R.id.etEmailAddAUSer) as EditText).text.toString()
        val password: String = (this.findViewById(R.id.etPasswordAddAUSer) as EditText).text.toString()
        val confirmPassword: String = (this.findViewById(R.id.etConfirmPasswordAddAUSer) as EditText).text.toString()

        if (password == confirmPassword){
            var newUser: User = User(null, name, firstname, email, password, confirmPassword, null)
        } else {}

    }


    /*inner class Worker: AsyncTask<Any, Any, Any>() {
        override fun doInBackground(vararg newUser: User): Any {
          return
        }

    }*/

    companion object {

        fun newIntent(context: Context): Intent {
            val intent = Intent(context, AddAUserActivity::class.java)
            return intent
        }
    }

}

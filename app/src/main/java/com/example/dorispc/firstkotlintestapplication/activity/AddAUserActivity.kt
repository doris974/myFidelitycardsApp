package com.example.dorispc.firstkotlintestapplication.activity

import android.content.Context
import android.content.Intent
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.dorispc.firstkotlintestapplication.R
import com.example.dorispc.firstkotlintestapplication.bo.User
import com.example.dorispc.firstkotlintestapplication.dao.AppDatabase
import kotlinx.android.synthetic.main.activity_add_a_user.*

class AddAUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_a_user)


    }

    fun AddANewUser (view: View){
        var name = etNameAddAUSer.text.toString()
        var firstname = etFirstnameAddAUSer.text.toString()
        var email = etEmailAddAUSer.text.toString()
        var password = etPasswordAddAUSer.text.toString()
        var confirmPassword = etConfirmPasswordAddAUSer.text.toString()

        if (name.isEmpty()) throw IllegalStateException("obligatoire")

        if(password == confirmPassword){
            var user = User(null, name, firstname, email, password)
            Worker().execute(user)
        }

    }

    inner class Worker: AsyncTask<User, Void, Void>(){
        override fun doInBackground(vararg users: User?): Void? {
            AppDatabase.getInstance(this@AddAUserActivity)?.userDao()?.insert(users)

            return null
        }

        override fun onPostExecute(result: Void?) {
            super.onPostExecute(result)
            callBackAddAUSer()
        }
    }

    private fun callBackAddAUSer() {
        Toast.makeText(this, "New user added", Toast.LENGTH_LONG)
        startActivity(Intent(this, LoginActivity::class.java))
    }

    /*companion object {

        fun newIntent(context: Context): Intent {
            val intent = Intent(context, AddAUserActivity::class.java)
            return intent
        }
    }*/

}

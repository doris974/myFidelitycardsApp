package com.example.dorispc.firstkotlintestapplication.activity

import android.content.Intent
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.dorispc.firstkotlintestapplication.R
import com.example.dorispc.firstkotlintestapplication.adapter.UserAdapter
import com.example.dorispc.firstkotlintestapplication.adapter.UserAdapter.ClickUserListener
import com.example.dorispc.firstkotlintestapplication.bo.User
import com.example.dorispc.firstkotlintestapplication.dao.AppDatabase
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), ClickUserListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        this.setSupportActionBar(my_toolbar)
        rvUsersLogin.layoutManager = LinearLayoutManager(this)
        UsersWorker().execute()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.login_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.addANewUserLogin) {
            val intent = Intent(this, AddAUserActivity::class.java)
            startActivity(intent)
        }

        return true
    }
    fun callBackGetAllUsers(usersList: List<User>?) {
        rvUsersLogin.adapter = usersList?.let { UserAdapter(it, this, this) }
        Toast.makeText(this@LoginActivity,"callback OK", Toast.LENGTH_LONG).show()
    }

    inner class UsersWorker : AsyncTask<Void, Void, List<User>>(){
        override fun doInBackground(vararg params: Void?): List<User>? {
            return AppDatabase.getInstance(this@LoginActivity)?.userDao()?.getAll()
        }

        override fun onPostExecute(result: List<User>?) {
            super.onPostExecute(result)
            callBackGetAllUsers(result)
        }
    }

    fun ToAddAUserActivity (view: View){
        val intent = Intent(this, AddAUserActivity::class.java)
        startActivity(intent)
    }

    override fun onClickUser(user: User) {
        val intent = MainActivity.newIntent(this)
        intent.putExtra("user", user)
        startActivity(intent)
    }
}

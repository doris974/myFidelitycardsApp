package com.example.dorispc.firstkotlintestapplication.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.dorispc.firstkotlintestapplication.R

open class BaseActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.login_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.getItemId() == R.id.addANewUserLogin) {
            val intent = Intent(this, AddAUserActivity::class.java)
            startActivity(intent)
        }

        return true
    }
}

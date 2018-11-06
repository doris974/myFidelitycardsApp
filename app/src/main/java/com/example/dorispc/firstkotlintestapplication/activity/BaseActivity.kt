package com.example.dorispc.firstkotlintestapplication.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.dorispc.firstkotlintestapplication.R

open class BaseActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem)= when (item.itemId) {
        R.id.menuCreateNewCard -> {
            startActivity(AddAFidelitycard.newIntent(this))
            true
        }

        R.id.menuModifyDeleteACard -> {
            startActivity(AddAFidelitycard.newIntent(this))
            true
        }

        R.id.menuSettings -> {
            startActivity(AddAFidelitycard.newIntent(this))
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}

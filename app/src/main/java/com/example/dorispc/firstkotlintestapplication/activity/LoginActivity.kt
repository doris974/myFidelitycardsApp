package com.example.dorispc.firstkotlintestapplication.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.dorispc.firstkotlintestapplication.R
import com.example.dorispc.firstkotlintestapplication.adapter.UserAdapter
import com.example.dorispc.firstkotlintestapplication.bo.User
import com.example.dorispc.firstkotlintestapplication.dao.AppDatabase

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    fun ToAddAUserActivity (view: View){
        val intent = Intent(this, AddAUserActivity::class.java)
        startActivity(intent)
    }
}

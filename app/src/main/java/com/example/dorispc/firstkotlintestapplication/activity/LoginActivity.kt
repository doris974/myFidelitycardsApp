package com.example.dorispc.firstkotlintestapplication.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.example.dorispc.firstkotlintestapplication.R
import com.example.dorispc.firstkotlintestapplication.dao.AppDatabase

class LoginActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var myDB: AppDatabase? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        myDB = AppDatabase.getInstance(this)
        /*var users: List<User> = myDB?.userDao()!!.getAll()
        viewManager = LinearLayoutManager(this)
        viewAdapter = UserAdapter(users)*/


    }
}
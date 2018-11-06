package com.example.dorispc.firstkotlintestapplication.activity

import android.content.Context
import android.content.Intent
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.widget.Toast
import com.example.dorispc.firstkotlintestapplication.R
import com.example.dorispc.firstkotlintestapplication.bo.Fidelitycard
import com.example.dorispc.firstkotlintestapplication.bo.User
import com.example.dorispc.firstkotlintestapplication.dao.AppDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user: User = intent.getParcelableExtra("user")
        tbBasic.title = getString(R.string.welcome_firstname,user.firstname)
        setSupportActionBar(tbBasic)
        rvFidelitydardsMain.layoutManager = LinearLayoutManager(this)


    }

    companion object {
        fun newIntent(context: Context): Intent {
            val intent = Intent(context, MainActivity::class.java)
            return intent
        }
    }

    inner class Worker : AsyncTask<Void,Void,List<Fidelitycard>>(){
        override fun doInBackground(vararg params: Void?): List<Fidelitycard>? {
            return AppDatabase.getInstance(this@MainActivity)?.fidelitycardDao()?.getAll()
        }

        override fun onPostExecute(result: List<Fidelitycard>?) {
            callBackFidelitycardsList(result)
        }
    }

    private fun callBackFidelitycardsList(result: List<Fidelitycard>?) {
        //rvFidelitydardsMain.adapter
    }
}

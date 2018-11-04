package com.example.dorispc.firstkotlintestapplication.adapter


import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.dorispc.firstkotlintestapplication.R
import com.example.dorispc.firstkotlintestapplication.bo.User
import kotlinx.android.synthetic.main.elements_userslistlogin.view.*


class UserAdapter(val usersList: List<User>, val context: Context, val listener: UserAdapter.ClickUserListener)
    : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.elements_userslistlogin, viewGroup, false))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.tvUserFullnameLogin?.text = usersList.get(position).firstname + " " + usersList.get(position).name
    }

    override fun getItemCount(): Int {
        return usersList.size
    }

    inner class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

        var tvUserFullnameLogin : TextView = view.tvUserFullnameLogin

        init {
            tvUserFullnameLogin.setOnClickListener {v ->

                if (this@UserAdapter.listener != null) {
                    var userClicked = usersList[adapterPosition]
                    listener.onClickUser(userClicked)
                }
            }
        }
    }

    interface ClickUserListener {
        fun onClickUser(user: User)
    }

}
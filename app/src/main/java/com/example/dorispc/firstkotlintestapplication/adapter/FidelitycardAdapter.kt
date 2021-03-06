package com.example.dorispc.firstkotlintestapplication.adapter

import android.content.Context
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.dorispc.firstkotlintestapplication.R
import com.example.dorispc.firstkotlintestapplication.bo.Fidelitycard
import kotlinx.android.synthetic.main.elements_fidelitycardslist.view.*
import org.jetbrains.anko.image
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.imageURI

class FidelitycardAdapter(val fidelitycardList: List<Fidelitycard>, val context: Context, val listener: FidelitycardAdapter.ClickFidelitycardListener)
    : RecyclerView.Adapter<FidelitycardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewgroup : ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.elements_fidelitycardslist, viewgroup, false))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.ivLogoShopMain.imageURI = Uri.parse(fidelitycardList.get(position).shop.logo)
        viewHolder.tvNameShopMain.text = fidelitycardList.get(position).shop.name
    }

    override fun getItemCount(): Int {
        return fidelitycardList.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var ivLogoShopMain : ImageView = itemView.ivLogoShopMain
        var tvNameShopMain : TextView = itemView.tvNameShopMain

        init {

        }
    }

    interface ClickFidelitycardListener{
        fun onClick()
    }

}
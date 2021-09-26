package com.aldion.submission1githubuser.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aldion.submission1githubuser.R
import com.aldion.submission1githubuser.model.Accounts

class ListAccountAdapter(private val listAccount: ArrayList<Accounts>) :
    RecyclerView.Adapter<ListAccountAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvUsername: TextView = itemView.findViewById(R.id.tv_item_username)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_account, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, username, avatar) = listAccount[position]
        holder.imgPhoto.setImageResource(avatar)
        holder.tvName.text = name.toString()
        holder.tvUsername.text = username

    }

    override fun getItemCount(): Int = listAccount.size

}
package com.example.facebook_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Adabter( var facebookList:ArrayList<Post>) :RecyclerView.Adapter<Adabter.Holder>() {

    class Holder(itemView: View):RecyclerView.ViewHolder(itemView){
        var title:TextView=itemView.findViewById(R.id.title)
        var post:TextView=itemView.findViewById(R.id.postTitleTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.activity_item_view,parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return facebookList.size

    }

    override fun onBindViewHolder(holder:Holder, position: Int) {

       val postItem:Post=facebookList[position]
        holder.title.text=postItem.title
        holder.post.text=postItem.post

    }
}
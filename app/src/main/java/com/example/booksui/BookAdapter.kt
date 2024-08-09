package com.example.booksui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(val data: List<Book>) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val bookImage = view.findViewById<ImageView>(R.id.book_img)
        val bookName = view.findViewById<TextView>(R.id.book_name)
        val authName = view.findViewById<TextView>(R.id.auth_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return ViewHolder(layoutInflater)
    }

    override fun getItemCount(): Int {
        return data.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = data[position]
        holder.bookImage.setImageResource(data.image)
        holder.bookName.text = data.bookDesc
        holder.authName.text = data.author
    }

}
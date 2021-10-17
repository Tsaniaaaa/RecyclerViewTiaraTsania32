package com.example.recyclerview_tiaratsania_32

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SeventeenAdapter (private val context: Context, private val seventeen: List<Sebong>, val listener: (Sebong) -> Unit )
    : RecyclerView.Adapter<SeventeenAdapter.SeventeenViewHolder>(){

    class SeventeenViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val imgSebong = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameSebong = view.findViewById<TextView>(R.id.tv_item_name)
        val descSebong = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(seventeen: Sebong, listener: (Sebong) -> Unit){
            imgSebong.setImageResource(seventeen.imgSebong)
            nameSebong.text = seventeen.nameSebong
            descSebong.text = seventeen.descSebong
            itemView.setOnClickListener{
                listener(seventeen)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeventeenViewHolder {
        return SeventeenViewHolder(
            LayoutInflater.from(context).inflate(R.layout.sebongiee, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SeventeenViewHolder, position: Int) {
        holder.bindView(seventeen[position], listener)
    }

    override fun getItemCount(): Int = seventeen.size
    }

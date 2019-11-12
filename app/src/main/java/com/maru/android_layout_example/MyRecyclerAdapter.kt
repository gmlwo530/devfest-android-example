package com.maru.android_layout_example

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


/*
* Created by CHOI HEE JAE on 2019-10-26
*/

class MyRecyclerAdapter(private val context: Context) : RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>(){
    private val items : ArrayList<String> = ArrayList()

    init {
        for(i in 1..20){
            items.add("Item$i")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerAdapter.MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view_item, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyRecyclerAdapter.MyViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
        override fun onClick(p0: View?) {
            Log.d("MYLOG", "Item${adapterPosition}")
        }

        val textView: TextView = itemView.findViewById(R.id.text_view)

        init {
            itemView.setOnClickListener(this)
        }
    }
}
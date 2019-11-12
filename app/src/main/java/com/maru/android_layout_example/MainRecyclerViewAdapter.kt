package com.maru.android_layout_example

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.maru.android_layout_example.myconstraintlayout.MyConstraintLayoutActivity
import com.maru.android_layout_example.mystartactivity.MyStartActivity


/*
* Created by CHOI HEE JAE on 2019-10-28
*/

class MainRecyclerViewAdapter(private val context : Context) : RecyclerView.Adapter<MainRecyclerViewAdapter.MyViewHolder>(){
    private val items : ArrayList<String> = ArrayList();
    private val activities = arrayOf(
        LinearLayoutActivity::class.java,
        MyConstraintLayoutActivity::class.java,
        RecyclerViewActivity::class.java,
        SizeLayoutOneActivity::class.java,
        SizeLayoutTwoActivity::class.java,
        MyStartActivity::class.java
    )

    init {
        for (i in activities){
            items.add(i.simpleName)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.main_recycler_view_item, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = items[position]
    }

    inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
        override fun onClick(p0: View?) {
            val i = Intent(itemView.context, activities[adapterPosition])
            itemView.context.startActivity(i)
        }

        val name : TextView = itemView.findViewById(R.id.text_view)

        init {
            itemView.setOnClickListener(this)
        }
    }

}
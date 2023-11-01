package com.duongpt207595.affimations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.duongpt207595.affimations.R
import com.duongpt207595.affimations.model.Affirmation

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) : Adapter<ItemAdapter.MyViewHolder>() {

    class MyViewHolder(private val view: View) : ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = dataset[holder.adapterPosition]
        holder.textView.text = item.toString()
    }
}
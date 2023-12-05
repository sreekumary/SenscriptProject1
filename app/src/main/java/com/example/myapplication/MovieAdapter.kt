package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(val itemList: ArrayList<ModelPoster>) : RecyclerView.Adapter<MovieAdapter.ModelViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieAdapter.ModelViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ModelViewHolder(v)
    }

    override fun onBindViewHolder(holder: MovieAdapter.ModelViewHolder, position: Int) {
        holder.ItemImage.setImageResource(itemList[position].image)
        holder.ItemText.setText(itemList[position].description)    }

    override fun getItemCount(): Int {
        return  itemList.size
    }
    inner class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ItemImage: ImageView
        var ItemText: TextView

        init {

            ItemImage = itemView.findViewById(R.id.imageview) as ImageView
            ItemText = itemView.findViewById(R.id.textView) as TextView
        }

    }
}
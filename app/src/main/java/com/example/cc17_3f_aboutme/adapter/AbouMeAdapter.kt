package com.example.cc17_3f_aboutme.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cc17_3f_aboutme.R
import com.example.cc17_3f_aboutme.model.AboutMe

class AbouMeAdapter(val data: List<AboutMe>):
    RecyclerView.Adapter<AbouMeAdapter.AboutMeItemViewHolder>(){
    class AboutMeItemViewHolder(val row: View): RecyclerView.ViewHolder(row){
        val aboutMeImageView = row.findViewById<ImageView>(R.id.aboutMeItemImg)
        val aboutMeNameView = row.findViewById<TextView>(R.id.aboutMeItemName)
        val aboutMeDescTextView = row.findViewById<TextView>(R.id.aboutMeItemDesc)
        val aboutMeShowMoreButton = row.findViewById<Button>(R.id.aboutMeItemShowMoreButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AboutMeItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.about_me_item_view, parent,false)
        return AboutMeItemViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: AboutMeItemViewHolder, position: Int) {
        holder.aboutMeImageView.setImageResource(data.get(position).imageResId)
        holder.aboutMeDescTextView.text = data.get(position).name
        holder.aboutMeDescTextView.text =data.get(position).desc
        holder.aboutMeShowMoreButton.setOnClickListener(data.get(position).onClickListener)

    }
}
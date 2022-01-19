package com.example.homework193

import android.provider.MediaStore
import android.telecom.Call
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ViewPagerAdapter(private var title: List<String>, private var details: List<String>, private var images:List<Int>):RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {

   inner class Pager2ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
       var itemTitle:TextView=itemView.findViewById(R.id.text_title)
       var iteDetails:TextView=itemView.findViewById(R.id.text_title2)
       var itemImage:ImageView=itemView.findViewById(R.id.image_src)
     init {
         itemImage.setOnClickListener {v:View->
             val position=adapterPosition
            // Toast.makeText(itemView.context, "You clicked ${position+1}", Toast.LENGTH_SHORT).show()
         }
     }
   }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.Pager2ViewHolder {
        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {
       holder.itemTitle.text=title[position]
       holder.iteDetails.text=details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
      return title.size
    }
}
package com.saddam.starrailinfo.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.saddam.starrailinfo.R
import com.saddam.starrailinfo.activity.DetailActivity
import com.saddam.starrailinfo.model.StarrailChar

class ListCharAdapter(private val listChar: ArrayList<StarrailChar>) : RecyclerView.Adapter<ListCharAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_char, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val context = holder.itemView.context
        val StarrailChar = listChar[position]
        Glide.with(holder.itemView.context)
            .load(StarrailChar.pic)
            .apply(RequestOptions())
            .into(holder.picture)
        holder.name.text = StarrailChar.name
        holder.elementinfo.text = StarrailChar.elementinfo
        holder.affiliation.text = StarrailChar.affiliation
        holder.itemView.setOnClickListener {
            val passItem = Intent(context, DetailActivity::class.java)
            passItem.putExtra(DetailActivity.EXTRA_NAME, StarrailChar.name)
            passItem.putExtra(DetailActivity.EXTRA_ELEMENTINFO, StarrailChar.elementinfo)
            passItem.putExtra(DetailActivity.EXTRA_AFFILIATION, StarrailChar.affiliation)
            passItem.putExtra(DetailActivity.EXTRA_INTRO, StarrailChar.bio)
            //passItem.putExtra(DetailActivity.EXTRA_BIRTH, StarrailChar.birth)
            passItem.putExtra(DetailActivity.EXTRA_PATH, StarrailChar.path)
            passItem.putExtra(DetailActivity.EXTRA_PIC, StarrailChar.pic)
            passItem.putExtra(DetailActivity.EXTRA_PICBG, StarrailChar.background)
            passItem.putExtra(DetailActivity.EXTRA_ELEMENT, StarrailChar.element)
            passItem.putExtra(DetailActivity.EXTRA_LINK, StarrailChar.charlink)
            context.startActivity(passItem)
        }
    }

    override fun getItemCount(): Int {
        return listChar.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.char_name)
        var elementinfo: TextView = itemView.findViewById(R.id.char_elementinfo)
        var affiliation: TextView = itemView.findViewById(R.id.char_affiliation)
        var picture: ImageView = itemView.findViewById(R.id.char_pic)
    }
}
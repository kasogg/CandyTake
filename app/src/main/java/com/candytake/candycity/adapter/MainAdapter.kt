package com.candytake.candycity.adapter

import android.support.v7.widget.RecyclerView
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.candytake.candycity.R
import com.candytake.candycity.bean.PostBean
import kotlinx.android.synthetic.main.item_candy_list.view.*

class MainAdapter(private val items: MutableList<PostBean>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_candy_list, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun getObjects(): MutableList<PostBean> {
        return items
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: PostBean) {
            itemView.tv_title.text = Html.fromHtml(item.content?.rendered)
        }
    }
}
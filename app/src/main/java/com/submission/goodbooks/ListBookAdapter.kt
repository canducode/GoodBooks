package com.submission.goodbooks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBookAdapter(private val listBook: ArrayList<Book>) : RecyclerView.Adapter<ListBookAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Book)
    }

    fun setOnClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        var tvAuthor: TextView = itemView.findViewById(R.id.tv_item_author)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_book, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val book = listBook[position]

        Glide.with(holder.itemView.context)
            .load(book.photo)
            .apply(RequestOptions().override(70,100))
            .into(holder.imgPhoto)

        holder.tvTitle.text = book.title
        holder.tvAuthor.text = "By "+book.author
        holder.tvDetail.text = book.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listBook[holder.adapterPosition])
            //Toast.makeText(holder.itemView.context, "Kamu memilih " + listBook[position].title, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return listBook.size
    }
}
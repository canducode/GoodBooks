package com.submission.goodbooks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.submission.goodbooks.databinding.ItemRowBookBinding

class ListBookAdapter(private val listBook: ArrayList<Book>) : RecyclerView.Adapter<ListBookAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Book)
    }

    fun setOnClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(var binding: ItemRowBookBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val book = listBook[position]

        Glide.with(holder.itemView.context)
            .load(book.photo)
            .apply(RequestOptions().override(70,100))
            .into(holder.binding.imgItemPhoto)

        holder.binding.tvItemTitle.text = book.title
        holder.binding.tvItemAuthor.text = "By "+book.author
        holder.binding.tvItemDetail.text = book.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listBook[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listBook.size
    }
}
package com.wvestudio.goodbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_AUTHOR = "extra_author"
        const val EXTRA_ISBN = "extra_isbn"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvTitle: TextView = findViewById(R.id.tv_item_title_detail)
        val tvAuthor: TextView = findViewById(R.id.tv_item_author_detail)
        val tvIsbn: TextView = findViewById(R.id.tv_item_isbn_detail)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail_detail)
        val imgPhoto: ImageView = findViewById(R.id.img_item_photo_detail)

        tvTitle.text = intent.getStringExtra(EXTRA_TITLE)
        tvAuthor.text = "By " + intent.getStringExtra(EXTRA_AUTHOR)
        tvIsbn.text = "ISBN : " + intent.getLongExtra(EXTRA_ISBN,0).toString()
        tvDetail.text = intent.getStringExtra(EXTRA_DETAIL)

        Glide.with(this)
            .load(intent.getIntExtra(EXTRA_PHOTO,0))
            .apply(RequestOptions().override(150,220))
            .into(imgPhoto)
    }
}
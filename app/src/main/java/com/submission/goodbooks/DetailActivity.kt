package com.submission.goodbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.submission.goodbooks.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_AUTHOR = "extra_author"
        const val EXTRA_ISBN = "extra_isbn"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            tvItemTitleDetail.text = intent.getStringExtra(EXTRA_TITLE)
            tvItemAuthorDetail.text = "By " + intent.getStringExtra(EXTRA_AUTHOR)
            tvItemIsbnDetail.text = "ISBN : " + intent.getLongExtra(EXTRA_ISBN,0).toString()
            tvItemDetailDetail.text = intent.getStringExtra(EXTRA_DETAIL)

            Glide.with(this@DetailActivity)
                .load(intent.getIntExtra(EXTRA_PHOTO,0))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh).error(R.drawable.ic_baseline_broken_image))
                .into(imgItemPhotoDetail)
        }

        supportActionBar?.title = "Detail Buku"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
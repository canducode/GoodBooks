package com.submission.goodbooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.submission.goodbooks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list: ArrayList<Book> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvBooks.setHasFixedSize(true)

        list.addAll(BooksData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        binding.rvBooks.layoutManager = LinearLayoutManager(this)
        val listBookAdapter = ListBookAdapter(list)
        binding.rvBooks.adapter = listBookAdapter

        listBookAdapter.setOnClickCallback(object : ListBookAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Book) {
                showSelectedBook(data)
            }
        })
    }

    private fun showSelectedBook(book: Book) {
        val moveToDetailIntent = Intent(this,DetailActivity::class.java).apply {
            putExtra(DetailActivity.EXTRA_TITLE, book.title)
            putExtra(DetailActivity.EXTRA_AUTHOR, book.author)
            putExtra(DetailActivity.EXTRA_DETAIL, book.detail)
            putExtra(DetailActivity.EXTRA_ISBN, book.isbn)
            putExtra(DetailActivity.EXTRA_PHOTO, book.photo)
        }
        startActivity(moveToDetailIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_page -> {
                startActivity(Intent(this, AboutActivity::class.java))
            }
        }
    }
}
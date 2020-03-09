package com.example.listapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var celebrityAdapter: CelebriyListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        celebrityAdapter = CelebriyListAdapter(this@MainActivity)
        celebrityListView.adapter = celebrityAdapter
    }
}

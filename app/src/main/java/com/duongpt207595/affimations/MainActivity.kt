package com.duongpt207595.affimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.duongpt207595.affimations.adapter.ItemAdapter
import com.duongpt207595.affimations.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = DataSource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = ItemAdapter(this, myDataset)
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)


    }
}
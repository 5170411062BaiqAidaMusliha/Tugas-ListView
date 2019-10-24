package com.example.listviewicon


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var listdat:RecyclerView
    private var list: ArrayList<getset> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listdat = findViewById(R.id.view)
        listdat.setHasFixedSize(true)

        list.addAll(datalis.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        listdat.layoutManager = LinearLayoutManager(this)
        val listOut = output(list)
        listdat.adapter = listOut

        listOut.setOnItemClickCallback(object : output.OnItemClickCallback {
            override fun onItemClicked(data: getset) {
                showData(data)
            }
        })
    }

    private fun showData(det : getset) {
        Toast.makeText(this, "Kamu memilih :" + det.tittles, Toast.LENGTH_SHORT).show()
    }
}

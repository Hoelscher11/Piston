package com.example.piston

import android.content.Context
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var segmentList = mutableListOf<Model>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        overviewScreen()
    }

    private fun overviewScreen() {
        segmentList.add(Model("Segment A", "A small, subcompact car with high fuel efficiency", R.drawable.perodua_axia))
        segmentList.add(Model("Segment B", "A medium-sized car with balanced performance", R.drawable.proton_persona))
        segmentList.add(Model("Segment C", "A fairly large car with good performance", R.drawable.honda_civic))
        segmentList.add(Model("Segment D", "A large, premium sized car with excellent performance, practical and comfortable", R.drawable.bmw_5_series))



        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = MyAdapter(this, R.layout.row, segmentList)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position==0){
                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra("segment", "Segment A")
                }
                startActivity(intent)
            }
            if (position==1){
                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra("segment", "Segment B")
                }
                startActivity(intent)
            }
            if (position==2){
                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra("segment", "Segment C")
                }
                startActivity(intent)
            }
            if (position==3){
                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra("segment", "Segment D")
                }
                startActivity(intent)
            }
        }
    }
}
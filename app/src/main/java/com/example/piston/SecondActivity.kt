package com.example.piston

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    var segmentData: ArrayList<Detail> = ArrayList()

    var segmentADetail: ArrayList<Detail> = ArrayList()
    var segmentBDetail: ArrayList<Detail> = ArrayList()
    var segmentCDetail: ArrayList<Detail> = ArrayList()
    var segmentDDetail: ArrayList<Detail> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        detailScreen()

        val intent = this.getIntent()
        val segment = intent.getStringExtra("segment")

        if(segment == "Segment A"){
            segmentData = segmentADetail

        } else if(segment == "Segment B"){
            segmentData = segmentBDetail

        } else if(segment == "Segment C"){
            segmentData = segmentCDetail

        } else if(segment == "Segment D"){
            segmentData = segmentDDetail

        }

        supportActionBar?.setTitle(segment)
        val detailView = findViewById<ListView>(R.id.detailView)
        detailView.adapter = DetailAdapter(this, R.layout.detailrow, segmentData)
    }
    private fun detailScreen() {

        segmentADetail.add(Detail("Performance", "Performance is considered adequate because the engine is small compared to other segments.\n\nThe focus of this segment is fuel saving rather than high power output\n\nAverage power output: 70 to 96 HP"))
        segmentADetail.add(Detail("Fuel Consumption", "Fuel consumption rate in this segment is the lowest compared to other segments.\n\nThis is due to its small engine size which is built to use small amount of fuel to produce enough power output.\n\nAverage Fuel Consumption: 18 to 20 KM per litre"))
        segmentADetail.add(Detail("Comfortability", "Comfortability in this segment is very reasonable even though it is not one of the main focus in this segment.\n\nThe comfortability level is a bit low compared to other segments."))
        segmentADetail.add(Detail("Maintenance Price", "Maintenance price is very affordable.\n\ncars in this segment are mostly from local companies which means spare parts and other things are available at a very reasonable price."))

        segmentBDetail.add(Detail("Performance", "Performance is fairly balanced between fuel saving and power output.\n\nThe engine produces fairly good amount of power while saving fuel.\n\nAverage power output: 102 to 120 HP"))
        segmentBDetail.add(Detail("Fuel Consumption", "Fuel Consumption is a bit higher compared to segment A but still considered as low.\n\nAverage fuel Consumption: 15 to 18 KM per litre"))
        segmentBDetail.add(Detail("Comfortability", "Comfortability is good for a medium-sized car.\n\nThe interior is a bit spacious compared segment A."))
        segmentBDetail.add(Detail("Maintenance Price", "Maintenance price is still affordable.\n\nSome companies like Perodua, Honda and Toyota share spare parts between their cars either from segment A or B.\n\nThis means that repair and service cost is the same or a bit higher than segment A cars."))

        segmentCDetail.add(Detail("Performance", "Performance is very good and in fact, some European cars in this segment have quite lots of power.\n\nJapanese cars still aside with fuel saving but still making a very good power output.\n\nAverage power output: 150 to 200 HP"))
        segmentCDetail.add(Detail("Fuel Consumption", "Fuel consumption is fairly decent and varied according to driving style and environment.\n\nCars in this segment mostly use big engines and intended for long distances travel.\n\nAverage fuel consumption: 14 to 16 KM per litre"))
        segmentCDetail.add(Detail("Comfortability", "Comfortability is a lot better in this segment.\n\nThe interior is spacious and ride comfort is better."))
        segmentCDetail.add(Detail("Maintenance Price", "Maintenance price is considered reasonable.\n\nEuropean cars may cost more to maintain than Japanese cars"))

        segmentDDetail.add(Detail("Performance", "Performance is the same or a bit increased compared to segment C cars.\n\nHowever, European cars have increased a lot in terms of power.\n\nAverage power output: 200 to 250 HP"))
        segmentDDetail.add(Detail("Fuel Consumption", "Fuel consumption is the highest compared to other segments.\n\nCars in this segment is made for long distance travel.\n\nLow fuel consumption can only be achieved during long distances travel but not in city driving.\n\nAverage fuel consumption: 14 to 16 KM per litre."))
        segmentDDetail.add(Detail("Comfortability", "Comfortability level in this segment is quite a premium.\n\nThe interior spaces are a lot spacious compared to other segments."))
        segmentDDetail.add(Detail("Maintenance Price", "Maintenance price is the highest in this segment compared to other segments.\n\nEuropean cars may cost more to maintain than Japanese cars."))
    }
}
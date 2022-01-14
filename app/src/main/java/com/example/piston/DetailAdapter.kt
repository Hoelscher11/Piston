package com.example.piston

import android.content.Context
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import java.io.Serializable
import java.util.ArrayList

class DetailAdapter(val mCtx: Context, var resources:Int, var items: List<Detail>): ArrayAdapter<Detail>(mCtx, resources, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resources, null)

        val aspectView: TextView = view.findViewById(R.id.aspect)
        val aspectDetailView: TextView = view.findViewById(R.id.aspectDetail)

        var mItem: Detail = items[position]
        aspectView.text = mItem.aspect
        aspectDetailView.text = mItem.description

        return view
    }
}
package com.example.piston

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MyAdapter(val mCtx: Context, var resources:Int, var items: List<Model>): ArrayAdapter<Model>(mCtx, resources, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView: ImageView = view.findViewById(R.id.image)
        val segmentTitleView: TextView = view.findViewById(R.id.segmentTitle)
        val segmentSummaryView: TextView = view.findViewById(R.id.segmentSummary)

        var mItem: Model = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        segmentTitleView.text = mItem.segmentTitle
        segmentSummaryView.text = mItem.segmentSummary

        return view
    }
}
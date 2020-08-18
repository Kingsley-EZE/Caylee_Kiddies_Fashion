package com.example.cayleekiddiesfashion.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.cayleekiddiesfashion.R
import com.example.cayleekiddiesfashion.model.LanguageItem

class LanguageAdapter(var context: Context, var arrayList: ArrayList<LanguageItem>) :BaseAdapter() {

    override fun getItem(p0: Int): Any {
        return arrayList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view:View = View.inflate(context, R.layout.card_view_item_grid, null)
        var icons:ImageView = view.findViewById(R.id.icons)
        var names:TextView = view.findViewById(R.id.names)

        var listItem:LanguageItem = arrayList.get(p0)

        icons.setImageResource(listItem.icons!!)
        names.text = listItem.name


        return view
    }
}
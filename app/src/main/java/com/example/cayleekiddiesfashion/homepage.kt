package com.example.cayleekiddiesfashion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.example.cayleekiddiesfashion.adapters.LanguageAdapter
import com.example.cayleekiddiesfashion.model.LanguageItem

class homepage : AppCompatActivity(), AdapterView.OnItemClickListener {
    private var arrayList:ArrayList<LanguageItem>? = null
    private var gridView: GridView? = null
    private var languageAdapters: LanguageAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kiddies_categories)


        gridView = findViewById(R.id.grid_view_list)
        arrayList = ArrayList()
        arrayList = setDataList()
        languageAdapters = LanguageAdapter(applicationContext, arrayList!!)
        gridView?.adapter = languageAdapters
        gridView?.onItemClickListener = this
    }

    private fun setDataList(): ArrayList<LanguageItem>{

        var arrayList:ArrayList<LanguageItem> = ArrayList()
        arrayList.add(LanguageItem(R.drawable.shorts, "Shorts"))
        arrayList.add(LanguageItem(R.drawable.laces, "Laces"))
        arrayList.add(LanguageItem(R.drawable.traditional, "Traditional"))
        arrayList.add(LanguageItem(R.drawable.formal, "Formal"))
        arrayList.add(LanguageItem(R.drawable.ballgowns, "Ball Gowns"))
       // arrayList.add(LanguageItem(R.drawable.modern, "Modern"))
        arrayList.add(LanguageItem(R.drawable.longsleeve, "Long sleeve"))
       // arrayList.add(LanguageItem(R.drawable.prom, "Prom"))
        return  arrayList
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items:LanguageItem = arrayList!!.get(position)
        Toast.makeText(applicationContext, items.name, Toast.LENGTH_SHORT).show()

        if (position == 0){
            val intent = Intent(this@homepage,ShortsCategory::class.java)
            startActivity(intent)
        }
    }
    
    

override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater:MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about){
            Toast.makeText(this, "About us", Toast.LENGTH_SHORT).show()
            return true
        }

        else if (item.itemId == R.id.contact){
            Toast.makeText(this, "Contact us", Toast.LENGTH_SHORT).show()
            return true
        }


        return super.onOptionsItemSelected(item)
    }
}


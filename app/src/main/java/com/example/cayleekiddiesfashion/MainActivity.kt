package com.example.cayleekiddiesfashion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.example.cayleekiddiesfashion.adapters.LanguageAdapter
import com.example.cayleekiddiesfashion.model.LanguageItem

class MainActivity : AppCompatActivity() , AdapterView.OnItemClickListener {
        private var arrayList:ArrayList<LanguageItem>? = null
        private var gridView:GridView? = null
        private var languageAdapters:LanguageAdapter? = null
        private val time = 3000
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    Handler().postDelayed({
        val intent = Intent(this@MainActivity,homepage::class.java)
        startActivity(intent)
        finish()
    }, time.toLong())

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
        arrayList.add(LanguageItem(R.drawable.modern, "Modern"))
        arrayList.add(LanguageItem(R.drawable.longsleeve, "Long sleeve"))
        arrayList.add(LanguageItem(R.drawable.prom, "Prom"))
        return  arrayList
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items:LanguageItem = arrayList!!.get(position)
        Toast.makeText(applicationContext, items.name, Toast.LENGTH_SHORT).show()
    }
}


//    var title = arrayOf("Shorts","Laces","Traditional","Formal","Ball Gowns","Modern","Long Sleeve","Prom")
//    var images = intArrayOf(R.drawable.shorts,R.drawable.laces,R.drawable.traditional,R.drawable.formal,R.drawable.ballgowns,R.drawable.modern,R.drawable.longsleeve,R.drawable.prom)



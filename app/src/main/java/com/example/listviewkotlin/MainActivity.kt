package com.example.listviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private val dataSource = arrayOf("Sunday","Monday","Tuesday","Thursday","Friday","Saturday","Sunday")
    private lateinit var arrayAdapter : ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView : ListView = findViewById(R.id.list_view)
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,dataSource)
        listView.adapter = arrayAdapter
        listView.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val textView : TextView = view as TextView
        Toast.makeText(this,"${textView.text} $position",Toast.LENGTH_SHORT).show()
    }
}
package com.aldion.submission1githubuser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aldion.submission1githubuser.adapter.ListAccountAdapter
import com.aldion.submission1githubuser.model.Accounts
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {
    private lateinit var rvAccouts: RecyclerView
    private val list = ArrayList<Accounts>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAccouts = findViewById(R.id.rv_accounts)
        rvAccouts.setHasFixedSize(true)
        list.addAll(listAccount)
        showRecyclerList()
    }

    private val listHeroes: ArrayList<Accounts>
        get() {
            val gson = Gson()
            val itemType = object : TypeToken<List<Accounts>>() {}.type
            var listAccount = ArrayList<Accounts>()
            listAccount = gson.fromJson<List<Accounts>>(itemListJsonString, itemType)
//            val dataName = resources.getStringArray(R.array.data_name)
//            val dataDescription = resources.getStringArray(R.array.data_description)
//            val dataPhoto = resources.obtainTypedArray(R.array.data_photo)

            for (i in dataName.indices) {
                val hero = Hero(dataName[i], dataDescription[i], dataPhoto.getResourceId(i, -1))
                listHero.add(hero)
            }
            return listHero
        }

    private fun showRecyclerList() {
        rvAccouts.layoutManager = LinearLayoutManager(this)
        val listAccountAdapter = ListAccountAdapter(list)
        rvAccouts.adapter = listAccountAdapter
    }
}
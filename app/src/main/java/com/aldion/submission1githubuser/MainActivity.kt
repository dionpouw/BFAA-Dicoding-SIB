package com.aldion.submission1githubuser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aldion.submission1githubuser.adapter.ListAccountAdapter
import com.aldion.submission1githubuser.model.Accounts

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

    private val listAccount: ArrayList<Accounts>
        get() {
            val dataName = resources.getStringArray(R.array.name)
            val dataUsername = resources.getStringArray(R.array.username)
            val dataPhoto = resources.obtainTypedArray(R.array.avatar)
            val dataCompany = resources.getStringArray(R.array.company)
            val dataLocation = resources.getStringArray(R.array.location)
            val dataRepository = resources.getStringArray(R.array.repository)
            val dataFollowers = resources.getStringArray(R.array.followers)
            val dataFollowing = resources.getStringArray(R.array.following)
            val listAccount = ArrayList<Accounts>()
            for (i in dataName.indices) {
                val account = Accounts(
                    dataName[i],
                    dataUsername[i],
                    dataPhoto.getResourceId(i, -1),
                    dataCompany[i],
                    dataLocation[i],
                    dataRepository[i],
                    dataFollowers[i],
                    dataFollowing[i]
                )
                listAccount.add(account)
            }
            return listAccount
        }

    private fun showRecyclerList() {
        rvAccouts.layoutManager = LinearLayoutManager(this)
        val listAccountAdapter = ListAccountAdapter(list)
        rvAccouts.adapter = listAccountAdapter
    }
}
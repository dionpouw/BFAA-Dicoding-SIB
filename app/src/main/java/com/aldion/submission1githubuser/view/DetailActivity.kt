package com.aldion.submission1githubuser.view

import android.accounts.Account
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aldion.submission1githubuser.R
import com.aldion.submission1githubuser.model.Accounts

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.item_detail_name)
        val imgAvatar: ImageView = findViewById(R.id.item_detail_avatar)
        val tvUsername: TextView = findViewById(R.id.item_detail_username)
        val tvRepository :TextView = findViewById(R.id.item_detail_repository)
        val tvFollowing: TextView = findViewById(R.id.item_detail_following)
        val tvFollowers: TextView = findViewById(R.id.item_detail_followers)
        val tvCompany: TextView = findViewById(R.id.item_detail_location)
        val tvLocation: TextView = findViewById(R.id.item_detail_company)

        val account = intent.getParcelableExtra<Account>(EXTRA_PERSON) as Accounts
        tvName.text = account.name
        imgAvatar.setImageResource(account.avatar)
        tvRepository.text = account.repository
        tvUsername.text = account.username
        tvFollowing.text = account.following
        tvFollowers.text = account.followers
        tvCompany.text = account.company
        tvLocation.text = account.location
    }
}
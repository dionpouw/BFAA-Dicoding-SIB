package com.aldion.submission1githubuser.view

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aldion.submission1githubuser.R
import com.aldion.submission1githubuser.model.Accounts
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.item_detail_name)
        val imgAvatar: ImageView = findViewById(R.id.item_detail_avatar)
        val tvUsername: TextView = findViewById(R.id.item_detail_username)
        val tvRepository: TextView = findViewById(R.id.item_detail_repository)
        val tvFollowing: TextView = findViewById(R.id.item_detail_following)
        val tvFollowers: TextView = findViewById(R.id.item_detail_followers)
        val tvCompany: TextView = findViewById(R.id.item_detail_location)
        val tvLocation: TextView = findViewById(R.id.item_detail_company)

        val account = intent.getParcelableExtra<Accounts>(EXTRA_PERSON) as Accounts
        val usernameFinal = "@${account.username}"
        tvName.text = account.name
        imgAvatar.setImageResource(account.avatar)
        Glide.with(this)
            .load(account.avatar).thumbnail(0.9f)
            .into(imgAvatar)
        tvRepository.text = account.repository
        tvUsername.text = usernameFinal
        tvFollowing.text = account.following
        tvFollowers.text = account.followers
        tvCompany.text = account.company
        tvLocation.text = account.location
    }

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }
}
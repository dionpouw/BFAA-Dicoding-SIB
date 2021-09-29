package com.aldion.submission1githubuser.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Accounts(
    val name: String,
    val username: String,
    val avatar: Int,
    val location: String,
    val company: String,
    val repository: String,
    val followers: String,
    val following: String,
) : Parcelable
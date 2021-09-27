package com.aldion.submission1githubuser.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Accounts(
    var name: String,
    var username: String,
    var avatar: Int,
    var location: String,
    var company: String,
    var repository: String,
    var followers: String,
    var following: String,
) : Parcelable
package com.example.githubuserapps

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


data class Keluaran(
    @SerializedName("items")
    val result: ArrayList<User>
)

@Parcelize
@Entity(tableName = "favoriteuser")
data class User (
        @SerializedName("login")
        @PrimaryKey
        @NonNull
        val username: String,
        @SerializedName("avatar_url")
        val photo: String?,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("location")
        var location: String? = null,
        @SerializedName("public_repos")
        var repository: String? = null,
        @SerializedName("company")
        var company: String? = null,
        @SerializedName("followers")
        var followers: String? = null,
        @SerializedName("following")
        var following: String? = null,
        @SerializedName("followers_url")
        var followers_url: String? = null,
        @SerializedName("following_url")
        var following_url: String? = null
) : Parcelable
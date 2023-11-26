package com.example.mygithubuser

import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @GET("users/{username}")
    fun getDetailUser(
        @Path("username") username: String
    ): Call<DetailResponse>

    @GET("search/users")
    fun getUser(
        @Query("q") login: String
    ): Call<DetailResponse>

    @GET("users/{username}/followers")
    fun getFollower(
        @Path("username") username: String
    ): Call<DetailResponse>

    @GET("users/{username}/following")
    fun getFollowing(
        @Path("username") username: String
    ): Call<DetailResponse>
}
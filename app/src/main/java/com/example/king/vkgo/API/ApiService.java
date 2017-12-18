package com.example.king.vkgo.API;
import com.example.king.vkgo.API.model.Account.UserAccountResponse;
import com.example.king.vkgo.API.model.Newsfeed.NewsFeedResponse;
import com.example.king.vkgo.API.model.Users.UserDetailInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by KING on 14.12.2017.
 */

public interface ApiService {
    //todo
    //https://api.vk.com/method/METHOD_NAME?PARAMETERS&access_token=ACCESS_TOKEN&v=V
    //https://api.vk.com/method/account.getProfileInfo?access_token=88241f7dae9db5e8eb3ad5ee4a85a3bfaca2f73b98ef8cd9535282a244e5b2d42107e92b06a8f225d90ac&v=5.69

    //Account
    @GET("account.getProfileInfo")
    Call<UserAccountResponse>getProfileInfo();


    //Users
    @GET("users.get")
    Call<UserDetailInfo>getUserDetailInfo(@Query("user_ids") String user_ids, @Query("fields") String fields);

    //NewsFeed
    @GET("newsfeed.get")
    Call<NewsFeedResponse>getNewsFeed(@Query("filters") String filters);
}

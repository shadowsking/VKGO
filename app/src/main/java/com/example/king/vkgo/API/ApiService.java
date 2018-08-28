package com.example.king.vkgo.API;
import com.example.king.vkgo.API.model.Account.UserAccountResponse;
import com.example.king.vkgo.API.model.Newsfeed.NewsFeedResponse;
import com.example.king.vkgo.API.model.Users.UserDetailInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by KING on 14.12.2017.
 */

public interface ApiService {

    //Account
    @GET("account.getProfileInfo")
    Observable<UserAccountResponse>getProfileInfo();

    //Users
    @GET("users.get")
    Observable<UserDetailInfo> getUserDetailInfo(@Query("user_ids") String user_ids, @Query("fields") String fields);


    //NewsFeed
    @GET("newsfeed.get")
    Observable<NewsFeedResponse>getNewsFeed(@Query("filters") String filters);
}

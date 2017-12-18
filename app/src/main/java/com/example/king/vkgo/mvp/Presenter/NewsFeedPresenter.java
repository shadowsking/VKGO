package com.example.king.vkgo.mvp.Presenter;

import com.example.king.vkgo.API.NetworkManager;
import com.example.king.vkgo.API.model.Newsfeed.NewsFeedResponse;
import com.example.king.vkgo.API.model.Users.UserDetailInfo;
import com.example.king.vkgo.mvp.Base.BasePresenter;
import com.example.king.vkgo.mvp.View.NewsFeed.NewsFeedView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by KING on 17.12.2017.
 */

public class NewsFeedPresenter extends BasePresenter<NewsFeedView>{
    private NetworkManager mNetworkManager;
    private String access_token;
    private String user_id;

    public NewsFeedPresenter(String access_token, String user_id){
        this.access_token = access_token;
        this.user_id = user_id;
        mNetworkManager = new NetworkManager(access_token);
        //Method toDO
        getNewsFeed("post");
    }

    public void getNewsFeed(String filters){
        mNetworkManager.getmApiService().getNewsFeed(filters).enqueue(new Callback<NewsFeedResponse>() {
            @Override
            public void onResponse(Call<NewsFeedResponse> call, Response<NewsFeedResponse> response) {
                getView().onNewsFeed(response.body());
            }

            @Override
            public void onFailure(Call<NewsFeedResponse> call, Throwable t) {
            }
        });
    }
}

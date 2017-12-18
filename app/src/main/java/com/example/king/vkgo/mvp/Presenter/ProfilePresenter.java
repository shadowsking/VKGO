package com.example.king.vkgo.mvp.Presenter;

import android.util.Log;
import com.example.king.vkgo.API.NetworkManager;
import com.example.king.vkgo.API.model.Account.UserAccountResponse;
import com.example.king.vkgo.API.model.Users.UserDetailInfo;
import com.example.king.vkgo.Constants;
import com.example.king.vkgo.mvp.Base.BasePresenter;
import com.example.king.vkgo.mvp.View.Profile.ProfileView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by KING on 16.12.2017.
 */

public class ProfilePresenter extends BasePresenter<ProfileView>{
    private NetworkManager mNetworkManager;
    private String access_token;
    private String user_id;
    private UserDetailInfo userDetailInfo;

    public ProfilePresenter(String access_token, String user_id){
        this.access_token = access_token;
        this.user_id = user_id;
        mNetworkManager = new NetworkManager(access_token);

        getUserDetailInfo(user_id, Constants.fields);
        //getUser();
    }

    public void getProfileInfo(){
        mNetworkManager.getmApiService().getProfileInfo().enqueue(new Callback<UserAccountResponse>() {
            @Override
            public void onResponse(Call<UserAccountResponse> call, Response<UserAccountResponse> response) {
                Log.d("Response", response.body().getResponse().toString());
                getView().onProfileInfo(response.body());
            }
            @Override
            public void onFailure(Call<UserAccountResponse> call, Throwable t) {
            }
        });
    }

    /*
    public void getUser(){
        getUserDetailInfo(user_id, Constants.fields);
        getView().onUserDetailInfo(userDetailInfo);
    }*/

    public void getUserDetailInfo(String user_id, String fields){
        mNetworkManager.getmApiService().getUserDetailInfo(user_id, fields).enqueue(new Callback<UserDetailInfo>() {
            @Override
            public void onResponse(Call<UserDetailInfo> call, Response<UserDetailInfo> response) {
                getView().onUserDetailInfo(response.body());
                //setUserDetailInfo(response.body());
            }

            @Override
            public void onFailure(Call<UserDetailInfo> call, Throwable t) {
            }
        });
    }


    /*
    public void setUserDetailInfo(UserDetailInfo userDetailInfo){
        this.userDetailInfo = userDetailInfo;
    }

    public UserDetailInfo returnUserDeatailInfo(){
        return userDetailInfo;
    }*/
}

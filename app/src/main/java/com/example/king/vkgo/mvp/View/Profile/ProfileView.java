package com.example.king.vkgo.mvp.View.Profile;

import com.example.king.vkgo.API.model.Account.UserAccountResponse;
import com.example.king.vkgo.API.model.Users.UserDetailInfo;
import com.example.king.vkgo.mvp.Base.BaseView;

/**
 * Created by KING on 16.12.2017.
 */

public interface ProfileView extends BaseView{
    void onProfileInfo(UserAccountResponse response);
    void onUserDetailInfo(UserDetailInfo response);

}

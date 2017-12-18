package com.example.king.vkgo.mvp.View.NewsFeed;
import com.example.king.vkgo.API.model.Newsfeed.NewsFeedResponse;
import com.example.king.vkgo.mvp.Base.BaseView;

/**
 * Created by KING on 17.12.2017.
 */

public interface NewsFeedView extends BaseView{
    void onNewsFeed(NewsFeedResponse response);
}

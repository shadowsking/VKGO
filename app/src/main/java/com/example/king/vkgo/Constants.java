package com.example.king.vkgo;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebView;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by KING on 14.12.2017.
 */

public class Constants {
    public static final String redirect_URL = "https://oauth.vk.com/blank.html";
    public static final String auth_URL = "https://oauth.vk.com/authorize";
    public static final String clientID = "6298085";
    public static final String scope = "140571934";
    private SharedPreferences sharedPreferences;

    //user.get
    public static final String fields = "photo_id, verified, sex, bdate, city, " +
            "country, home_town, has_photo, photo_50, photo_100, photo_200_orig, photo_200, " +
            "photo_400_orig, photo_max, photo_max_orig, online, domain, has_mobile, contacts, site, " +
            "education, universities, schools, status, last_seen, followers_count, common_count, " +
            "occupation, nickname, relatives, relation, personal, connections, exports, " +
            "wall_comments, activities, interests, music, movies, tv, books, games, about, quotes, " +
            "can_post, can_see_all_posts, can_see_audio, can_write_private_message, " +
            "can_send_friend_request, is_favorite, is_hidden_from_feed, timezone, screen_name, " +
            "maiden_name, crop_photo, is_friend, friend_status, career, military, blacklisted, " +
            "blacklisted_by_me";


    public void saveInSharedPreferences(String key, String value, Context context){
        sharedPreferences = context.getSharedPreferences("Setting", MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(key, value);
        edit.commit();
    }

    public String getToken(Context context){
        sharedPreferences = context.getSharedPreferences("Setting", MODE_PRIVATE);
        return sharedPreferences.getString("ACCESS_TOKEN","");
    }

    public String getUserId(Context context){
        sharedPreferences = context.getSharedPreferences("Setting", MODE_PRIVATE);
        return sharedPreferences.getString("USER_ID","");
    }
}

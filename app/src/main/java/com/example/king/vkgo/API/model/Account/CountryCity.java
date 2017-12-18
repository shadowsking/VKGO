package com.example.king.vkgo.API.model.Account;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by KING on 14.12.2017.
 */

class CountryCity implements Serializable {
    @SerializedName("id")
    private int mId;
    @SerializedName("title")
    private String mTitle;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}

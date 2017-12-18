package com.example.king.vkgo.API.model.Account;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by KING on 14.12.2017.
 */

class RelationParthnerResponse implements Serializable {
    //toDO НЕ ТОЧНАЯ ИНФА

    @SerializedName("id")
    private String mId;
    @SerializedName("first_name")
    private String mFirstName;

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }
}

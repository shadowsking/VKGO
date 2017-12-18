package com.example.king.vkgo.API.model.Account;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by KING on 14.12.2017.
 */

class NameRequestResponse implements Serializable {
    @SerializedName("id")
    private int mId;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("last_name")
    private String mLastName;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }
}

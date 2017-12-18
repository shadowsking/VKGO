package com.example.king.vkgo.API.model.Account;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by KING on 14.12.2017.
 */


public class UserAccountInfoResponse  implements Serializable {
    //getProfileInfo
    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("last_name")
    private String mLastName;
    @SerializedName("maiden_name")
    private String mMaidenName;
    @SerializedName("screen_name")
    private String mScreenName;
    @SerializedName("sex")
    private int mSex;
    @SerializedName("relation")
    private int mRelation;
    @SerializedName("relation_partner")
    private RelationParthnerResponse mRelationParthner;
    @SerializedName("relation_pending ")
    private int mRelationPending;
    @SerializedName("relation_requests")
    private List<RelationParthnerResponse> mRelationRequest;
    @SerializedName("bdate")
    private String mBdate;
    @SerializedName("bdate_visibility")
    private int mBdateVisibility;
    @SerializedName("home_town")
    private String mHomeTown;
    @SerializedName("country")
    private CountryCity mCountry;
    @SerializedName("city")
    private CountryCity mCity;
    @SerializedName("name_request")
    private NameRequestResponse mNameRequest;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("phone")
    private String mPhone;

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

    public String getmMaidenName() {
        return mMaidenName;
    }

    public void setmMaidenName(String mMaidenName) {
        this.mMaidenName = mMaidenName;
    }

    public String getmScreenName() {
        return mScreenName;
    }

    public void setmScreenName(String mScreenName) {
        this.mScreenName = mScreenName;
    }

    public int getmSex() {
        return mSex;
    }

    public void setmSex(int mSex) {
        this.mSex = mSex;
    }

    public int getmRelation() {
        return mRelation;
    }

    public void setmRelation(int mRelation) {
        this.mRelation = mRelation;
    }

    public RelationParthnerResponse getmRelationParthner() {
        return mRelationParthner;
    }

    public void setmRelationParthner(RelationParthnerResponse mRelationParthner) {
        this.mRelationParthner = mRelationParthner;
    }

    public int getmRelationPending() {
        return mRelationPending;
    }

    public void setmRelationPending(int mRelationPending) {
        this.mRelationPending = mRelationPending;
    }

    public List<RelationParthnerResponse> getmRelationRequest() {
        return mRelationRequest;
    }

    public void setmRelationRequest(List<RelationParthnerResponse> mRelationRequest) {
        this.mRelationRequest = mRelationRequest;
    }


    public String getmBdate() {
        return mBdate;
    }

    public void setmBdate(String mBdate) {
        this.mBdate = mBdate;
    }

    public int getmBdateVisibility() {
        return mBdateVisibility;
    }

    public void setmBdateVisibility(int mBdateVisibility) {
        this.mBdateVisibility = mBdateVisibility;
    }

    public String getmHomeTown() {
        return mHomeTown;
    }

    public void setmHomeTown(String mHomeTown) {
        this.mHomeTown = mHomeTown;
    }


    public CountryCity getmCountry() {
        return mCountry;
    }

    public void setmCountry(CountryCity mCountry) {
        this.mCountry = mCountry;
    }

    public CountryCity getmCity() {
        return mCity;
    }

    public void setmCity(CountryCity mCity) {
        this.mCity = mCity;
    }

    public NameRequestResponse getmNameRequest() {
        return mNameRequest;
    }

    public void setmNameRequest(NameRequestResponse mNameRequest) {
        this.mNameRequest = mNameRequest;
    }
    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    @Override
    public String toString() {
        return "UserAccountInfoResponse{" +
                "mFirstName='" + mFirstName + '\'' +
                ", mLastName='" + mLastName + '\'' +
                ", mMaidenName='" + mMaidenName + '\'' +
                ", mScreenName='" + mScreenName + '\'' +
                ", mSex=" + mSex +
                ", mRelation=" + mRelation +
                ", mRelationParthner=" + mRelationParthner +
                ", mRelationPending=" + mRelationPending +
                ", mRelationRequest=" + mRelationRequest +
                ", mBdate='" + mBdate + '\'' +
                ", mBdateVisibility=" + mBdateVisibility +
                ", mHomeTown='" + mHomeTown + '\'' +
                ", mCountry=" + mCountry +
                ", mCity=" + mCity +
                ", mNameRequest=" + mNameRequest +
                ", mStatus='" + mStatus + '\'' +
                ", mPhone='" + mPhone + '\'' +
                '}';
    }
}

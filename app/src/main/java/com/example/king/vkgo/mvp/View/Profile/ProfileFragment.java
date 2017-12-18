package com.example.king.vkgo.mvp.View.Profile;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.king.vkgo.API.model.Account.UserAccountResponse;
import com.example.king.vkgo.API.model.Users.UserDetailInfo;
import com.example.king.vkgo.Constants;
import com.example.king.vkgo.R;
import com.example.king.vkgo.mvp.Presenter.ProfilePresenter;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileFragment extends Fragment implements ProfileView{

    //Основная информация
    @BindView(R.id.avatarImage)
    ImageView avatarImage;
    @BindView(R.id.userName)
    TextView userName;
    @BindView(R.id.bDate)
    TextView bDate;
    @BindView(R.id.online)
    TextView online;

    //Контактная информация
    @BindView(R.id.city)
    TextView city;

    private ProfilePresenter mProfilePresenter;

    public static Fragment newInstance() {
        Bundle args = new Bundle();
        Fragment fragment = new ProfileFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_profile, container, false);
        Constants constants = new Constants();
        mProfilePresenter = new ProfilePresenter(constants.getToken(view.getContext()), constants.getUserId(view.getContext()));
        mProfilePresenter.attachView(this);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //ButterKnife.bind(this, view);
    }


    @Override
    public void onProfileInfo(UserAccountResponse response) {
        //textView.setText(response.getResponse().getmLastName() + " " + response.getResponse().getmFirstName());
    }

    @Override
    public void onUserDetailInfo(UserDetailInfo response) {
        //Основная информация
        UserDetailInfo.ResponseBean rBeen = response.getResponse().get(0);
        Glide
                .with(this)
                .load(rBeen.getPhoto_100())
                .into(avatarImage);
        userName.setText(rBeen.getLast_name() + " " + rBeen.getFirst_name());
        bDate.setText(rBeen.getBdate());
        if(rBeen.getOnline()!=0) online.setText("Online");
        else online.setText("Offline");

        //Контактная информация
        city.setText(city.getText() + rBeen.getCity().getTitle());
        city.setVisibility(View.VISIBLE);
    }
}

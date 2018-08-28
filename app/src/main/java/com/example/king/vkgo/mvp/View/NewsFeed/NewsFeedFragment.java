package com.example.king.vkgo.mvp.View.NewsFeed;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.king.vkgo.API.model.Newsfeed.NewsFeedResponse;
import com.example.king.vkgo.Constants;
import com.example.king.vkgo.R;

import android.support.v7.widget.LinearLayoutManager;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by KING on 16.12.2017.
 */

public class NewsFeedFragment extends Fragment implements NewsFeedView{
    @BindView(R.id.newsFeedRecyclerView)
    RecyclerView recyclerView;
    NewsFeedAdapter adapter = new NewsFeedAdapter();


    private NewsFeedPresenter mNewsFeedPresenter;

    public static Fragment newInstance() {

        Bundle args = new Bundle();
        Fragment fragment = new NewsFeedFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_newsfeed, container, false);
        Constants constants = new Constants();
        mNewsFeedPresenter = new NewsFeedPresenter(constants.getToken(view.getContext()), constants.getUserId(view.getContext()));
        mNewsFeedPresenter.attachView(this);
        ButterKnife.bind(this, view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onNewsFeed(NewsFeedResponse response) {
        Log.d("onNewsFeed", "YES");
        adapter.addData(response.getResponse().getItems(), response.getResponse());
    }
}

package com.example.king.vkgo.mvp.View;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.example.king.vkgo.R;
import com.example.king.vkgo.mvp.View.NewsFeed.NewsFeedFragment;
import com.example.king.vkgo.mvp.View.Profile.ProfileFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import butterknife.BindView;
import butterknife.ButterKnife;

public class TestActivity extends AppCompatActivity {
    @BindView(R.id.navigation)
    BottomNavigationView mNavigationView;
    private String mKeySelectedItem = "SELECTED_ITEM";
    private int mSelectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

        mNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectFragment(item);
                return false;
            }
        });
        MenuItem selectedItem;
        if(savedInstanceState!=null){
            mSelectedItem = savedInstanceState.getInt(mKeySelectedItem, 0);
            selectedItem = mNavigationView.getMenu().findItem(mSelectedItem);
        } else selectedItem = mNavigationView.getMenu().getItem(0);
        selectFragment(selectedItem);
    }

    @Override
    public void onBackPressed() {
        MenuItem homeItem = mNavigationView.getMenu().getItem(0);
        if (mSelectedItem != homeItem.getItemId()) {
            selectFragment(homeItem);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(mKeySelectedItem, mSelectedItem);
        super.onSaveInstanceState(outState);
    }

    private void selectFragment(MenuItem item){
        Fragment fragment = null;
        MenuItem menuItem;
        if(mSelectedItem!=item.getItemId()){
            switch (item.getItemId()) {
                case R.id.newsfeed: {
                    fragment = NewsFeedFragment.newInstance();
                    menuItem = mNavigationView.getMenu().getItem(0);
                    menuItem.setChecked(menuItem.getItemId() == item.getItemId());
                    break;
                }
                case R.id.profile: {
                    fragment = ProfileFragment.newInstance();
                    menuItem = mNavigationView.getMenu().getItem(2);
                    menuItem.setChecked(menuItem.getItemId() == item.getItemId());
                    break;
                }
            }
        }
        mSelectedItem = item.getItemId();
        if(fragment!=null){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout, fragment, fragment.getTag());
            fragmentTransaction.commit();
        }
    }
}

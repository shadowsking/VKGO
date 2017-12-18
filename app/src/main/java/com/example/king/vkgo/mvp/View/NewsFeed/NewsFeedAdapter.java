package com.example.king.vkgo.mvp.View.NewsFeed;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.king.vkgo.API.model.Newsfeed.NewsFeedResponse;
import com.example.king.vkgo.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import static java.lang.Math.abs;

/**
 * Created by KING on 17.12.2017.
 */

public class NewsFeedAdapter extends  RecyclerView.Adapter<NewsFeedAdapter.ViewHolder>{
    private List<NewsFeedResponse.ResponseBean.ItemsBeanXXXX> mList;
    private NewsFeedResponse.ResponseBean newsFeedResponse;

    public NewsFeedAdapter(){
        mList = new ArrayList<>();
    }

    public void addData(List<NewsFeedResponse.ResponseBean.ItemsBeanXXXX> data, NewsFeedResponse.ResponseBean newsFeedResponse){
        mList.addAll(data);
        this.newsFeedResponse = newsFeedResponse;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_newsfeed, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        List<NewsFeedResponse.ResponseBean.ProfilesBean> profile = newsFeedResponse.getProfiles();
        List<NewsFeedResponse.ResponseBean.GroupsBean> groups = newsFeedResponse.getGroups();
        List<NewsFeedResponse.ResponseBean.ItemsBeanXXXX> items = newsFeedResponse.getItems();

        for(int i=0; i<profile.size(); i++){
            if(profile.get(i).getId() == items.get(position).getSource_id()){
                Glide
                        .with(holder.itemView)
                        .load(profile.get(i).getPhoto_50())
                        .into(holder.avatar);

                holder.userName.setText(profile.get(i).getFirst_name() + " " + profile.get(i).getLast_name());
            }
        }

        for(int i=0; i<groups.size(); i++) {
            if (groups.get(i).getId() == abs(items.get(position).getSource_id())) {
                Glide
                        .with(holder.itemView)
                        .load(groups.get(i).getPhoto_50())
                        .into(holder.avatar);
                holder.userName.setText(groups.get(i).getName());
            }
        }

        holder.text.setText(items.get(position).getText());


        if(items.get(position).getCopy_history()!=null) {
            holder.text.setText(holder.text.getText() + "\n" + items.get(position).getCopy_history().get(0).getText());
        }



        if(items.get(position).getAttachments()!=null) {
            String type = items.get(position).getAttachments().get(0).getType();
            if (Objects.equals(type, "photo")) {
                Glide
                        .with(holder.itemView)
                        .load(items.get(position).getAttachments().get(0).getPhoto().getPhoto_604())
                        .into(holder.postImage);
            }

            if (Objects.equals(type, "video")) {
                Glide
                        .with(holder.itemView)
                        .load(items.get(position).getAttachments().get(0).getVideo().getPhoto_640())
                        .into(holder.postImage);
            }

            if (Objects.equals(type, "link")) {
                Glide
                        .with(holder.itemView)
                        .load(items.get(position).getAttachments().get(0).getLink().getPhoto().getPhoto_604())
                        .into(holder.postImage);
            }
        }
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.textNewsFeed)
        TextView text;
        @BindView(R.id.avatarNewsFeedImage)
        ImageView avatar;
        @BindView(R.id.userNameNewsFeed)
        TextView userName;
        @BindView(R.id.postImage)
        ImageView postImage;
        @BindView(R.id.item_news)
        LinearLayout linearLayout;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

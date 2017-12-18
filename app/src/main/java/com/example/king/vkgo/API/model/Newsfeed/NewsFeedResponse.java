package com.example.king.vkgo.API.model.Newsfeed;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by KING on 17.12.2017.
 */

public class NewsFeedResponse {
    private ResponseBean response;

    public static NewsFeedResponse objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), NewsFeedResponse.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class ResponseBean {

        private String next_from;
        private List<ItemsBeanXXXX> items;
        private List<ProfilesBean> profiles;
        private List<GroupsBean> groups;

        public static ResponseBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ResponseBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public String getNext_from() {
            return next_from;
        }

        public void setNext_from(String next_from) {
            this.next_from = next_from;
        }

        public List<ItemsBeanXXXX> getItems() {
            return items;
        }

        public void setItems(List<ItemsBeanXXXX> items) {
            this.items = items;
        }

        public List<ProfilesBean> getProfiles() {
            return profiles;
        }

        public void setProfiles(List<ProfilesBean> profiles) {
            this.profiles = profiles;
        }

        public List<GroupsBean> getGroups() {
            return groups;
        }

        public void setGroups(List<GroupsBean> groups) {
            this.groups = groups;
        }

        public static class ItemsBeanXXXX {
            private String type;
            private int source_id;
            private int date;
            private PhotosBean photos;
            private int post_id;
            private String post_type;
            private String text;
            private int marked_as_ads;
            private PostSourceBean post_source;
            private CommentsBeanX comments;
            private LikesBeanX likes;
            private RepostsBeanX reposts;
            private ViewsBean views;
            private VideoBean video;
            private FriendsBean friends;
            private AudioBean audio;
            private int signer_id;
            private List<AttachmentsBean> attachments;
            private List<CopyHistoryBean> copy_history;

            public static ItemsBeanXXXX objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ItemsBeanXXXX.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getSource_id() {
                return source_id;
            }

            public void setSource_id(int source_id) {
                this.source_id = source_id;
            }

            public int getDate() {
                return date;
            }

            public void setDate(int date) {
                this.date = date;
            }

            public PhotosBean getPhotos() {
                return photos;
            }

            public void setPhotos(PhotosBean photos) {
                this.photos = photos;
            }

            public int getPost_id() {
                return post_id;
            }

            public void setPost_id(int post_id) {
                this.post_id = post_id;
            }

            public String getPost_type() {
                return post_type;
            }

            public void setPost_type(String post_type) {
                this.post_type = post_type;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public int getMarked_as_ads() {
                return marked_as_ads;
            }

            public void setMarked_as_ads(int marked_as_ads) {
                this.marked_as_ads = marked_as_ads;
            }

            public PostSourceBean getPost_source() {
                return post_source;
            }

            public void setPost_source(PostSourceBean post_source) {
                this.post_source = post_source;
            }

            public CommentsBeanX getComments() {
                return comments;
            }

            public void setComments(CommentsBeanX comments) {
                this.comments = comments;
            }

            public LikesBeanX getLikes() {
                return likes;
            }

            public void setLikes(LikesBeanX likes) {
                this.likes = likes;
            }

            public RepostsBeanX getReposts() {
                return reposts;
            }

            public void setReposts(RepostsBeanX reposts) {
                this.reposts = reposts;
            }

            public ViewsBean getViews() {
                return views;
            }

            public void setViews(ViewsBean views) {
                this.views = views;
            }

            public VideoBean getVideo() {
                return video;
            }

            public void setVideo(VideoBean video) {
                this.video = video;
            }

            public FriendsBean getFriends() {
                return friends;
            }

            public void setFriends(FriendsBean friends) {
                this.friends = friends;
            }

            public AudioBean getAudio() {
                return audio;
            }

            public void setAudio(AudioBean audio) {
                this.audio = audio;
            }

            public int getSigner_id() {
                return signer_id;
            }

            public void setSigner_id(int signer_id) {
                this.signer_id = signer_id;
            }

            public List<AttachmentsBean> getAttachments() {
                return attachments;
            }

            public void setAttachments(List<AttachmentsBean> attachments) {
                this.attachments = attachments;
            }

            public List<CopyHistoryBean> getCopy_history() {
                return copy_history;
            }

            public void setCopy_history(List<CopyHistoryBean> copy_history) {
                this.copy_history = copy_history;
            }

            public static class PhotosBean {
                private int count;
                private List<ItemsBean> items;

                public static PhotosBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), PhotosBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public List<ItemsBean> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBean> items) {
                    this.items = items;
                }

                public static class ItemsBean {

                    private int id;
                    private int album_id;
                    private int owner_id;
                    private String photo_75;
                    private String photo_130;
                    private String photo_604;
                    private int width;
                    private int height;
                    private String text;
                    private int date;
                    private String access_key;
                    private LikesBean likes;
                    private RepostsBean reposts;
                    private CommentsBean comments;
                    private int can_comment;
                    private int can_repost;
                    private String photo_807;

                    public static ItemsBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), ItemsBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getAlbum_id() {
                        return album_id;
                    }

                    public void setAlbum_id(int album_id) {
                        this.album_id = album_id;
                    }

                    public int getOwner_id() {
                        return owner_id;
                    }

                    public void setOwner_id(int owner_id) {
                        this.owner_id = owner_id;
                    }

                    public String getPhoto_75() {
                        return photo_75;
                    }

                    public void setPhoto_75(String photo_75) {
                        this.photo_75 = photo_75;
                    }

                    public String getPhoto_130() {
                        return photo_130;
                    }

                    public void setPhoto_130(String photo_130) {
                        this.photo_130 = photo_130;
                    }

                    public String getPhoto_604() {
                        return photo_604;
                    }

                    public void setPhoto_604(String photo_604) {
                        this.photo_604 = photo_604;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getDate() {
                        return date;
                    }

                    public void setDate(int date) {
                        this.date = date;
                    }

                    public String getAccess_key() {
                        return access_key;
                    }

                    public void setAccess_key(String access_key) {
                        this.access_key = access_key;
                    }

                    public LikesBean getLikes() {
                        return likes;
                    }

                    public void setLikes(LikesBean likes) {
                        this.likes = likes;
                    }

                    public RepostsBean getReposts() {
                        return reposts;
                    }

                    public void setReposts(RepostsBean reposts) {
                        this.reposts = reposts;
                    }

                    public CommentsBean getComments() {
                        return comments;
                    }

                    public void setComments(CommentsBean comments) {
                        this.comments = comments;
                    }

                    public int getCan_comment() {
                        return can_comment;
                    }

                    public void setCan_comment(int can_comment) {
                        this.can_comment = can_comment;
                    }

                    public int getCan_repost() {
                        return can_repost;
                    }

                    public void setCan_repost(int can_repost) {
                        this.can_repost = can_repost;
                    }

                    public String getPhoto_807() {
                        return photo_807;
                    }

                    public void setPhoto_807(String photo_807) {
                        this.photo_807 = photo_807;
                    }

                    public static class LikesBean {
                        /**
                         * user_likes : 0
                         * count : 0
                         */

                        private int user_likes;
                        private int count;

                        public static LikesBean objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), LikesBean.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public int getUser_likes() {
                            return user_likes;
                        }

                        public void setUser_likes(int user_likes) {
                            this.user_likes = user_likes;
                        }

                        public int getCount() {
                            return count;
                        }

                        public void setCount(int count) {
                            this.count = count;
                        }
                    }

                    public static class RepostsBean {
                        /**
                         * count : 0
                         * user_reposted : 0
                         */

                        private int count;
                        private int user_reposted;

                        public static RepostsBean objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), RepostsBean.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public int getCount() {
                            return count;
                        }

                        public void setCount(int count) {
                            this.count = count;
                        }

                        public int getUser_reposted() {
                            return user_reposted;
                        }

                        public void setUser_reposted(int user_reposted) {
                            this.user_reposted = user_reposted;
                        }
                    }

                    public static class CommentsBean {
                        /**
                         * count : 0
                         */

                        private int count;

                        public static CommentsBean objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), CommentsBean.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public int getCount() {
                            return count;
                        }

                        public void setCount(int count) {
                            this.count = count;
                        }
                    }
                }
            }

            public static class PostSourceBean {
                /**
                 * type : vk
                 */

                private String type;

                public static PostSourceBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), PostSourceBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class CommentsBeanX {
                /**
                 * count : 0
                 * groups_can_post : true
                 * can_post : 1
                 */

                private int count;
                private boolean groups_can_post;
                private int can_post;

                public static CommentsBeanX objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), CommentsBeanX.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public boolean isGroups_can_post() {
                    return groups_can_post;
                }

                public void setGroups_can_post(boolean groups_can_post) {
                    this.groups_can_post = groups_can_post;
                }

                public int getCan_post() {
                    return can_post;
                }

                public void setCan_post(int can_post) {
                    this.can_post = can_post;
                }
            }

            public static class LikesBeanX {
                /**
                 * count : 36
                 * user_likes : 0
                 * can_like : 1
                 * can_publish : 1
                 */

                private int count;
                private int user_likes;
                private int can_like;
                private int can_publish;

                public static LikesBeanX objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), LikesBeanX.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public int getUser_likes() {
                    return user_likes;
                }

                public void setUser_likes(int user_likes) {
                    this.user_likes = user_likes;
                }

                public int getCan_like() {
                    return can_like;
                }

                public void setCan_like(int can_like) {
                    this.can_like = can_like;
                }

                public int getCan_publish() {
                    return can_publish;
                }

                public void setCan_publish(int can_publish) {
                    this.can_publish = can_publish;
                }
            }

            public static class RepostsBeanX {
                /**
                 * count : 5
                 * user_reposted : 0
                 */

                private int count;
                private int user_reposted;

                public static RepostsBeanX objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), RepostsBeanX.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public int getUser_reposted() {
                    return user_reposted;
                }

                public void setUser_reposted(int user_reposted) {
                    this.user_reposted = user_reposted;
                }
            }

            public static class ViewsBean {
                /**
                 * count : 7059
                 */

                private int count;

                public static ViewsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), ViewsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }
            }

            public static class VideoBean {

                private int count;
                private List<ItemsBeanX> items;

                public static VideoBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), VideoBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public List<ItemsBeanX> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBeanX> items) {
                    this.items = items;
                }

                public static class ItemsBeanX {

                    private int id;
                    private int owner_id;
                    private String title;
                    private int duration;
                    private String description;
                    private int date;
                    private int comments;
                    private int views;
                    private String photo_130;
                    private String photo_320;
                    private String photo_640;
                    private String access_key;
                    private String platform;
                    private int can_add;
                    private int can_comment;
                    private int can_repost;
                    private LikesBeanXX likes;

                    public static ItemsBeanX objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), ItemsBeanX.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getOwner_id() {
                        return owner_id;
                    }

                    public void setOwner_id(int owner_id) {
                        this.owner_id = owner_id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public int getDuration() {
                        return duration;
                    }

                    public void setDuration(int duration) {
                        this.duration = duration;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public int getDate() {
                        return date;
                    }

                    public void setDate(int date) {
                        this.date = date;
                    }

                    public int getComments() {
                        return comments;
                    }

                    public void setComments(int comments) {
                        this.comments = comments;
                    }

                    public int getViews() {
                        return views;
                    }

                    public void setViews(int views) {
                        this.views = views;
                    }

                    public String getPhoto_130() {
                        return photo_130;
                    }

                    public void setPhoto_130(String photo_130) {
                        this.photo_130 = photo_130;
                    }

                    public String getPhoto_320() {
                        return photo_320;
                    }

                    public void setPhoto_320(String photo_320) {
                        this.photo_320 = photo_320;
                    }

                    public String getPhoto_640() {
                        return photo_640;
                    }

                    public void setPhoto_640(String photo_640) {
                        this.photo_640 = photo_640;
                    }

                    public String getAccess_key() {
                        return access_key;
                    }

                    public void setAccess_key(String access_key) {
                        this.access_key = access_key;
                    }

                    public String getPlatform() {
                        return platform;
                    }

                    public void setPlatform(String platform) {
                        this.platform = platform;
                    }

                    public int getCan_add() {
                        return can_add;
                    }

                    public void setCan_add(int can_add) {
                        this.can_add = can_add;
                    }

                    public int getCan_comment() {
                        return can_comment;
                    }

                    public void setCan_comment(int can_comment) {
                        this.can_comment = can_comment;
                    }

                    public int getCan_repost() {
                        return can_repost;
                    }

                    public void setCan_repost(int can_repost) {
                        this.can_repost = can_repost;
                    }

                    public LikesBeanXX getLikes() {
                        return likes;
                    }

                    public void setLikes(LikesBeanXX likes) {
                        this.likes = likes;
                    }

                    public static class LikesBeanXX {
                        /**
                         * user_likes : 0
                         * count : 34
                         */

                        private int user_likes;
                        private int count;

                        public static LikesBeanXX objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), LikesBeanXX.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public int getUser_likes() {
                            return user_likes;
                        }

                        public void setUser_likes(int user_likes) {
                            this.user_likes = user_likes;
                        }

                        public int getCount() {
                            return count;
                        }

                        public void setCount(int count) {
                            this.count = count;
                        }
                    }
                }
            }

            public static class FriendsBean {

                private int count;
                private List<ItemsBeanXX> items;

                public static FriendsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), FriendsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public List<ItemsBeanXX> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBeanXX> items) {
                    this.items = items;
                }

                public static class ItemsBeanXX {
                    private int user_id;

                    public static ItemsBeanXX objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), ItemsBeanXX.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public int getUser_id() {
                        return user_id;
                    }

                    public void setUser_id(int user_id) {
                        this.user_id = user_id;
                    }
                }
            }

            public static class AudioBean {

                private int count;
                private List<ItemsBeanXXX> items;

                public static AudioBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), AudioBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public List<ItemsBeanXXX> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBeanXXX> items) {
                    this.items = items;
                }

                public static class ItemsBeanXXX {

                    private int id;
                    private int owner_id;
                    private String artist;
                    private String title;
                    private int duration;
                    private int date;
                    private String url;
                    private boolean is_hq;
                    private int content_restricted;

                    public static ItemsBeanXXX objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), ItemsBeanXXX.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getOwner_id() {
                        return owner_id;
                    }

                    public void setOwner_id(int owner_id) {
                        this.owner_id = owner_id;
                    }

                    public String getArtist() {
                        return artist;
                    }

                    public void setArtist(String artist) {
                        this.artist = artist;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public int getDuration() {
                        return duration;
                    }

                    public void setDuration(int duration) {
                        this.duration = duration;
                    }

                    public int getDate() {
                        return date;
                    }

                    public void setDate(int date) {
                        this.date = date;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public boolean isIs_hq() {
                        return is_hq;
                    }

                    public void setIs_hq(boolean is_hq) {
                        this.is_hq = is_hq;
                    }

                    public int getContent_restricted() {
                        return content_restricted;
                    }

                    public void setContent_restricted(int content_restricted) {
                        this.content_restricted = content_restricted;
                    }
                }
            }

            public static class AttachmentsBean {


                private String type;
                private VideoBeanX video;
                private PhotoBeanX photo;
                private LinkBeen link;
                public static AttachmentsBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), AttachmentsBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public VideoBeanX getVideo() {
                    return video;
                }

                public void setVideo(VideoBeanX video) {
                    this.video = video;
                }

                public PhotoBeanX getPhoto() {
                    return photo;
                }

                public void setPhoto(PhotoBeanX photo) {
                    this.photo = photo;
                }

                public LinkBeen getLink() {
                    return link;
                }

                public void setLink(LinkBeen link) {
                    this.link = link;
                }

                public static class VideoBeanX {


                    private int id;
                    private int owner_id;
                    private String title;
                    private int duration;
                    private String description;
                    private int date;
                    private int comments;
                    private int views;
                    private String photo_130;
                    private String photo_320;
                    private String photo_640;
                    private String access_key;
                    private String platform;
                    private int can_add;

                    public static VideoBeanX objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), VideoBeanX.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getOwner_id() {
                        return owner_id;
                    }

                    public void setOwner_id(int owner_id) {
                        this.owner_id = owner_id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public int getDuration() {
                        return duration;
                    }

                    public void setDuration(int duration) {
                        this.duration = duration;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public int getDate() {
                        return date;
                    }

                    public void setDate(int date) {
                        this.date = date;
                    }

                    public int getComments() {
                        return comments;
                    }

                    public void setComments(int comments) {
                        this.comments = comments;
                    }

                    public int getViews() {
                        return views;
                    }

                    public void setViews(int views) {
                        this.views = views;
                    }

                    public String getPhoto_130() {
                        return photo_130;
                    }

                    public void setPhoto_130(String photo_130) {
                        this.photo_130 = photo_130;
                    }

                    public String getPhoto_320() {
                        return photo_320;
                    }

                    public void setPhoto_320(String photo_320) {
                        this.photo_320 = photo_320;
                    }

                    public String getPhoto_640() {
                        return photo_640;
                    }

                    public void setPhoto_640(String photo_640) {
                        this.photo_640 = photo_640;
                    }

                    public String getAccess_key() {
                        return access_key;
                    }

                    public void setAccess_key(String access_key) {
                        this.access_key = access_key;
                    }

                    public String getPlatform() {
                        return platform;
                    }

                    public void setPlatform(String platform) {
                        this.platform = platform;
                    }

                    public int getCan_add() {
                        return can_add;
                    }

                    public void setCan_add(int can_add) {
                        this.can_add = can_add;
                    }
                }

                public static class PhotoBeanX {
                    private int id;
                    private int album_id;
                    private int owner_id;
                    private int user_id;
                    private String photo_75;
                    private String photo_130;
                    private String photo_604;
                    private String photo_807;
                    private int width;
                    private int height;
                    private String text;
                    private int date;
                    private int post_id;
                    private String access_key;


                    public static PhotoBeanX objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), PhotoBeanX.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getAlbum_id() {
                        return album_id;
                    }

                    public void setAlbum_id(int album_id) {
                        this.album_id = album_id;
                    }

                    public int getOwner_id() {
                        return owner_id;
                    }

                    public void setOwner_id(int owner_id) {
                        this.owner_id = owner_id;
                    }

                    public int getUser_id() {
                        return user_id;
                    }

                    public void setUser_id(int user_id) {
                        this.user_id = user_id;
                    }

                    public String getPhoto_75() {
                        return photo_75;
                    }

                    public void setPhoto_75(String photo_75) {
                        this.photo_75 = photo_75;
                    }

                    public String getPhoto_130() {
                        return photo_130;
                    }

                    public void setPhoto_130(String photo_130) {
                        this.photo_130 = photo_130;
                    }

                    public String getPhoto_604() {
                        return photo_604;
                    }

                    public void setPhoto_604(String photo_604) {
                        this.photo_604 = photo_604;
                    }

                    public String getPhoto_807() {
                        return photo_807;
                    }

                    public void setPhoto_807(String photo_807) {
                        this.photo_807 = photo_807;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getDate() {
                        return date;
                    }

                    public void setDate(int date) {
                        this.date = date;
                    }

                    public int getPost_id() {
                        return post_id;
                    }

                    public void setPost_id(int post_id) {
                        this.post_id = post_id;
                    }

                    public String getAccess_key() {
                        return access_key;
                    }

                    public void setAccess_key(String access_key) {
                        this.access_key = access_key;
                    }
                }

                public static class LinkBeen {
                    private String url;
                    private String title;
                    private String caption;
                    private String description;
                    private PhotoBeanX photo;

                    public static LinkBeen objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), LinkBeen.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getCaption() {
                        return caption;
                    }

                    public void setCaption(String caption) {
                        this.caption = caption;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public PhotoBeanX getPhoto() {
                        return photo;
                    }

                    public void setPhoto(PhotoBeanX photo) {
                        this.photo = photo;
                    }
                }
            }

            public static class CopyHistoryBean {

                private int id;
                private int owner_id;
                private int from_id;
                private int date;
                private String post_type;
                private String text;
                private PostSourceBeanX post_source;
                private List<AttachmentsBeanX> attachments;

                public static CopyHistoryBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), CopyHistoryBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getOwner_id() {
                    return owner_id;
                }

                public void setOwner_id(int owner_id) {
                    this.owner_id = owner_id;
                }

                public int getFrom_id() {
                    return from_id;
                }

                public void setFrom_id(int from_id) {
                    this.from_id = from_id;
                }

                public int getDate() {
                    return date;
                }

                public void setDate(int date) {
                    this.date = date;
                }

                public String getPost_type() {
                    return post_type;
                }

                public void setPost_type(String post_type) {
                    this.post_type = post_type;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public PostSourceBeanX getPost_source() {
                    return post_source;
                }

                public void setPost_source(PostSourceBeanX post_source) {
                    this.post_source = post_source;
                }

                public List<AttachmentsBeanX> getAttachments() {
                    return attachments;
                }

                public void setAttachments(List<AttachmentsBeanX> attachments) {
                    this.attachments = attachments;
                }

                public static class PostSourceBeanX {
                    /**
                     * type : vk
                     */

                    private String type;

                    public static PostSourceBeanX objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), PostSourceBeanX.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }
                }

                public static class AttachmentsBeanX {
                    private String type;
                    private VideoBeanXX video;

                    public static AttachmentsBeanX objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), AttachmentsBeanX.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public VideoBeanXX getVideo() {
                        return video;
                    }

                    public void setVideo(VideoBeanXX video) {
                        this.video = video;
                    }

                    public static class VideoBeanXX {

                        private int id;
                        private int owner_id;
                        private String title;
                        private int duration;
                        private String description;
                        private int date;
                        private int comments;
                        private int views;
                        private int width;
                        private int height;
                        private String photo_130;
                        private String photo_320;
                        private String photo_800;
                        private String access_key;
                        private String first_frame_800;
                        private String first_frame_320;
                        private String first_frame_160;
                        private String first_frame_130;
                        private int can_add;

                        public static VideoBeanXX objectFromData(String str, String key) {

                            try {
                                JSONObject jsonObject = new JSONObject(str);

                                return new Gson().fromJson(jsonObject.getString(str), VideoBeanXX.class);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public int getOwner_id() {
                            return owner_id;
                        }

                        public void setOwner_id(int owner_id) {
                            this.owner_id = owner_id;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public int getDuration() {
                            return duration;
                        }

                        public void setDuration(int duration) {
                            this.duration = duration;
                        }

                        public String getDescription() {
                            return description;
                        }

                        public void setDescription(String description) {
                            this.description = description;
                        }

                        public int getDate() {
                            return date;
                        }

                        public void setDate(int date) {
                            this.date = date;
                        }

                        public int getComments() {
                            return comments;
                        }

                        public void setComments(int comments) {
                            this.comments = comments;
                        }

                        public int getViews() {
                            return views;
                        }

                        public void setViews(int views) {
                            this.views = views;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public String getPhoto_130() {
                            return photo_130;
                        }

                        public void setPhoto_130(String photo_130) {
                            this.photo_130 = photo_130;
                        }

                        public String getPhoto_320() {
                            return photo_320;
                        }

                        public void setPhoto_320(String photo_320) {
                            this.photo_320 = photo_320;
                        }

                        public String getPhoto_800() {
                            return photo_800;
                        }

                        public void setPhoto_800(String photo_800) {
                            this.photo_800 = photo_800;
                        }

                        public String getAccess_key() {
                            return access_key;
                        }

                        public void setAccess_key(String access_key) {
                            this.access_key = access_key;
                        }

                        public String getFirst_frame_800() {
                            return first_frame_800;
                        }

                        public void setFirst_frame_800(String first_frame_800) {
                            this.first_frame_800 = first_frame_800;
                        }

                        public String getFirst_frame_320() {
                            return first_frame_320;
                        }

                        public void setFirst_frame_320(String first_frame_320) {
                            this.first_frame_320 = first_frame_320;
                        }

                        public String getFirst_frame_160() {
                            return first_frame_160;
                        }

                        public void setFirst_frame_160(String first_frame_160) {
                            this.first_frame_160 = first_frame_160;
                        }

                        public String getFirst_frame_130() {
                            return first_frame_130;
                        }

                        public void setFirst_frame_130(String first_frame_130) {
                            this.first_frame_130 = first_frame_130;
                        }

                        public int getCan_add() {
                            return can_add;
                        }

                        public void setCan_add(int can_add) {
                            this.can_add = can_add;
                        }
                    }
                }
            }
        }

        public static class ProfilesBean {

            private int id;
            private String first_name;
            private String last_name;
            private int sex;
            private String screen_name;
            private String photo_50;
            private String photo_100;
            private int online;
            private int online_mobile;
            private String online_app;

            public static ProfilesBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ProfilesBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getFirst_name() {
                return first_name;
            }

            public void setFirst_name(String first_name) {
                this.first_name = first_name;
            }

            public String getLast_name() {
                return last_name;
            }

            public void setLast_name(String last_name) {
                this.last_name = last_name;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public String getScreen_name() {
                return screen_name;
            }

            public void setScreen_name(String screen_name) {
                this.screen_name = screen_name;
            }

            public String getPhoto_50() {
                return photo_50;
            }

            public void setPhoto_50(String photo_50) {
                this.photo_50 = photo_50;
            }

            public String getPhoto_100() {
                return photo_100;
            }

            public void setPhoto_100(String photo_100) {
                this.photo_100 = photo_100;
            }

            public int getOnline() {
                return online;
            }

            public void setOnline(int online) {
                this.online = online;
            }

            public int getOnline_mobile() {
                return online_mobile;
            }

            public void setOnline_mobile(int online_mobile) {
                this.online_mobile = online_mobile;
            }

            public String getOnline_app() {
                return online_app;
            }

            public void setOnline_app(String online_app) {
                this.online_app = online_app;
            }
        }

        public static class GroupsBean {

            private int id;
            private String name;
            private String screen_name;
            private int is_closed;
            private String type;
            private String photo_50;
            private String photo_100;
            private String photo_200;

            public static GroupsBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), GroupsBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getScreen_name() {
                return screen_name;
            }

            public void setScreen_name(String screen_name) {
                this.screen_name = screen_name;
            }

            public int getIs_closed() {
                return is_closed;
            }

            public void setIs_closed(int is_closed) {
                this.is_closed = is_closed;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getPhoto_50() {
                return photo_50;
            }

            public void setPhoto_50(String photo_50) {
                this.photo_50 = photo_50;
            }

            public String getPhoto_100() {
                return photo_100;
            }

            public void setPhoto_100(String photo_100) {
                this.photo_100 = photo_100;
            }

            public String getPhoto_200() {
                return photo_200;
            }

            public void setPhoto_200(String photo_200) {
                this.photo_200 = photo_200;
            }
        }
    }
}

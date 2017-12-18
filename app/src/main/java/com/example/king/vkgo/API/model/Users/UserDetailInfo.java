package com.example.king.vkgo.API.model.Users;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by KING on 17.12.2017.
 */

public class UserDetailInfo {

    private List<ResponseBean> response;

    public static UserDetailInfo objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), UserDetailInfo.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<ResponseBean> getResponse() {
        return response;
    }

    public void setResponse(List<ResponseBean> response) {
        this.response = response;
    }

    public static class ResponseBean {
        private int id;
        private String first_name;
        private String last_name;
        private int sex;
        private String nickname;
        private String maiden_name;
        private String domain;
        private String screen_name;
        private String bdate;
        private CityBean city;
        private CountryBean country;
        private String photo_50;
        private String photo_100;
        private String photo_200;
        private String photo_max;
        private String photo_200_orig;
        private String photo_400_orig;
        private String photo_max_orig;
        private String photo_id;
        private int has_photo;
        private int has_mobile;
        private int is_friend;
        private int friend_status;
        private int online;
        private int wall_comments;
        private int can_post;
        private int can_see_all_posts;
        private int can_see_audio;
        private int can_write_private_message;
        private int can_send_friend_request;
        private String mobile_phone;
        private String home_phone;
        private String site;
        private String status;
        private LastSeenBean last_seen;
        private CropPhotoBean crop_photo;
        private int verified;
        private int followers_count;
        private int blacklisted;
        private int blacklisted_by_me;
        private int is_favorite;
        private int is_hidden_from_feed;
        private int common_count;
        private int university;
        private String university_name;
        private int faculty;
        private String faculty_name;
        private int graduation;
        private String home_town;
        private int relation;
        private PersonalBean personal;
        private String interests;
        private String music;
        private String activities;
        private String movies;
        private String tv;
        private String books;
        private String games;
        private String about;
        private String quotes;
        private List<?> career;
        private List<?> military;
        private List<?> universities;
        private List<?> schools;
        private List<?> relatives;

        public static ResponseBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ResponseBean.class);
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

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getMaiden_name() {
            return maiden_name;
        }

        public void setMaiden_name(String maiden_name) {
            this.maiden_name = maiden_name;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getScreen_name() {
            return screen_name;
        }

        public void setScreen_name(String screen_name) {
            this.screen_name = screen_name;
        }

        public String getBdate() {
            return bdate;
        }

        public void setBdate(String bdate) {
            this.bdate = bdate;
        }

        public CityBean getCity() {
            return city;
        }

        public void setCity(CityBean city) {
            this.city = city;
        }

        public CountryBean getCountry() {
            return country;
        }

        public void setCountry(CountryBean country) {
            this.country = country;
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

        public String getPhoto_max() {
            return photo_max;
        }

        public void setPhoto_max(String photo_max) {
            this.photo_max = photo_max;
        }

        public String getPhoto_200_orig() {
            return photo_200_orig;
        }

        public void setPhoto_200_orig(String photo_200_orig) {
            this.photo_200_orig = photo_200_orig;
        }

        public String getPhoto_400_orig() {
            return photo_400_orig;
        }

        public void setPhoto_400_orig(String photo_400_orig) {
            this.photo_400_orig = photo_400_orig;
        }

        public String getPhoto_max_orig() {
            return photo_max_orig;
        }

        public void setPhoto_max_orig(String photo_max_orig) {
            this.photo_max_orig = photo_max_orig;
        }

        public String getPhoto_id() {
            return photo_id;
        }

        public void setPhoto_id(String photo_id) {
            this.photo_id = photo_id;
        }

        public int getHas_photo() {
            return has_photo;
        }

        public void setHas_photo(int has_photo) {
            this.has_photo = has_photo;
        }

        public int getHas_mobile() {
            return has_mobile;
        }

        public void setHas_mobile(int has_mobile) {
            this.has_mobile = has_mobile;
        }

        public int getIs_friend() {
            return is_friend;
        }

        public void setIs_friend(int is_friend) {
            this.is_friend = is_friend;
        }

        public int getFriend_status() {
            return friend_status;
        }

        public void setFriend_status(int friend_status) {
            this.friend_status = friend_status;
        }

        public int getOnline() {
            return online;
        }

        public void setOnline(int online) {
            this.online = online;
        }

        public int getWall_comments() {
            return wall_comments;
        }

        public void setWall_comments(int wall_comments) {
            this.wall_comments = wall_comments;
        }

        public int getCan_post() {
            return can_post;
        }

        public void setCan_post(int can_post) {
            this.can_post = can_post;
        }

        public int getCan_see_all_posts() {
            return can_see_all_posts;
        }

        public void setCan_see_all_posts(int can_see_all_posts) {
            this.can_see_all_posts = can_see_all_posts;
        }

        public int getCan_see_audio() {
            return can_see_audio;
        }

        public void setCan_see_audio(int can_see_audio) {
            this.can_see_audio = can_see_audio;
        }

        public int getCan_write_private_message() {
            return can_write_private_message;
        }

        public void setCan_write_private_message(int can_write_private_message) {
            this.can_write_private_message = can_write_private_message;
        }

        public int getCan_send_friend_request() {
            return can_send_friend_request;
        }

        public void setCan_send_friend_request(int can_send_friend_request) {
            this.can_send_friend_request = can_send_friend_request;
        }

        public String getMobile_phone() {
            return mobile_phone;
        }

        public void setMobile_phone(String mobile_phone) {
            this.mobile_phone = mobile_phone;
        }

        public String getHome_phone() {
            return home_phone;
        }

        public void setHome_phone(String home_phone) {
            this.home_phone = home_phone;
        }

        public String getSite() {
            return site;
        }

        public void setSite(String site) {
            this.site = site;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public LastSeenBean getLast_seen() {
            return last_seen;
        }

        public void setLast_seen(LastSeenBean last_seen) {
            this.last_seen = last_seen;
        }

        public CropPhotoBean getCrop_photo() {
            return crop_photo;
        }

        public void setCrop_photo(CropPhotoBean crop_photo) {
            this.crop_photo = crop_photo;
        }

        public int getVerified() {
            return verified;
        }

        public void setVerified(int verified) {
            this.verified = verified;
        }

        public int getFollowers_count() {
            return followers_count;
        }

        public void setFollowers_count(int followers_count) {
            this.followers_count = followers_count;
        }

        public int getBlacklisted() {
            return blacklisted;
        }

        public void setBlacklisted(int blacklisted) {
            this.blacklisted = blacklisted;
        }

        public int getBlacklisted_by_me() {
            return blacklisted_by_me;
        }

        public void setBlacklisted_by_me(int blacklisted_by_me) {
            this.blacklisted_by_me = blacklisted_by_me;
        }

        public int getIs_favorite() {
            return is_favorite;
        }

        public void setIs_favorite(int is_favorite) {
            this.is_favorite = is_favorite;
        }

        public int getIs_hidden_from_feed() {
            return is_hidden_from_feed;
        }

        public void setIs_hidden_from_feed(int is_hidden_from_feed) {
            this.is_hidden_from_feed = is_hidden_from_feed;
        }

        public int getCommon_count() {
            return common_count;
        }

        public void setCommon_count(int common_count) {
            this.common_count = common_count;
        }

        public int getUniversity() {
            return university;
        }

        public void setUniversity(int university) {
            this.university = university;
        }

        public String getUniversity_name() {
            return university_name;
        }

        public void setUniversity_name(String university_name) {
            this.university_name = university_name;
        }

        public int getFaculty() {
            return faculty;
        }

        public void setFaculty(int faculty) {
            this.faculty = faculty;
        }

        public String getFaculty_name() {
            return faculty_name;
        }

        public void setFaculty_name(String faculty_name) {
            this.faculty_name = faculty_name;
        }

        public int getGraduation() {
            return graduation;
        }

        public void setGraduation(int graduation) {
            this.graduation = graduation;
        }

        public String getHome_town() {
            return home_town;
        }

        public void setHome_town(String home_town) {
            this.home_town = home_town;
        }

        public int getRelation() {
            return relation;
        }

        public void setRelation(int relation) {
            this.relation = relation;
        }

        public PersonalBean getPersonal() {
            return personal;
        }

        public void setPersonal(PersonalBean personal) {
            this.personal = personal;
        }

        public String getInterests() {
            return interests;
        }

        public void setInterests(String interests) {
            this.interests = interests;
        }

        public String getMusic() {
            return music;
        }

        public void setMusic(String music) {
            this.music = music;
        }

        public String getActivities() {
            return activities;
        }

        public void setActivities(String activities) {
            this.activities = activities;
        }

        public String getMovies() {
            return movies;
        }

        public void setMovies(String movies) {
            this.movies = movies;
        }

        public String getTv() {
            return tv;
        }

        public void setTv(String tv) {
            this.tv = tv;
        }

        public String getBooks() {
            return books;
        }

        public void setBooks(String books) {
            this.books = books;
        }

        public String getGames() {
            return games;
        }

        public void setGames(String games) {
            this.games = games;
        }

        public String getAbout() {
            return about;
        }

        public void setAbout(String about) {
            this.about = about;
        }

        public String getQuotes() {
            return quotes;
        }

        public void setQuotes(String quotes) {
            this.quotes = quotes;
        }

        public List<?> getCareer() {
            return career;
        }

        public void setCareer(List<?> career) {
            this.career = career;
        }

        public List<?> getMilitary() {
            return military;
        }

        public void setMilitary(List<?> military) {
            this.military = military;
        }

        public List<?> getUniversities() {
            return universities;
        }

        public void setUniversities(List<?> universities) {
            this.universities = universities;
        }

        public List<?> getSchools() {
            return schools;
        }

        public void setSchools(List<?> schools) {
            this.schools = schools;
        }

        public List<?> getRelatives() {
            return relatives;
        }

        public void setRelatives(List<?> relatives) {
            this.relatives = relatives;
        }

        public static class CityBean {
            /**
             * id : 5331
             * title : Los Angeles
             */

            private int id;
            private String title;

            public static CityBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), CityBean.class);
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

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class CountryBean {
            /**
             * id : 9
             * title : США
             */

            private int id;
            private String title;

            public static CountryBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), CountryBean.class);
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

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class LastSeenBean {
            /**
             * time : 1513418693
             * platform : 7
             */

            private int time;
            private int platform;

            public static LastSeenBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), LastSeenBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public int getPlatform() {
                return platform;
            }

            public void setPlatform(int platform) {
                this.platform = platform;
            }
        }

        public static class CropPhotoBean {
            /**
             * photo : {"id":456239441,"album_id":-6,"owner_id":210700286,"photo_75":"https://pp.userapi.com/c840637/v840637830/2d201/gWJisLzGDh0.jpg","photo_130":"https://pp.userapi.com/c840637/v840637830/2d202/YJOmZ_ptR5A.jpg","photo_604":"https://pp.userapi.com/c840637/v840637830/2d203/dURAOlrfDFI.jpg","photo_807":"https://pp.userapi.com/c840637/v840637830/2d204/XTVycRtFj4E.jpg","photo_1280":"https://pp.userapi.com/c840637/v840637830/2d205/GZ1yuB53Y5M.jpg","photo_2560":"https://pp.userapi.com/c840637/v840637830/2d206/RbLvpcVOI5A.jpg","width":1367,"height":2048,"text":"","date":1511901434,"post_id":3319}
             * crop : {"x":0,"y":9.91,"x2":90.12,"y2":100}
             * rect : {"x":10.47,"y":14.04,"x2":90.5,"y2":67.48}
             */

            private PhotoBean photo;
            private CropBean crop;
            private RectBean rect;

            public static CropPhotoBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), CropPhotoBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public PhotoBean getPhoto() {
                return photo;
            }

            public void setPhoto(PhotoBean photo) {
                this.photo = photo;
            }

            public CropBean getCrop() {
                return crop;
            }

            public void setCrop(CropBean crop) {
                this.crop = crop;
            }

            public RectBean getRect() {
                return rect;
            }

            public void setRect(RectBean rect) {
                this.rect = rect;
            }

            public static class PhotoBean {
                private int id;
                private int album_id;
                private int owner_id;
                private String photo_75;
                private String photo_130;
                private String photo_604;
                private String photo_807;
                private String photo_1280;
                private String photo_2560;
                private int width;
                private int height;
                private String text;
                private int date;
                private int post_id;

                public static PhotoBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), PhotoBean.class);
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

                public String getPhoto_807() {
                    return photo_807;
                }

                public void setPhoto_807(String photo_807) {
                    this.photo_807 = photo_807;
                }

                public String getPhoto_1280() {
                    return photo_1280;
                }

                public void setPhoto_1280(String photo_1280) {
                    this.photo_1280 = photo_1280;
                }

                public String getPhoto_2560() {
                    return photo_2560;
                }

                public void setPhoto_2560(String photo_2560) {
                    this.photo_2560 = photo_2560;
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
            }

            public static class CropBean {
                /**
                 * x : 0
                 * y : 9.91
                 * x2 : 90.12
                 * y2 : 100
                 */

                private int x;
                private double y;
                private double x2;
                private int y2;

                public static CropBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), CropBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }

                public double getY() {
                    return y;
                }

                public void setY(double y) {
                    this.y = y;
                }

                public double getX2() {
                    return x2;
                }

                public void setX2(double x2) {
                    this.x2 = x2;
                }

                public int getY2() {
                    return y2;
                }

                public void setY2(int y2) {
                    this.y2 = y2;
                }
            }

            public static class RectBean {
                private double x;
                private double y;
                private double x2;
                private double y2;

                public static RectBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), RectBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public double getX() {
                    return x;
                }

                public void setX(double x) {
                    this.x = x;
                }

                public double getY() {
                    return y;
                }

                public void setY(double y) {
                    this.y = y;
                }

                public double getX2() {
                    return x2;
                }

                public void setX2(double x2) {
                    this.x2 = x2;
                }

                public double getY2() {
                    return y2;
                }

                public void setY2(double y2) {
                    this.y2 = y2;
                }
            }
        }

        public static class PersonalBean {
            private String religion;
            private String inspired_by;
            private int people_main;
            private int life_main;
            private int smoking;
            private int alcohol;

            public static PersonalBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), PersonalBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public String getReligion() {
                return religion;
            }

            public void setReligion(String religion) {
                this.religion = religion;
            }

            public String getInspired_by() {
                return inspired_by;
            }

            public void setInspired_by(String inspired_by) {
                this.inspired_by = inspired_by;
            }

            public int getPeople_main() {
                return people_main;
            }

            public void setPeople_main(int people_main) {
                this.people_main = people_main;
            }

            public int getLife_main() {
                return life_main;
            }

            public void setLife_main(int life_main) {
                this.life_main = life_main;
            }

            public int getSmoking() {
                return smoking;
            }

            public void setSmoking(int smoking) {
                this.smoking = smoking;
            }

            public int getAlcohol() {
                return alcohol;
            }

            public void setAlcohol(int alcohol) {
                this.alcohol = alcohol;
            }
        }
    }
}

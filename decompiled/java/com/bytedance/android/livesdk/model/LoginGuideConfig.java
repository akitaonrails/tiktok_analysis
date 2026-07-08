package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public class LoginGuideConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("from_comment")
    public String fromComment;

    @C09CT("from_default")
    public String fromDefault;

    @C09CT("from_favorite")
    public String fromFavorite;

    @C09CT("from_follow")
    public String fromFollow;

    @C09CT("from_home_upper_right")
    public String fromHomeUpperRight;

    @C09CT("image_url_from_comment")
    public String imageUrlFromComment;

    @C09CT("image_url_from_default")
    public String imageUrlFromDefault;

    @C09CT("image_url_from_favorite")
    public String imageUrlFromFavorite;

    @C09CT("image_url_from_follow")
    public String imageUrlFromFollow;

    @C09CT("image_url_from_home_upper_right")
    public String imageUrlFromHomeUpperRight;

    static {
        NormalGson.singleton();
        ADAPTER = new LoginGuideConfig_OptTypeAdapter();
    }

    public String getFromComment() {
        return this.fromComment;
    }

    public String getFromDefault() {
        return this.fromDefault;
    }

    public String getFromFavorite() {
        return this.fromFavorite;
    }

    public String getFromFollow() {
        return this.fromFollow;
    }

    public String getFromHomeUpperRight() {
        return this.fromHomeUpperRight;
    }

    public String getImageUrlFromComment() {
        return this.imageUrlFromComment;
    }

    public String getImageUrlFromDefault() {
        return this.imageUrlFromDefault;
    }

    public String getImageUrlFromFavorite() {
        return this.imageUrlFromFavorite;
    }

    public String getImageUrlFromFollow() {
        return this.imageUrlFromFollow;
    }

    public String getImageUrlFromHomeUpperRight() {
        return this.imageUrlFromHomeUpperRight;
    }

    public void setFromComment(String str) {
        this.fromComment = str;
    }

    public void setFromDefault(String str) {
        this.fromDefault = str;
    }

    public void setFromFavorite(String str) {
        this.fromFavorite = str;
    }

    public void setFromFollow(String str) {
        this.fromFollow = str;
    }

    public void setFromHomeUpperRight(String str) {
        this.fromHomeUpperRight = str;
    }

    public void setImageUrlFromComment(String str) {
        this.imageUrlFromComment = str;
    }

    public void setImageUrlFromDefault(String str) {
        this.imageUrlFromDefault = str;
    }

    public void setImageUrlFromFavorite(String str) {
        this.imageUrlFromFavorite = str;
    }

    public void setImageUrlFromFollow(String str) {
        this.imageUrlFromFollow = str;
    }

    public void setImageUrlFromHomeUpperRight(String str) {
        this.imageUrlFromHomeUpperRight = str;
    }
}

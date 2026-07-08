package com.ss.android.ugc.profile.platform.business.header.business.cta.business.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class SocialConnect implements Serializable {
    public static final int $stable = 8;

    @C09CT("ins_id")
    public String insId;

    @C09CT("lemon8_open_id")
    public String lemon8OpenId;

    @C09CT("lemon8_store_region")
    public String lemon8StoreRegion;

    @C09CT("lemon8_user_name")
    public String lemon8UserName;

    @C09CT("twitter_id")
    public String twitterId;

    @C09CT("twitter_name")
    public String twitterName;

    @C09CT("youtube_channel_id")
    public String youtubeChannelId;

    @C09CT("youtube_channel_title")
    public String youtubeChannelTitle;

    public final String getInsId() {
        return this.insId;
    }

    public final String getLemon8OpenId() {
        return this.lemon8OpenId;
    }

    public final String getLemon8StoreRegion() {
        return this.lemon8StoreRegion;
    }

    public final String getLemon8UserName() {
        return this.lemon8UserName;
    }

    public final String getTwitterId() {
        return this.twitterId;
    }

    public final String getTwitterName() {
        return this.twitterName;
    }

    public final String getYoutubeChannelId() {
        return this.youtubeChannelId;
    }

    public final String getYoutubeChannelTitle() {
        return this.youtubeChannelTitle;
    }

    public final void setInsId(String str) {
        this.insId = str;
    }

    public final void setLemon8OpenId(String str) {
        this.lemon8OpenId = str;
    }

    public final void setLemon8StoreRegion(String str) {
        this.lemon8StoreRegion = str;
    }

    public final void setLemon8UserName(String str) {
        this.lemon8UserName = str;
    }

    public final void setTwitterId(String str) {
        this.twitterId = str;
    }

    public final void setTwitterName(String str) {
        this.twitterName = str;
    }

    public final void setYoutubeChannelId(String str) {
        this.youtubeChannelId = str;
    }

    public final void setYoutubeChannelTitle(String str) {
        this.youtubeChannelTitle = str;
    }
}

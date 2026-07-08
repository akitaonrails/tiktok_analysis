package com.ss.android.ugc.aweme.creative.model.forward;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class SimpleAweme implements Serializable {

    @C09CT("aid")
    public String aid = "";

    @C09CT("aigc_info")
    public AIGCInfo aigcInfo = new AIGCInfo(0, false);

    @C09CT("author")
    public User author;

    @C09CT("aweme_type")
    public int awemeType;

    @C09CT("create_time")
    public long createTime;

    @C09CT("desc")
    public String desc;

    @C09CT("is_streaks_post")
    public boolean isStreaksPost;

    @C09CT("is_tiktok_story")
    public boolean isTikTokStory;

    @C09CT("music")
    public Music music;

    @C09CT("image_post_info")
    public PhotoModeImageInfo photoModeImageInfo;

    @C09CT("video")
    public Video video;

    public final String getAid() {
        return this.aid;
    }

    public final AIGCInfo getAigcInfo() {
        return this.aigcInfo;
    }

    public final User getAuthor() {
        return this.author;
    }

    public final int getAwemeType() {
        return this.awemeType;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final Music getMusic() {
        return this.music;
    }

    public final PhotoModeImageInfo getPhotoModeImageInfo() {
        return this.photoModeImageInfo;
    }

    public final Video getVideo() {
        return this.video;
    }

    public final boolean isStreaksPost() {
        return this.isStreaksPost;
    }

    public final boolean isTikTokStory() {
        return this.isTikTokStory;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setAigcInfo(AIGCInfo aIGCInfo) {
        this.aigcInfo = aIGCInfo;
    }

    public final void setAuthor(User user) {
        this.author = user;
    }

    public final void setAwemeType(int i) {
        this.awemeType = i;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setMusic(Music music) {
        this.music = music;
    }

    public final void setPhotoModeImageInfo(PhotoModeImageInfo photoModeImageInfo) {
        this.photoModeImageInfo = photoModeImageInfo;
    }

    public final void setStreaksPost(boolean z) {
        this.isStreaksPost = z;
    }

    public final void setTikTokStory(boolean z) {
        this.isTikTokStory = z;
    }

    public final void setVideo(Video video) {
        this.video = video;
    }
}

package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import X.C1245190iVZ;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileBgInfo implements Serializable {
    public static final C1245190iVZ Companion = new Object() { // from class: X.0iVZ
    };

    @C09CT("image_url_list")
    public List<String> imageUrlList;

    @C09CT("media_type")
    public int mediaType;

    @C09CT("video_info")
    public ProfileBgVideoInfo videoInfo;

    public final boolean hasBackground() {
        return this.mediaType > 0;
    }

    public final boolean isImage() {
        return this.mediaType == 1;
    }

    public final boolean isVideo() {
        return this.mediaType == 2;
    }

    public final List<String> getImageUrlList() {
        return this.imageUrlList;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final ProfileBgVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public final void setImageUrlList(List<String> list) {
        this.imageUrlList = list;
    }

    public final void setMediaType(int i) {
        this.mediaType = i;
    }

    public final void setVideoInfo(ProfileBgVideoInfo profileBgVideoInfo) {
        this.videoInfo = profileBgVideoInfo;
    }
}

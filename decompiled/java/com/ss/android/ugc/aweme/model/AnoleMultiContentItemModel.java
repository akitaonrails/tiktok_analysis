package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleMultiContentItemModel implements Serializable {

    @C09CT("content_type")
    public final Integer contentType;

    @C09CT("cover")
    public final String cover;

    @C09CT("file_hash")
    public final String fileHash;

    @C09CT("player_access_key")
    public final String playerAccessKey;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("vid")
    public final String vid;

    @C09CT("height")
    public final Integer videoHeight;

    @C09CT("video_length")
    public final Integer videoLength;

    @C09CT("width")
    public final Integer videoWith;

    public AnoleMultiContentItemModel() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final Integer getContentType() {
        return this.contentType;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getFileHash() {
        return this.fileHash;
    }

    public final String getPlayerAccessKey() {
        return this.playerAccessKey;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final String getVid() {
        return this.vid;
    }

    public final Integer getVideoHeight() {
        return this.videoHeight;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    public final Integer getVideoWith() {
        return this.videoWith;
    }

    public AnoleMultiContentItemModel(String str, String str2, Integer num, List<String> list, String str3, Integer num2, String str4, Integer num3, Integer num4) {
        this.cover = str;
        this.vid = str2;
        this.videoLength = num;
        this.urlList = list;
        this.playerAccessKey = str3;
        this.contentType = num2;
        this.fileHash = str4;
        this.videoWith = num3;
        this.videoHeight = num4;
    }
}

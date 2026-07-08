package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class LogoSpotlightVideoModel implements Serializable {

    @C09CT("cover")
    public String cover;

    @C09CT("cover_uri")
    public String coverUri;

    @C09CT("file_hash")
    public String fileHash;

    @C09CT("height")
    public Integer height;

    @C09CT("player_access_key")
    public String playerAccessKey;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("vid")
    public String vid;

    @C09CT("video_length")
    public Double videoLength;

    @C09CT("width")
    public Integer width;

    @C09CT("origin_width_px")
    public int originWidthPx = 1584;

    @C09CT("origin_height_px")
    public int originHeightPx = 3168;

    public final String getCover() {
        return this.cover;
    }

    public final String getCoverUri() {
        return this.coverUri;
    }

    public final String getFileHash() {
        return this.fileHash;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final int getOriginHeightPx() {
        return this.originHeightPx;
    }

    public final int getOriginWidthPx() {
        return this.originWidthPx;
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

    public final Double getVideoLength() {
        return this.videoLength;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final void setCover(String str) {
        this.cover = str;
    }

    public final void setCoverUri(String str) {
        this.coverUri = str;
    }

    public final void setFileHash(String str) {
        this.fileHash = str;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setOriginHeightPx(int i) {
        this.originHeightPx = i;
    }

    public final void setOriginWidthPx(int i) {
        this.originWidthPx = i;
    }

    public final void setPlayerAccessKey(String str) {
        this.playerAccessKey = str;
    }

    public final void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public final void setVid(String str) {
        this.vid = str;
    }

    public final void setVideoLength(Double d) {
        this.videoLength = d;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }
}

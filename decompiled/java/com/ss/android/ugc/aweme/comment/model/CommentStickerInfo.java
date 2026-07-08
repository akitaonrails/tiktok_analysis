package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes7.dex */
public final class CommentStickerInfo {

    @C09CT("creator_name")
    public String creatorName;

    @C09CT("format")
    public String format;

    @C09CT("height")
    public int height;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("recommend_sub_type")
    public int recommendSubType;

    @C09CT("sticker_type")
    public int stickerType;

    @C09CT("uri")
    public String uri;

    @C09CT("url")
    public String url;

    @C09CT("width")
    public int width;

    public final String getCreatorName() {
        return this.creatorName;
    }

    public final String getFormat() {
        return this.format;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getId() {
        return this.id;
    }

    public final int getRecommendSubType() {
        return this.recommendSubType;
    }

    public final int getStickerType() {
        return this.stickerType;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setCreatorName(String str) {
        this.creatorName = str;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setRecommendSubType(int i) {
        this.recommendSubType = i;
    }

    public final void setStickerType(int i) {
        this.stickerType = i;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}

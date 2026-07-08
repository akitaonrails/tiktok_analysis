package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class TopViewLiveInfo implements Serializable {
    public transient int currentIndex;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    @C09CT("viewer_count")
    public Long viewerCount = 0L;

    @C09CT("comment_count")
    public Long commentCount = 0L;

    @C09CT("gift_count")
    public Long giftCount = 0L;

    public final Long getCommentCount() {
        return this.commentCount;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final Long getGiftCount() {
        return this.giftCount;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final Long getViewerCount() {
        return this.viewerCount;
    }

    public final void setCommentCount(Long l) {
        this.commentCount = l;
    }

    public final void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    public final void setGiftCount(Long l) {
        this.giftCount = l;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public final void setViewerCount(Long l) {
        this.viewerCount = l;
    }
}

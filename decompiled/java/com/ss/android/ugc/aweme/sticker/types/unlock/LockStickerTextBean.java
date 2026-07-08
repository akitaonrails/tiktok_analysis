package com.ss.android.ugc.aweme.sticker.types.unlock;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class LockStickerTextBean {

    @C09CT("activity_id")
    public String activityId;

    @C09CT("bubble_hint")
    public String bubbleHint;

    @C09CT("content")
    public String content;

    @C09CT("share_desc")
    public String shareDesc;

    @C09CT("share_url")
    public String shareUrl;

    @C09CT("title")
    public String title;

    public final String getBubbleHint() {
        return this.bubbleHint;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getShareDesc() {
        return this.shareDesc;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBubbleHint(String str) {
        this.bubbleHint = str;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public final void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}

package com.ss.android.ugc.aweme.feed.model;

/* JADX INFO: loaded from: classes13.dex */
public class AwemeForHotComment {
    public Aweme mAweme;
    public int mEventType;
    public String mHotCommentTargetId;

    public Aweme getAweme() {
        return this.mAweme;
    }

    public int getEventType() {
        return this.mEventType;
    }

    public String getHotCommentTargetId() {
        return this.mHotCommentTargetId;
    }

    public void setHotCommentTargetId(String str) {
        this.mHotCommentTargetId = str;
    }

    public AwemeForHotComment(int i, Aweme aweme) {
        this.mEventType = i;
        this.mAweme = aweme;
    }
}

package com.ss.android.ugc.aweme.feed.count;

/* JADX INFO: loaded from: classes36.dex */
public final class UserPlayNum {
    public static final int $stable = 8;
    public FeedPlayNumModel model;
    public String uid;

    public final void setModel(FeedPlayNumModel feedPlayNumModel) {
        this.model = feedPlayNumModel;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public UserPlayNum(String str, FeedPlayNumModel feedPlayNumModel) {
        this.uid = str;
        this.model = feedPlayNumModel;
    }
}

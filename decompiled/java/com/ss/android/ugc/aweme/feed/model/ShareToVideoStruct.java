package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ShareToVideoStruct implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("share_post_type")
    public int sharePostType;

    public static final class Companion {
    }

    public ShareToVideoStruct() {
        this(0);
    }

    public final int getSharePostType() {
        return this.sharePostType;
    }

    public ShareToVideoStruct(int i) {
        this.sharePostType = i;
    }
}

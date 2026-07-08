package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class UpvotePreloadStruct implements Serializable {

    @C09CT("need_pull_upvote_info")
    public boolean needPullUpvoteInfo;

    public UpvotePreloadStruct() {
    }

    public UpvotePreloadStruct(boolean z) {
        this.needPullUpvoteInfo = z;
    }
}

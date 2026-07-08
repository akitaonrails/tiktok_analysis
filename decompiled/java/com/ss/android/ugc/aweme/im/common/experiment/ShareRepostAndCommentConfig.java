package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class ShareRepostAndCommentConfig {

    @C09CT("min_likes")
    public final int minLikes;

    @C09CT("min_replies")
    public final long minReplies;

    public ShareRepostAndCommentConfig() {
        this(0, 0L);
    }

    public ShareRepostAndCommentConfig(int i, long j) {
        this.minLikes = i;
        this.minReplies = j;
    }
}

package com.ss.android.ugc.aweme.feed.assem.quickcomment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class SocialCommentControlInfo {

    @C09CT("social_comment_exit")
    public int socialCommentExit;

    @C09CT("social_comment_exit_timestamp")
    public long socialCommentExitTimestamp;

    @C09CT("social_comment_no_click")
    public int socialCommentNoClick;

    public SocialCommentControlInfo() {
        this(0, 0L, 0);
    }

    public SocialCommentControlInfo(int i, long j, int i2) {
        this.socialCommentNoClick = i;
        this.socialCommentExitTimestamp = j;
        this.socialCommentExit = i2;
    }
}

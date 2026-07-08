package com.ss.android.ugc.aweme.feed.assem.quickcomment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class Feed0CommentControlInfo {

    @C09CT("feed_0_comment_appear_times")
    public int feed0CommentAppearTimes;

    @C09CT("feed_0_comment_appear_timestamp")
    public long feed0CommentAppearTimestamp;

    @C09CT("feed_0_comment_exit")
    public int feed0CommentExit;

    @C09CT("feed_0_comment_exit_timestamp")
    public long feed0CommentExitTimestamp;

    @C09CT("feed_0_comment_no_click")
    public int feed0CommentNoClick;

    @C09CT("feed_0_comment_trigger_threshold")
    public int feed0CommentTriggerThreshold;

    public Feed0CommentControlInfo() {
        this(0, 0L, 0, 0L, 0, 0);
    }

    public Feed0CommentControlInfo(int i, long j, int i2, long j2, int i3, int i4) {
        this.feed0CommentNoClick = i;
        this.feed0CommentExitTimestamp = j;
        this.feed0CommentExit = i2;
        this.feed0CommentAppearTimestamp = j2;
        this.feed0CommentAppearTimes = i3;
        this.feed0CommentTriggerThreshold = i4;
    }
}

package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentIntentionControlConfig {

    @C09CT("comment_intention_exit_days")
    public final int commentIntentionExitDays;

    @C09CT("comment_intention_no_click_limit")
    public final int commentIntentionNoClickLimit;

    @C09CT("comment_intention_single_day_limit")
    public final int commentIntentionSingleDayLimit;

    public CommentIntentionControlConfig() {
        this(1, 3, 7);
    }

    public CommentIntentionControlConfig(int i, int i2, int i3) {
        this.commentIntentionSingleDayLimit = i;
        this.commentIntentionNoClickLimit = i2;
        this.commentIntentionExitDays = i3;
    }
}

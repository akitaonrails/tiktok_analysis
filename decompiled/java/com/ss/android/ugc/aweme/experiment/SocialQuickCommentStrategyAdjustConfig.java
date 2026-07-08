package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class SocialQuickCommentStrategyAdjustConfig {

    @C09CT("social_comment_click_exit_limit")
    public final int socialCommentClickExitLimit;

    @C09CT("social_comment_display_interval")
    public final int socialCommentDisplayInterval;

    @C09CT("social_comment_enable")
    public final boolean socialCommentEnable;

    @C09CT("social_comment_exit_days")
    public final int socialCommentExitDays;

    @C09CT("social_comment_max_appear_times")
    public final int socialCommentMaxAppearTimes;

    @C09CT("social_comment_max_exit_times")
    public final int socialCommentMaxExitTimes;

    @C09CT("social_comment_play_appear")
    public final double socialCommentPlayAppear;

    @C09CT("social_comment_show_strategy")
    public final int socialCommentShowStrategy;

    public SocialQuickCommentStrategyAdjustConfig() {
        this(false, 5, 10, 5, 10, 5.0d, 4, 50);
    }

    public SocialQuickCommentStrategyAdjustConfig(boolean z, int i, int i2, int i3, int i4, double d, int i5, int i6) {
        this.socialCommentEnable = z;
        this.socialCommentClickExitLimit = i;
        this.socialCommentExitDays = i2;
        this.socialCommentMaxExitTimes = i3;
        this.socialCommentMaxAppearTimes = i4;
        this.socialCommentPlayAppear = d;
        this.socialCommentShowStrategy = i5;
        this.socialCommentDisplayInterval = i6;
    }
}

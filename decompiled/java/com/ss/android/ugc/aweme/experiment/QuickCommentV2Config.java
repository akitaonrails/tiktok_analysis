package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes22.dex */
public final class QuickCommentV2Config {

    @C09CT("play_appear_disable")
    public final boolean disablePlayAppear;

    @C09CT("feed_0_comment_enable_estimated_score")
    public final boolean enableEstimatedScore;

    @C09CT("like_decoupling_estimated_score")
    public final boolean enableLikeDecouplingEstimated;

    @C09CT("feed_0_comment_click_exit_limit")
    public final int feed0CommentClickExitLimit;

    @C09CT("feed_0_comment_enable")
    public final boolean feed0CommentEnable;

    @C09CT("feed_0_comment_exit_days")
    public final int feed0CommentExitDays;

    @C09CT("feed_0_comment_max_appear_times")
    public final int feed0CommentMaxAppearTimes;

    @C09CT("feed_0_comment_max_exit_times")
    public final int feed0CommentMaxExitTimes;

    @C09CT("feed_0_comment_play_appear")
    public final int feed0CommentPlayAppear;

    @C09CT("social_comment_click_exit_limit")
    public final int socialCommentClickExitLimit;

    @C09CT("social_comment_enable")
    public final boolean socialCommentEnable;

    @C09CT("social_comment_exit_days")
    public final int socialCommentExitDays;

    @C09CT("social_comment_max_appear_times")
    public final int socialCommentMaxAppearTimes;

    @C09CT("social_comment_max_exit_times")
    public final int socialCommentMaxExitTimes;

    public QuickCommentV2Config() {
        this(true, 5, 7, 5, LSPassThroughRecordSizeConfig.DEFAULT, true, 3, 5, 7, 5, 5, false, false, false);
    }

    public QuickCommentV2Config(boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, int i6, int i7, int i8, int i9, boolean z3, boolean z4, boolean z5) {
        this.socialCommentEnable = z;
        this.socialCommentClickExitLimit = i;
        this.socialCommentExitDays = i2;
        this.socialCommentMaxExitTimes = i3;
        this.socialCommentMaxAppearTimes = i4;
        this.feed0CommentEnable = z2;
        this.feed0CommentPlayAppear = i5;
        this.feed0CommentClickExitLimit = i6;
        this.feed0CommentExitDays = i7;
        this.feed0CommentMaxExitTimes = i8;
        this.feed0CommentMaxAppearTimes = i9;
        this.enableEstimatedScore = z3;
        this.enableLikeDecouplingEstimated = z4;
        this.disablePlayAppear = z5;
    }
}

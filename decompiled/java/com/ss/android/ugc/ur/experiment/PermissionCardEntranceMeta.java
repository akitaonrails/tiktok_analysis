package com.ss.android.ugc.ur.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PermissionCardEntranceMeta {

    @C09CT("cooldown_days")
    public final int exposureCooldownDays;

    @C09CT("inbox_top_unique_exposure_window_hours")
    public final int exposureWindowHours;

    @C09CT("others_profile_follower_count_threshold")
    public final int followCount;

    @C09CT("inbox_bottom_close_button")
    public final boolean inboxBottomCloseBtnVisible;

    @C09CT("inbox_top_close_button")
    public final boolean inboxTopCloseBtnVisible;

    @C09CT("num_exposures_lower_threshold")
    public final int numExposuresLowerThreshold;

    @C09CT("num_exposures_upper_threshold")
    public final int numExposuresUpperThreshold;

    @C09CT("inbox_demote_to_bottom")
    public final boolean shouldDemoteInboxToBottom;

    @C09CT("others_profile_greater_equal_threshold")
    public final boolean showHorizontalListAboveThreshold;

    @C09CT("others_profile_less_than_threshold")
    public final boolean showHorizontalListUnderThreshold;

    @C09CT("inbox_bottom")
    public final boolean showInboxBottom;

    @C09CT("inbox_top")
    public final boolean showInboxTop;

    @C09CT("personal_profile_following_list")
    public final boolean showProfileFollowing;

    @C09CT("personal_profile_friends_list")
    public final boolean showProfileFriends;

    @C09CT("inbox_top_show_strategy_optimize")
    public final boolean useNewFrequencyControl;

    @C09CT("inbox_ui_optimize")
    public final boolean useNewUi;

    public PermissionCardEntranceMeta() {
        this(10000, true, true, true, true, true, true, 2, 3, 21, false, false, 24, false, false, false);
    }

    public PermissionCardEntranceMeta(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, int i3, int i4, boolean z7, boolean z8, int i5, boolean z9, boolean z10, boolean z11) {
        this.followCount = i;
        this.showInboxTop = z;
        this.showInboxBottom = z2;
        this.showHorizontalListUnderThreshold = z3;
        this.showHorizontalListAboveThreshold = z4;
        this.showProfileFollowing = z5;
        this.showProfileFriends = z6;
        this.numExposuresLowerThreshold = i2;
        this.numExposuresUpperThreshold = i3;
        this.exposureCooldownDays = i4;
        this.inboxTopCloseBtnVisible = z7;
        this.inboxBottomCloseBtnVisible = z8;
        this.exposureWindowHours = i5;
        this.useNewFrequencyControl = z9;
        this.shouldDemoteInboxToBottom = z10;
        this.useNewUi = z11;
    }
}

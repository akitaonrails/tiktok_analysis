package com.ss.android.ugc.aweme.vibefeed.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialVibeConfig {

    @C09CT("entrance_action_bar")
    public final boolean actionBarEnable;

    @C09CT("impressions_limit")
    public final int actionBarExposeTimes;

    @C09CT("pull_interval")
    public final long configFetchInterval;

    @C09CT("feature_enable")
    public final boolean enable;

    @C09CT("feature_enable_for_group")
    public final boolean enableGroup;

    @C09CT("invite_hide_avatar")
    public final boolean inviteHideAvatar;

    @C09CT("invite_ttl_second")
    public final long inviteTTLSecond;

    @C09CT("entrance_navi_bar")
    public final boolean naviBarEnable;

    @C09CT("red_dot_show_only_once")
    public final boolean redDotShowOnlyOnce;

    @C09CT("skip_chat_feed_invite_freq")
    public final boolean skipChatFeedInviteFreq;

    @C09CT("skip_retention_popup_freq")
    public final boolean skipRetentionPopupFreq;

    @C09CT("skip_tutorial_freq")
    public final boolean skipTutorialFreq;

    @C09CT("entrance_transition")
    public final boolean transitionEnable;

    public SocialVibeConfig() {
        this(false, false, false, false, 86400L, 60L, 10, false, false, false, false, false, true);
    }

    public SocialVibeConfig(boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, int i, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.enable = z;
        this.naviBarEnable = z2;
        this.actionBarEnable = z3;
        this.transitionEnable = z4;
        this.inviteTTLSecond = j;
        this.configFetchInterval = j2;
        this.actionBarExposeTimes = i;
        this.skipTutorialFreq = z5;
        this.skipChatFeedInviteFreq = z6;
        this.inviteHideAvatar = z7;
        this.enableGroup = z8;
        this.skipRetentionPopupFreq = z9;
        this.redDotShowOnlyOnce = z10;
    }
}

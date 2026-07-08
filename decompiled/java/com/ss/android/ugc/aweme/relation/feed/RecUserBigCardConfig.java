package com.ss.android.ugc.aweme.relation.feed;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class RecUserBigCardConfig {

    @C09CT("cooldown_time")
    public int coolDownTime;

    @C09CT("big_card_days_registration")
    public long daysRegistration;

    @C09CT("feed_card_redesign_group")
    public int feedCardRedesignGroup;

    @C09CT("friends")
    public FriendsTabConfig friendsTabConfig;

    @C09CT("fyp")
    public FYPConfig fypConfig;

    @C09CT("group")
    public int group;

    @C09CT("is_other_frequency_in_effect")
    public boolean isOtherFreInEffect;

    @C09CT("is_work_for_high_muf")
    public boolean isWorkForHighMuf;

    @C09CT("load_count")
    public int loadCount;

    @C09CT("load_more_threshold")
    public int loadMoreThreshold;

    @C09CT("longpress_dislike_cooldown_time")
    public long longPressDislikeCoolDownTime;

    @C09CT("negative_behavior_threshold")
    public int negativeBehaviorThreshold;

    @C09CT("passive_reaction_cooldown_time")
    public long passiveReactionCoolDownTime;

    @C09CT("delay_fetch")
    public boolean shouldDelayFetch;

    @C09CT("stack_card")
    public StackCardConfig stackCard;

    public RecUserBigCardConfig() {
        this(10, 20, 20L, 60L, 0L, 3, 20, 10, true, true, new FYPConfig(1, 1, 1, 1, 3, 1, new int[]{1, 1, 3}, new int[]{5, 60, 10000}, 2, 2, 6), new FriendsTabConfig(1, 1, 1, 1, 4, 1, new int[]{1, 1, 4}, new int[]{5, 60, 10000}, 5, 3), 0, new StackCardConfig(0, 30L, true), false);
    }

    public RecUserBigCardConfig(int i, int i2, long j, long j2, long j3, int i3, int i4, int i5, boolean z, boolean z2, FYPConfig fYPConfig, FriendsTabConfig friendsTabConfig, int i6, StackCardConfig stackCardConfig, boolean z3) {
        this.group = i;
        this.coolDownTime = i2;
        this.passiveReactionCoolDownTime = j;
        this.longPressDislikeCoolDownTime = j2;
        this.daysRegistration = j3;
        this.negativeBehaviorThreshold = i3;
        this.loadCount = i4;
        this.loadMoreThreshold = i5;
        this.isOtherFreInEffect = z;
        this.isWorkForHighMuf = z2;
        this.fypConfig = fYPConfig;
        this.friendsTabConfig = friendsTabConfig;
        this.feedCardRedesignGroup = i6;
        this.stackCard = stackCardConfig;
        this.shouldDelayFetch = z3;
    }
}

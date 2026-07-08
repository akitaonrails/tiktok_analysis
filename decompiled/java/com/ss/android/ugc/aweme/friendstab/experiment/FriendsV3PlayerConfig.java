package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class FriendsV3PlayerConfig {

    @C09CT("hot_zone_centerline_ratio")
    public final float hotZoneCenterRatio;

    @C09CT("expose_hot_zone_ratio")
    public final float hotZoneRatio;

    @C09CT("max_continue_play_count")
    public final int maxContinuePlayCount;

    @C09CT("player_mini_expose_ratio")
    public final float playerExposeRatio;

    public FriendsV3PlayerConfig() {
        this(1.0f, 0.5f, 0.9f, 20);
    }

    public FriendsV3PlayerConfig(float f, float f2, float f3, int i) {
        this.playerExposeRatio = f;
        this.hotZoneCenterRatio = f2;
        this.hotZoneRatio = f3;
        this.maxContinuePlayCount = i;
    }
}

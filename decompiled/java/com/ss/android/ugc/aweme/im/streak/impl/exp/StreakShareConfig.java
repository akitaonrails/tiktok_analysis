package com.ss.android.ugc.aweme.im.streak.impl.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakShareConfig {

    @C09CT("animation_request_retry_count")
    public final int animationRequestRetryCount;

    @C09CT("feature_request_time_out")
    public final long featureRequestTimeOut;

    @C09CT("filter_list_max_count")
    public final int filterListMaxCount;

    @C09CT("filter_list_max_count")
    public final String followDialogEggUrl;

    @C09CT("follow_dialog_second_request_delay")
    public final long followDialogSecondRequestDelay;

    @C09CT("share_info_request_retry_count")
    public final int shareInfoRequestRetryCount;

    @C09CT("share_info_request_time_out")
    public final long shareInfoRequestTimeOut;

    @C09CT("streak_egg_animation_bundle")
    public final String streakEggAnimationBundle;

    @C09CT("streak_egg_animation_channel")
    public final String streakEggAnimationChannel;

    @C09CT("group_streak_pet_hatching_share_panel_animation")
    public final String streakGroupHatchingBundle;

    public StreakShareConfig() {
        this(80, 2000L, "https://sf16-sg.tiktokcdn.com/obj/eden-sg/vivhnuhd/streak/share/streak_egg.png", 1000L, 2, 2000L, "mt_dm_streak_common_resource", "dm_streak_pet/egg_share_panel_animation.json", 2, "dm_streak_pet/group_streak_pet_hatching_share_panel_animation.json");
    }

    public StreakShareConfig(int i, long j, String str, long j2, int i2, long j3, String str2, String str3, int i3, String str4) {
        this.filterListMaxCount = i;
        this.featureRequestTimeOut = j;
        this.followDialogEggUrl = str;
        this.followDialogSecondRequestDelay = j2;
        this.shareInfoRequestRetryCount = i2;
        this.shareInfoRequestTimeOut = j3;
        this.streakEggAnimationChannel = str2;
        this.streakEggAnimationBundle = str3;
        this.animationRequestRetryCount = i3;
        this.streakGroupHatchingBundle = str4;
    }
}

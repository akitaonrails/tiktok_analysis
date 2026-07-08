package com.ss.android.ugc.aweme.friendstab.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsTabAvatarOrderOptConfig2 {

    @C09CT("enable_not_show_avatar_low_muf_user")
    public final boolean enableNotShowAvatarLowMufUser;

    @C09CT("enable_strategy")
    public final boolean enableStrategy;

    @C09CT("muf_maximum_count_level_1")
    public final int mufMaximumCountLevel1;

    @C09CT("muf_maximum_count_level_2")
    public final int mufMaximumCountLevel2;

    @C09CT("threshold_level_1")
    public final float thresholdLevel1;

    @C09CT("threshold_level_2")
    public final float thresholdLevel2;

    @C09CT("threshold_level_3")
    public final float thresholdLevel3;

    @C09CT("topk_level_1")
    public final int topKLevel1;

    @C09CT("topk_level_2")
    public final int topKLevel2;

    @C09CT("topk_level_3")
    public final int topKLevel3;

    public FriendsTabAvatarOrderOptConfig2() {
        this(false, false, 0, 0, 0.0f, 0, 0.0f, 0, 0.0f, 0);
    }

    public FriendsTabAvatarOrderOptConfig2(boolean z, boolean z2, int i, int i2, float f, int i3, float f2, int i4, float f3, int i5) {
        this.enableStrategy = z;
        this.enableNotShowAvatarLowMufUser = z2;
        this.mufMaximumCountLevel1 = i;
        this.mufMaximumCountLevel2 = i2;
        this.thresholdLevel1 = f;
        this.topKLevel1 = i3;
        this.thresholdLevel2 = f2;
        this.topKLevel2 = i4;
        this.thresholdLevel3 = f3;
        this.topKLevel3 = i5;
    }
}

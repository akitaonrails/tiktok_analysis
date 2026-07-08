package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendsV3PhotoListScrollConfig {

    @C09CT("extra_layout_space_factor_idle")
    public final float idleExtraLayoutSpaceFactor;

    @C09CT("extra_layout_space_factor_scrolling")
    public final float scrollingExtraLayoutSpaceFactor;

    public FriendsV3PhotoListScrollConfig() {
        this(-1.0f, 2.0f);
    }

    public FriendsV3PhotoListScrollConfig(float f, float f2) {
        this.scrollingExtraLayoutSpaceFactor = f;
        this.idleExtraLayoutSpaceFactor = f2;
    }
}

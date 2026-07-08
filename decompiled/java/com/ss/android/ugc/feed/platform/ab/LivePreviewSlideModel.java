package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class LivePreviewSlideModel {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public final int f85default;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("initiative")
    public final int initiative;

    @C09CT("non_initiative")
    public final int nonInitiative;

    public LivePreviewSlideModel() {
        this(false, 45, 45, 45);
    }

    public LivePreviewSlideModel(boolean z, int i, int i2, int i3) {
        this.enable = z;
        this.f85default = i;
        this.initiative = i2;
        this.nonInitiative = i3;
    }
}

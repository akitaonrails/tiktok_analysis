package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class AmeGenIconSeekConfig {

    @C09CT("enable_filter_feature")
    public final boolean enableFilterFeature;

    @C09CT("seek_count")
    public final int seekCount;

    public AmeGenIconSeekConfig() {
        this(5, false);
    }

    public AmeGenIconSeekConfig(int i, boolean z) {
        this.seekCount = i;
        this.enableFilterFeature = z;
    }
}

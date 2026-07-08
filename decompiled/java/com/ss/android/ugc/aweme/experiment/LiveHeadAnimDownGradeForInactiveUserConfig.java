package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveHeadAnimDownGradeForInactiveUserConfig {

    @C09CT("downgradeFraction")
    public int downgradeFraction;

    @C09CT("isEnable")
    public boolean isEnable;

    public LiveHeadAnimDownGradeForInactiveUserConfig() {
        this(false, 2);
    }

    public LiveHeadAnimDownGradeForInactiveUserConfig(boolean z, int i) {
        this.isEnable = z;
        this.downgradeFraction = i;
    }
}

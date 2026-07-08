package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class AppLogNetworkOptExperimentModel {

    @C09CT("delay_ms")
    public final int delayMs;

    @C09CT("is_open")
    public final boolean isOpen;

    public AppLogNetworkOptExperimentModel() {
        this(false, 0);
    }

    public AppLogNetworkOptExperimentModel(boolean z, int i) {
        this.isOpen = z;
        this.delayMs = i;
    }
}

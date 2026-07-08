package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class FYPComponentConfig {

    @C09CT("skip_top_position")
    public final int skipTopPosition;

    @C09CT("trigger_type")
    public final int triggerType;

    public FYPComponentConfig() {
        this(1, 0);
    }

    public FYPComponentConfig(int i, int i2) {
        this.triggerType = i;
        this.skipTopPosition = i2;
    }
}

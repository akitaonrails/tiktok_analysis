package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankSkylightCommonControl implements Serializable {

    @C09CT("skylight_auto_display")
    public final boolean autoDisplay;

    public MixRankSkylightCommonControl() {
        this(false);
    }

    public MixRankSkylightCommonControl(boolean z) {
        this.autoDisplay = z;
    }
}

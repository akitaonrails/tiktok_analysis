package com.ss.android.ugc.aweme.inbox.skylight.plat;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class OnThisDayExtraData implements Serializable {
    public static final int $stable = 0;

    @C09CT("pastMemoryKey")
    public final String pastKeyMemory;

    public OnThisDayExtraData() {
        this(null);
    }

    public OnThisDayExtraData(String str) {
        this.pastKeyMemory = str;
    }
}

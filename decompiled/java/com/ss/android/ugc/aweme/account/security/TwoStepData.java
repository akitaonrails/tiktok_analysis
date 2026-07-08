package com.ss.android.ugc.aweme.account.security;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class TwoStepData implements Serializable {
    public static final int $stable = 8;

    @C09CT("available_ways")
    public final List<String> availableWays;

    @C09CT("display_order")
    public final int displayOrder;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("last_updated_timestamp")
    public final long lastUpdatedTimestamp;

    public TwoStepData() {
        this(false, 0L, null, -1);
    }

    public TwoStepData(boolean z, long j, List<String> list, int i) {
        this.enabled = z;
        this.lastUpdatedTimestamp = j;
        this.availableWays = list;
        this.displayOrder = i;
    }
}

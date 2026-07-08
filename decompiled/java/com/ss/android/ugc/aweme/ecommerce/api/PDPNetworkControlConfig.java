package com.ss.android.ugc.aweme.ecommerce.api;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class PDPNetworkControlConfig {

    @C09CT("black_list")
    public final List<String> blackList;

    @C09CT("disable_preloads")
    public final boolean disablePreloads;

    @C09CT("high_prio_apis")
    public final List<String> highPrioApis;

    @C09CT("max_delay")
    public final int maxDelay;

    @C09CT("network_score_threshold")
    public final int networkScoreThreshold;

    public PDPNetworkControlConfig() {
        this(null, null, 0, 0, false, 31, null);
    }

    public PDPNetworkControlConfig(List<String> list, List<String> list2, int i, int i2, boolean z) {
        this.blackList = list;
        this.highPrioApis = list2;
        this.maxDelay = i;
        this.networkScoreThreshold = i2;
        this.disablePreloads = z;
    }

    public PDPNetworkControlConfig(List list, List list2, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C13BV.INSTANCE : list, (i3 & 2) != 0 ? C13BV.INSTANCE : list2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? -1 : i2, (i3 & 16) == 0 ? z : false);
    }
}

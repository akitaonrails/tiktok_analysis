package com.ss.android.ugc.aweme.ecommerce.image;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class EcomPriorityData {

    @C09CT("after_mall_refresh")
    public final boolean afterMallRefresh;

    @C09CT("allow_prefetch")
    public final boolean allowPrefetch;

    @C09CT("debug")
    public final int debug;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("priority_reverse")
    public final boolean priorityReverse;

    @C09CT("scenes")
    public final List<String> scenes;

    @C09CT("skip_during_mall_refresh")
    public final boolean skipDuringMallRefresh;

    @C09CT("weak_network_control")
    public final boolean weakNetworkControl;

    @C09CT("weak_network_level")
    public final int weakNetworkLevel;

    @C09CT("weak_network_priority")
    public final int weakNetworkPriority;

    public EcomPriorityData() {
        this(0, false, false, null, false, false, false, 0, false, 0, 1023, null);
    }

    public EcomPriorityData(int i, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, boolean z5, int i2, boolean z6, int i3) {
        this.debug = i;
        this.enable = z;
        this.allowPrefetch = z2;
        this.scenes = list;
        this.afterMallRefresh = z3;
        this.skipDuringMallRefresh = z4;
        this.weakNetworkControl = z5;
        this.weakNetworkLevel = i2;
        this.priorityReverse = z6;
        this.weakNetworkPriority = i3;
    }

    public EcomPriorityData(int i, boolean z, boolean z2, List list, boolean z3, boolean z4, boolean z5, int i2, boolean z6, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? false : z2, (i4 & 8) != 0 ? C13BV.INSTANCE : list, (i4 & 16) != 0 ? false : z3, (i4 & 32) != 0 ? false : z4, (i4 & 64) != 0 ? false : z5, (i4 & 128) != 0 ? 4 : i2, (i4 & 256) == 0 ? z6 : false, (i4 & 512) != 0 ? 2 : i3);
    }
}

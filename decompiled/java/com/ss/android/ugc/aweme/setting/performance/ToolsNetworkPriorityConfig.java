package com.ss.android.ugc.aweme.setting.performance;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class ToolsNetworkPriorityConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("lazy_interval")
    public final long lazyInterval;

    @C09CT("p0_request")
    public final List<ToolsNetworkRequest> p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @C09CT("p1_request")
    public final List<ToolsNetworkRequest> f410p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @C09CT("p2_request")
    public final List<ToolsNetworkRequest> f411p2;

    @C09CT("p3_request")
    public final List<ToolsNetworkRequest> p3;

    public ToolsNetworkPriorityConfig() {
        this(false, 0L, null, null, null, null, 63, null);
    }

    public ToolsNetworkPriorityConfig(boolean z, long j, List<ToolsNetworkRequest> list, List<ToolsNetworkRequest> list2, List<ToolsNetworkRequest> list3, List<ToolsNetworkRequest> list4) {
        this.enable = z;
        this.lazyInterval = j;
        this.p0 = list;
        this.f410p1 = list2;
        this.f411p2 = list3;
        this.p3 = list4;
    }

    public ToolsNetworkPriorityConfig(boolean z, long j, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 1000L : j, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? C13BV.INSTANCE : list3, (i & 32) != 0 ? C13BV.INSTANCE : list4);
    }
}

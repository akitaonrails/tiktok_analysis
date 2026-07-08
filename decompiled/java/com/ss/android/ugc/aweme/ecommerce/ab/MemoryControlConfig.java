package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class MemoryControlConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("notify_min_interval_ms")
    public final long minNotifyInterval;

    @C09CT("notify_channel_list")
    public final List<String> notifyChannelList;

    public MemoryControlConfig() {
        this(false, 0L, null, 7, null);
    }

    public MemoryControlConfig(boolean z, long j, List<String> list) {
        this.enable = z;
        this.minNotifyInterval = j;
        this.notifyChannelList = list;
    }

    public MemoryControlConfig(boolean z, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 3000L : j, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}

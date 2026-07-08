package com.ss.android.ugc.aweme.account.security;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class DevicesData implements Serializable {
    public static final int $stable = 8;

    @C09CT("display_order")
    public final int displayOrder;

    @C09CT("last_checked_timestamp")
    public final long lastCheckedTimestamp;

    @C09CT("unknown_devices")
    public final List<Map<Object, Object>> unknownDevices;

    public DevicesData() {
        this(0L, null, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DevicesData(long j, List<? extends Map<Object, ? extends Object>> list, int i) {
        this.lastCheckedTimestamp = j;
        this.unknownDevices = list;
        this.displayOrder = i;
    }
}

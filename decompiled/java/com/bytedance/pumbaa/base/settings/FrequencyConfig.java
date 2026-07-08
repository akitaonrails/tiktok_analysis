package com.bytedance.pumbaa.base.settings;

import X.C09CT;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class FrequencyConfig {

    @C09CT("guard_range")
    public final GuardRange guardRange;

    @C09CT("max_called_times")
    public final int maxCalledTimes;

    @C09CT("max_store_size")
    public final int maxStoreSize;

    @C09CT("name")
    public final String name;

    @C09CT("time_interval")
    public final long timeInterval;

    public FrequencyConfig() {
        this(10, TimeUnit.MINUTES.toMillis(1L), 100, "", new GuardRange(null, null, null, 7, null));
    }

    public FrequencyConfig(int i, long j, int i2, String str, GuardRange guardRange) {
        this.maxCalledTimes = i;
        this.timeInterval = j;
        this.maxStoreSize = i2;
        this.name = str;
        this.guardRange = guardRange;
    }
}

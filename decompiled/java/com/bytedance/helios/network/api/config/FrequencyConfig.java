package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class FrequencyConfig {

    @C09CT("max_called_times")
    public final int maxCalledTimes;

    @C09CT("max_store_size")
    public final int maxStoreSize;

    @C09CT("name")
    public final String name;

    @C09CT("time_interval")
    public final long timeInterval;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyConfig)) {
            return false;
        }
        FrequencyConfig frequencyConfig = (FrequencyConfig) obj;
        return this.maxCalledTimes == frequencyConfig.maxCalledTimes && this.timeInterval == frequencyConfig.timeInterval && this.maxStoreSize == frequencyConfig.maxStoreSize && Intrinsics.LJFF(this.name, frequencyConfig.name);
    }

    public final int hashCode() {
        return (((((this.maxCalledTimes * 31) + C786410Ut5.Y2(this.timeInterval)) * 31) + this.maxStoreSize) * 31) + this.name.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyConfig(maxCalledTimes=");
        sbLIZ.append(this.maxCalledTimes);
        sbLIZ.append(", timeInterval=");
        sbLIZ.append(this.timeInterval);
        sbLIZ.append(", maxStoreSize=");
        sbLIZ.append(this.maxStoreSize);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyConfig() {
        this(20, TimeUnit.MINUTES.toMillis(1L), 50, "network_stack_frequency");
    }

    public FrequencyConfig(int i, long j, int i2, String str) {
        this.maxCalledTimes = i;
        this.timeInterval = j;
        this.maxStoreSize = i2;
        this.name = str;
    }
}

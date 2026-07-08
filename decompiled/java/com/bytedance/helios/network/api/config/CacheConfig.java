package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes13.dex */
public final class CacheConfig {

    @C09CT("max_store_interval")
    public final long maxStoreInterval;

    @C09CT("max_store_size")
    public final int maxStoreSize;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheConfig)) {
            return false;
        }
        CacheConfig cacheConfig = (CacheConfig) obj;
        return this.maxStoreSize == cacheConfig.maxStoreSize && this.maxStoreInterval == cacheConfig.maxStoreInterval;
    }

    public final int hashCode() {
        return (this.maxStoreSize * 31) + C786410Ut5.Y2(this.maxStoreInterval);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheConfig(maxStoreSize=");
        sbLIZ.append(this.maxStoreSize);
        sbLIZ.append(", maxStoreInterval=");
        sbLIZ.append(this.maxStoreInterval);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CacheConfig() {
        this(500, 30000L);
    }

    public CacheConfig(int i, long j) {
        this.maxStoreSize = i;
        this.maxStoreInterval = j;
    }
}

package com.ss.android.ugc.aweme.search.pages.visualsearch.smartsearch.core.config;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class SmartSearchResponseCacheConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("max_size")
    public final int max_size;

    @C09CT("ttl_ms")
    public final long ttl_ms;

    public SmartSearchResponseCacheConfig() {
        this(false, 300000L, 10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartSearchResponseCacheConfig)) {
            return false;
        }
        SmartSearchResponseCacheConfig smartSearchResponseCacheConfig = (SmartSearchResponseCacheConfig) obj;
        return this.enable == smartSearchResponseCacheConfig.enable && this.ttl_ms == smartSearchResponseCacheConfig.ttl_ms && this.max_size == smartSearchResponseCacheConfig.max_size;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.ttl_ms)) * 31) + this.max_size;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmartSearchResponseCacheConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", ttl_ms=");
        sbLIZ.append(this.ttl_ms);
        sbLIZ.append(", max_size=");
        sbLIZ.append(this.max_size);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SmartSearchResponseCacheConfig(boolean z, long j, int i) {
        this.enable = z;
        this.ttl_ms = j;
        this.max_size = i;
    }
}

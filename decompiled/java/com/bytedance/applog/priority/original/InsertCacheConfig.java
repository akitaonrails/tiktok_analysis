package com.bytedance.applog.priority.original;

import X.C13LQ;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class InsertCacheConfig {
    public final boolean cacheEnable;
    public final long cacheTime;
    public final int maxCacheSize;
    public final Set<Integer> notFlushType;

    public InsertCacheConfig() {
        this(false, 0, 0L, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsertCacheConfig)) {
            return false;
        }
        InsertCacheConfig insertCacheConfig = (InsertCacheConfig) obj;
        return this.cacheEnable == insertCacheConfig.cacheEnable && this.maxCacheSize == insertCacheConfig.maxCacheSize && this.cacheTime == insertCacheConfig.cacheTime && Intrinsics.LJFF(this.notFlushType, insertCacheConfig.notFlushType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.cacheEnable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iY2 = ((((r0 * 31) + this.maxCacheSize) * 31) + C786410Ut5.Y2(this.cacheTime)) * 31;
        Set<Integer> set = this.notFlushType;
        return iY2 + (set == null ? 0 : set.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsertCacheConfig(cacheEnable=");
        sbLIZ.append(this.cacheEnable);
        sbLIZ.append(", maxCacheSize=");
        sbLIZ.append(this.maxCacheSize);
        sbLIZ.append(", cacheTime=");
        sbLIZ.append(this.cacheTime);
        sbLIZ.append(", notFlushType=");
        sbLIZ.append(this.notFlushType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InsertCacheConfig(boolean z, int i, long j, Set<Integer> set) {
        this.cacheEnable = z;
        this.maxCacheSize = i;
        this.cacheTime = j;
        this.notFlushType = set;
    }

    public InsertCacheConfig(boolean z, int i, long j, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? C13LQ.LJLIIL(new Integer[]{1, 3}) : set);
    }
}

package com.bytedance.applog.priority.original;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SqliteOptConfig {
    public final InsertCacheConfig insertCache;
    public final PragmaConfig pragmaConfig;
    public final boolean switchToWal;

    public SqliteOptConfig() {
        this(new PragmaConfig(false, false, false, 0L, 0), new InsertCacheConfig(false, 0, 0L, null, 15, null), false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SqliteOptConfig)) {
            return false;
        }
        SqliteOptConfig sqliteOptConfig = (SqliteOptConfig) obj;
        return Intrinsics.LJFF(this.pragmaConfig, sqliteOptConfig.pragmaConfig) && Intrinsics.LJFF(this.insertCache, sqliteOptConfig.insertCache) && this.switchToWal == sqliteOptConfig.switchToWal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        int iHashCode = ((this.pragmaConfig.hashCode() * 31) + this.insertCache.hashCode()) * 31;
        boolean z = this.switchToWal;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SqliteOptConfig(pragmaConfig=");
        sbLIZ.append(this.pragmaConfig);
        sbLIZ.append(", insertCache=");
        sbLIZ.append(this.insertCache);
        sbLIZ.append(", switchToWal=");
        sbLIZ.append(this.switchToWal);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SqliteOptConfig(PragmaConfig pragmaConfig, InsertCacheConfig insertCacheConfig, boolean z) {
        this.pragmaConfig = pragmaConfig;
        this.insertCache = insertCacheConfig;
        this.switchToWal = z;
    }
}

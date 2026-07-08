package com.ss.android.ugc.tiktok.tools.performance.api.storage;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes31.dex */
public final class ToolsCustomCacheConfig {

    @C09CT("expire_day")
    public final long expireDay;

    @C09CT("expire_day_for_e_low_storage")
    public final long expireDayForELowStorage;

    @C09CT("expire_day_for_low_storage")
    public final long expireDayForLowStorage;

    @C09CT("independent_clean")
    public final boolean independentClean;

    @C09CT("max_size_mb")
    public final long maxSizeMB;

    @C09CT("remove_dead_files")
    public final boolean removeDeadFiles;

    @C09CT("trim_size_mb")
    public final long trimSizeMB;

    @C09CT("use_old_strategy")
    public final boolean useOldStrategy;

    public ToolsCustomCacheConfig() {
        this(false, false, -1L, -1L, -1L, 0L, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolsCustomCacheConfig)) {
            return false;
        }
        ToolsCustomCacheConfig toolsCustomCacheConfig = (ToolsCustomCacheConfig) obj;
        return this.independentClean == toolsCustomCacheConfig.independentClean && this.useOldStrategy == toolsCustomCacheConfig.useOldStrategy && this.expireDay == toolsCustomCacheConfig.expireDay && this.expireDayForLowStorage == toolsCustomCacheConfig.expireDayForLowStorage && this.expireDayForELowStorage == toolsCustomCacheConfig.expireDayForELowStorage && this.trimSizeMB == toolsCustomCacheConfig.trimSizeMB && this.maxSizeMB == toolsCustomCacheConfig.maxSizeMB && this.removeDeadFiles == toolsCustomCacheConfig.removeDeadFiles;
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.Z2(this.independentClean) * 31) + C786410Ut5.Z2(this.useOldStrategy)) * 31) + C786410Ut5.Y2(this.expireDay)) * 31) + C786410Ut5.Y2(this.expireDayForLowStorage)) * 31) + C786410Ut5.Y2(this.expireDayForELowStorage)) * 31) + C786410Ut5.Y2(this.trimSizeMB)) * 31) + C786410Ut5.Y2(this.maxSizeMB)) * 31) + C786410Ut5.Z2(this.removeDeadFiles);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolsCustomCacheConfig(independentClean=");
        sbLIZ.append(this.independentClean);
        sbLIZ.append(", useOldStrategy=");
        sbLIZ.append(this.useOldStrategy);
        sbLIZ.append(", expireDay=");
        sbLIZ.append(this.expireDay);
        sbLIZ.append(", expireDayForLowStorage=");
        sbLIZ.append(this.expireDayForLowStorage);
        sbLIZ.append(", expireDayForELowStorage=");
        sbLIZ.append(this.expireDayForELowStorage);
        sbLIZ.append(", trimSizeMB=");
        sbLIZ.append(this.trimSizeMB);
        sbLIZ.append(", maxSizeMB=");
        sbLIZ.append(this.maxSizeMB);
        sbLIZ.append(", removeDeadFiles=");
        sbLIZ.append(this.removeDeadFiles);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ToolsCustomCacheConfig(boolean z, boolean z2, long j, long j2, long j3, long j4, long j5, boolean z3) {
        this.independentClean = z;
        this.useOldStrategy = z2;
        this.expireDay = j;
        this.expireDayForLowStorage = j2;
        this.expireDayForELowStorage = j3;
        this.trimSizeMB = j4;
        this.maxSizeMB = j5;
        this.removeDeadFiles = z3;
    }
}

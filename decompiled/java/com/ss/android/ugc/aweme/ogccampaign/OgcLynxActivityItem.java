package com.ss.android.ugc.aweme.ogccampaign;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.lynx.OgcLynxPrefetchConfig;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class OgcLynxActivityItem {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("cache_ttl")
    public final int cacheTtl;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("prefetch_config")
    public final OgcLynxPrefetchConfig prefetchConfig;

    @C09CT("strategy_keys")
    public final List<String> strategyKeys;

    public OgcLynxActivityItem() {
        this(null, 0L, 0, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgcLynxActivityItem)) {
            return false;
        }
        OgcLynxActivityItem ogcLynxActivityItem = (OgcLynxActivityItem) obj;
        return Intrinsics.LJFF(this.activityId, ogcLynxActivityItem.activityId) && this.endTime == ogcLynxActivityItem.endTime && this.cacheTtl == ogcLynxActivityItem.cacheTtl && Intrinsics.LJFF(this.prefetchConfig, ogcLynxActivityItem.prefetchConfig) && Intrinsics.LJFF(this.strategyKeys, ogcLynxActivityItem.strategyKeys);
    }

    public final int hashCode() {
        int iHashCode = ((((this.activityId.hashCode() * 31) + C786410Ut5.Y2(this.endTime)) * 31) + this.cacheTtl) * 31;
        OgcLynxPrefetchConfig ogcLynxPrefetchConfig = this.prefetchConfig;
        return ((iHashCode + (ogcLynxPrefetchConfig == null ? 0 : ogcLynxPrefetchConfig.hashCode())) * 31) + this.strategyKeys.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OgcLynxActivityItem(activityId=");
        sbLIZ.append(this.activityId);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", cacheTtl=");
        sbLIZ.append(this.cacheTtl);
        sbLIZ.append(", prefetchConfig=");
        sbLIZ.append(this.prefetchConfig);
        sbLIZ.append(", strategyKeys=");
        sbLIZ.append(this.strategyKeys);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OgcLynxActivityItem(String str, long j, int i, OgcLynxPrefetchConfig ogcLynxPrefetchConfig, List<String> list) {
        this.activityId = str;
        this.endTime = j;
        this.cacheTtl = i;
        this.prefetchConfig = ogcLynxPrefetchConfig;
        this.strategyKeys = list;
    }

    public OgcLynxActivityItem(String str, long j, int i, OgcLynxPrefetchConfig ogcLynxPrefetchConfig, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : ogcLynxPrefetchConfig, (i2 & 16) != 0 ? C13BV.INSTANCE : list);
    }
}

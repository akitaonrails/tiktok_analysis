package com.ss.android.ugc.aweme.geofencing.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HistoryUpdateRequest {

    @C09CT("region_groups")
    public final List<HistoryRegionGroup> regionGroups;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HistoryUpdateRequest) && Intrinsics.LJFF(this.regionGroups, ((HistoryUpdateRequest) obj).regionGroups);
    }

    public final int hashCode() {
        return this.regionGroups.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryUpdateRequest(regionGroups=");
        sbLIZ.append(this.regionGroups);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HistoryUpdateRequest(List<HistoryRegionGroup> list) {
        this.regionGroups = list;
    }
}

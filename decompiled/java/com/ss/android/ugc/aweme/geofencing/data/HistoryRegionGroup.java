package com.ss.android.ugc.aweme.geofencing.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HistoryRegionGroup {

    @C09CT("region_codes")
    public final List<String> regionCodes;

    @C09CT("source")
    public final String source;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryRegionGroup)) {
            return false;
        }
        HistoryRegionGroup historyRegionGroup = (HistoryRegionGroup) obj;
        return Intrinsics.LJFF(this.regionCodes, historyRegionGroup.regionCodes) && Intrinsics.LJFF(this.source, historyRegionGroup.source);
    }

    public final int hashCode() {
        return (this.regionCodes.hashCode() * 31) + this.source.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryRegionGroup(regionCodes=");
        sbLIZ.append(this.regionCodes);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HistoryRegionGroup(List<String> list, String str) {
        this.regionCodes = list;
        this.source = str;
    }
}

package com.ss.android.ugc.aweme.geofencing.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HistoryEntry {

    @C09CT("op_time_sec")
    public final Long opTimeSec;

    @C09CT("region_codes")
    public final List<String> regionCodes;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryEntry)) {
            return false;
        }
        HistoryEntry historyEntry = (HistoryEntry) obj;
        return Intrinsics.LJFF(this.regionCodes, historyEntry.regionCodes) && Intrinsics.LJFF(this.opTimeSec, historyEntry.opTimeSec);
    }

    public final int hashCode() {
        int iHashCode = this.regionCodes.hashCode() * 31;
        Long l = this.opTimeSec;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryEntry(regionCodes=");
        sbLIZ.append(this.regionCodes);
        sbLIZ.append(", opTimeSec=");
        sbLIZ.append(this.opTimeSec);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HistoryEntry(List<String> list, Long l) {
        this.regionCodes = list;
        this.opTimeSec = l;
    }
}

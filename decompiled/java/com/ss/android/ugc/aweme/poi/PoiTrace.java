package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PoiTrace implements Serializable {

    @C09CT("event_info")
    public String eventInfo;

    @C09CT("poi_id")
    public String poiId;

    @C09CT("unavailable_reason")
    public String reason;

    public PoiTrace() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiTrace)) {
            return false;
        }
        PoiTrace poiTrace = (PoiTrace) obj;
        return Intrinsics.LJFF(this.poiId, poiTrace.poiId) && Intrinsics.LJFF(this.reason, poiTrace.reason) && Intrinsics.LJFF(this.eventInfo, poiTrace.eventInfo);
    }

    public int hashCode() {
        String str = this.poiId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reason;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventInfo;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiTrace(poiId=");
        sbLIZ.append(this.poiId);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.reason);
        sbLIZ.append(", eventInfo=");
        sbLIZ.append(this.eventInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiTrace(String str, String str2, String str3) {
        this.poiId = str;
        this.reason = str2;
        this.eventInfo = str3;
    }
}

package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SearchLandingPageResponse extends TakoBaseResponse {
    public final String LIZ;

    @C09CT("data")
    public final Map<String, Object> data;

    @C09CT("log_pb")
    public final LogPb logPb;

    public SearchLandingPageResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLandingPageResponse)) {
            return false;
        }
        SearchLandingPageResponse searchLandingPageResponse = (SearchLandingPageResponse) obj;
        return Intrinsics.LJFF(this.data, searchLandingPageResponse.data) && Intrinsics.LJFF(this.logPb, searchLandingPageResponse.logPb) && Intrinsics.LJFF(this.LIZ, searchLandingPageResponse.LIZ);
    }

    public final int hashCode() {
        Map<String, Object> map = this.data;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        LogPb logPb = this.logPb;
        int iHashCode2 = (iHashCode + (logPb == null ? 0 : logPb.hashCode())) * 31;
        String str = this.LIZ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchLandingPageResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchLandingPageResponse(Map<String, ? extends Object> map, LogPb logPb, String str) {
        super(null, 0, "");
        this.data = map;
        this.logPb = logPb;
        this.LIZ = str;
    }
}

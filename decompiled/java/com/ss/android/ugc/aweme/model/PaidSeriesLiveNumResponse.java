package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class PaidSeriesLiveNumResponse extends BaseResponse {

    @C09CT("added_live_series_count")
    public final int addedLiveSeriesCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaidSeriesLiveNumResponse) && this.addedLiveSeriesCount == ((PaidSeriesLiveNumResponse) obj).addedLiveSeriesCount;
    }

    public final int hashCode() {
        return this.addedLiveSeriesCount;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidSeriesLiveNumResponse(addedLiveSeriesCount=");
        sbLIZ.append(this.addedLiveSeriesCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaidSeriesLiveNumResponse(int i) {
        this.addedLiveSeriesCount = i;
    }
}

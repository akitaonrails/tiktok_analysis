package com.ss.android.ugc.tiktok.samsungfinder;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SamsungSearchResponse extends BaseResponse {

    @C09CT("data")
    public final SamsungSearchData data;

    @C09CT("error")
    public final SamsungSearchError error;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SamsungSearchResponse)) {
            return false;
        }
        SamsungSearchResponse samsungSearchResponse = (SamsungSearchResponse) obj;
        return Intrinsics.LJFF(this.data, samsungSearchResponse.data) && Intrinsics.LJFF(this.error, samsungSearchResponse.error);
    }

    public final int hashCode() {
        SamsungSearchData samsungSearchData = this.data;
        int iHashCode = (samsungSearchData == null ? 0 : samsungSearchData.hashCode()) * 31;
        SamsungSearchError samsungSearchError = this.error;
        return iHashCode + (samsungSearchError != null ? samsungSearchError.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SamsungSearchResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SamsungSearchResponse(SamsungSearchData samsungSearchData, SamsungSearchError samsungSearchError) {
        this.data = samsungSearchData;
        this.error = samsungSearchError;
    }
}

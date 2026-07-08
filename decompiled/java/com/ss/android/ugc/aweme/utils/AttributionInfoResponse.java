package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AttributionInfoResponse extends BaseResponse {

    @C09CT("data")
    public final AttributionInfoData data;

    @C09CT("err_no")
    public final int errCode;

    public AttributionInfoResponse() {
        this(-1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributionInfoResponse)) {
            return false;
        }
        AttributionInfoResponse attributionInfoResponse = (AttributionInfoResponse) obj;
        return this.errCode == attributionInfoResponse.errCode && Intrinsics.LJFF(this.data, attributionInfoResponse.data);
    }

    public final int hashCode() {
        int i = this.errCode * 31;
        AttributionInfoData attributionInfoData = this.data;
        return i + (attributionInfoData == null ? 0 : attributionInfoData.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AttributionInfoResponse(errCode=");
        sbLIZ.append(this.errCode);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AttributionInfoResponse(int i, AttributionInfoData attributionInfoData) {
        this.errCode = i;
        this.data = attributionInfoData;
    }
}

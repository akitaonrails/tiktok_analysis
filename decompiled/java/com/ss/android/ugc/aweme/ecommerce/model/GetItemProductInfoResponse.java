package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class GetItemProductInfoResponse extends BaseResponse {

    @C09CT("data")
    public final GetItemProductInfoResponseData data;

    public GetItemProductInfoResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetItemProductInfoResponse) && Intrinsics.LJFF(this.data, ((GetItemProductInfoResponse) obj).data);
    }

    public final int hashCode() {
        GetItemProductInfoResponseData getItemProductInfoResponseData = this.data;
        if (getItemProductInfoResponseData == null) {
            return 0;
        }
        return getItemProductInfoResponseData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetItemProductInfoResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetItemProductInfoResponse(GetItemProductInfoResponseData getItemProductInfoResponseData) {
        this.data = getItemProductInfoResponseData;
    }
}

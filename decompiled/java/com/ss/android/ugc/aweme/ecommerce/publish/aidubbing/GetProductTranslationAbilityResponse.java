package com.ss.android.ugc.aweme.ecommerce.publish.aidubbing;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetProductTranslationAbilityResponse {

    @C09CT("data")
    public final GetProductTranslationAbilityResponseData data;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public GetProductTranslationAbilityResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetProductTranslationAbilityResponse)) {
            return false;
        }
        GetProductTranslationAbilityResponse getProductTranslationAbilityResponse = (GetProductTranslationAbilityResponse) obj;
        return Intrinsics.LJFF(this.statusCode, getProductTranslationAbilityResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, getProductTranslationAbilityResponse.statusMsg) && Intrinsics.LJFF(this.data, getProductTranslationAbilityResponse.data);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        GetProductTranslationAbilityResponseData getProductTranslationAbilityResponseData = this.data;
        return iHashCode2 + (getProductTranslationAbilityResponseData != null ? getProductTranslationAbilityResponseData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetProductTranslationAbilityResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetProductTranslationAbilityResponse(Integer num, String str, GetProductTranslationAbilityResponseData getProductTranslationAbilityResponseData) {
        this.statusCode = num;
        this.statusMsg = str;
        this.data = getProductTranslationAbilityResponseData;
    }
}

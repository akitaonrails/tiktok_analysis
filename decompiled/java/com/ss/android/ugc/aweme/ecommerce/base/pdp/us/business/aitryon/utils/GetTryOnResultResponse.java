package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetTryOnResultResponse {

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final n data;

    @C09CT("message")
    public final String message;

    public GetTryOnResultResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTryOnResultResponse)) {
            return false;
        }
        GetTryOnResultResponse getTryOnResultResponse = (GetTryOnResultResponse) obj;
        return Intrinsics.LJFF(this.code, getTryOnResultResponse.code) && Intrinsics.LJFF(this.message, getTryOnResultResponse.message) && Intrinsics.LJFF(this.data, getTryOnResultResponse.data);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n nVar = this.data;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetTryOnResultResponse(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetTryOnResultResponse(Integer num, String str, n nVar) {
        this.code = num;
        this.message = str;
        this.data = nVar;
    }
}

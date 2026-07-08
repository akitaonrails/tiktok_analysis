package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EcSearchDiversionResponse {

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("code")
    public final int code;

    @C09CT("data")
    public final String data;

    @C09CT("message")
    public final String message;

    public EcSearchDiversionResponse() {
        this(null, -1, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcSearchDiversionResponse)) {
            return false;
        }
        EcSearchDiversionResponse ecSearchDiversionResponse = (EcSearchDiversionResponse) obj;
        return Intrinsics.LJFF(this.awemeId, ecSearchDiversionResponse.awemeId) && this.code == ecSearchDiversionResponse.code && Intrinsics.LJFF(this.message, ecSearchDiversionResponse.message) && Intrinsics.LJFF(this.data, ecSearchDiversionResponse.data);
    }

    public final int hashCode() {
        String str = this.awemeId;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.code) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.data;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchDiversionResponse(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcSearchDiversionResponse(String str, int i, String str2, String str3) {
        this.awemeId = str;
        this.code = i;
        this.message = str2;
        this.data = str3;
    }
}

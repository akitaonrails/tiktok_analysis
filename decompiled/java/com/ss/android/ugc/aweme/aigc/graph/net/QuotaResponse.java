package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class QuotaResponse {

    @C09CT("quotas")
    public final List<QuotaStruct> quotas;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMessage;

    public QuotaResponse() {
        this(null, null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuotaResponse)) {
            return false;
        }
        QuotaResponse quotaResponse = (QuotaResponse) obj;
        return Intrinsics.LJFF(this.quotas, quotaResponse.quotas) && Intrinsics.LJFF(this.statusCode, quotaResponse.statusCode) && Intrinsics.LJFF(this.statusMessage, quotaResponse.statusMessage);
    }

    public final int hashCode() {
        List<QuotaStruct> list = this.quotas;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.statusMessage;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotaResponse(quotas=");
        sbLIZ.append(this.quotas);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMessage=");
        sbLIZ.append(this.statusMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QuotaResponse(List<QuotaStruct> list, Integer num, String str) {
        this.quotas = list;
        this.statusCode = num;
        this.statusMessage = str;
    }
}

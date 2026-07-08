package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EcSearchBatchDiversionResponse {

    @C09CT("code")
    public final int code;

    @C09CT("message")
    public final String message;

    @C09CT("results")
    public final List<EcSearchDiversionResponse> results;

    public EcSearchBatchDiversionResponse() {
        this(-1, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcSearchBatchDiversionResponse)) {
            return false;
        }
        EcSearchBatchDiversionResponse ecSearchBatchDiversionResponse = (EcSearchBatchDiversionResponse) obj;
        return this.code == ecSearchBatchDiversionResponse.code && Intrinsics.LJFF(this.message, ecSearchBatchDiversionResponse.message) && Intrinsics.LJFF(this.results, ecSearchBatchDiversionResponse.results);
    }

    public final int hashCode() {
        int i = this.code * 31;
        String str = this.message;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<EcSearchDiversionResponse> list = this.results;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchBatchDiversionResponse(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", results=");
        sbLIZ.append(this.results);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcSearchBatchDiversionResponse(int i, String str, List<EcSearchDiversionResponse> list) {
        this.code = i;
        this.message = str;
        this.results = list;
    }
}

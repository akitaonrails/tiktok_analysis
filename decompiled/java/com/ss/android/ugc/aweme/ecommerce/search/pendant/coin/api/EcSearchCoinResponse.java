package com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EcSearchCoinResponse extends BaseResponse {

    @C09CT("debug_msg")
    public final String debugMsg;

    @C09CT("err_no")
    public Integer errNo;

    public EcSearchCoinResponse() {
        this(-1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcSearchCoinResponse)) {
            return false;
        }
        EcSearchCoinResponse ecSearchCoinResponse = (EcSearchCoinResponse) obj;
        return Intrinsics.LJFF(this.errNo, ecSearchCoinResponse.errNo) && Intrinsics.LJFF(this.debugMsg, ecSearchCoinResponse.debugMsg);
    }

    public final int hashCode() {
        Integer num = this.errNo;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.debugMsg;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchCoinResponse(errNo=");
        sbLIZ.append(this.errNo);
        sbLIZ.append(", debugMsg=");
        sbLIZ.append(this.debugMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcSearchCoinResponse(Integer num, String str) {
        this.errNo = num;
        this.debugMsg = str;
    }
}

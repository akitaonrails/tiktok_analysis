package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TradeQueryChargeDetails {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    @C09CT("status_code")
    public final String statusCode;

    public TradeQueryChargeDetails() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeQueryChargeDetails)) {
            return false;
        }
        TradeQueryChargeDetails tradeQueryChargeDetails = (TradeQueryChargeDetails) obj;
        return Intrinsics.LJFF(this.status, tradeQueryChargeDetails.status) && Intrinsics.LJFF(this.statusCode, tradeQueryChargeDetails.statusCode);
    }

    public final int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusCode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TradeQueryChargeDetails(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TradeQueryChargeDetails(String str, String str2) {
        this.status = str;
        this.statusCode = str2;
    }
}

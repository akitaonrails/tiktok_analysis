package com.ss.android.ugc.aweme.pipo.cashier.cashier;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierKey {

    @C09CT("notification_id")
    public final String notificationId;

    @C09CT("pay_request_id")
    public final String payRequestId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashierKey)) {
            return false;
        }
        CashierKey cashierKey = (CashierKey) obj;
        return Intrinsics.LJFF(this.payRequestId, cashierKey.payRequestId) && Intrinsics.LJFF(this.notificationId, cashierKey.notificationId);
    }

    public final int hashCode() {
        String str = this.payRequestId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.notificationId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CashierKey(payRequestId=");
        sbLIZ.append(this.payRequestId);
        sbLIZ.append(", notificationId=");
        sbLIZ.append(this.notificationId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CashierKey() {
        this("", "");
    }

    public CashierKey(String str, String str2) {
        this.payRequestId = str;
        this.notificationId = str2;
    }
}

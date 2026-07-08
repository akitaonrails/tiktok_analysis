package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PayRequestPaymentConsult {

    @C09CT("payment_consult_id")
    public final String paymentConsultId;

    @C09CT("payment_params")
    public final Map<String, String> paymentParams;

    @C09CT("payment_unit_id")
    public final String paymentUnitId;

    public PayRequestPaymentConsult() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayRequestPaymentConsult)) {
            return false;
        }
        PayRequestPaymentConsult payRequestPaymentConsult = (PayRequestPaymentConsult) obj;
        return Intrinsics.LJFF(this.paymentConsultId, payRequestPaymentConsult.paymentConsultId) && Intrinsics.LJFF(this.paymentUnitId, payRequestPaymentConsult.paymentUnitId) && Intrinsics.LJFF(this.paymentParams, payRequestPaymentConsult.paymentParams);
    }

    public final int hashCode() {
        String str = this.paymentConsultId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentUnitId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.paymentParams;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PayRequestPaymentConsult(paymentConsultId=");
        sbLIZ.append(this.paymentConsultId);
        sbLIZ.append(", paymentUnitId=");
        sbLIZ.append(this.paymentUnitId);
        sbLIZ.append(", paymentParams=");
        sbLIZ.append(this.paymentParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PayRequestPaymentConsult(String str, String str2, Map<String, String> map) {
        this.paymentConsultId = str;
        this.paymentUnitId = str2;
        this.paymentParams = map;
    }
}

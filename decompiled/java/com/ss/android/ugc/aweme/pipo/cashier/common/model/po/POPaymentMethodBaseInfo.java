package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class POPaymentMethodBaseInfo {

    @C09CT("model")
    public final String model;

    @C09CT("payment_method_v2")
    public final String paymentMethodV2;

    @C09CT("payment_method_id")
    public final String pmId;

    @C09CT("payment_method_token")
    public final String token;

    public POPaymentMethodBaseInfo() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POPaymentMethodBaseInfo)) {
            return false;
        }
        POPaymentMethodBaseInfo pOPaymentMethodBaseInfo = (POPaymentMethodBaseInfo) obj;
        return Intrinsics.LJFF(this.pmId, pOPaymentMethodBaseInfo.pmId) && Intrinsics.LJFF(this.token, pOPaymentMethodBaseInfo.token) && Intrinsics.LJFF(this.paymentMethodV2, pOPaymentMethodBaseInfo.paymentMethodV2) && Intrinsics.LJFF(this.model, pOPaymentMethodBaseInfo.model);
    }

    public final int hashCode() {
        String str = this.pmId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.token;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodV2;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.model;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POPaymentMethodBaseInfo(pmId=");
        sbLIZ.append(this.pmId);
        sbLIZ.append(", token=");
        sbLIZ.append(this.token);
        sbLIZ.append(", paymentMethodV2=");
        sbLIZ.append(this.paymentMethodV2);
        sbLIZ.append(", model=");
        sbLIZ.append(this.model);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public POPaymentMethodBaseInfo(String str, String str2, String str3, String str4) {
        this.pmId = str;
        this.token = str2;
        this.paymentMethodV2 = str3;
        this.model = str4;
    }
}

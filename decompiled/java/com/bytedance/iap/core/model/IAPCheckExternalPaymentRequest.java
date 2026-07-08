package com.bytedance.iap.core.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class IAPCheckExternalPaymentRequest {

    @C09CT("country_code")
    public final String countryCode;

    @C09CT("merchant_id")
    public final String merchantId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IAPCheckExternalPaymentRequest)) {
            return false;
        }
        IAPCheckExternalPaymentRequest iAPCheckExternalPaymentRequest = (IAPCheckExternalPaymentRequest) obj;
        return Intrinsics.LJFF(this.merchantId, iAPCheckExternalPaymentRequest.merchantId) && Intrinsics.LJFF(this.countryCode, iAPCheckExternalPaymentRequest.countryCode);
    }

    public final int hashCode() {
        return (this.merchantId.hashCode() * 31) + this.countryCode.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IAPCheckExternalPaymentRequest(merchantId=");
        sbLIZ.append(this.merchantId);
        sbLIZ.append(", countryCode=");
        sbLIZ.append(this.countryCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IAPCheckExternalPaymentRequest(String str, String str2) {
        this.merchantId = str;
        this.countryCode = str2;
    }
}

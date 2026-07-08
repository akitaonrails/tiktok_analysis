package com.ss.android.ugc.aweme.pipo.cashier.common.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PaymentOptionLocalInstallmentInfo {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("installment_option_id")
    public final String installmentOptionId;

    @C09CT("installment_plan_id")
    public final String installmentPlanId;

    @C09CT("tenure")
    public final Long tenure;

    public PaymentOptionLocalInstallmentInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentOptionLocalInstallmentInfo)) {
            return false;
        }
        PaymentOptionLocalInstallmentInfo paymentOptionLocalInstallmentInfo = (PaymentOptionLocalInstallmentInfo) obj;
        return Intrinsics.LJFF(this.tenure, paymentOptionLocalInstallmentInfo.tenure) && Intrinsics.LJFF(this.installmentPlanId, paymentOptionLocalInstallmentInfo.installmentPlanId) && Intrinsics.LJFF(this.installmentOptionId, paymentOptionLocalInstallmentInfo.installmentOptionId);
    }

    public final int hashCode() {
        Long l = this.tenure;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.installmentPlanId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.installmentOptionId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentOptionLocalInstallmentInfo(tenure=");
        sbLIZ.append(this.tenure);
        sbLIZ.append(", installmentPlanId=");
        sbLIZ.append(this.installmentPlanId);
        sbLIZ.append(", installmentOptionId=");
        sbLIZ.append(this.installmentOptionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaymentOptionLocalInstallmentInfo(Long l, String str, String str2) {
        this.tenure = l;
        this.installmentPlanId = str;
        this.installmentOptionId = str2;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentInstallmentPlan implements Serializable {
    public static final int $stable = 0;

    @C09CT("total_discount_info")
    public final PaymentDiscountInfo totalDiscountInfo;

    public PaymentInstallmentPlan() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentInstallmentPlan) && Intrinsics.LJFF(this.totalDiscountInfo, ((PaymentInstallmentPlan) obj).totalDiscountInfo);
    }

    public int hashCode() {
        PaymentDiscountInfo paymentDiscountInfo = this.totalDiscountInfo;
        if (paymentDiscountInfo == null) {
            return 0;
        }
        return paymentDiscountInfo.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentInstallmentPlan(totalDiscountInfo=");
        sbLIZ.append(this.totalDiscountInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaymentInstallmentPlan(PaymentDiscountInfo paymentDiscountInfo) {
        this.totalDiscountInfo = paymentDiscountInfo;
    }
}

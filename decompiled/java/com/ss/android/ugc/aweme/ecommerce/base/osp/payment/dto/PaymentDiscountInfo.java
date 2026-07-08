package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentDiscountInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("discount_amount")
    public final String discountAmount;

    @C09CT("discount_currency")
    public final String discountCurrency;

    @C09CT("discount_source_id")
    public final String discountSourceId;

    @C09CT("discount_type")
    public final String discountType;

    public PaymentDiscountInfo() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDiscountInfo)) {
            return false;
        }
        PaymentDiscountInfo paymentDiscountInfo = (PaymentDiscountInfo) obj;
        return Intrinsics.LJFF(this.discountType, paymentDiscountInfo.discountType) && Intrinsics.LJFF(this.discountSourceId, paymentDiscountInfo.discountSourceId) && Intrinsics.LJFF(this.discountAmount, paymentDiscountInfo.discountAmount) && Intrinsics.LJFF(this.discountCurrency, paymentDiscountInfo.discountCurrency);
    }

    public int hashCode() {
        String str = this.discountType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.discountSourceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discountAmount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.discountCurrency;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentDiscountInfo(discountType=");
        sbLIZ.append(this.discountType);
        sbLIZ.append(", discountSourceId=");
        sbLIZ.append(this.discountSourceId);
        sbLIZ.append(", discountAmount=");
        sbLIZ.append(this.discountAmount);
        sbLIZ.append(", discountCurrency=");
        sbLIZ.append(this.discountCurrency);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaymentDiscountInfo(String str, String str2, String str3, String str4) {
        this.discountType = str;
        this.discountSourceId = str2;
        this.discountAmount = str3;
        this.discountCurrency = str4;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.coupon;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CouponInfo {

    @C09CT("discount_limit_text")
    public final String discountLimitText;

    @C09CT("discount_text")
    public final String discountText;

    @C09CT("threshold_text")
    public final String thresholdText;

    @C09CT("voucher_type_id")
    public final String voucherTypeId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponInfo)) {
            return false;
        }
        CouponInfo couponInfo = (CouponInfo) obj;
        return Intrinsics.LJFF(this.voucherTypeId, couponInfo.voucherTypeId) && Intrinsics.LJFF(this.discountText, couponInfo.discountText) && Intrinsics.LJFF(this.discountLimitText, couponInfo.discountLimitText) && Intrinsics.LJFF(this.thresholdText, couponInfo.thresholdText);
    }

    public final int hashCode() {
        String str = this.voucherTypeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.discountText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discountLimitText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thresholdText;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CouponInfo(voucherTypeId=");
        sbLIZ.append(this.voucherTypeId);
        sbLIZ.append(", discountText=");
        sbLIZ.append(this.discountText);
        sbLIZ.append(", discountLimitText=");
        sbLIZ.append(this.discountLimitText);
        sbLIZ.append(", thresholdText=");
        sbLIZ.append(this.thresholdText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CouponInfo(String str, String str2, String str3, String str4) {
        this.voucherTypeId = str;
        this.discountText = str2;
        this.discountLimitText = str3;
        this.thresholdText = str4;
    }
}

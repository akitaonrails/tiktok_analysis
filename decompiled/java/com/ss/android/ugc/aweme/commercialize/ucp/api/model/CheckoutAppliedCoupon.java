package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CheckoutAppliedCoupon implements Serializable {

    @C09CT("code")
    public final String code;

    @C09CT("description")
    public final String description;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final Integer type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutAppliedCoupon)) {
            return false;
        }
        CheckoutAppliedCoupon checkoutAppliedCoupon = (CheckoutAppliedCoupon) obj;
        return Intrinsics.LJFF(this.code, checkoutAppliedCoupon.code) && Intrinsics.LJFF(this.title, checkoutAppliedCoupon.title) && Intrinsics.LJFF(this.description, checkoutAppliedCoupon.description) && Intrinsics.LJFF(this.type, checkoutAppliedCoupon.type);
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutAppliedCoupon(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutAppliedCoupon(String str, String str2, String str3, Integer num) {
        this.code = str;
        this.title = str2;
        this.description = str3;
        this.type = num;
    }
}

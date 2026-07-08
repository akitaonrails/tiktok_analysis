package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PayOnInfo {

    @C09CT("discount_description")
    public final String discountDescription;

    @C09CT("discount_value")
    public final Long discountValue;

    @C09CT("title")
    public final String title;

    public PayOnInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayOnInfo)) {
            return false;
        }
        PayOnInfo payOnInfo = (PayOnInfo) obj;
        return Intrinsics.LJFF(this.title, payOnInfo.title) && Intrinsics.LJFF(this.discountValue, payOnInfo.discountValue) && Intrinsics.LJFF(this.discountDescription, payOnInfo.discountDescription);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.discountValue;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.discountDescription;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PayOnInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", discountValue=");
        sbLIZ.append(this.discountValue);
        sbLIZ.append(", discountDescription=");
        sbLIZ.append(this.discountDescription);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PayOnInfo(String str, Long l, String str2) {
        this.title = str;
        this.discountValue = l;
        this.discountDescription = str2;
    }
}

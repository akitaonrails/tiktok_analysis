package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TaxInfoItem {

    @C09CT("button")
    public final StarlingKeyValue button;

    @C09CT("status_code")
    public final String code;

    @C09CT("is_need_tax")
    public final Boolean isNeedTax;

    @C09CT("is_prefill")
    public final Boolean isPrefill;

    @C09CT("sub_text")
    public final String subText;

    @C09CT("tax_code")
    public final String taxCode;

    @C09CT("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxInfoItem)) {
            return false;
        }
        TaxInfoItem taxInfoItem = (TaxInfoItem) obj;
        return Intrinsics.LJFF(this.taxCode, taxInfoItem.taxCode) && Intrinsics.LJFF(this.isNeedTax, taxInfoItem.isNeedTax) && Intrinsics.LJFF(this.isPrefill, taxInfoItem.isPrefill) && Intrinsics.LJFF(this.title, taxInfoItem.title) && Intrinsics.LJFF(this.subText, taxInfoItem.subText) && Intrinsics.LJFF(this.button, taxInfoItem.button) && Intrinsics.LJFF(this.code, taxInfoItem.code);
    }

    public final int hashCode() {
        String str = this.taxCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isNeedTax;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPrefill;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StarlingKeyValue starlingKeyValue = this.button;
        int iHashCode6 = (iHashCode5 + (starlingKeyValue == null ? 0 : starlingKeyValue.hashCode())) * 31;
        String str4 = this.code;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaxInfoItem(taxCode=");
        sbLIZ.append(this.taxCode);
        sbLIZ.append(", isNeedTax=");
        sbLIZ.append(this.isNeedTax);
        sbLIZ.append(", isPrefill=");
        sbLIZ.append(this.isPrefill);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subText=");
        sbLIZ.append(this.subText);
        sbLIZ.append(", button=");
        sbLIZ.append(this.button);
        sbLIZ.append(", code=");
        sbLIZ.append(this.code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TaxInfoItem(String str, Boolean bool, Boolean bool2, String str2, String str3, StarlingKeyValue starlingKeyValue, String str4) {
        this.taxCode = str;
        this.isNeedTax = bool;
        this.isPrefill = bool2;
        this.title = str2;
        this.subText = str3;
        this.button = starlingKeyValue;
        this.code = str4;
    }
}

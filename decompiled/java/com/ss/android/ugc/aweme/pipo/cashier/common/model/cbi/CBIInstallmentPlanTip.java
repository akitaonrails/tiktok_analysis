package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CBIInstallmentPlanTip {

    @C09CT("raw_name")
    public final String rawName;

    @C09CT("text")
    public final String text;

    @C09CT("tips")
    public final String tips;

    public CBIInstallmentPlanTip() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CBIInstallmentPlanTip)) {
            return false;
        }
        CBIInstallmentPlanTip cBIInstallmentPlanTip = (CBIInstallmentPlanTip) obj;
        return Intrinsics.LJFF(this.tips, cBIInstallmentPlanTip.tips) && Intrinsics.LJFF(this.text, cBIInstallmentPlanTip.text) && Intrinsics.LJFF(this.rawName, cBIInstallmentPlanTip.rawName);
    }

    public final int hashCode() {
        String str = this.tips;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rawName;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CBIInstallmentPlanTip(tips=");
        sbLIZ.append(this.tips);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", rawName=");
        sbLIZ.append(this.rawName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CBIInstallmentPlanTip(String str, String str2, String str3) {
        this.tips = str;
        this.text = str2;
        this.rawName = str3;
    }
}

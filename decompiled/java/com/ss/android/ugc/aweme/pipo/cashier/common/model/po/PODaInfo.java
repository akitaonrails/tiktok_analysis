package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PODaInfo {

    @C09CT("bank_code")
    public final String bankCode;

    @C09CT("is_pi")
    public final String isPIValue;

    @C09CT("payment_method")
    public final String optionName;

    public PODaInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PODaInfo)) {
            return false;
        }
        PODaInfo pODaInfo = (PODaInfo) obj;
        return Intrinsics.LJFF(this.optionName, pODaInfo.optionName) && Intrinsics.LJFF(this.bankCode, pODaInfo.bankCode) && Intrinsics.LJFF(this.isPIValue, pODaInfo.isPIValue);
    }

    public final int hashCode() {
        String str = this.optionName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bankCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.isPIValue;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PODaInfo(optionName=");
        sbLIZ.append(this.optionName);
        sbLIZ.append(", bankCode=");
        sbLIZ.append(this.bankCode);
        sbLIZ.append(", isPIValue=");
        sbLIZ.append(this.isPIValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PODaInfo(String str, String str2, String str3) {
        this.optionName = str;
        this.bankCode = str2;
        this.isPIValue = str3;
    }
}

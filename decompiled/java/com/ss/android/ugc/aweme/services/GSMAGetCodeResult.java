package com.ss.android.ugc.aweme.services;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GSMAGetCodeResult {
    public static final int $stable = 0;
    public final String code;
    public final String failReason;
    public final Boolean hasAccount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GSMAGetCodeResult)) {
            return false;
        }
        GSMAGetCodeResult gSMAGetCodeResult = (GSMAGetCodeResult) obj;
        return Intrinsics.LJFF(this.code, gSMAGetCodeResult.code) && Intrinsics.LJFF(this.hasAccount, gSMAGetCodeResult.hasAccount) && Intrinsics.LJFF(this.failReason, gSMAGetCodeResult.failReason);
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasAccount;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.failReason;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GSMAGetCodeResult(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", hasAccount=");
        sbLIZ.append(this.hasAccount);
        sbLIZ.append(", failReason=");
        sbLIZ.append(this.failReason);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GSMAGetCodeResult(String str, Boolean bool, String str2) {
        this.code = str;
        this.hasAccount = bool;
        this.failReason = str2;
    }
}

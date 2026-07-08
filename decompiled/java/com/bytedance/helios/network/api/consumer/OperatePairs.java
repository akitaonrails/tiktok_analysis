package com.bytedance.helios.network.api.consumer;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatePairs {
    public final String changedKey;
    public final transient String changedValue;
    public final String originKey;
    public final transient String originValue;

    public OperatePairs() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperatePairs)) {
            return false;
        }
        OperatePairs operatePairs = (OperatePairs) obj;
        return Intrinsics.LJFF(this.originKey, operatePairs.originKey) && Intrinsics.LJFF(this.originValue, operatePairs.originValue) && Intrinsics.LJFF(this.changedKey, operatePairs.changedKey) && Intrinsics.LJFF(this.changedValue, operatePairs.changedValue);
    }

    public int hashCode() {
        String str = this.originKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.originValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.changedKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.changedValue;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String strLIZIZ;
        String str = this.originKey;
        if (str == null || a0.LJJJIL(str)) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append("originKey: ");
            sbLIZ.append(this.originKey);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        String str2 = this.changedKey;
        if (!(str2 == null || a0.LJJJIL(str2))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(a0.LJJJIL(strLIZIZ) ^ true ? ", " : "");
            sbLIZ2.append("changedKey: ");
            sbLIZ2.append(this.changedKey);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        String str3 = this.originValue;
        if (str3 != null && !a0.LJJJIL(str3)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(a0.LJJJIL(strLIZIZ) ^ true ? ", " : "");
            sbLIZ3.append("originValue: ");
            sbLIZ3.append(this.originValue);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        String str4 = this.changedValue;
        if (str4 == null || a0.LJJJIL(str4)) {
            return strLIZIZ;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append(a0.LJJJIL(strLIZIZ) ^ true ? ", " : "");
        sbLIZ4.append("changedValue: ");
        sbLIZ4.append(this.changedValue);
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    public OperatePairs(String str, String str2, String str3, String str4) {
        this.originKey = str;
        this.originValue = str2;
        this.changedKey = str3;
        this.changedValue = str4;
    }
}

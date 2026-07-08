package com.bytedance.helios.network.api.consumer;

import X.C2188811AlT;
import X.C841550Wzp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ReportParam {
    public static final C841550Wzp Companion = new Object() { // from class: X.0Wzp
    };
    public boolean isCheckConflict;
    public boolean isRemain;
    public String key;
    public String type;
    public Object value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportParam)) {
            return false;
        }
        ReportParam reportParam = (ReportParam) obj;
        return Intrinsics.LJFF(this.key, reportParam.key) && Intrinsics.LJFF(this.value, reportParam.value) && Intrinsics.LJFF(this.type, reportParam.type) && this.isRemain == reportParam.isRemain && this.isCheckConflict == reportParam.isCheckConflict;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Object obj = this.value;
        int iHashCode2 = (((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.type.hashCode()) * 31;
        boolean z = this.isRemain;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return ((iHashCode2 + r0) * 31) + (this.isCheckConflict ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportParam(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", isRemain=");
        sbLIZ.append(this.isRemain);
        sbLIZ.append(", isCheckConflict=");
        sbLIZ.append(this.isCheckConflict);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isCheckConflict() {
        return this.isCheckConflict;
    }

    public final boolean isRemain() {
        return this.isRemain;
    }

    public final void setCheckConflict(boolean z) {
        this.isCheckConflict = z;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setRemain(boolean z) {
        this.isRemain = z;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }

    public ReportParam(String str, Object obj, String str2, boolean z, boolean z2) {
        this.key = str;
        this.value = obj;
        this.type = str2;
        this.isRemain = z;
        this.isCheckConflict = z2;
    }
}

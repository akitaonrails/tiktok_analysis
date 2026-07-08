package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class POStatusAttr {

    @C09CT("is_available")
    public boolean available;

    @C09CT("is_default")
    public final Boolean isDefault;

    @C09CT("is_primary")
    public final Boolean isPrimary;

    public POStatusAttr() {
        this(true, Boolean.FALSE, Boolean.FALSE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POStatusAttr)) {
            return false;
        }
        POStatusAttr pOStatusAttr = (POStatusAttr) obj;
        return this.available == pOStatusAttr.available && Intrinsics.LJFF(this.isDefault, pOStatusAttr.isDefault) && Intrinsics.LJFF(this.isPrimary, pOStatusAttr.isPrimary);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.available) * 31;
        Boolean bool = this.isDefault;
        int iHashCode = (iZ2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPrimary;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POStatusAttr(available=");
        sbLIZ.append(this.available);
        sbLIZ.append(", isDefault=");
        sbLIZ.append(this.isDefault);
        sbLIZ.append(", isPrimary=");
        sbLIZ.append(this.isPrimary);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public POStatusAttr(boolean z, Boolean bool, Boolean bool2) {
        this.available = z;
        this.isDefault = bool;
        this.isPrimary = bool2;
    }
}

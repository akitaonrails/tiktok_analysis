package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PDPAccessControl {

    @C09CT("blocked")
    public final Boolean blocked;

    @C09CT("display_msg")
    public final String displayMsg;

    public PDPAccessControl() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPAccessControl)) {
            return false;
        }
        PDPAccessControl pDPAccessControl = (PDPAccessControl) obj;
        return Intrinsics.LJFF(this.blocked, pDPAccessControl.blocked) && Intrinsics.LJFF(this.displayMsg, pDPAccessControl.displayMsg);
    }

    public final int hashCode() {
        Boolean bool = this.blocked;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.displayMsg;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPAccessControl(blocked=");
        sbLIZ.append(this.blocked);
        sbLIZ.append(", displayMsg=");
        sbLIZ.append(this.displayMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PDPAccessControl(Boolean bool, String str) {
        this.blocked = bool;
        this.displayMsg = str;
    }
}

package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class POFormAutoFillInfo {

    @C09CT("address")
    public final POFormAutoFillAddress address;

    public POFormAutoFillInfo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof POFormAutoFillInfo) && Intrinsics.LJFF(this.address, ((POFormAutoFillInfo) obj).address);
    }

    public final int hashCode() {
        POFormAutoFillAddress pOFormAutoFillAddress = this.address;
        if (pOFormAutoFillAddress == null) {
            return 0;
        }
        return pOFormAutoFillAddress.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POFormAutoFillInfo(address=");
        sbLIZ.append(this.address);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public POFormAutoFillInfo(POFormAutoFillAddress pOFormAutoFillAddress) {
        this.address = pOFormAutoFillAddress;
    }
}

package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UcpOpenLoopAdInfo {

    @C09CT("adv_id")
    public final String advId;

    public UcpOpenLoopAdInfo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UcpOpenLoopAdInfo) && Intrinsics.LJFF(this.advId, ((UcpOpenLoopAdInfo) obj).advId);
    }

    public final int hashCode() {
        String str = this.advId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpOpenLoopAdInfo(advId=");
        sbLIZ.append(this.advId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpOpenLoopAdInfo(String str) {
        this.advId = str;
    }
}

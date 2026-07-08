package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class IncentivePreload extends C1893670zNV {

    @C09CT("enable_preload")
    public Boolean enablePreload;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IncentivePreload) && Intrinsics.LJFF(this.enablePreload, ((IncentivePreload) obj).enablePreload);
    }

    public final int hashCode() {
        Boolean bool = this.enablePreload;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IncentivePreload(enablePreload=");
        sbLIZ.append(this.enablePreload);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IncentivePreload(Boolean bool) {
        this.enablePreload = bool;
    }
}

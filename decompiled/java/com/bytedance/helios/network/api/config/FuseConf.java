package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class FuseConf {

    @C09CT("code")
    public final int code;

    @C09CT("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FuseConf)) {
            return false;
        }
        FuseConf fuseConf = (FuseConf) obj;
        return this.code == fuseConf.code && Intrinsics.LJFF(this.message, fuseConf.message);
    }

    public final int hashCode() {
        return (this.code * 31) + this.message.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FuseConf(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FuseConf() {
        this(410, "this api is not allow");
    }

    public FuseConf(int i, String str) {
        this.code = i;
        this.message = str;
    }
}

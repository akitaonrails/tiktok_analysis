package com.ss.android.ugc.aweme.biz.wallet.network.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetUserPlacementResp implements Serializable {

    @C09CT("jump_schema")
    public final String jumpSchema;

    public GetUserPlacementResp() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetUserPlacementResp) && Intrinsics.LJFF(this.jumpSchema, ((GetUserPlacementResp) obj).jumpSchema);
    }

    public int hashCode() {
        String str = this.jumpSchema;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetUserPlacementResp(jumpSchema=");
        sbLIZ.append(this.jumpSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetUserPlacementResp(String str) {
        this.jumpSchema = str;
    }
}

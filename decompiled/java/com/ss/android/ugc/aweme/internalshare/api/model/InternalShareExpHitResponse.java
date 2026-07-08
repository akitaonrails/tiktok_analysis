package com.ss.android.ugc.aweme.internalshare.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class InternalShareExpHitResponse extends BaseResponse {

    @C09CT("uid_hit_info")
    public final Map<String, String> hitInfo;

    public InternalShareExpHitResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InternalShareExpHitResponse) && Intrinsics.LJFF(this.hitInfo, ((InternalShareExpHitResponse) obj).hitInfo);
    }

    public final int hashCode() {
        Map<String, String> map = this.hitInfo;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InternalShareExpHitResponse(hitInfo=");
        sbLIZ.append(this.hitInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InternalShareExpHitResponse(Map<String, String> map) {
        this.hitInfo = map;
    }
}

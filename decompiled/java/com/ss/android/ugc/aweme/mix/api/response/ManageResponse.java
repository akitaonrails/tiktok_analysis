package com.ss.android.ugc.aweme.mix.api.response;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class ManageResponse extends BaseResponse {

    @C09CT("mix_id")
    public final String mixId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ManageResponse) && Intrinsics.LJFF(this.mixId, ((ManageResponse) obj).mixId);
    }

    public final int hashCode() {
        return this.mixId.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManageResponse(mixId=");
        sbLIZ.append(this.mixId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ManageResponse(String str) {
        this.mixId = str;
    }
}

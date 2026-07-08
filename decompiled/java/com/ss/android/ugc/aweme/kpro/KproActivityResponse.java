package com.ss.android.ugc.aweme.kpro;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class KproActivityResponse extends BaseResponse {

    @C09CT("data")
    public final KproActivityResponseData data;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KproActivityResponse) && Intrinsics.LJFF(this.data, ((KproActivityResponse) obj).data);
    }

    public final int hashCode() {
        KproActivityResponseData kproActivityResponseData = this.data;
        if (kproActivityResponseData == null) {
            return 0;
        }
        return kproActivityResponseData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KproActivityResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KproActivityResponse(KproActivityResponseData kproActivityResponseData) {
        this.data = kproActivityResponseData;
    }
}

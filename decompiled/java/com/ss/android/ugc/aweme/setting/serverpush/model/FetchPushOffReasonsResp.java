package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class FetchPushOffReasonsResp extends BaseResponse {

    @C09CT("data")
    public final PushOffReasonsData data;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FetchPushOffReasonsResp) && Intrinsics.LJFF(this.data, ((FetchPushOffReasonsResp) obj).data);
    }

    public final int hashCode() {
        PushOffReasonsData pushOffReasonsData = this.data;
        if (pushOffReasonsData == null) {
            return 0;
        }
        return pushOffReasonsData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchPushOffReasonsResp(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FetchPushOffReasonsResp(PushOffReasonsData pushOffReasonsData) {
        this.data = pushOffReasonsData;
    }
}

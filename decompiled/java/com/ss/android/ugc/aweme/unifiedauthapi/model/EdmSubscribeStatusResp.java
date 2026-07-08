package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EdmSubscribeStatusResp extends BaseResponse {

    @C09CT("data")
    public final SubscribeStatus data;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EdmSubscribeStatusResp) && Intrinsics.LJFF(this.data, ((EdmSubscribeStatusResp) obj).data);
    }

    public final int hashCode() {
        SubscribeStatus subscribeStatus = this.data;
        if (subscribeStatus == null) {
            return 0;
        }
        return subscribeStatus.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EdmSubscribeStatusResp(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EdmSubscribeStatusResp(SubscribeStatus subscribeStatus) {
        this.data = subscribeStatus;
    }
}

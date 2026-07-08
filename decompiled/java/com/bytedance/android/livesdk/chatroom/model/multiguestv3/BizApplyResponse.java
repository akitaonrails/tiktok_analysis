package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BizApplyResponse {

    @C09CT("data")
    public BizApplyResponseData responseData;

    public BizApplyResponse() {
        this(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizApplyResponse(responseData=");
        sbLIZ.append(this.responseData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizApplyResponse(BizApplyResponseData bizApplyResponseData) {
        this.responseData = bizApplyResponseData;
    }
}

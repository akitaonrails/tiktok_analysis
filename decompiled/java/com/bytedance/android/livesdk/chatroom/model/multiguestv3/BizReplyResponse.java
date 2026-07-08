package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BizReplyResponse {

    @C09CT("data")
    public BizReplyResponseData responseData;

    public BizReplyResponse() {
        this(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizReplyResponse(responseData=");
        sbLIZ.append(this.responseData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizReplyResponse(BizReplyResponseData bizReplyResponseData) {
        this.responseData = bizReplyResponseData;
    }
}

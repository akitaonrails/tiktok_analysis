package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BizJoinDirectResponse {

    @C09CT("data")
    public BizJoinDirectResponseData responseData;

    public BizJoinDirectResponse() {
        this(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizJoinDirectResponse(responseData=");
        sbLIZ.append(this.responseData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizJoinDirectResponse(BizJoinDirectResponseData bizJoinDirectResponseData) {
        this.responseData = bizJoinDirectResponseData;
    }
}

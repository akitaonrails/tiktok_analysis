package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BizCreateChannelResponse {

    @C09CT("data")
    public BizCreateChannelResponseData responseData;

    public BizCreateChannelResponse() {
        this(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizCreateChannelResponse(responseData=");
        sbLIZ.append(this.responseData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizCreateChannelResponse(BizCreateChannelResponseData bizCreateChannelResponseData) {
        this.responseData = bizCreateChannelResponseData;
    }
}

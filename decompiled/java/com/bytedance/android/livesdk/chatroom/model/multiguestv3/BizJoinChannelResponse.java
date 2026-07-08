package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BizJoinChannelResponse {

    @C09CT("data")
    public BizJoinChannelResponseData responseData;

    public BizJoinChannelResponse() {
        this(null);
    }

    public BizJoinChannelResponse(BizJoinChannelResponseData bizJoinChannelResponseData) {
        this.responseData = bizJoinChannelResponseData;
    }
}

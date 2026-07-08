package com.bytedance.pipo.kyc.singpass.network.model.response;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class BaseResp {

    @C09CT("statusCode")
    public final int statusCode;

    @C09CT("statusMessage")
    public final String statusMessage;

    public BaseResp(int i, String str) {
        this.statusCode = i;
        this.statusMessage = str;
    }
}

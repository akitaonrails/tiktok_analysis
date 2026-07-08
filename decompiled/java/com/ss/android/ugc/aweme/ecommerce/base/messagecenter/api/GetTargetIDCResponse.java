package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class GetTargetIDCResponse {

    @C09CT("code")
    public final int code;

    @C09CT("data")
    public final GetTargetIDCData data;

    @C09CT("message")
    public final String message;

    public GetTargetIDCResponse() {
        this(-1, "", null);
    }

    public GetTargetIDCResponse(int i, String str, GetTargetIDCData getTargetIDCData) {
        this.code = i;
        this.message = str;
        this.data = getTargetIDCData;
    }
}

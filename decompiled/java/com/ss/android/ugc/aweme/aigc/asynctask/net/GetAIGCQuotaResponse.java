package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class GetAIGCQuotaResponse {

    @C09CT("data")
    public final QuotaData data;

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final int statusCode;

    public GetAIGCQuotaResponse() {
        this(-12345, "", new QuotaData(0, 0, 0, 0));
    }

    public GetAIGCQuotaResponse(int i, String str, QuotaData quotaData) {
        this.statusCode = i;
        this.message = str;
        this.data = quotaData;
    }
}

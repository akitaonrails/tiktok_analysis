package com.ss.android.ugc.aweme.amazon.model;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class AmazonTokenRemoveResponse {

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public AmazonTokenRemoveResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMsg = str;
    }
}

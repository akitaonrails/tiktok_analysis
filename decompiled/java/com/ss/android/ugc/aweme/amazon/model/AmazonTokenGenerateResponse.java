package com.ss.android.ugc.aweme.amazon.model;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class AmazonTokenGenerateResponse {

    @C09CT("amazon_token_info")
    public final AmazonTokenInfo amazonTokenInfo;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public AmazonTokenGenerateResponse(Integer num, String str, AmazonTokenInfo amazonTokenInfo) {
        this.statusCode = num;
        this.statusMsg = str;
        this.amazonTokenInfo = amazonTokenInfo;
    }
}

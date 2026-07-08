package com.ss.android.ugc.aweme.giftcard.network;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class GiftCardRequestWrapper {

    @C09CT("biz_content")
    public final String bizContent;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("pipo_error_code_params")
    public final String pipoErrorCodeParams;

    @C09CT("request_time")
    public final String requestTime;

    public GiftCardRequestWrapper(String str, String str2, String str3, String str4) {
        this.merchantId = str;
        this.bizContent = str2;
        this.requestTime = str3;
        this.pipoErrorCodeParams = str4;
    }
}

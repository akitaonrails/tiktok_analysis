package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoRequestWrapper {
    public final String LIZ;

    @C09CT("biz_content")
    public final String bizContent;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("nonce")
    public final String nonce;

    @C09CT("request_time")
    public final String requestTime;

    @C09CT("sign")
    public final String sign;

    public PipoRequestWrapper(String str, String str2, String str3, String str4, String str5, String str6) {
        this.merchantId = str;
        this.requestTime = str2;
        this.sign = str3;
        this.bizContent = str4;
        this.nonce = str5;
        this.LIZ = str6;
    }
}

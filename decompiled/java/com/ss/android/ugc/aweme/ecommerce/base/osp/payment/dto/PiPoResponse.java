package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PiPoResponse {

    @C09CT("response")
    public final String response;

    @C09CT("sign")
    public final String sign;

    public PiPoResponse(String str, String str2) {
        this.response = str;
        this.sign = str2;
    }
}

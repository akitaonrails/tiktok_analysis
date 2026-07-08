package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class WriteImpressionResponse {

    @C09CT("code")
    public final Integer code;

    @C09CT("message")
    public final String message;

    public WriteImpressionResponse() {
        this(-1, null);
    }

    public WriteImpressionResponse(Integer num, String str) {
        this.code = num;
        this.message = str;
    }
}

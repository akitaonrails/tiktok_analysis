package com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ApplyAuthResponse {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final ApplyAuthData data;

    @C09CT("message")
    public final String message;

    public ApplyAuthResponse() {
        this(-1, null, null);
    }

    public ApplyAuthResponse(Integer num, String str, ApplyAuthData applyAuthData) {
        this.code = num;
        this.message = str;
        this.data = applyAuthData;
    }
}

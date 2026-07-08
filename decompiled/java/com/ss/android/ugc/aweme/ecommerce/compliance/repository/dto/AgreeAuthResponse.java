package com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AgreeAuthResponse {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final AgreeAuthData data;

    @C09CT("message")
    public final String message;

    public AgreeAuthResponse() {
        this(-1, null, null);
    }

    public AgreeAuthResponse(Integer num, String str, AgreeAuthData agreeAuthData) {
        this.code = num;
        this.message = str;
        this.data = agreeAuthData;
    }
}

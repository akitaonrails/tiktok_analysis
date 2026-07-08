package com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ExposureAuthResponse {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final ExposureAuthData data;

    @C09CT("message")
    public final String message;

    public ExposureAuthResponse() {
        this(-1, null, null);
    }

    public ExposureAuthResponse(Integer num, String str, ExposureAuthData exposureAuthData) {
        this.code = num;
        this.message = str;
        this.data = exposureAuthData;
    }
}

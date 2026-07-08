package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpRecommendPreloadResponse {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("code")
    public final Integer code;

    @C09CT("data_str")
    public final String data;

    @C09CT("message")
    public final String message;

    public PdpRecommendPreloadResponse(Integer num, String str, String str2) {
        this.code = num;
        this.message = str;
        this.data = str2;
    }
}

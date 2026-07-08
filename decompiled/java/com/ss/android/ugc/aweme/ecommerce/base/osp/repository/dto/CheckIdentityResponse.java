package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CheckIdentityResponse {

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final CheckIdentityResponseData data;

    @C09CT("message")
    public final String message;

    public CheckIdentityResponse(Integer num, String str, CheckIdentityResponseData checkIdentityResponseData) {
        this.code = num;
        this.message = str;
        this.data = checkIdentityResponseData;
    }
}

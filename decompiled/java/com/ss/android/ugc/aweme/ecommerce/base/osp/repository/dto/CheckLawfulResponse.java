package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckLawfulResponse {

    @C09CT("code")
    public final Integer code;

    @C09CT("message")
    public final String message;

    public CheckLawfulResponse(Integer num, String str) {
        this.code = num;
        this.message = str;
    }
}

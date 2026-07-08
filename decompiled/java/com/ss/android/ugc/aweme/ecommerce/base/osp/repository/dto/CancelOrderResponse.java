package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class CancelOrderResponse {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final Object data;

    @C09CT("message")
    public final String message;

    public CancelOrderResponse() {
        this(-1, null, null);
    }

    public CancelOrderResponse(Integer num, String str, Object obj) {
        this.code = num;
        this.message = str;
        this.data = obj;
    }
}

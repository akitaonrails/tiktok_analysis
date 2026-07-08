package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class CheckPopUpResponse {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final PopUpResponseData data;

    @C09CT("message")
    public final String message;

    public CheckPopUpResponse(Integer num, String str, PopUpResponseData popUpResponseData) {
        this.code = num;
        this.message = str;
        this.data = popUpResponseData;
    }
}

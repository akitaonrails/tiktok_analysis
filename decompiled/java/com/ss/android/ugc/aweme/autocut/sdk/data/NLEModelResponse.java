package com.ss.android.ugc.aweme.autocut.sdk.data;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class NLEModelResponse {

    @C09CT("aigt_resp_status")
    public final Integer aigtRespStatus;

    @C09CT("data")
    public final String data;

    @C09CT("extra")
    public final NLEModelResponseExtra extra;

    @C09CT("is_asset")
    public final Boolean isAsset;

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public final Boolean isAsset() {
        return this.isAsset;
    }

    public NLEModelResponse(String str, NLEModelResponseExtra nLEModelResponseExtra, String str2, int i, String str3, Boolean bool, Integer num) {
        this.data = str;
        this.extra = nLEModelResponseExtra;
        this.message = str2;
        this.statusCode = i;
        this.statusMsg = str3;
        this.isAsset = bool;
        this.aigtRespStatus = num;
    }
}

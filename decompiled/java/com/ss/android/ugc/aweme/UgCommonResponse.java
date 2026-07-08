package com.ss.android.ugc.aweme;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class UgCommonResponse {

    @C09CT("extra")
    public final UgCommonResponseExtra extra;

    @C09CT("status_code")
    public final int statusCode;

    public UgCommonResponse(int i, UgCommonResponseExtra ugCommonResponseExtra) {
        this.statusCode = i;
        this.extra = ugCommonResponseExtra;
    }
}

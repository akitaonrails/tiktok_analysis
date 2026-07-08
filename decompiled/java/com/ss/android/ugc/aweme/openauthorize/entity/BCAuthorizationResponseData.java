package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class BCAuthorizationResponseData {

    @C09CT("description")
    public final String description;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("redirect_url")
    public final String redirectUrl;

    public BCAuthorizationResponseData() {
        this(null, null, null);
    }

    public BCAuthorizationResponseData(String str, String str2, String str3) {
        this.redirectUrl = str;
        this.errorCode = str2;
        this.description = str3;
    }
}

package com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PassportLoginResponse {

    @C09CT("data")
    public final PassportLoginData data;

    @C09CT("message")
    public final String message;

    public PassportLoginResponse() {
        this(null, null);
    }

    public PassportLoginResponse(String str, PassportLoginData passportLoginData) {
        this.message = str;
        this.data = passportLoginData;
    }
}

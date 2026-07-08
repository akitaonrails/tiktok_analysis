package com.ss.android.ugc.aweme.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class AccountAttributesApiResponse {

    @C09CT("data")
    public final AccountAttributesData data;

    @C09CT("message")
    public final String message;

    public AccountAttributesApiResponse() {
        this("", null);
    }

    public AccountAttributesApiResponse(String str, AccountAttributesData accountAttributesData) {
        this.message = str;
        this.data = accountAttributesData;
    }
}

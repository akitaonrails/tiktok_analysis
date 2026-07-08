package com.ss.android.ugc.aweme.account.api;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class ChangePasswordApiResponse {

    @C09CT("data")
    public final ChangePasswordData data;

    @C09CT("message")
    public final String message;

    public ChangePasswordApiResponse() {
        this("", null);
    }

    public ChangePasswordApiResponse(String str, ChangePasswordData changePasswordData) {
        this.message = str;
        this.data = changePasswordData;
    }
}

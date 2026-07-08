package com.ss.android.ugc.aweme.account.login.passkey.api;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PasskeyRemoveApiResponse {

    @C09CT("data")
    public final PasskeyRemoveData data;

    @C09CT("message")
    public final String message;

    public PasskeyRemoveApiResponse() {
        this("", null);
    }

    public PasskeyRemoveApiResponse(String str, PasskeyRemoveData passkeyRemoveData) {
        this.message = str;
        this.data = passkeyRemoveData;
    }
}

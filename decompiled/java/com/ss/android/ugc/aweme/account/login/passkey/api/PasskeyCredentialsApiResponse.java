package com.ss.android.ugc.aweme.account.login.passkey.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PasskeyCredentialsApiResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final PasskeyCredentialsData data;

    @C09CT("message")
    public final String message;

    public PasskeyCredentialsApiResponse() {
        this("", null);
    }

    public PasskeyCredentialsApiResponse(String str, PasskeyCredentialsData passkeyCredentialsData) {
        this.message = str;
        this.data = passkeyCredentialsData;
    }
}

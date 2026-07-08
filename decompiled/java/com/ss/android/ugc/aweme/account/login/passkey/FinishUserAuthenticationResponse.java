package com.ss.android.ugc.aweme.account.login.passkey;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes32.dex */
public final class FinishUserAuthenticationResponse {

    @C09CT("data")
    public final n data;

    @C09CT("message")
    public final String message;

    public FinishUserAuthenticationResponse() {
        this("", null);
    }

    public FinishUserAuthenticationResponse(String str, n nVar) {
        this.message = str;
        this.data = nVar;
    }
}

package com.ss.android.ugc.aweme.account.login.passkey;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes32.dex */
public final class BeginUserAuthenticationResponse {

    @C09CT("data")
    public final n data;

    @C09CT("message")
    public final String message;

    public BeginUserAuthenticationResponse() {
        this("", null);
    }

    public BeginUserAuthenticationResponse(String str, n nVar) {
        this.message = str;
        this.data = nVar;
    }
}

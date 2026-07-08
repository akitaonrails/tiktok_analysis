package com.ss.android.ugc.aweme.account.login.passkey;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class AuthenticatorSelection {

    @C09CT("authenticatorAttachment")
    public final String authenticatorAttachment;

    @C09CT("residentKey")
    public final String residentKey;

    @C09CT("userVerification")
    public final String userVerification;

    public AuthenticatorSelection() {
        this(null, null, null);
    }

    public AuthenticatorSelection(String str, String str2, String str3) {
        this.authenticatorAttachment = str;
        this.residentKey = str2;
        this.userVerification = str3;
    }
}

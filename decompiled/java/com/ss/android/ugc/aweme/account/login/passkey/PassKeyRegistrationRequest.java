package com.ss.android.ugc.aweme.account.login.passkey;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class PassKeyRegistrationRequest {

    @C09CT("attestation")
    public final String attestation;

    @C09CT("authenticatorSelection")
    public final AuthenticatorSelection authenticatorSelection;

    @C09CT("challenge")
    public final String challenge;

    @C09CT("excludeCredentials")
    public final List<Object> excludeCredentials;

    @C09CT("pubKeyCredParams")
    public final List<Object> pubKeyCredParams;

    @C09CT("rp")
    public final RelyingParty rp;

    @C09CT("user")
    public final UserData user;

    @C09CT("user_exists")
    public final boolean userExists;

    @C09CT("webauthn_ticket")
    public final String webauthnTicket;

    public PassKeyRegistrationRequest() {
        this(null, null, null, null, null, null, null, "", false);
    }

    public PassKeyRegistrationRequest(String str, RelyingParty relyingParty, UserData userData, List<Object> list, String str2, List<Object> list2, AuthenticatorSelection authenticatorSelection, String str3, boolean z) {
        this.challenge = str;
        this.rp = relyingParty;
        this.user = userData;
        this.pubKeyCredParams = list;
        this.attestation = str2;
        this.excludeCredentials = list2;
        this.authenticatorSelection = authenticatorSelection;
        this.webauthnTicket = str3;
        this.userExists = z;
    }
}

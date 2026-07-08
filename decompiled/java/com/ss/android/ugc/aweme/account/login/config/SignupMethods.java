package com.ss.android.ugc.aweme.account.login.config;

import X.C09CT;
import X.C2097608Jq;

/* JADX INFO: loaded from: classes29.dex */
public final class SignupMethods {

    @C09CT("email")
    public final SignupConsentConfig email;

    @C09CT("mobile")
    public final SignupConsentConfig mobile;

    @C09CT("third_parties")
    public final ThirdPartyConfig thirdParties;

    public SignupMethods() {
        this(new SignupConsentConfig(null, 1, null), new SignupConsentConfig(null, 1, null), new ThirdPartyConfig("", C2097608Jq.LJ()));
    }

    public SignupMethods(SignupConsentConfig signupConsentConfig, SignupConsentConfig signupConsentConfig2, ThirdPartyConfig thirdPartyConfig) {
        this.mobile = signupConsentConfig;
        this.email = signupConsentConfig2;
        this.thirdParties = thirdPartyConfig;
    }
}

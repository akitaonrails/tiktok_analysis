package com.ss.android.ugc.aweme.account.login.config;

import X.C09CT;
import X.C2097608Jq;

/* JADX INFO: loaded from: classes29.dex */
public final class AccountLoginFeatureConfig {

    @C09CT("login_methods")
    public final LoginMethods loginMethods;

    @C09CT("signup_methods")
    public final SignupMethods signupMethods;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountLoginFeatureConfig() {
        int i = 1;
        this(new SignupMethods(new SignupConsentConfig(null, i, 0 == true ? 1 : 0), new SignupConsentConfig(0 == true ? 1 : 0, i, 0 == true ? 1 : 0), new ThirdPartyConfig("", C2097608Jq.LJ())), new LoginMethods(new MobileConfig(new BasicConfig(true)), new ThirdPartyConfig("", C2097608Jq.LJ()), new BasicConfig(true), new BasicConfig(true), new BasicConfig(true), new HistoryLoginConfig(true, new BasicConfig(true)), new ShareOneTapLoginConfig(true, true, true, new BasicConfig(false)), new AccountRecoveryConfig(true, "")));
    }

    public AccountLoginFeatureConfig(SignupMethods signupMethods, LoginMethods loginMethods) {
        this.signupMethods = signupMethods;
        this.loginMethods = loginMethods;
    }
}

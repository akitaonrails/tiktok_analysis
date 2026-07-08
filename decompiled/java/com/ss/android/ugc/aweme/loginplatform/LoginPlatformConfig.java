package com.ss.android.ugc.aweme.loginplatform;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class LoginPlatformConfig {

    @C09CT("login")
    public final LoginSignupConfig loginConfig;

    @C09CT("recover_account_url")
    public final String recoverAccountUrl;

    @C09CT("signup")
    public final LoginSignupConfig signupConfig;

    public LoginPlatformConfig() {
        this(null, null, null);
    }

    public LoginPlatformConfig(LoginSignupConfig loginSignupConfig, LoginSignupConfig loginSignupConfig2, String str) {
        this.loginConfig = loginSignupConfig;
        this.signupConfig = loginSignupConfig2;
        this.recoverAccountUrl = str;
    }
}

package com.ss.android.ugc.aweme.loginplatform;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class LoginMethodConfig {

    @C09CT("confirm_config")
    public final LoginMethodConfirmConfig confirmConfig;

    @C09CT("fallback_url")
    public final String fallbackUrl;

    @C09CT("need_confirm")
    public final Boolean needConfirm;

    @C09CT("platform")
    public final String platform;

    public LoginMethodConfig() {
        this(null, null, null, null);
    }

    public LoginMethodConfig(String str, Boolean bool, String str2, LoginMethodConfirmConfig loginMethodConfirmConfig) {
        this.platform = str;
        this.needConfirm = bool;
        this.fallbackUrl = str2;
        this.confirmConfig = loginMethodConfirmConfig;
    }
}

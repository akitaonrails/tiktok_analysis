package com.ss.android.ugc.aweme.account.login.config;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class AccountRecoveryConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("url")
    public final String url;

    public AccountRecoveryConfig() {
        this(true, "");
    }

    public AccountRecoveryConfig(boolean z, String str) {
        this.enable = z;
        this.url = str;
    }
}

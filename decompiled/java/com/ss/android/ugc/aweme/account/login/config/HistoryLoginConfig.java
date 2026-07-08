package com.ss.android.ugc.aweme.account.login.config;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class HistoryLoginConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("one_click_login")
    public final BasicConfig oneClickLogin;

    public HistoryLoginConfig() {
        this(true, new BasicConfig(true));
    }

    public HistoryLoginConfig(boolean z, BasicConfig basicConfig) {
        this.enable = z;
        this.oneClickLogin = basicConfig;
    }
}

package com.ss.android.ugc.aweme.share;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class RulesConfig {

    @C09CT("new_user")
    public final NewUserConfig newUserConfig;

    @C09CT("continuous_no_click")
    public final NoClickConfig noClickConfig;

    @C09CT("unlogin")
    public final UnLoginConfig unLogin;

    public RulesConfig() {
        this(null, null, null);
    }

    public RulesConfig(NewUserConfig newUserConfig, NoClickConfig noClickConfig, UnLoginConfig unLoginConfig) {
        this.newUserConfig = newUserConfig;
        this.noClickConfig = noClickConfig;
        this.unLogin = unLoginConfig;
    }
}

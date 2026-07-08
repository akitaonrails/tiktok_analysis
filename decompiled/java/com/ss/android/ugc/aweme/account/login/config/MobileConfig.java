package com.ss.android.ugc.aweme.account.login.config;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class MobileConfig {

    @C09CT("gsma")
    public final BasicConfig gsma;

    public MobileConfig() {
        this(new BasicConfig(true));
    }

    public MobileConfig(BasicConfig basicConfig) {
        this.gsma = basicConfig;
    }
}

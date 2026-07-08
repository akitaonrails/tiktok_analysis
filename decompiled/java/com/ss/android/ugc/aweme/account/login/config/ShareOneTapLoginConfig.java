package com.ss.android.ugc.aweme.account.login.config;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ShareOneTapLoginConfig {

    @C09CT("blob")
    public final BasicConfig blob;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("is_provider")
    public final boolean isProvider;

    @C09CT("is_requester")
    public final boolean isRequester;

    public ShareOneTapLoginConfig() {
        this(true, true, true, new BasicConfig(false));
    }

    public ShareOneTapLoginConfig(boolean z, boolean z2, boolean z3, BasicConfig basicConfig) {
        this.enable = z;
        this.isProvider = z2;
        this.isRequester = z3;
        this.blob = basicConfig;
    }
}

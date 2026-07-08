package com.ss.android.ugc.aweme.legoImp.task.security;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class TikTokSecurityConfigModel {

    @C09CT("enable_gms_core_security_provider")
    public final boolean enableGmsCoreSecurityProvider;

    public TikTokSecurityConfigModel() {
        this(false);
    }

    public TikTokSecurityConfigModel(boolean z) {
        this.enableGmsCoreSecurityProvider = z;
    }
}

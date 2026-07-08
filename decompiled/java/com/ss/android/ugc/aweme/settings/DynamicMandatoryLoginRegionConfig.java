package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class DynamicMandatoryLoginRegionConfig {

    @C09CT("force_login_install_before_version")
    public final Integer forceLoginInstallBeforeVersion;

    @C09CT("is_force_login")
    public final Boolean isForceLogin;

    public DynamicMandatoryLoginRegionConfig() {
        this(Boolean.FALSE, -2);
    }

    public DynamicMandatoryLoginRegionConfig(Boolean bool, Integer num) {
        this.isForceLogin = bool;
        this.forceLoginInstallBeforeVersion = num;
    }
}

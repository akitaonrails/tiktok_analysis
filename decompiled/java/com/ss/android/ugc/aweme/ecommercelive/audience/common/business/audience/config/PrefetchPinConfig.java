package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.config;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class PrefetchPinConfig {

    @C09CT("is_enabled")
    public final boolean isEnabled;

    @C09CT("is_enabled_group_two")
    public final boolean isEnabledGroupTwo;

    public PrefetchPinConfig() {
        this(false, false);
    }

    public PrefetchPinConfig(boolean z, boolean z2) {
        this.isEnabled = z;
        this.isEnabledGroupTwo = z2;
    }
}

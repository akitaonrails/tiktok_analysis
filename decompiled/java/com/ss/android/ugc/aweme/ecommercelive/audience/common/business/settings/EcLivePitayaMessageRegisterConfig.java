package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class EcLivePitayaMessageRegisterConfig {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("use_global_scope")
    public final boolean useGlobalScope;

    public EcLivePitayaMessageRegisterConfig() {
        this(true, false);
    }

    public EcLivePitayaMessageRegisterConfig(boolean z, boolean z2) {
        this.enabled = z;
        this.useGlobalScope = z2;
    }
}

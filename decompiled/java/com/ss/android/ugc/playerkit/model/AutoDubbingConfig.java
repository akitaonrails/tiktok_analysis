package com.ss.android.ugc.playerkit.model;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class AutoDubbingConfig {

    @C09CT("enable_origin_fallback")
    public final boolean enableOriginFallback;

    @C09CT("enable_switch_language")
    public final boolean enableSwitchLanguage;

    @C09CT("enabled")
    public final boolean enabled;

    public AutoDubbingConfig() {
        this(false, false, false);
    }

    public AutoDubbingConfig(boolean z, boolean z2, boolean z3) {
        this.enabled = z;
        this.enableSwitchLanguage = z2;
        this.enableOriginFallback = z3;
    }
}

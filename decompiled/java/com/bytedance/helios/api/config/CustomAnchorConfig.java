package com.bytedance.helios.api.config;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class CustomAnchorConfig {

    @C09CT("DetectDelay")
    public final long detectDelay;

    @C09CT("DisabledCaseIds")
    public final String[] disabledCaseId;

    @C09CT("Enabled")
    public final boolean enabled;

    public CustomAnchorConfig() {
        this(true, 2000L, new String[0]);
    }

    public CustomAnchorConfig(boolean z, long j, String[] strArr) {
        this.enabled = z;
        this.detectDelay = j;
        this.disabledCaseId = strArr;
    }
}

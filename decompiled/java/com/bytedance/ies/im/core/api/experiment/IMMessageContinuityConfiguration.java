package com.bytedance.ies.im.core.api.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMessageContinuityConfiguration {

    @C09CT("global_message_min_index")
    public final long globalMessageMinIndex;

    @C09CT("enable")
    public final boolean isEnabled;

    @C09CT("recovery_version_android")
    public final int recoveryVersionAndroid;

    @C09CT("recovery_version_ios")
    public final int recoveryVersionIOS;

    @C09CT("resolve_max_page_count")
    public final int resolveMaxPageCount;

    public IMMessageContinuityConfiguration() {
        this(false, 0L, 0, 0, 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public IMMessageContinuityConfiguration(boolean z, long j, int i, int i2, int i3) {
        this.isEnabled = z;
        this.globalMessageMinIndex = j;
        this.recoveryVersionIOS = i;
        this.recoveryVersionAndroid = i2;
        this.resolveMaxPageCount = i3;
    }
}

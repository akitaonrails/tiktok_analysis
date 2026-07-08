package com.bytedance.im.core.client.configs;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKStatusMessageCompletenessConfig {

    @C09CT("check_interval")
    public final long checkInterval;

    @C09CT("check_limit")
    public final int checkLimit;

    @C09CT("enable_check_inboxes")
    public final List<Integer> enabledInboxes;

    @C09CT("enable")
    public final boolean isEnabled;

    public IMSDKStatusMessageCompletenessConfig() {
        this(false, null, 0L, 0, 15, null);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public IMSDKStatusMessageCompletenessConfig(boolean z, List<Integer> list, long j, int i) {
        this.isEnabled = z;
        this.enabledInboxes = list;
        this.checkInterval = j;
        this.checkLimit = i;
    }

    public IMSDKStatusMessageCompletenessConfig(boolean z, List list, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : i);
    }
}

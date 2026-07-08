package com.bytedance.helios.api.config;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class BinderConfig {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("interest_binders")
    public final List<Object> interestBinders;

    @C09CT("interest_providers")
    public final List<Object> interestProviders;

    @C09CT("share_monitor")
    public final ShareConfig shareConfig;

    public BinderConfig() {
        this(false, null, null, null, 15, null);
    }

    public BinderConfig(boolean z, ShareConfig shareConfig, List<Object> list, List<Object> list2) {
        this.enabled = z;
        this.shareConfig = shareConfig;
        this.interestBinders = list;
        this.interestProviders = list2;
    }

    public BinderConfig(boolean z, ShareConfig shareConfig, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ShareConfig(0.0d, 0.0d, false, null, null, null, 63, null) : shareConfig, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2);
    }
}

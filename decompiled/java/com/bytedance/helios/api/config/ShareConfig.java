package com.bytedance.helios.api.config;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareConfig {

    @C09CT("interest_binders")
    public final List<Object> interestBinders;

    @C09CT("mask_value_online")
    public final boolean maskValue;

    @C09CT("monitor_rate")
    public final double monitorRate;

    @C09CT("report_rate")
    public final double reportRate;

    @C09CT("skip_actions")
    public final List<String> skipActions;

    @C09CT("skip_providers")
    public final List<String> skipProviders;

    public ShareConfig() {
        this(0.0d, 0.0d, false, null, null, null, 63, null);
    }

    public ShareConfig(double d, double d2, boolean z, List<Object> list, List<String> list2, List<String> list3) {
        this.reportRate = d;
        this.monitorRate = d2;
        this.maskValue = z;
        this.interestBinders = list;
        this.skipActions = list2;
        this.skipProviders = list3;
    }

    public ShareConfig(double d, double d2, boolean z, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) == 0 ? d2 : 0.0d, (i & 4) != 0 ? false : z, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? C13BV.INSTANCE : list2, (i & 32) != 0 ? C13BV.INSTANCE : list3);
    }
}

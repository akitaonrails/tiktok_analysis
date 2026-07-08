package com.bytedance.helios.api.config;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class StrictModeConfig {

    @C09CT("fuse_api_ids")
    public final List<Integer> fuseApiIds;

    @C09CT("report_api_ids")
    public final List<Integer> reportApiIds;

    public StrictModeConfig() {
        this(null, null, 3, null);
    }

    public StrictModeConfig(List<Integer> list, List<Integer> list2) {
        this.fuseApiIds = list;
        this.reportApiIds = list2;
    }

    public StrictModeConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}

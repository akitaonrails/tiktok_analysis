package com.bytedance.pumbaa.base.settings;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class GuardRange {

    @C09CT("api_ids")
    public final List<Integer> apiIds;

    @C09CT("data_types")
    public final List<String> dataTypes;

    @C09CT("exclude_api_ids")
    public final List<Integer> excludeApiIds;

    public GuardRange() {
        this(null, null, null, 7, null);
    }

    public GuardRange(List<Integer> list, List<Integer> list2, List<String> list3) {
        this.apiIds = list;
        this.excludeApiIds = list2;
        this.dataTypes = list3;
    }

    public GuardRange(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3);
    }
}

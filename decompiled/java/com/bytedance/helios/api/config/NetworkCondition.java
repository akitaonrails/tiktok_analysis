package com.bytedance.helios.api.config;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkCondition {

    @C09CT("domain")
    public final List<ValueCondition> domainCondition;

    @C09CT("path")
    public final List<ValueCondition> pathCondition;

    @C09CT("url")
    public final List<ValueCondition> urlCondition;

    public NetworkCondition() {
        this(null, null, null, 7, null);
    }

    public NetworkCondition(List<ValueCondition> list, List<ValueCondition> list2, List<ValueCondition> list3) {
        this.domainCondition = list;
        this.pathCondition = list2;
        this.urlCondition = list3;
    }

    public NetworkCondition(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3);
    }
}

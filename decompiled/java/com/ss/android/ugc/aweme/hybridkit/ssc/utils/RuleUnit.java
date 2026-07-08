package com.ss.android.ugc.aweme.hybridkit.ssc.utils;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class RuleUnit {

    @C09CT("h")
    public final List<String> h;

    @C09CT("q")
    public final List<String> q;

    @C09CT("r")
    public final List<InnerRule> r;

    public RuleUnit() {
        this(null, null, null, 7, null);
    }

    public RuleUnit(List<String> list, List<String> list2, List<InnerRule> list3) {
        this.q = list;
        this.h = list2;
        this.r = list3;
    }

    public RuleUnit(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3);
    }
}

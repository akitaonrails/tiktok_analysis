package com.ss.android.ugc.aweme.hybridkit.ssc.utils;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Path {

    @C09CT("exact")
    public final Map<String, RuleUnit> exact;

    @C09CT("regs")
    public final List<PathReg> regs;

    public Path() {
        this(null, null, 3, null);
    }

    public Path(Map<String, RuleUnit> map, List<PathReg> list) {
        this.exact = map;
        this.regs = list;
    }

    public Path(Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJ() : map, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}

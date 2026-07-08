package com.ss.android.ugc.aweme.hybridkit.ssc.utils;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Hosts {

    @C09CT("regs")
    public final List<HostReg> regs;

    @C09CT("suffix")
    public final Map<String, String> suffix;

    public Hosts() {
        this(null, null, 3, null);
    }

    public Hosts(Map<String, String> map, List<HostReg> list) {
        this.suffix = map;
        this.regs = list;
    }

    public Hosts(Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJ() : map, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}

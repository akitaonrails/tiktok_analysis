package com.ss.android.ugc.aweme.hybridkit.ssc.utils;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Channels {

    @C09CT("prefix")
    public final List<String> prefix;

    @C09CT("regs")
    public final List<HostReg> regs;

    @C09CT("suffix")
    public final Map<String, String> suffix;

    public Channels() {
        this(null, null, null, 7, null);
    }

    public Channels(List<String> list, Map<String, String> map, List<HostReg> list2) {
        this.prefix = list;
        this.suffix = map;
        this.regs = list2;
    }

    public Channels(List list, Map map, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C2097608Jq.LJ() : map, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}

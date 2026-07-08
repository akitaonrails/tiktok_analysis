package com.bytedance.lynx.hybrid.ttp.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class Config {

    @C09CT("exclude")
    public final List<String> exclude;

    @C09CT("include")
    public final List<String> include;

    public Config() {
        this(null, null, 3, null);
    }

    public Config(List<String> list, List<String> list2) {
        this.include = list;
        this.exclude = list2;
    }

    public Config(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}

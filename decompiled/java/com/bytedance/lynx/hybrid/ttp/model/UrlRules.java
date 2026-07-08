package com.bytedance.lynx.hybrid.ttp.model;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class UrlRules {

    @C09CT("excludes")
    public final List<String> excludes;

    @C09CT("includes")
    public final List<String> includes;

    public UrlRules() {
        this(null, null, 3, null);
    }

    public UrlRules(List<String> list, List<String> list2) {
        this.includes = list;
        this.excludes = list2;
    }

    public UrlRules(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1697810uHb.LJIIJJI(".tiktok.com", ".tiktokv.com", ".tiktokcdn.com", ".tiktokcdn-us.com", ".tiktokw.us", ".tiktokv.us", ".tiktokw.eu", ".tiktokv.eu", ".tiktokcdn-eu.com") : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}

package com.ss.android.ugc.aweme.compliance.sandbox.api.webview;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class UrlRules {

    @C09CT("excludes")
    public final List<String> excludes;

    @C09CT("forcePlanB")
    public final boolean forcePlanB;

    @C09CT("includes")
    public final List<String> includes;

    @C09CT("planb")
    public final PlanBRule planb;

    public UrlRules() {
        this(null, null, false, null, 15, null);
    }

    public UrlRules(List<String> list, List<String> list2, boolean z, PlanBRule planBRule) {
        this.includes = list;
        this.excludes = list2;
        this.forcePlanB = z;
        this.planb = planBRule;
    }

    public UrlRules(List list, List list2, boolean z, PlanBRule planBRule, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1697810uHb.LJIIJJI(".tiktok.com", ".tiktokv.com", ".tiktokcdn.com", ".tiktokcdn-us.com", ".tiktokw.us", ".tiktokv.us", ".tiktokw.eu", ".tiktokv.eu", ".tiktokcdn-eu.com") : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new PlanBRule(null, 1, null) : planBRule);
    }
}

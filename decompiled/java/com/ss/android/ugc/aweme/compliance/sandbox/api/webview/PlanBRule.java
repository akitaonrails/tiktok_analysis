package com.ss.android.ugc.aweme.compliance.sandbox.api.webview;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class PlanBRule {

    @C09CT("htmlIncludes")
    public final List<String> htmlIncludes;

    public PlanBRule() {
        this(null, 1, null);
    }

    public PlanBRule(List<String> list) {
        this.htmlIncludes = list;
    }

    public PlanBRule(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}

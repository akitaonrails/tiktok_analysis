package com.ss.android.ugc.aweme.localservice.passthrough.rules;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class EventReportRules {

    @C09CT("bussiness_scene")
    public final String businessScene;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("rules")
    public final List<Rule> rules;

    public EventReportRules() {
        this(false, null, null, 7, null);
    }

    public EventReportRules(boolean z, String str, List<Rule> list) {
        this.enable = z;
        this.businessScene = str;
        this.rules = list;
    }

    public EventReportRules(boolean z, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}

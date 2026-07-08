package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class TooltipBindConfig {

    @C09CT("exit_rules")
    public final List<String> exitRules;

    @C09CT("frequency_rules")
    public final List<String> frequencyRules;

    @C09CT("ids")
    public final List<String> ids;

    @C09CT("type")
    public final String type;

    public TooltipBindConfig() {
        this(null, null, null, null, 15, null);
    }

    public TooltipBindConfig(String str, List<String> list, List<String> list2, List<String> list3) {
        this.type = str;
        this.ids = list;
        this.exitRules = list2;
        this.frequencyRules = list3;
    }

    public TooltipBindConfig(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? C13BV.INSTANCE : list3);
    }
}

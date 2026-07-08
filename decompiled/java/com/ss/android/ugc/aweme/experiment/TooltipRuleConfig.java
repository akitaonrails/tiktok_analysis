package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class TooltipRuleConfig {

    @C09CT("exit_rules")
    public final List<ExitRules> exitRules;

    @C09CT("frequency_rules")
    public final List<FrequencyRules> frequencyRules;

    public TooltipRuleConfig() {
        this(null, null, 3, null);
    }

    public TooltipRuleConfig(List<ExitRules> list, List<FrequencyRules> list2) {
        this.exitRules = list;
        this.frequencyRules = list2;
    }

    public TooltipRuleConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}

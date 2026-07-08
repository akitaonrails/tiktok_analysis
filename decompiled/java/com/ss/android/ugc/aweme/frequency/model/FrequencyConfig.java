package com.ss.android.ugc.aweme.frequency.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class FrequencyConfig implements Serializable {

    @C09CT("bind_configs")
    public final List<BindConfig> bindConfigs;

    @C09CT("exit_rules")
    public final List<ExitRule> exitRules;

    @C09CT("frequency_rules")
    public final List<FrequencyRule> frequencyRules;

    @C09CT("outreach_type")
    public final String outreachType;

    public FrequencyConfig() {
        this(null, null, null, null);
    }

    public FrequencyConfig(String str, List<FrequencyRule> list, List<ExitRule> list2, List<BindConfig> list3) {
        this.outreachType = str;
        this.frequencyRules = list;
        this.exitRules = list2;
        this.bindConfigs = list3;
    }
}

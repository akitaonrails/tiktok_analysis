package com.ss.android.ugc.aweme.outreach.frequency.config;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class CommonFrequencyAbilityConfig {

    @C09CT("common_configs")
    public final CommonConfigs commonConfigs;

    @C09CT("custom_configs")
    public final List<CustomConfig> customConfigs;

    public CommonFrequencyAbilityConfig(CommonConfigs commonConfigs, List<CustomConfig> list) {
        this.commonConfigs = commonConfigs;
        this.customConfigs = list;
    }
}

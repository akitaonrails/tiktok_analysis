package com.ss.android.ugc.aweme.frequency.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class FrequencyProtocol implements Serializable {

    @C09CT("outreach_frequency_configs")
    public final List<FrequencyConfig> frequencyConfigs;

    public FrequencyProtocol() {
        this(null);
    }

    public FrequencyProtocol(List<FrequencyConfig> list) {
        this.frequencyConfigs = list;
    }
}

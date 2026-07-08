package com.ss.android.ugc.aweme.im.strategy.exp;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DMResourceSampleRateSettingsData {

    @C09CT("aggregate_sample_data")
    public final Map<String, Double> aggregateSampleData;

    @C09CT("separate_sample_data")
    public final Map<String, Double> separateSampleData;

    public DMResourceSampleRateSettingsData() {
        this(null, null);
    }

    public DMResourceSampleRateSettingsData(Map<String, Double> map, Map<String, Double> map2) {
        this.separateSampleData = map;
        this.aggregateSampleData = map2;
    }
}

package com.ss.android.ugc.aweme.affinity.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class AffinityAggregationReportConfig {

    @C09CT("aggregation_count")
    public final int aggregationCount;

    @C09CT("aggregation_package_size")
    public final int aggregationPackageSize;

    @C09CT("aggregation_time")
    public final int aggregationTime;

    public AffinityAggregationReportConfig() {
        this(30, 900, 5000);
    }

    public AffinityAggregationReportConfig(int i, int i2, int i3) {
        this.aggregationCount = i;
        this.aggregationTime = i2;
        this.aggregationPackageSize = i3;
    }
}

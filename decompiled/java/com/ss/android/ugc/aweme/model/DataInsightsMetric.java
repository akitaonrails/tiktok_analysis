package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class DataInsightsMetric {

    @C09CT("value")
    public final List<DataPoint> dataPoints;

    @C09CT("status_code")
    public final int statusCode;

    public DataInsightsMetric(int i, List<DataPoint> list) {
        this.statusCode = i;
        this.dataPoints = list;
    }
}

package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class CameoMetricsInfo {

    @C09CT("activate_filter")
    public final Integer activateFilter;

    @C09CT("activate_function")
    public final String activateFunction;

    @C09CT("faceid_created_way")
    public final String faceIDCreatedWay;

    @C09CT("generate_count")
    public final Integer generateCount;

    public CameoMetricsInfo() {
        this(null, null, null, null);
    }

    public CameoMetricsInfo(Integer num, String str, String str2, Integer num2) {
        this.generateCount = num;
        this.faceIDCreatedWay = str;
        this.activateFunction = str2;
        this.activateFilter = num2;
    }
}

package com.ss.android.ugc.aweme.theater.common;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterCameoMetricsInfo implements Serializable {

    @C09CT("activate_filter")
    public final Integer activateFilter;

    @C09CT("activate_function")
    public final String activateFunction;

    @C09CT("faceid_created_way")
    public final String faceidCreatedWay;

    @C09CT("generate_count")
    public final Integer generateCount;

    public AITheaterCameoMetricsInfo() {
        this(null, null, null, null);
    }

    public final Integer getRetakeCnt() {
        int iIntValue;
        Integer num = this.generateCount;
        if (num == null || (iIntValue = num.intValue()) <= 0) {
            return 0;
        }
        return Integer.valueOf(iIntValue - 1);
    }

    public final Integer getActivateFilter() {
        return this.activateFilter;
    }

    public final String getActivateFunction() {
        return this.activateFunction;
    }

    public final String getFaceidCreatedWay() {
        return this.faceidCreatedWay;
    }

    public final Integer getGenerateCount() {
        return this.generateCount;
    }

    public AITheaterCameoMetricsInfo(Integer num, String str, String str2, Integer num2) {
        this.generateCount = num;
        this.faceidCreatedWay = str;
        this.activateFunction = str2;
        this.activateFilter = num2;
    }
}

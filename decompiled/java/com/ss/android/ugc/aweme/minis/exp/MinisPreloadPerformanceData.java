package com.ss.android.ugc.aweme.minis.exp;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisPreloadPerformanceData implements Serializable {

    @C09CT("required_cpu_state")
    public final Integer requiredCpuState;

    @C09CT("required_traffic_state")
    public final Integer requiredTrafficState;

    public MinisPreloadPerformanceData() {
        this(null, null);
    }

    public MinisPreloadPerformanceData(Integer num, Integer num2) {
        this.requiredCpuState = num;
        this.requiredTrafficState = num2;
    }
}

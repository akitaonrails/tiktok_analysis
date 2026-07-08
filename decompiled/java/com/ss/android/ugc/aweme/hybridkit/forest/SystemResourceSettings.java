package com.ss.android.ugc.aweme.hybridkit.forest;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class SystemResourceSettings {
    public static final SystemResourceModel LIZ = new SystemResourceModel();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(79));

    public static final class SystemResourceModel {

        @C09CT("enable")
        public boolean enable;

        @C09CT("cpu_normal_threshold")
        public double cpuNormalThreshold = 0.55d;

        @C09CT("cpu_stressful_threshold")
        public double cpuStressfulThreshold = 0.85d;

        @C09CT("memory_stressful_threshold")
        public long memoryStressfulThreshold = 52428800;
    }

    public static SystemResourceModel LIZ() {
        return (SystemResourceModel) LIZIZ.getValue();
    }
}

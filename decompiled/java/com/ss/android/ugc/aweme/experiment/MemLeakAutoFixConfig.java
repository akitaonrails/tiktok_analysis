package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class MemLeakAutoFixConfig {

    @C09CT("fix_activity_leak")
    public boolean fixActivityLeak;

    @C09CT("fix_fragment_leak")
    public boolean fixFragmentLeak;

    @C09CT("fix_leak_min_interval")
    public int fixLeakMinInterval;

    @C09CT("mem_usage_thresh")
    public float memoryUsageThreshold;

    @C09CT("leak_count_thresh")
    public int objectLeakCountThreshold;

    @C09CT("leak_time_thresh")
    public int objectLeakTimeThreshold;

    @C09CT("replace_with_null")
    public boolean replaceLeakObjectWithNull;

    public MemLeakAutoFixConfig() {
        this(180000, 0.9f, 5, 300000, false, true, false);
    }

    public final void setFixActivityLeak(boolean z) {
        this.fixActivityLeak = z;
    }

    public final void setFixFragmentLeak(boolean z) {
        this.fixFragmentLeak = z;
    }

    public final void setFixLeakMinInterval(int i) {
        this.fixLeakMinInterval = i;
    }

    public final void setMemoryUsageThreshold(float f) {
        this.memoryUsageThreshold = f;
    }

    public final void setObjectLeakCountThreshold(int i) {
        this.objectLeakCountThreshold = i;
    }

    public final void setObjectLeakTimeThreshold(int i) {
        this.objectLeakTimeThreshold = i;
    }

    public final void setReplaceLeakObjectWithNull(boolean z) {
        this.replaceLeakObjectWithNull = z;
    }

    public MemLeakAutoFixConfig(int i, float f, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.fixLeakMinInterval = i;
        this.memoryUsageThreshold = f;
        this.objectLeakCountThreshold = i2;
        this.objectLeakTimeThreshold = i3;
        this.replaceLeakObjectWithNull = z;
        this.fixActivityLeak = z2;
        this.fixFragmentLeak = z3;
    }
}

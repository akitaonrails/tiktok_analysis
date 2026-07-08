package com.ss.android.ugc.aweme.web.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandPageSSPOptSettingV2Model {

    @C09CT("enable_monitor_prefetch_reuse_count")
    public final boolean enableMonitorPrefetchReuseCount;

    @C09CT("enable_optimize_on_slide")
    public final boolean enableOptimizeOnSlide;

    @C09CT("enable_use_resource_group")
    public final boolean enableUseResourceGroup;

    @C09CT("prefetch_task_reuse_time")
    public final long prefetchTaskReuseTime;

    public AdLandPageSSPOptSettingV2Model() {
        this(false, false, false, 0L);
    }

    public AdLandPageSSPOptSettingV2Model(boolean z, boolean z2, boolean z3, long j) {
        this.enableOptimizeOnSlide = z;
        this.enableUseResourceGroup = z2;
        this.enableMonitorPrefetchReuseCount = z3;
        this.prefetchTaskReuseTime = j;
    }
}

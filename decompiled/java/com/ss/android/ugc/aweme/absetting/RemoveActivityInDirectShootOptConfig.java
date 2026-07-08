package com.ss.android.ugc.aweme.absetting;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes26.dex */
public final class RemoveActivityInDirectShootOptConfig {

    @C09CT("disable_high_freq_perf_mob")
    public boolean disableHighFreqPerfMob;

    @C09CT("disable_prefetch_effect_chunked")
    public boolean disablePrefetchEffectChunked;

    @C09CT("lazy_load_component_v1")
    public boolean lazyLoadComponentV1;

    @C09CT("lazy_load_component_v2")
    public boolean lazyLoadComponentV2;

    @C09CT("memory_task_opt")
    public boolean memoryTaskOpt;

    @C09CT("preload_draft_opt")
    public boolean preloadDraftOpt;

    @C09CT("preload_task_delay_start_ms")
    public long preloadTaskDelayStartMs;

    @C09CT("unify_preload_tasks")
    public boolean unifyPreloadTasks;

    public RemoveActivityInDirectShootOptConfig() {
        this(false, 0L, false, false, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoveActivityInDirectShootOptConfig)) {
            return false;
        }
        RemoveActivityInDirectShootOptConfig removeActivityInDirectShootOptConfig = (RemoveActivityInDirectShootOptConfig) obj;
        return this.lazyLoadComponentV1 == removeActivityInDirectShootOptConfig.lazyLoadComponentV1 && this.preloadTaskDelayStartMs == removeActivityInDirectShootOptConfig.preloadTaskDelayStartMs && this.unifyPreloadTasks == removeActivityInDirectShootOptConfig.unifyPreloadTasks && this.preloadDraftOpt == removeActivityInDirectShootOptConfig.preloadDraftOpt && this.memoryTaskOpt == removeActivityInDirectShootOptConfig.memoryTaskOpt && this.lazyLoadComponentV2 == removeActivityInDirectShootOptConfig.lazyLoadComponentV2 && this.disableHighFreqPerfMob == removeActivityInDirectShootOptConfig.disableHighFreqPerfMob && this.disablePrefetchEffectChunked == removeActivityInDirectShootOptConfig.disablePrefetchEffectChunked;
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.Z2(this.lazyLoadComponentV1) * 31) + C786410Ut5.Y2(this.preloadTaskDelayStartMs)) * 31) + C786410Ut5.Z2(this.unifyPreloadTasks)) * 31) + C786410Ut5.Z2(this.preloadDraftOpt)) * 31) + C786410Ut5.Z2(this.memoryTaskOpt)) * 31) + C786410Ut5.Z2(this.lazyLoadComponentV2)) * 31) + C786410Ut5.Z2(this.disableHighFreqPerfMob)) * 31) + C786410Ut5.Z2(this.disablePrefetchEffectChunked);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoveActivityInDirectShootOptConfig(lazyLoadComponentV1=");
        sbLIZ.append(this.lazyLoadComponentV1);
        sbLIZ.append(", preloadTaskDelayStartMs=");
        sbLIZ.append(this.preloadTaskDelayStartMs);
        sbLIZ.append(", unifyPreloadTasks=");
        sbLIZ.append(this.unifyPreloadTasks);
        sbLIZ.append(", preloadDraftOpt=");
        sbLIZ.append(this.preloadDraftOpt);
        sbLIZ.append(", memoryTaskOpt=");
        sbLIZ.append(this.memoryTaskOpt);
        sbLIZ.append(", lazyLoadComponentV2=");
        sbLIZ.append(this.lazyLoadComponentV2);
        sbLIZ.append(", disableHighFreqPerfMob=");
        sbLIZ.append(this.disableHighFreqPerfMob);
        sbLIZ.append(", disablePrefetchEffectChunked=");
        sbLIZ.append(this.disablePrefetchEffectChunked);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RemoveActivityInDirectShootOptConfig(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.lazyLoadComponentV1 = z;
        this.preloadTaskDelayStartMs = j;
        this.unifyPreloadTasks = z2;
        this.preloadDraftOpt = z3;
        this.memoryTaskOpt = z4;
        this.lazyLoadComponentV2 = z5;
        this.disableHighFreqPerfMob = z6;
        this.disablePrefetchEffectChunked = z7;
    }
}

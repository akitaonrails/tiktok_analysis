package com.ss.android.ugc.aweme.ecommerce.sparkpreload;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class ECSparkPreloadConfigItem {

    @C09CT("expired_time_in_second")
    public final int expiredTimeInSecond;

    @C09CT("max_count")
    public final int maxCount;

    @C09CT("max_memory_usage_percent")
    public final Float maxMemoryUsagePercent;

    @C09CT("need_cleanup")
    public final boolean needCleanup;

    @C09CT("preload_condition")
    public final ECSparkPreloadCondition preloadCondition;

    @C09CT("preload_info")
    public final List<ECSparkPreloadInfo> preloadInfo;

    @C09CT("preload_type")
    public final int preloadType;

    public ECSparkPreloadConfigItem() {
        this(0, null, 0, 0, false, null, null);
    }

    public ECSparkPreloadConfigItem(int i, ECSparkPreloadCondition eCSparkPreloadCondition, int i2, int i3, boolean z, Float f, List<ECSparkPreloadInfo> list) {
        this.preloadType = i;
        this.preloadCondition = eCSparkPreloadCondition;
        this.maxCount = i2;
        this.expiredTimeInSecond = i3;
        this.needCleanup = z;
        this.maxMemoryUsagePercent = f;
        this.preloadInfo = list;
    }
}

package com.ss.android.ugc.aweme.boost;

import X.C09CT;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes34.dex */
public final class ThreadBoostConfigs {

    @C09CT("enable_strategy")
    public final boolean enableStrategy;

    @C09CT("non_resident_thread_config")
    public final ThreadBoostConfig nonResidentThreadConfig;

    @C09CT("resident_thread_config")
    public final ThreadBoostConfig residentThreadConfig;

    @C09CT("start_collect_delay_time")
    public final long startCollectDelayTime;

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadBoostConfigs() {
        this(false, 0L, null, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public ThreadBoostConfigs(boolean z, long j, ThreadBoostConfig threadBoostConfig, ThreadBoostConfig threadBoostConfig2) {
        this.enableStrategy = z;
        this.startCollectDelayTime = j;
        this.residentThreadConfig = threadBoostConfig;
        this.nonResidentThreadConfig = threadBoostConfig2;
    }

    public /* synthetic */ ThreadBoostConfigs(boolean z, long j, ThreadBoostConfig threadBoostConfig, ThreadBoostConfig threadBoostConfig2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 3000L : j, (i & 4) != 0 ? new ThreadBoostConfig(new ArrayList(), new ArrayList(), new ArrayList(), 0L, 0L, false, false, false, true, 0L) : threadBoostConfig, (i & 8) != 0 ? new ThreadBoostConfig(new ArrayList(), new ArrayList(), new ArrayList(), 0L, 0L, false, false, false, true, 0L) : threadBoostConfig2);
    }
}

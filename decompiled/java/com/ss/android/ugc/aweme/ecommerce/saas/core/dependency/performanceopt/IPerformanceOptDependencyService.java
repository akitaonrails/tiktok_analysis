package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt;

import X.C03NS;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes27.dex */
public interface IPerformanceOptDependencyService extends IECommerceHostService {
    C03NS createFpsMonitor(String str);

    long getUltimateInflaterCacheAliveTime();

    boolean isNewUserColdBootRequestDelayRolloutEnable();

    void jatoBoost(long j);

    long reinstallCheckWaitTime();
}

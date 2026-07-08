package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt;

import X.C03NS;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultPerformanceOptDependencyService implements IPerformanceOptDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService
    public long getUltimateInflaterCacheAliveTime() {
        return 30L;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService
    public boolean isNewUserColdBootRequestDelayRolloutEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService
    public void jatoBoost(long j) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService
    public long reinstallCheckWaitTime() {
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService
    public C03NS createFpsMonitor(String str) {
        return new C03NS() { // from class: X.0ydG
            @Override // X.C03NS
            public final void LIZIZ(RecyclerView recyclerView) {
            }
        };
    }
}

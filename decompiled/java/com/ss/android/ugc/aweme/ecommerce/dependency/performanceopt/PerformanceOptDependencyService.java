package com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt;

import X.C03NS;
import X.C04TD;
import X.C0CNS;
import X.C1702420uP2;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;

/* JADX INFO: loaded from: classes31.dex */
public final class PerformanceOptDependencyService implements IPerformanceOptDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService
    public long getUltimateInflaterCacheAliveTime() {
        return 60L;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService
    public boolean isNewUserColdBootRequestDelayRolloutEnable() {
        return C0CNS.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService
    public long reinstallCheckWaitTime() {
        return C0CNS.LIZ() ? ((Number) C0CNS.LIZ.getValue()).intValue() : 0;
    }

    public static IPerformanceOptDependencyService createIPerformanceOptDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IPerformanceOptDependencyService.class, z);
        if (objLIZ != null) {
            return (IPerformanceOptDependencyService) objLIZ;
        }
        if (C04TD.L == null) {
            synchronized (IPerformanceOptDependencyService.class) {
                if (C04TD.L == null) {
                    C04TD.L = new PerformanceOptDependencyService();
                }
            }
        }
        return C04TD.L;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService
    public C03NS createFpsMonitor(final String str) {
        return new C03NS(str) { // from class: X.14Az
            public final InterfaceC1602960roc LIZ;

            {
                this.LIZ = C0VWN.LIZ(str, false);
            }

            @Override // X.C03NS
            public final void LIZIZ(RecyclerView recyclerView) {
                this.LIZ.LIZIZ(recyclerView);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService
    public void jatoBoost(long j) {
        C1702420uP2.LIZIZ(j, 2, 8, 4, 1);
    }
}

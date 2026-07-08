package com.ss.android.ugc.aweme.ecommerce.saas.core.monitor;

import com.ss.android.ugc.aweme.ecommerce.monitor.IECSDKMonitorService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.service.monitor.IECSaaSCoreMonitorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ECSaaSCoreMonitorService implements IECSaaSCoreMonitorService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.service.monitor.IECSaaSCoreMonitorService
    public final void LIZ(long j) {
        IECSDKMonitorService iECSDKMonitorService = (IECSDKMonitorService) PluggableExtentionKt.pluggableSpi$default(IECSDKMonitorService.class, false, false, false, 14, null);
        if (iECSDKMonitorService != null) {
            iECSDKMonitorService.LIZ(j);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.service.monitor.IECSaaSCoreMonitorService
    public final void LIZIZ(boolean z, Boolean bool, String str, int i, long j, String str2) {
        IECSDKMonitorService iECSDKMonitorService = (IECSDKMonitorService) PluggableExtentionKt.pluggableSpi$default(IECSDKMonitorService.class, false, false, false, 14, null);
        if (iECSDKMonitorService != null) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = -1;
                }
            }
            iECSDKMonitorService.LIZIZ(z, bool, str, i2, j, str2);
        }
    }
}

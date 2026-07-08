package com.ss.android.ugc.aweme.services.performance;

import X.C04TD;
import X.C04TP;
import X.C04TS;

/* JADX INFO: loaded from: classes3.dex */
public final class ManageResourceService implements IManageResourceService {
    @Override // com.ss.android.ugc.aweme.services.performance.IManageResourceService
    public boolean isHitCTMigrateThreadPoolFromDefaultToIO() {
        return ((Boolean) C04TP.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IManageResourceService
    public boolean enableCreativeToolsThreads() {
        return C04TS.LIZ();
    }

    public static IManageResourceService createIManageResourceServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IManageResourceService.class, z);
        if (objLIZ != null) {
            return (IManageResourceService) objLIZ;
        }
        if (C04TD.L4 == null) {
            synchronized (IManageResourceService.class) {
                if (C04TD.L4 == null) {
                    C04TD.L4 = new ManageResourceService();
                }
            }
        }
        return C04TD.L4;
    }
}

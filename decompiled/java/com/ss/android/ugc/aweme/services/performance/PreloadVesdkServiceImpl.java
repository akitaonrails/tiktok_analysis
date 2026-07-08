package com.ss.android.ugc.aweme.services.performance;

import X.C04TD;
import X.C0C64;
import X.C0CNO;
import X.C15O7;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes22.dex */
public final class PreloadVesdkServiceImpl implements IPreloadVesdkService {
    @Override // com.ss.android.ugc.aweme.services.performance.IPreloadVesdkService
    public void preloadVesdk() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_pre_load_vesdk_opt", true, false)) {
            C0CNO.LIZ(C15O7.LJI, AFwS210S0000000_22.get$arr$(108));
        }
    }

    public static IPreloadVesdkService createIPreloadVesdkServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IPreloadVesdkService.class, z);
        if (objLIZ != null) {
            return (IPreloadVesdkService) objLIZ;
        }
        if (C04TD.M4 == null) {
            synchronized (IPreloadVesdkService.class) {
                if (C04TD.M4 == null) {
                    C04TD.M4 = new PreloadVesdkServiceImpl();
                }
            }
        }
        return C04TD.M4;
    }
}

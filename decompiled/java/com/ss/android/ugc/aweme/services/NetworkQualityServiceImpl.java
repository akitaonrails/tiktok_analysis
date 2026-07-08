package com.ss.android.ugc.aweme.services;

import X.C04TD;
import X.C2215011Bmd;
import com.ss.android.ugc.aweme.lancet.INetworkQualityService;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkQualityServiceImpl implements INetworkQualityService {
    @Override // com.ss.android.ugc.aweme.lancet.INetworkQualityService
    public int getNetQualityLevel() {
        return C2215011Bmd.LIZIZ();
    }

    public static INetworkQualityService createINetworkQualityServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(INetworkQualityService.class, z);
        if (objLIZ != null) {
            return (INetworkQualityService) objLIZ;
        }
        if (C04TD.C4 == null) {
            synchronized (INetworkQualityService.class) {
                if (C04TD.C4 == null) {
                    C04TD.C4 = new NetworkQualityServiceImpl();
                }
            }
        }
        return C04TD.C4;
    }
}

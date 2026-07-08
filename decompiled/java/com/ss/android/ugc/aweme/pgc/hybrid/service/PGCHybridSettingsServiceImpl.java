package com.ss.android.ugc.aweme.pgc.hybrid.service;

import X.C04T9;
import X.C04TD;

/* JADX INFO: loaded from: classes3.dex */
public final class PGCHybridSettingsServiceImpl implements IPGCHybridSettingsService {
    public static IPGCHybridSettingsService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IPGCHybridSettingsService.class, false);
        if (objLIZ != null) {
            return (IPGCHybridSettingsService) objLIZ;
        }
        if (C04TD.f107a3 == null) {
            synchronized (IPGCHybridSettingsService.class) {
                if (C04TD.f107a3 == null) {
                    C04TD.f107a3 = new PGCHybridSettingsServiceImpl();
                }
            }
        }
        return C04TD.f107a3;
    }

    @Override // com.ss.android.ugc.aweme.pgc.hybrid.service.IPGCHybridSettingsService
    public final boolean LIZ() {
        return ((Boolean) C04T9.LIZ.getValue()).booleanValue();
    }
}

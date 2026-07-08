package com.ss.android.ugc.aweme.app.services;

import X.C04TD;
import X.C0VSJ;
import X.C830370Whn;
import X.C830390Whp;
import android.os.Build;

/* JADX INFO: loaded from: classes14.dex */
public final class LiveMonitorService implements ILiveMonitorService {
    public static ILiveMonitorService LIZ() {
        Object objLIZ = C04TD.LIZ(ILiveMonitorService.class, false);
        if (objLIZ != null) {
            return (ILiveMonitorService) objLIZ;
        }
        if (C04TD.LLIIIILZ == null) {
            synchronized (ILiveMonitorService.class) {
                if (C04TD.LLIIIILZ == null) {
                    C04TD.LLIIIILZ = new LiveMonitorService();
                }
            }
        }
        return C04TD.LLIIIILZ;
    }

    @Override // com.ss.android.ugc.aweme.app.services.ILiveMonitorService
    public final String getLiveScopedUserId() {
        C830390Whp.LIZ.getClass();
        return C830390Whp.LIZ("ttlive");
    }

    @Override // com.ss.android.ugc.aweme.app.services.ILiveMonitorService
    public final long ze(C0VSJ c0vsj) {
        if (Build.VERSION.SDK_INT < 26) {
            return C830370Whn.LIZIZ(c0vsj);
        }
        return C830370Whn.LIZ(c0vsj);
    }
}

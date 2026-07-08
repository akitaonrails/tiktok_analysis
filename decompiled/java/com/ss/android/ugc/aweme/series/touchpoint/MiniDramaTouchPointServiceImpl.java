package com.ss.android.ugc.aweme.series.touchpoint;

import X.C04TD;
import X.C1611700s2i;
import X.EnumC1611690s2h;
import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.ss.android.ugc.aweme.service.MiniDramaTouchPointService;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaTouchPointServiceImpl implements MiniDramaTouchPointService {
    public static MiniDramaTouchPointService LIZIZ() {
        Object objLIZ = C04TD.LIZ(MiniDramaTouchPointService.class, false);
        if (objLIZ != null) {
            return (MiniDramaTouchPointService) objLIZ;
        }
        if (C04TD.W3 == null) {
            synchronized (MiniDramaTouchPointService.class) {
                if (C04TD.W3 == null) {
                    C04TD.W3 = new MiniDramaTouchPointServiceImpl();
                }
            }
        }
        return C04TD.W3;
    }

    @Override // com.ss.android.ugc.aweme.service.MiniDramaTouchPointService
    public final boolean LIZ(EnumC1611690s2h enumC1611690s2h) {
        IWatchVideoService iWatchVideoService = (IWatchVideoService) C1611700s2i.LIZ.getValue();
        enumC1611690s2h.getValue();
        return iWatchVideoService.LIZJ();
    }
}

package com.ss.android.ugc.aweme.bottomtab.service;

import X.C04TD;
import X.C19EG;
import com.ss.android.ugc.aweme.live.ILiveTabService;

/* JADX INFO: loaded from: classes3.dex */
public final class LiveTabServiceImpl implements ILiveTabService {
    @Override // com.ss.android.ugc.aweme.live.ILiveTabService
    public final boolean LIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveTabService
    public final boolean LIZIZ(C19EG c19eg) {
        return false;
    }

    public static ILiveTabService LIZJ() {
        Object objLIZ = C04TD.LIZ(ILiveTabService.class, false);
        if (objLIZ != null) {
            return (ILiveTabService) objLIZ;
        }
        if (C04TD.LLILLL == null) {
            synchronized (ILiveTabService.class) {
                if (C04TD.LLILLL == null) {
                    C04TD.LLILLL = new LiveTabServiceImpl();
                }
            }
        }
        return C04TD.LLILLL;
    }
}

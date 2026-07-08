package com.ss.android.storage.cleaner;

import X.C13VI;
import X.C302040Bsg;
import X.EnumC1335420kr6;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveGeckoStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        boolean z2 = C302040Bsg.LIZ;
        if (!C302040Bsg.LIZ) {
            return 0L;
        }
        return 0 + ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().cleanLiveUnimportantGecko(z);
    }
}

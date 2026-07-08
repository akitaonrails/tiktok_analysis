package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0VSJ;
import X.C1374720lsU;
import X.C13VI;
import X.C2354709Kn;
import X.C2427709fH;
import X.EnumC1335420kr6;
import java.io.File;

/* JADX INFO: loaded from: classes31.dex */
public final class VideoShareCacheStorage extends C13VI {
    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return new C0VSJ(C2427709fH.LJIILL(C1374720lsU.LIZIZ()));
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        long jLJIIJ = C2354709Kn.LJIIJ(LJIIIIZZ().getPath());
        if (z) {
            C2354709Kn.LJIJI(LJIIIIZZ());
        }
        return jLJIIJ;
    }
}

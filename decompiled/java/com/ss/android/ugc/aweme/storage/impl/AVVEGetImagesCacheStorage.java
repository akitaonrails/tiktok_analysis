package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VU;
import X.EnumC1335420kr6;
import X.EnumC20228014Cw;
import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes31.dex */
public final class AVVEGetImagesCacheStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIIIZZ(EnumC20228014Cw.VE_GET_IMAGES_CACHE, "", true);
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        C13VD c13vd = new C13VD(null, null, 3);
        if (LJIIIIZZ().exists()) {
            C13VF c13vf = new C13VF();
            c13vf.LIZ(c13vd);
            c13vf.LIZIZ(LJIIIIZZ());
        }
        long j = c13vd.LIZJ;
        if (z && LJIIIIZZ().exists()) {
            C13VU c13vu = new C13VU((Set) null, 3);
            c13vu.LIZJ = true;
            C13VF c13vf2 = new C13VF();
            c13vf2.LIZ(c13vu);
            c13vf2.LIZIZ(LJIIIIZZ());
            c13vu.LIZIZ(null);
        }
        return j;
    }
}

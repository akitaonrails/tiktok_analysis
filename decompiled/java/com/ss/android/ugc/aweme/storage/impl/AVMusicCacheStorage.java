package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VP;
import X.C13VU;
import X.EnumC1335420kr6;
import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes31.dex */
public final class AVMusicCacheStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    public final long LJIILLIIL() {
        C13VD c13vd = new C13VD(null, null, 3);
        if (LJIIIIZZ().exists()) {
            C13VF c13vf = new C13VF();
            c13vf.LIZ(c13vd);
            c13vf.LIZIZ(LJIIIIZZ());
        }
        return c13vd.LIZJ + 0;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZ(C0CHQ.LIZ().LJJJJL().getCacheDir());
    }

    public final boolean LJIILL() {
        if (!LJIIIIZZ().exists()) {
            return true;
        }
        C13VU c13vu = new C13VU((Set) null, 3);
        C13VF c13vf = new C13VF();
        c13vf.LIZ(c13vu);
        c13vf.LIZIZ(LJIIIIZZ());
        c13vu.LIZIZ(null);
        return true;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        long jLJIILLIIL = LJIILLIIL();
        if (z) {
            LJIILL();
        }
        return jLJIILLIIL;
    }

    @Override // X.C13VI
    public final long LJIIJJI(boolean z) {
        C13VP.LIZ.getClass();
        if (C13VP.LIZ()) {
            long jLJIILLIIL = LJIILLIIL();
            if (z) {
                LJIILL();
            }
            return jLJIILLIIL;
        }
        return 0L;
    }
}

package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C0M5Z;
import X.C0VSJ;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VP;
import X.C13VU;
import X.C1436830nUf;
import X.EnumC1335420kr6;
import java.io.File;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: loaded from: classes31.dex */
public final class AVCreativeCacheStorage extends C13VI {
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
        return new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCacheRoot());
    }

    public final boolean LJIILL() {
        if (!LJIIIIZZ().exists()) {
            return true;
        }
        C0M5Z c0m5z = new C0M5Z(AFwS269S0000000_27.get$arr$(152));
        C0CHQ.LIZ().getPublishService().LJIIL();
        c0m5z.addAll(C1436830nUf.LJIILLIIL());
        String strLIZIZ = C0CHQ.LIZ().LJJI().LIZIZ();
        if (strLIZIZ != null) {
            c0m5z.add(strLIZIZ);
        }
        C13VU c13vu = new C13VU(c0m5z, 2);
        c13vu.LIZJ = true;
        C13VF c13vf = new C13VF();
        c13vf.LIZ(c13vu);
        c13vf.LIZIZ(LJIIIIZZ());
        c13vu.LIZIZ(null);
        return true;
    }

    public final long LJIILLIIL() {
        if (!LJIIIIZZ().exists()) {
            return 0L;
        }
        C13VD c13vd = new C13VD(null, null, 3);
        C13VF c13vf = new C13VF();
        c13vf.LIZ(c13vd);
        c13vf.LIZIZ(LJIIIIZZ());
        return c13vd.LIZJ;
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

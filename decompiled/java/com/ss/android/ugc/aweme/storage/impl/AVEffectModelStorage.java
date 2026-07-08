package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C0MZY;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VJ;
import X.C13VU;
import X.EnumC1335420kr6;
import java.io.File;

/* JADX INFO: loaded from: classes31.dex */
public final class AVEffectModelStorage extends C13VI {
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
        return C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZJ(C0CHQ.LIZ.getFilesDir(), "effectmodel");
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final void LJFF(boolean z) {
        super.LJFF(z);
        if (z) {
            C13VJ.LIZ(true);
        }
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        C0MZY.LIZ.getClass();
        C13VD c13vd = new C13VD(C0MZY.LIZIZ(), null, 2);
        if (LJIIIIZZ().exists()) {
            C13VF c13vf = new C13VF();
            c13vf.LIZ(c13vd);
            c13vf.LIZIZ(LJIIIIZZ());
        }
        long j = c13vd.LIZJ + 0;
        if (z && LJIIIIZZ().exists()) {
            C13VU c13vu = new C13VU(C0MZY.LIZIZ(), 2);
            c13vu.LIZJ = true;
            C13VF c13vf2 = new C13VF();
            c13vf2.LIZ(c13vu);
            c13vf2.LIZIZ(LJIIIIZZ());
            c13vu.LIZIZ(null);
        }
        return j;
    }

    @Override // X.C13VI
    public final void LJIILJJIL(long j, boolean z) {
        super.LJIILJJIL(j, z);
        if (z) {
            C13VJ.LIZ(false);
        }
    }
}

package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C0MZY;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VU;
import X.EnumC1335420kr6;
import X.EnumC20227914Cv;
import java.io.File;

/* JADX INFO: loaded from: classes31.dex */
public final class AVCreativeTemplateStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.AUTOCUT_TEMPLATE, "", true);
    }

    public final boolean LJIILL() {
        if (!LJIIIIZZ().exists()) {
            return true;
        }
        C0MZY.LIZ.getClass();
        C13VU c13vu = new C13VU(C0MZY.LIZIZ(), 2);
        c13vu.LIZJ = true;
        C13VF c13vf = new C13VF();
        c13vf.LIZ(c13vu);
        c13vf.LIZIZ(LJIIIIZZ());
        c13vu.LIZIZ(null);
        return true;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        if (z) {
            LJIILL();
            return 0L;
        }
        return 0L;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        long j;
        if (!LJIIIIZZ().exists()) {
            j = 0;
        } else {
            C0MZY.LIZ.getClass();
            C13VD c13vd = new C13VD(C0MZY.LIZIZ(), null, 2);
            C13VF c13vf = new C13VF();
            c13vf.LIZ(c13vd);
            c13vf.LIZIZ(LJIIIIZZ());
            j = c13vd.LIZJ;
        }
        if (z) {
            LJIILL();
        }
        return j;
    }
}

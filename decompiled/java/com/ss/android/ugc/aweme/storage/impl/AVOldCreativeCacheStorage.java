package com.ss.android.ugc.aweme.storage.impl;

import X.AnonymousClass0207;
import X.C0CHQ;
import X.C0M5Z;
import X.C0MZY;
import X.C0VSJ;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VU;
import X.C1436830nUf;
import X.C20021913Vp;
import X.C2188811AlT;
import X.C570490MZb;
import X.EnumC1335420kr6;
import java.io.File;

/* JADX INFO: loaded from: classes31.dex */
public final class AVOldCreativeCacheStorage extends C13VI {
    public static C0M5Z LJIILL() {
        C0M5Z c0m5z = new C0M5Z(AnonymousClass0207.get$arr$(145));
        C0CHQ.LIZ().getPublishService().LJIIL();
        c0m5z.addAll(C1436830nUf.LJIILLIIL());
        String strLIZIZ = C0CHQ.LIZ().LJJI().LIZIZ();
        if (strLIZIZ != null) {
            c0m5z.add(strLIZIZ);
        }
        C0MZY.LIZ.getClass();
        c0m5z.addAll(C0MZY.LIZIZ());
        return c0m5z;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C570490MZb.LIZJ(C20021913Vp.LIZIZ()));
        sbLIZ.append("parallel_upload");
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        C0M5Z c0m5zLJIILL = LJIILL();
        C13VD c13vd = new C13VD(c0m5zLJIILL, null, 2);
        C13VF c13vf = new C13VF();
        c13vf.LIZ(c13vd);
        c13vf.LIZIZ(LJIIIIZZ());
        long j = c13vd.LIZJ;
        if (z) {
            C13VU c13vu = new C13VU(c0m5zLJIILL, 2);
            c13vu.LIZJ = true;
            C13VF c13vf2 = new C13VF();
            c13vf2.LIZ(c13vu);
            c13vf2.LIZIZ(LJIIIIZZ());
            c13vu.LIZIZ(null);
        }
        return j;
    }
}

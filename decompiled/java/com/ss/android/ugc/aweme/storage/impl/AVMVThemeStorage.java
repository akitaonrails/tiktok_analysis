package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C0MZY;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VP;
import X.C13VU;
import X.C2188811AlT;
import X.C570490MZb;
import X.EnumC1335420kr6;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AwS65S0010000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class AVMVThemeStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    public final long LJIILLIIL() {
        C0MZY.LIZ.getClass();
        C13VD c13vd = new C13VD(C0MZY.LIZIZ(), null, 2);
        if (LJIIIIZZ().exists()) {
            C13VF c13vf = new C13VF();
            c13vf.LIZ(c13vd);
            c13vf.LIZIZ(LJIIIIZZ());
        }
        return c13vd.LIZJ + 0;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C570490MZb.LIZJ(C0CHQ.LIZ.getFilesDir().getAbsolutePath()));
        sbLIZ.append("mvtheme");
        return C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        long jLJIILLIIL = LJIILLIIL();
        if (z) {
            LJIILL(false);
        }
        return jLJIILLIIL;
    }

    @Override // X.C13VI
    public final long LJIIL(boolean z) {
        C13VP.LIZ.getClass();
        if (C13VP.LIZIZ()) {
            long jLJIILLIIL = LJIILLIIL();
            if (z) {
                LJIILL(true);
            }
            return jLJIILLIIL;
        }
        return 0L;
    }

    public final void LJIILL(boolean z) {
        if (!LJIIIIZZ().exists()) {
            return;
        }
        C0MZY.LIZ.getClass();
        C13VU c13vu = new C13VU((Set<String>) C0MZY.LIZIZ(), (Set<String>) Collections.singleton("contact_video"));
        c13vu.LIZJ = true;
        C13VF c13vf = new C13VF();
        c13vf.LIZ(c13vu);
        c13vf.LIZIZ(LJIIIIZZ());
        c13vu.LIZIZ(new AwS65S0010000_30(z, 2));
    }
}

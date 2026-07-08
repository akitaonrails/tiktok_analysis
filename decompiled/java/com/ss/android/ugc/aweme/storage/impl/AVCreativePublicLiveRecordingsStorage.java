package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C0VSJ;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VP;
import X.C13VU;
import X.C298170BmR;
import X.EnumC1335420kr6;
import X.EnumC20227914Cv;
import java.io.File;
import java.util.Set;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class AVCreativePublicLiveRecordingsStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.LIVE_RECORDINGS, "", false).getAbsolutePath());
    }

    public final boolean LJIILL() {
        if (!LJIIIIZZ().exists()) {
            return true;
        }
        C13VU c13vu = new C13VU((Set) null, 3);
        c13vu.LIZJ = true;
        C13VF c13vf = new C13VF();
        c13vf.LIZ(c13vu);
        c13vf.LIZIZ(LJIIIIZZ());
        c13vu.LIZIZ(AFwS219S0000000_30.get$arr$(100));
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
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        if (C298170BmR.LIZ() && z) {
            LJIILL();
            return 0L;
        }
        return 0L;
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
        LJIIIZ(z);
        return 0L;
    }
}

package com.ss.android.ugc.aweme.storage.impl;

import X.C0MZY;
import X.C0VSJ;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VU;
import X.C2285608xS;
import X.EnumC1335420kr6;
import java.io.File;

/* JADX INFO: loaded from: classes31.dex */
public final class AVVESdkStorage extends C13VI {
    public static final /* synthetic */ int LIZJ = 0;
    public final C0VSJ LIZIZ = C2285608xS.LIZ();

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return this.LIZIZ;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return LJIIJ(true);
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        long j;
        if (!this.LIZIZ.exists()) {
            j = 0;
        } else {
            C0MZY.LIZ.getClass();
            C13VD c13vd = new C13VD(C0MZY.LIZIZ(), null, 2);
            C13VF c13vf = new C13VF();
            c13vf.LIZ(c13vd);
            c13vf.LIZIZ(this.LIZIZ);
            j = c13vd.LIZJ;
        }
        if (z && this.LIZIZ.exists()) {
            C0MZY.LIZ.getClass();
            C13VU c13vu = new C13VU(C0MZY.LIZIZ(), 2);
            c13vu.LIZJ = true;
            C13VF c13vf2 = new C13VF();
            c13vf2.LIZ(c13vu);
            c13vf2.LIZIZ(this.LIZIZ);
            c13vu.LIZIZ(null);
        }
        return j;
    }
}

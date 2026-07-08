package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C2235908pR;
import X.EnumC1335420kr6;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;

/* JADX INFO: loaded from: classes31.dex */
public final class AVPersonalMojiStorage extends C13VI {
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
        return C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZ(C2235908pR.LIZ());
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        C13VD c13vd = new C13VD(null, null, 3);
        if (LJIIIIZZ().exists()) {
            C13VF c13vf = new C13VF();
            c13vf.LIZ(c13vd);
            c13vf.LIZIZ(LJIIIIZZ());
        }
        long j = c13vd.LIZJ + 0;
        if (z) {
            Keva.getRepo("personal_effect").clear();
            FileUtils.INSTANCE.removeDir(C2235908pR.LIZ());
        }
        return j;
    }
}

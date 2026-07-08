package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C0MZY;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VP;
import X.C13VU;
import X.C279530AxT;
import X.EnumC1335420kr6;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicStorageCleanService;
import java.io.File;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class AVMusicResStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZ(C0CHQ.LIZ().LJJJJL().getDownloadDir());
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        if (z) {
            ((IMusicStorageCleanService) ServiceManager.get().getService(IMusicStorageCleanService.class)).LIZJ(AFwS274S0000000_30.get$arr$(328));
            return 0L;
        }
        return 0L;
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
            C13VF c13vf2 = new C13VF();
            c13vf2.LIZ(c13vu);
            c13vf2.LIZIZ(LJIIIIZZ());
            c13vu.LIZIZ(null);
        }
        return j;
    }

    @Override // X.C13VI
    public final long LJIIJJI(boolean z) {
        C13VP.LIZ.getClass();
        if (C13VP.LIZ()) {
            return ((IMusicStorageCleanService) ServiceManager.get().getService(IMusicStorageCleanService.class)).LIZIZ(((Number) C279530AxT.LIZ.getValue()).longValue(), z);
        }
        LJIIIZ(z);
        return 0L;
    }
}

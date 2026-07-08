package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C13VI;
import X.EnumC1335420kr6;
import java.io.File;

/* JADX INFO: loaded from: classes31.dex */
public final class AVEndingWatermarkResStorage extends C13VI {
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
        return C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZ(C0CHQ.LIZ().LIZIZ().LIZIZ());
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        long jLJ = C0CHQ.LIZ().LIZIZ().LJ();
        if (z) {
            C0CHQ.LIZ().LIZIZ().LIZJ();
        }
        return jLJ;
    }
}

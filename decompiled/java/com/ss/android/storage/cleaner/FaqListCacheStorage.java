package com.ss.android.storage.cleaner;

import X.C0VSJ;
import X.C13VI;
import X.C2188811AlT;
import X.C2454209jY;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1335420kr6;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class FaqListCacheStorage extends C13VI {
    public final String LIZIZ;

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        C844470XAv.LIZ.getClass();
        return new C0VSJ(C786410Ut5.w2(C844470XAv.LIZ()).getAbsolutePath(), this.LIZIZ);
    }

    public FaqListCacheStorage() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CSP");
        sbLIZ.append(File.separator);
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LJIIJ);
        sbLIZ.append("_cache");
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        File[] fileArrListFiles;
        boolean z2 = true;
        if (!LJIIIIZZ().isDirectory()) {
            z2 = false;
        }
        long jLIZIZ = 0;
        if (!z2 || (fileArrListFiles = LJIIIIZZ().listFiles()) == null) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            jLIZIZ += C2454209jY.LIZIZ(file, arrayList, z);
        }
        return jLIZIZ;
    }
}

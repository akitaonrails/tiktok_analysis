package com.ss.android.storage.cleaner;

import X.C13VI;
import X.C2427709fH;
import X.C844470XAv;
import X.EnumC1335420kr6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class FilesVideoPreloadStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return null;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        long jLJII = C2427709fH.LJII(null);
        if (z) {
            try {
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ();
                return jLJII;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jLJII;
    }
}

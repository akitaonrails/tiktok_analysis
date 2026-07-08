package com.ss.android.storage.cleaner;

import X.C13VI;
import X.C19319410i8;
import X.C1EE1;
import X.C2188811AlT;
import X.EnumC1335420kr6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: loaded from: classes31.dex */
public final class OfflineModeStorage extends C13VI {
    public final C19319410i8 LIZIZ = new C19319410i8("OfflineModeStorage");

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
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        C1EE1 c1ee1 = C1EE1.LIZIZ;
        long jLJJI = c1ee1.LJJI();
        if (z) {
            try {
                c1ee1.LJJJJ();
                return jLJJI;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C19319410i8 c19319410i8 = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("settings page delete offline cache failed, ");
                sbLIZ.append(e);
                c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return jLJJI;
    }
}

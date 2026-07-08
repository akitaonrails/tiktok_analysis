package com.ss.android.storage.cleaner;

import X.C0VSJ;
import X.C13BV;
import X.C13VI;
import X.C2454209jY;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1335420kr6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxEnv;
import java.io.File;

/* JADX INFO: loaded from: classes31.dex */
public final class LynxQuickJSStorageCleaner extends C13VI {
    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        return 0L;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        C844470XAv.LIZ.getClass();
        return new C0VSJ(C786410Ut5.w2(C844470XAv.LIZ()).getPath(), "lynx_quickjs");
    }

    @Override // X.C13VI
    public final long LJIILIIL() {
        return C2454209jY.LIZIZ(LJIIIIZZ(), C13BV.INSTANCE, true);
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIJJI(boolean z) {
        return C2454209jY.LIZIZ(LJIIIIZZ(), C13BV.INSTANCE, z);
    }

    @Override // X.C13VI
    public final void LJIILJJIL(long j, boolean z) {
        if (z) {
            try {
                LynxEnv.inst().forceDisableQuickJsCache();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        super.LJIILJJIL(j, z);
    }
}

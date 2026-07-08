package com.bytedance.pumbaa.utility.dfid;

import X.C13LQ;
import X.C823280WRi;
import X.C838990Wvh;
import X.C839010Wvj;
import X.C839020Wvk;
import com.bytedance.bpea.transmit.IRegister;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public final class AutoDFIDManager {
    public static int LIZ = -1;
    public static boolean LIZIZ = true;

    public static final void LIZIZ() {
        if (LIZIZ) {
            try {
                C838990Wvh c838990Wvh = C838990Wvh.LIZ;
                int i = LIZ;
                c838990Wvh.getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C823280WRi.LIZLLL(th);
            }
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Register implements IRegister {
        @Override // com.bytedance.bpea.transmit.IRegister
        public final boolean enable() {
            return AutoDFIDManager.LIZIZ;
        }

        @Override // com.bytedance.bpea.transmit.IRegister
        public final void LIZ(int i) {
            AutoDFIDManager.LIZ = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Integer LIZ(int i) {
        int i2;
        C839010Wvj c839010WvjLIZIZ;
        if (!LIZIZ) {
            return null;
        }
        try {
            C838990Wvh c838990Wvh = C838990Wvh.LIZ;
            i2 = LIZ;
            c838990Wvh.getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C823280WRi.LIZLLL(th);
        }
        for (c839010WvjLIZIZ = C838990Wvh.LIZIZ(i2); c839010WvjLIZIZ != null; c839010WvjLIZIZ = c839010WvjLIZIZ.LIZIZ) {
            C839020Wvk[] c839020WvkArr = (C839020Wvk[]) c839010WvjLIZIZ.LIZ;
            if (c839020WvkArr != null) {
                for (C839020Wvk c839020Wvk : c839020WvkArr) {
                    if (C13LQ.LJIILJJIL(i, c839020Wvk.LIZIZ)) {
                        return Integer.valueOf(c839020Wvk.LIZ);
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public static final void LIZJ(C839020Wvk[] c839020WvkArr) {
        if (!LIZIZ) {
            return;
        }
        try {
            C838990Wvh c838990Wvh = C838990Wvh.LIZ;
            int i = LIZ;
            c838990Wvh.getClass();
            C838990Wvh.LIZLLL(i, c839020WvkArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C823280WRi.LIZLLL(th);
        }
    }
}

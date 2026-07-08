package com.tiktok.pns.compliance.foundation.init;

import X.C100C;
import X.C100G;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSFoundationInitManager {
    public final void install() {
        C100C c100c = C100C.LIZ;
        C100G c100g = new C100G(AFwS217S0000000_28.get$arr$(444), AFwS217S0000000_28.get$arr$(445), AFwS217S0000000_28.get$arr$(446), AFwS217S0000000_28.get$arr$(447), AFwS217S0000000_28.get$arr$(448), AFwS217S0000000_28.get$arr$(449));
        synchronized (c100c) {
            try {
                if (C100C.LIZIZ) {
                    return;
                }
                C100C.LIZJ = c100g;
                C100C.LIZIZ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

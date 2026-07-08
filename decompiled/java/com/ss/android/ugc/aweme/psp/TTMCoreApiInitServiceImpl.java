package com.ss.android.ugc.aweme.psp;

import X.C2188811AlT;
import X.C2213481BkA;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.ttm.ITTMCoreApiInitService;
import com.tiktok.ttm.TTMCore;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes35.dex */
public final class TTMCoreApiInitServiceImpl implements ITTMCoreApiInitService {
    @Override // com.tiktok.ttm.ITTMCoreApiInitService
    public final void initTTMCore() {
        TTMCore.Config config;
        C2213481BkA.LIZ.getClass();
        if (C2213481BkA.LIZIZ.compareAndSet(false, true) && (config = C2213481BkA.LJ) != null && config.globalEnable) {
            try {
                TTMCore.getInstance().initTTM(config);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                PrintStream printStream = System.err;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TTMachineCore  init error: ");
                sbLIZ.append(th);
                printStream.printf(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
            }
        }
    }
}

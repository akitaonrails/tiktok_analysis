package com.bytedance.ttnet.throttle;

import X.C1493430oxx;
import X.C1493630oyH;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;

/* JADX INFO: loaded from: classes24.dex */
public class TTNetThrottle {
    public static C1493630oyH getCronetHttpClient() {
        if (C1493430oxx.LIZ()) {
            return C1493630oyH.LIZLLL(TTNetInit.getTTNetDepend().getContext());
        }
        throw new UnsupportedOperationException("Cronet is not enabled");
    }

    public static void stop(String[] strArr, int i) {
        if (strArr == null || (i != 1 && i != 2 && i != 4 && i != 8)) {
            Logger.debug();
            return;
        }
        try {
            getCronetHttpClient().getClass();
            C1493630oyH.LIZIZ();
            C1493630oyH.LIZJ.stopThrottle(strArr, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void start(String[] strArr, int i, long j) {
        if (strArr != null && ((i == 1 || i == 2 || i == 4 || i == 8) && j >= 0)) {
            try {
                getCronetHttpClient().getClass();
                C1493630oyH.LIZIZ();
                C1493630oyH.LIZJ.startThrottle(strArr, i, j);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        Logger.debug();
    }
}

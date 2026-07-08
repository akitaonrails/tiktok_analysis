package com.samsung.sdk.sperf;

import X.C1C7U;
import X.C2179971ATj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes32.dex */
public class SPerfInitThread implements Runnable {
    public SPerfManager sPerfManager;

    public SPerfManager getSPerfManager() {
        return this.sPerfManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1C7U.LIZ("SPerfInitThread@3761.run");
        com_samsung_sdk_sperf_SPerfInitThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        C1C7U.LIZIZ("SPerfInitThread@3761.run");
    }

    public void com_samsung_sdk_sperf_SPerfInitThread__run$___twin___() {
        try {
            this.sPerfManager = SPerfManager.initSPerfManager();
        } catch (IllegalThreadStateException e) {
            TryCatchGuardChecker.doCheck(e);
            this.sPerfManager = null;
        }
    }

    public static void com_samsung_sdk_sperf_SPerfInitThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(SPerfInitThread sPerfInitThread) {
        try {
            sPerfInitThread.com_samsung_sdk_sperf_SPerfInitThread__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }
}

package com.ss.android.ugc.effectmanager.knadapt;

import X.C1C7U;
import X.C2179971ATj;
import X.InterfaceExecutorC740550T3d;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes13.dex */
public final class KNExecutorService implements InterfaceExecutorC740550T3d {
    public final ExecutorService iExecutor;

    public void shutdown() {
        this.iExecutor.shutdown();
    }

    public KNExecutorService(ExecutorService executorService) {
        this.iExecutor = executorService;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        this.iExecutor.execute(new Runnable() { // from class: com.ss.android.ugc.effectmanager.knadapt.KNExecutorService.execute.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("KNExecutorService@fa28.execute$1");
                com_ss_android_ugc_effectmanager_knadapt_KNExecutorService$execute$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("KNExecutorService@fa28.execute$1");
            }

            public final void com_ss_android_ugc_effectmanager_knadapt_KNExecutorService$execute$1__run$___twin___() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            public static void com_ss_android_ugc_effectmanager_knadapt_KNExecutorService$execute$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_android_ugc_effectmanager_knadapt_KNExecutorService$execute$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }
}

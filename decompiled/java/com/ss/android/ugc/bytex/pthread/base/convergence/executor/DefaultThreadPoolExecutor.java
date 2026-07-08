package com.ss.android.ugc.bytex.pthread.base.convergence.executor;

import X.C01GW;
import X.C0WP0;
import X.C13LE;
import X.C1BCA;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC2217461Bqa;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes14.dex */
public final class DefaultThreadPoolExecutor implements IExecutor {
    public static final /* synthetic */ InterfaceC2217461Bqa[] $$delegatedProperties;
    public final C01GW mExecutor$delegate = C452501pT.LIZIZ(new DefaultThreadPoolExecutor$mExecutor$2());

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C13LE.LIZ(DefaultThreadPoolExecutor.class), "mExecutor", "getMExecutor()Ljava/util/concurrent/ThreadPoolExecutor;");
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final ThreadPoolExecutor getMExecutor() {
        C01GW c01gw = this.mExecutor$delegate;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = $$delegatedProperties;
        return (ThreadPoolExecutor) c01gw.getValue();
    }

    public void com_ss_android_ugc_bytex_pthread_base_convergence_executor_DefaultThreadPoolExecutor__execute$___twin___(Runnable runnable) {
        getMExecutor().execute(runnable);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.executor.IExecutor
    public void execute(Runnable runnable) throws NoSuchMethodException {
        com_ss_android_ugc_bytex_pthread_base_convergence_executor_DefaultThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_DefaultThreadPoolExecutorLancet_execute(this, runnable);
    }

    public static void com_ss_android_ugc_bytex_pthread_base_convergence_executor_DefaultThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_DefaultThreadPoolExecutorLancet_execute(DefaultThreadPoolExecutor defaultThreadPoolExecutor, Runnable runnable) throws NoSuchMethodException {
        try {
            if (C0WP0.LIZ(runnable)) {
                C1BCA.LJJIIJZLJL(runnable);
            } else {
                defaultThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_convergence_executor_DefaultThreadPoolExecutor__execute$___twin___(runnable);
            }
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }
}

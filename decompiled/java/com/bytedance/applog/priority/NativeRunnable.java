package com.bytedance.applog.priority;

import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2209791BeD;
import X.InterfaceC2209561Bdq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class NativeRunnable implements Runnable {
    public static final List<String> loggerTags = Collections.singletonList("PriorityNativeRunnable");
    public final long nativeTaskPtr;

    public native void nativeRun(long j);

    @Override // java.lang.Runnable
    public void run() {
        C1C7U.LIZ("NativeRunnable@de5d.run");
        com_bytedance_applog_priority_NativeRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        C1C7U.LIZIZ("NativeRunnable@de5d.run");
    }

    public void com_bytedance_applog_priority_NativeRunnable__run$___twin___() {
        InterfaceC2209561Bdq interfaceC2209561BdqLJIJJ = C2209791BeD.LJIJJ();
        List<String> list = loggerTags;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("run with native ptr: ");
        sbLIZ.append(this.nativeTaskPtr);
        interfaceC2209561BdqLJIJJ.LIZLLL(list, C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
        nativeRun(this.nativeTaskPtr);
    }

    public NativeRunnable(long j) {
        this.nativeTaskPtr = j;
    }

    public static void com_bytedance_applog_priority_NativeRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NativeRunnable nativeRunnable) {
        try {
            nativeRunnable.com_bytedance_applog_priority_NativeRunnable__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }
}

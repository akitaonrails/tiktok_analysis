package com.bytedance.sysoptimizer;

import X.C08PL;
import X.C1C7U;
import X.C2112108Pf;
import X.C2179971ATj;
import X.C786410Ut5;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class JavaFrameInfoOpt {
    public static volatile boolean sInit;

    public static native int nStart(ExceptionInfo[] exceptionInfoArr, boolean z, boolean z2, boolean z3, int i);

    public static void mockCrash(boolean z) {
        if (z) {
            C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: com.bytedance.sysoptimizer.JavaFrameInfoOpt.1
                public void com_bytedance_sysoptimizer_JavaFrameInfoOpt$1__run$___twin___() {
                    try {
                        testGetMethodParams(true, (byte) 17, 'a', (short) 52, 4369, 286331153L, 0.11f, 0.11d, "aa", new Object());
                        testGetMethodParams(false, (byte) 34, 'b', (short) 67, 8738, 572662306L, 0.22f, 0.22d, "bb", new Object());
                        testGetMethodParams(true, (byte) 51, 'c', (short) 34, 13107, 858993459L, 0.33f, 0.33d, "cc", null);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("JavaFrameInfoOpt@66b6.mockCrash$1");
                    com_bytedance_sysoptimizer_JavaFrameInfoOpt$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("JavaFrameInfoOpt@66b6.mockCrash$1");
                }

                public static void com_bytedance_sysoptimizer_JavaFrameInfoOpt$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_bytedance_sysoptimizer_JavaFrameInfoOpt$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }

                private void testGetMethodParams(boolean z2, byte b, char c, short s, int i, long j, float f, double d, String str, Object obj) {
                    obj.hashCode();
                }
            });
        }
    }

    public static class ExceptionInfo {
        public String msg;
        public String type;

        public ExceptionInfo(String str, String str2) {
            this.type = str;
            this.msg = str2;
        }
    }

    public static int start(Context context, ExceptionInfo[] exceptionInfoArr, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if (!Process.is64Bit()) {
            System.out.println("JavaFrameInfoOpt only support 64 bits");
            return 0;
        }
        if (sInit) {
            return 1;
        }
        if (SysOptimizer.loadOptimizerLibrary(context) && !sInit) {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            int iNStart = nStart(exceptionInfoArr, z, z2, z3, i);
            sInit = true;
            mockCrash(z4);
            return iNStart;
        }
        return -1;
    }
}

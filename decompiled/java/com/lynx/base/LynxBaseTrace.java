package com.lynx.base;

import X.C1285920jZG;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.service.ILynxTraceService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class LynxBaseTrace {
    public static final AtomicBoolean sHasInit = new AtomicBoolean(false);
    public static volatile boolean sIsNativeLibLoad;

    public static native void nativeInitBaseTrace(long j);

    public static void init() {
        if (sHasInit.compareAndSet(false, true)) {
            new BPEAThread(new Runnable() { // from class: com.lynx.base.LynxBaseTrace.1
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("LynxBaseTrace@6dbd.init$1");
                    com_lynx_base_LynxBaseTrace$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("LynxBaseTrace@6dbd.init$1");
                }

                public void com_lynx_base_LynxBaseTrace$1__run$___twin___() {
                    try {
                        if (!LynxBaseTrace.sIsNativeLibLoad) {
                            LynxBaseTrace.sIsNativeLibLoad = LynxBaseEnv.inst().isNativeLibraryLoaded();
                        }
                        if (LynxBaseTrace.sIsNativeLibLoad) {
                            LynxBaseTrace.initNativeBaseTrace();
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("init LynxBaseTrace exception [ ");
                        sbLIZ.append(e.getMessage());
                        sbLIZ.append(" ]");
                        LynxLog.e("lynx", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }

                public static void com_lynx_base_LynxBaseTrace$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_lynx_base_LynxBaseTrace$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            }, "LynxTraceInit").start();
        }
    }

    public static boolean initNativeBaseTrace() {
        ILynxTraceService iLynxTraceService = (ILynxTraceService) C1285920jZG.LIZJ().LIZ(ILynxTraceService.class);
        if (iLynxTraceService == null) {
            nativeInitBaseTrace(0L);
            LynxLog.i("LynxBaseTrace", "LynxBaseTrace init successfully by itself.");
            return true;
        }
        long defaultTraceFunction = iLynxTraceService.getDefaultTraceFunction();
        if (defaultTraceFunction == 0) {
            LynxLog.i("LynxBaseTrace", "failed to init LynxBaseTrace dependency");
            return false;
        }
        nativeInitBaseTrace(defaultTraceFunction);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxBaseTrace init successfully by custom LynxBaseTraceService. function native address is ");
        sbLIZ.append(defaultTraceFunction);
        LynxLog.i("LynxBaseTrace", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }
}

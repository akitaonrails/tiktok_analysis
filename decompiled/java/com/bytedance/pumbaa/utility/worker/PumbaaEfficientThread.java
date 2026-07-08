package com.bytedance.pumbaa.utility.worker;

import X.C0WQ3;
import X.C0WQ4;
import X.C0WQ5;
import X.C1C7U;
import X.ExecutorC822880WPu;
import android.os.Handler;
import android.os.Message;
import ci3.a;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public final class PumbaaEfficientThread extends a {
    public static PumbaaEfficientThread LL;
    public static Handler LLILLJJLI;
    public static ExecutorC822880WPu LLILLL;
    public static final Object LLILZ = new Object();
    public static int LLILZIL = 0;

    public PumbaaEfficientThread() {
        super("pumbaa.efficient", 0);
    }

    public static void LIZIZ() {
        PumbaaEfficientThread pumbaaEfficientThread = LL;
        if (pumbaaEfficientThread == null || !pumbaaEfficientThread.isAlive()) {
            synchronized (LLILZ) {
                try {
                    if (LLILZIL >= 3) {
                        return;
                    }
                    PumbaaEfficientThread pumbaaEfficientThread2 = LL;
                    if (pumbaaEfficientThread2 == null || !pumbaaEfficientThread2.isAlive()) {
                        PumbaaEfficientThread pumbaaEfficientThread3 = new PumbaaEfficientThread();
                        LL = pumbaaEfficientThread3;
                        C0WQ3 c0wq3 = C0WQ4.LIZ;
                        pumbaaEfficientThread3.setUncaughtExceptionHandler(C0WQ4.LIZ);
                        LL.start();
                        BPEAHandler bPEAHandler = new BPEAHandler(LL.getLooper()) { // from class: com.bytedance.pumbaa.utility.worker.PumbaaEfficientThread.1
                            @Override // android.os.Handler
                            public final void handleMessage(Message message) {
                                C1C7U.LIZ("PumbaaEfficientThread@eab5.ensureThreadLocked$1");
                                if (message.what == -529657540 && (HandlerHook.getMessageObj(message.obj) instanceof C0WQ5)) {
                                    HandlerHook.getMessageObj(message.obj).getClass();
                                } else if (message.what == 354084380 && (HandlerHook.getMessageObj(message.obj) instanceof C0WQ5)) {
                                    HandlerHook.getMessageObj(message.obj).getClass();
                                } else {
                                    super.handleMessage(message);
                                }
                                C1C7U.LIZIZ("PumbaaEfficientThread@eab5.ensureThreadLocked$1");
                            }
                        };
                        LLILLJJLI = bPEAHandler;
                        LLILLL = new ExecutorC822880WPu(bPEAHandler);
                        LLILZIL++;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static Handler getHandler() {
        Handler handler;
        synchronized (PumbaaEfficientThread.class) {
            try {
                LIZIZ();
                handler = LLILLJJLI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return handler;
    }
}

package com.bytedance.pumbaa.utility.worker;

import X.C0W8P;
import X.C0WQ3;
import X.C0WQ4;
import X.C1C7U;
import X.C823280WRi;
import X.ExecutorC822880WPu;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import ci3.a;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public final class PumbaaWorkerThread extends a {
    public static PumbaaWorkerThread LL;
    public static Handler LLILLJJLI;
    public static ExecutorC822880WPu LLILLL;
    public static final Object LLILZ = new Object();
    public static int LLILZIL = 0;

    public PumbaaWorkerThread() {
        super("pumbaa.worker", 0);
    }

    public static void LIZIZ() {
        PumbaaWorkerThread pumbaaWorkerThread = LL;
        if (pumbaaWorkerThread == null || !pumbaaWorkerThread.isAlive()) {
            synchronized (LLILZ) {
                try {
                    if (LLILZIL >= 3) {
                        return;
                    }
                    PumbaaWorkerThread pumbaaWorkerThread2 = LL;
                    if (pumbaaWorkerThread2 == null || !pumbaaWorkerThread2.isAlive()) {
                        PumbaaWorkerThread pumbaaWorkerThread3 = new PumbaaWorkerThread();
                        LL = pumbaaWorkerThread3;
                        C0WQ3 c0wq3 = C0WQ4.LIZ;
                        pumbaaWorkerThread3.setUncaughtExceptionHandler(C0WQ4.LIZ);
                        LL.start();
                        BPEAHandler bPEAHandler = new BPEAHandler(LL.getLooper()) { // from class: com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread.1
                            @Override // android.os.Handler
                            public final void handleMessage(Message message) {
                                C1C7U.LIZ("PumbaaWorkerThread@ce9f.ensureThreadLocked$1");
                                if (message.what == -529657540 && (HandlerHook.getMessageObj(message.obj) instanceof C0W8P)) {
                                    C0W8P c0w8p = (C0W8P) HandlerHook.getMessageObj(message.obj);
                                    Runnable runnable = c0w8p.LIZ;
                                    if (runnable != null) {
                                        try {
                                            runnable.run();
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            C823280WRi.LIZLLL(e);
                                        }
                                        Message messageObtainMessage = obtainMessage(-529657540);
                                        messageObtainMessage.obj = c0w8p;
                                        sendMessageAtTime(messageObtainMessage, SystemClock.uptimeMillis() + c0w8p.LIZIZ);
                                    }
                                } else if (message.what == 354084380 && (HandlerHook.getMessageObj(message.obj) instanceof C0W8P)) {
                                    C0W8P c0w8p2 = (C0W8P) HandlerHook.getMessageObj(message.obj);
                                    Runnable runnable2 = c0w8p2.LIZ;
                                    if (runnable2 != null) {
                                        try {
                                            runnable2.run();
                                        } catch (Exception e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                            C823280WRi.LIZLLL(e2);
                                        }
                                        c0w8p2.LIZ = null;
                                        c0w8p2.LIZIZ = -1L;
                                    }
                                } else {
                                    super.handleMessage(message);
                                }
                                C1C7U.LIZIZ("PumbaaWorkerThread@ce9f.ensureThreadLocked$1");
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
        synchronized (PumbaaWorkerThread.class) {
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

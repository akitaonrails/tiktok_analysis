package com.ss.android.ugc.aweme.sp;

import X.C08AN;
import X.C1C7U;
import X.C786410Ut5;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class QueuedWork {
    public static final Object LIZ = new Object();
    public static final Object LIZIZ = new Object();
    public static final LinkedList<Runnable> LIZJ = new LinkedList<>();
    public static Handler LIZLLL = null;
    public static final LinkedList<Runnable> LJ = new LinkedList<>();
    public static final boolean LJFF = true;

    static {
        new Object() { // from class: X.08AI
            {
                try {
                    C08IF.LIZIZ(16, 1, 31, "numBuckets");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }

    public static Handler LIZ() {
        Handler handler;
        synchronized (LIZ) {
            try {
                if (LIZLLL == null) {
                    HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                    handlerThread.start();
                    LIZLLL = new QueuedWorkHandler(C786410Ut5.W2(handlerThread));
                }
                handler = LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return handler;
    }

    public static boolean LIZIZ() {
        boolean z;
        synchronized (LIZ) {
            try {
                z = !LJ.isEmpty();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public static class QueuedWorkHandler extends BPEAHandler {
        public QueuedWorkHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            LinkedList linkedList;
            C1C7U.LIZ("QueuedWork$QueuedWorkHandler@f5de.handleMessage");
            if (message.what == 1) {
                synchronized (QueuedWork.LIZIZ) {
                    try {
                        synchronized (QueuedWork.LIZ) {
                            try {
                                LinkedList<Runnable> linkedList2 = QueuedWork.LJ;
                                linkedList = (LinkedList) linkedList2.clone();
                                linkedList2.clear();
                                QueuedWork.LIZ().removeMessages(1);
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        if (linkedList.size() > 0) {
                            Iterator it2 = linkedList.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C1C7U.LIZIZ("QueuedWork$QueuedWorkHandler@f5de.handleMessage");
        }
    }

    public static void LIZJ(C08AN c08an, boolean z) {
        Handler handlerLIZ = LIZ();
        synchronized (LIZ) {
            try {
                LJ.add(c08an);
                if (z && LJFF) {
                    C786410Ut5.LJLJJI(1, 100L, handlerLIZ);
                } else {
                    C786410Ut5.LJLILLLLZI(handlerLIZ, 1);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

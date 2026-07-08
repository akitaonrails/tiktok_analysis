package com.lynx.animax.base;

import X.C1C7U;
import X.C786410Ut5;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.base.CleanupReference;
import com.lynx.animax.util.AnimaXLog;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes21.dex */
public final class CleanupReference extends PhantomReference<Object> {
    public static final ReferenceQueue<Object> LIZJ = new ReferenceQueue<>();
    public static final Object LIZLLL = new Object();
    public static final Set<CleanupReference> LJ;
    public static final Set<CleanupReference> LJFF;
    public static final ConcurrentLinkedQueue LJI;
    public final boolean LIZ;
    public Runnable LIZIZ;

    public static class LazyHolder {
        public static final AnonymousClass1 LIZ = new BPEAHandler(Looper.getMainLooper()) { // from class: com.lynx.animax.base.CleanupReference.LazyHolder.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("CleanupReference$LazyHolder@8774.<field>$1");
                CleanupReference cleanupReference = (CleanupReference) HandlerHook.getMessageObj(message.obj);
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        AnimaXLog.LIZ("CleanupReference", C786410Ut5.j4("Bad message=%d", new Object[]{Integer.valueOf(i)}));
                    } else {
                        cleanupReference.LIZIZ(CleanupReference.LJ);
                    }
                } else {
                    ((HashSet) CleanupReference.LJ).add(cleanupReference);
                }
                synchronized (CleanupReference.LIZLLL) {
                    while (true) {
                        try {
                            CleanupReference cleanupReference2 = (CleanupReference) CleanupReference.LIZJ.poll();
                            if (cleanupReference2 != null) {
                                if (!cleanupReference2.LIZ) {
                                    CleanupReference.LJI.offer(cleanupReference2);
                                } else {
                                    cleanupReference2.LIZIZ(CleanupReference.LJ);
                                }
                            } else {
                                CleanupReference.LIZLLL.notifyAll();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                C1C7U.LIZIZ("CleanupReference$LazyHolder@8774.<field>$1");
            }
        };
    }

    static {
        BPEAThread bPEAThread = new BPEAThread() { // from class: X.0jf8
            public static void LIZJ() {
                while (true) {
                    try {
                        CleanupReference cleanupReference = (CleanupReference) CleanupReference.LIZJ.remove();
                        Object obj = CleanupReference.LIZLLL;
                        synchronized (obj) {
                            try {
                                if (cleanupReference.LIZ) {
                                    Message.obtain(CleanupReference.LazyHolder.LIZ, 2, cleanupReference).sendToTarget();
                                    obj.wait(500L);
                                } else {
                                    CleanupReference.LJI.offer(cleanupReference);
                                }
                                while (true) {
                                    CleanupReference cleanupReference2 = (CleanupReference) CleanupReference.LJI.poll();
                                    if (cleanupReference2 == null) {
                                        break;
                                    } else {
                                        cleanupReference2.LIZIZ(CleanupReference.LJFF);
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Queue remove exception:");
                        sbLIZ.append(e.toString());
                        AnimaXLog.LIZ("CleanupReference", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }

            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("CleanupReference@c21.<field>$1");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    LIZJ();
                    throw null;
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("CleanupReference@c21.<field>$1");
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        throw th2;
                    }
                }
            }
        };
        bPEAThread.setDaemon(true);
        bPEAThread.start();
        LJ = new HashSet();
        LJFF = ConcurrentHashMap.newKeySet();
        LJI = new ConcurrentLinkedQueue();
    }

    public final void LIZ(int i) {
        Message messageObtain = Message.obtain(LazyHolder.LIZ, i, this);
        if (Looper.myLooper() == messageObtain.getTarget().getLooper()) {
            messageObtain.getTarget().handleMessage(messageObtain);
            messageObtain.recycle();
        } else {
            messageObtain.sendToTarget();
        }
    }

    public final void LIZIZ(Set<CleanupReference> set) {
        if (!set.remove(this)) {
            return;
        }
        Runnable runnable = this.LIZIZ;
        this.LIZIZ = null;
        if (runnable != null) {
            runnable.run();
        }
        clear();
    }

    public CleanupReference(Object obj, Runnable runnable) {
        super(obj, LIZJ);
        this.LIZIZ = runnable;
        this.LIZ = true;
        LIZ(1);
    }
}

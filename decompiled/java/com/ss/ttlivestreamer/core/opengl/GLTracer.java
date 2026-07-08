package com.ss.ttlivestreamer.core.opengl;

import X.C1267520j5a;
import X.C1273860jFo;
import X.C1274080jGA;
import X.C2188811AlT;
import X.C786410Ut5;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class GLTracer {
    public static boolean sEnableGlTracer;
    public static volatile GLTracer sGlTracer;
    public List<C1273860jFo> threads = new ArrayList();

    public static void checkAndDump() {
        checkAndDump(12);
    }

    public static GLTracer getWithLock() {
        if (sGlTracer == null) {
            sGlTracer = new GLTracer();
        }
        return sGlTracer;
    }

    public static void abort() {
        dump();
        C1274080jGA.LIZ.LIZ("GLTracer.abort", new AndroidRuntimeException("GLTracer abort."));
    }

    public static void dump() {
        if (C1267520j5a.LIZ() || sEnableGlTracer) {
            synchronized (GLTracer.class) {
                try {
                    Iterator<C1273860jFo> it2 = getWithLock().threads.iterator();
                    while (it2.hasNext()) {
                        AVLog.ioe("GLTracer", it2.next().toString());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void removeTraceStack() {
        if (C1267520j5a.LIZ() || sEnableGlTracer) {
            synchronized (GLTracer.class) {
                try {
                    synchronized (GLTracer.class) {
                        try {
                            Iterator<C1273860jFo> it2 = getWithLock().threads.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C1273860jFo next = it2.next();
                                if (next.LIZ == C786410Ut5.u3()) {
                                    getWithLock().threads.remove(next);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("RemoveTrackStack remain ");
                                    sbLIZ.append(getWithLock().threads.size());
                                    AVLog.iow("GLTracer", C2188811AlT.LIZIZ(sbLIZ));
                                    break;
                                }
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static int size() {
        int size;
        if (!C1267520j5a.LIZ() && !sEnableGlTracer) {
            return 0;
        }
        synchronized (GLTracer.class) {
            try {
                size = getWithLock().threads.size();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return size;
    }

    public static void traceStack() {
        traceStack(C786410Ut5.u3());
    }

    public static void checkAndDump(int i) {
        if ((C1267520j5a.LIZ() || sEnableGlTracer) && size() > i) {
            dump();
        }
    }

    public static void setEnableGlTracer(boolean z) {
        sEnableGlTracer = z;
    }

    public static void traceStack(Thread thread) {
        if (C1267520j5a.LIZ() || sEnableGlTracer) {
            synchronized (GLTracer.class) {
                try {
                    getWithLock().threads.add(new C1273860jFo(thread, ThreadMethodProxy.getStackTrace(C786410Ut5.u3())));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AddTrackStack with threadName[");
                    sbLIZ.append(thread.getName());
                    sbLIZ.append("] current size ");
                    sbLIZ.append(getWithLock().threads.size());
                    AVLog.iow("GLTracer", C2188811AlT.LIZIZ(sbLIZ));
                    int size = size();
                    if (size > 12) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Too more GL thread with ");
                        sbLIZ2.append(size);
                        sbLIZ2.append(" VS ");
                        sbLIZ2.append(12);
                        AVLog.ioe("GLTracer", C2188811AlT.LIZIZ(sbLIZ2));
                        abort();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}

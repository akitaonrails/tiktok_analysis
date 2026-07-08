package com.bytedance.monitor.collector;

import X.C0V3W;
import X.C786410Ut5;
import android.util.Log;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class BinderMonitor extends c {
    public static final List<C0V3W> LJ = new ArrayList(200);
    public static final Object LJFF = new Object();
    public static volatile int LJI = 0;

    @Override // com.bytedance.monitor.collector.c
    public final void LJ(int i) {
    }

    public static String getStacktrace() {
        return Log.getStackTraceString(new Exception());
    }

    @Override // com.bytedance.monitor.collector.c
    public final Pair<String, String> LIZ() {
        try {
            return new Pair<>(this.LIZ, LJ.toString());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public BinderMonitor(int i) {
        super(i, "binder_monitor");
    }

    @Override // com.bytedance.monitor.collector.c
    public final Pair<String, String> LIZIZ(long j, long j2) {
        C0V3W c0v3w;
        try {
            String str = this.LIZ;
            ArrayList arrayList = new ArrayList();
            synchronized (LJFF) {
                try {
                    int i = 0;
                    if (((ArrayList) LJ).size() < 200) {
                        while (true) {
                            List<C0V3W> list = LJ;
                            if (i >= ((ArrayList) list).size()) {
                                break;
                            }
                            arrayList.add(((ArrayList) list).get(i));
                            i++;
                        }
                    } else {
                        while (i < 200) {
                            arrayList.add(((ArrayList) LJ).get(((LJI + i) + 1) % 200));
                            i++;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            do {
                size--;
                if (size < 0) {
                    break;
                }
                c0v3w = (C0V3W) ListProtector.get(arrayList, size);
                if (c0v3w.LIZ < j2 || c0v3w.LIZIZ > j) {
                    arrayList2.add(c0v3w);
                }
            } while (c0v3w.LIZIZ >= j);
            return new Pair<>(str, arrayList2.toString());
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return null;
        }
    }

    public static void saveBinderInfo(long j, long j2, long j3) {
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
        synchronized (LJFF) {
            try {
                if (LJI >= 200) {
                    LJI -= 200;
                }
                List<C0V3W> list = LJ;
                if (((ArrayList) list).size() >= 200) {
                    C0V3W c0v3w = (C0V3W) ((ArrayList) list).get(LJI);
                    c0v3w.LIZ = j;
                    c0v3w.LIZIZ = j2;
                    c0v3w.LIZJ = j3;
                    c0v3w.LIZLLL = stackTrace;
                } else {
                    C0V3W c0v3w2 = new C0V3W();
                    c0v3w2.LIZ = j;
                    c0v3w2.LIZIZ = j2;
                    c0v3w2.LIZJ = j3;
                    c0v3w2.LIZLLL = stackTrace;
                    ((ArrayList) list).add(c0v3w2);
                }
                LJI++;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

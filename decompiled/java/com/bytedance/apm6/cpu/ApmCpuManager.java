package com.bytedance.apm6.cpu;

import X.AbstractRunnableC792500V6y;
import X.C08GN;
import X.C08OX;
import X.C0V47;
import X.C0V6H;
import X.C0V6I;
import X.C0V7T;
import X.C0V9K;
import X.C0V9O;
import X.C0V9U;
import X.C0V9V;
import X.C0V9X;
import X.C0V9Y;
import X.C2257208ss;
import X.C791560V3i;
import X.C792400V6o;
import X.C792490V6x;
import X.EnumC792970V8t;
import X.InterfaceC793040V9a;
import X.InterfaceC793050V9b;
import X.InterfaceC793060V9c;
import aa3.a;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import duo.b;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes14.dex */
public class ApmCpuManager {
    public static C0V9V sVersion = C0V9V.V2;
    public static volatile ApmCpuManager singleton;
    public CopyOnWriteArraySet<String> mSceneSet = new CopyOnWriteArraySet<>();

    public static ApmCpuManager getInstance() {
        if (singleton == null) {
            synchronized (ApmCpuManager.class) {
                try {
                    if (singleton == null) {
                        singleton = new ApmCpuManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return singleton;
    }

    public static boolean isPowerOpt() {
        return sVersion != C0V9V.V1;
    }

    public double getCpuRate() {
        return C0V6H.LIZ.LIZ;
    }

    public String getCpuSceneString() {
        String strLIZ = C08GN.LIZ(this.mSceneSet.toArray());
        return !TextUtils.isEmpty(strLIZ) ? strLIZ : "";
    }

    public double getCpuSpeed() {
        return C0V6H.LIZ.LIZIZ;
    }

    public a getCurrentCpuRateNew() throws Throwable {
        a aVar = new a();
        try {
            if (C08OX.LIZJ() <= 0) {
                return aVar;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C791560V3i.LIZLLL().getClass();
            long jLIZIZ = C08OX.LIZIZ();
            C791560V3i.LIZLLL().getClass();
            long jLIZJ = C791560V3i.LIZJ();
            try {
                Thread.sleep(360L);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C791560V3i.LIZLLL().getClass();
            long jLIZIZ2 = C08OX.LIZIZ();
            C791560V3i.LIZLLL().getClass();
            double d = C791560V3i.LIZJ() - jLIZJ > 0 ? (jLIZIZ2 - jLIZIZ) / r4 : -1.0d;
            aVar.LIZ = d;
            aVar.LIZIZ = (((jLIZIZ2 - jLIZIZ) * 1000.0d) / (System.currentTimeMillis() - jCurrentTimeMillis)) / C08OX.LJFF();
            return aVar;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return aVar;
        }
    }

    public Pair<Long, LinkedList<C0V47>> getExceptionThreadList() {
        C0V6I c0v6i = C0V6H.LIZ;
        return ((AbstractCollection) c0v6i.LIZLLL.second).isEmpty() ? c0v6i.LIZLLL : new Pair<>(c0v6i.LIZLLL.first, new LinkedList((Collection) c0v6i.LIZLLL.second));
    }

    public long getLastCpuExceptionTimestamp() {
        return C0V9Y.LIZ.LJ;
    }

    public Pair<Long, LinkedList<C0V47>> getThreadList() {
        C0V6I c0v6i = C0V6H.LIZ;
        return ((AbstractCollection) c0v6i.LIZJ.second).isEmpty() ? c0v6i.LIZJ : new Pair<>(c0v6i.LIZJ.first, new LinkedList((Collection) c0v6i.LIZJ.second));
    }

    public void startExceptionDetectNoStack() {
        C0V9K c0v9k;
        if (C792400V6o.LJJ) {
            C0V9O c0v9o = C0V9Y.LIZ;
            synchronized (c0v9o) {
                if (c0v9o.LIZ || (c0v9k = c0v9o.LIZJ) == null) {
                    return;
                }
                c0v9o.LIZ = true;
                c0v9o.LIZLLL = false;
                c0v9o.LIZIZ.LJFF(c0v9k);
            }
        }
    }

    public void stopExceptionDetectNoStack() {
        if (C792400V6o.LJJ) {
            C0V9O c0v9o = C0V9Y.LIZ;
            synchronized (c0v9o) {
                if (!c0v9o.LIZ || c0v9o.LIZLLL) {
                    return;
                }
                c0v9o.LIZ = false;
                c0v9o.LIZIZ.LJI();
            }
        }
    }

    public void tmpStartExceptionDetect() {
        C0V9O c0v9o = C0V9Y.LIZ;
        synchronized (c0v9o) {
            c0v9o.LJFF = true;
        }
    }

    public a getCurrentCpuRate() {
        return getCurrentCpuRateNew();
    }

    public CopyOnWriteArraySet<String> getCpuSceneSet() {
        return this.mSceneSet;
    }

    public static void setVersion(C0V9V c0v9v) {
        sVersion = c0v9v;
    }

    public void setCpuDataListener(InterfaceC793040V9a interfaceC793040V9a) {
        C0V7T.LIZ.getClass();
    }

    public void setCpuExceptionFilter(InterfaceC793050V9b interfaceC793050V9b) {
        C0V9Y.LIZ.getClass();
    }

    public void setExceptionListener(InterfaceC793060V9c interfaceC793060V9c) {
        C0V9Y.LIZ.getClass();
    }

    public void startScene(String str) {
        this.mSceneSet.add(str);
        C2257208ss.LIZ().LIZ.add(str);
    }

    public void startUsageDetect(String str) {
        synchronized (C0V9U.class) {
            C0V9X c0v9x = new C0V9X();
            c0v9x.LIZ = System.currentTimeMillis();
            C791560V3i.LIZLLL().getClass();
            c0v9x.LIZIZ = C08OX.LIZIZ();
            C791560V3i c791560V3iLIZLLL = C791560V3i.LIZLLL();
            C08OX.LIZJ();
            c791560V3iLIZLLL.getClass();
            c0v9x.LIZJ = C791560V3i.LIZJ();
            ((HashMap) C0V9U.LIZ).put(str, c0v9x);
        }
    }

    public void stopScene(String str) {
        this.mSceneSet.remove(str);
        C2257208ss.LIZ().LIZ.remove(str);
    }

    public void stopUsageDetect(final String str, final boolean z) {
        final double d;
        synchronized (C0V9U.class) {
            Map<String, C0V9X> map = C0V9U.LIZ;
            C0V9X c0v9x = (C0V9X) ((HashMap) map).get(str);
            if (c0v9x == null) {
                return;
            }
            if (c0v9x.LIZIZ < 0 && c0v9x.LIZJ < 0) {
                return;
            }
            C791560V3i.LIZLLL().getClass();
            long jLIZIZ = C08OX.LIZIZ();
            C791560V3i c791560V3iLIZLLL = C791560V3i.LIZLLL();
            C08OX.LIZJ();
            c791560V3iLIZLLL.getClass();
            long jLIZJ = C791560V3i.LIZJ() - c0v9x.LIZJ;
            if (jLIZJ > 0) {
                d = (jLIZIZ - c0v9x.LIZIZ) / jLIZJ;
            } else {
                d = -1.0d;
            }
            final double dCurrentTimeMillis = (((jLIZIZ - c0v9x.LIZIZ) * 1000.0d) / (System.currentTimeMillis() - c0v9x.LIZ)) / C08OX.LJFF();
            ((HashMap) map).remove(str);
            C792490V6x.LIZ(EnumC792970V8t.CPU).LIZJ(new AbstractRunnableC792500V6y() { // from class: X.0V9J
                public final void LIZ() {
                    C0V9L c0v9l = new C0V9L(!z ? C0V9S.FRONT : C0V9S.BACK, str, d, 0.0d, dCurrentTimeMillis, 0.0d, null);
                    c0v9l.LJIIIZ = b.LIZJ(C792400V6o.LIZ);
                    c0v9l.LJIIJ = false;
                    if (C0V9U.LIZJ) {
                        C0VBB.LIZ(c0v9l);
                    } else {
                        ((LinkedList) C0V9U.LIZIZ).add(c0v9l);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("InitiativeCpuCollectManager@2254.sendData$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("InitiativeCpuCollectManager@2254.sendData$1");
                }
            });
        }
    }
}

package com.ss.android.ugc.aweme.lancet;

import X.AbstractC1387200mCc;
import X.C08Q0;
import X.C08TH;
import X.C08TI;
import X.C08TJ;
import X.C08TN;
import X.C1150504el;
import X.C1906580ziK;
import X.C1BWL;
import X.C1C7U;
import X.C202098145w;
import X.C202099145x;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.ARunnableS83S0000000_3;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class LoadSoLancet {
    public static final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();
    public static final Set<String> LIZIZ = Collections.synchronizedSet(new HashSet());
    public static final Set<String> LIZJ = Collections.synchronizedSet(new HashSet());
    public static final CopyOnWriteArrayList<String> LIZLLL = new CopyOnWriteArrayList<>();
    public static final List<String> LJ;
    public static final HandlerThread LJFF;
    public static volatile Handler LJI;
    public static final AtomicBoolean LJII;
    public static final AtomicBoolean LJIIIIZZ;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        LJ = copyOnWriteArrayList;
        LJII = new AtomicBoolean(false);
        LJIIIIZZ = new AtomicBoolean(false);
        Collections.addAll(copyOnWriteArrayList, "c++_shared", "vcbasekit", "ttcrypto", "ttboringssl", "sscronet", "vcn", "vcnverify", "ByteVC1_dec");
        HandlerThread handlerThread = new HandlerThread("idlePreloadSoThread");
        LJFF = handlerThread;
        handlerThread.start();
        if (C08TJ.LIZ) {
            return;
        }
        LJI = LIZ();
    }

    public static Handler LIZ() {
        return new BPEAHandler(C786410Ut5.W2(LJFF)) { // from class: com.ss.android.ugc.aweme.lancet.LoadSoLancet.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("LoadSoLancet@e671.createIdleHandler$1");
                super.handleMessage(message);
                if (C08Q0.LIZIZ(C1BWL.LIZ(), 0, "key_idle_loadso") <= 0) {
                    C1C7U.LIZIZ("LoadSoLancet@e671.createIdleHandler$1");
                    return;
                }
                if (LoadSoLancet.LJIIIIZZ.get()) {
                    C1C7U.LIZIZ("LoadSoLancet@e671.createIdleHandler$1");
                    return;
                }
                if (!LoadSoLancet.LIZLLL.isEmpty()) {
                    C1C7U.LIZIZ("LoadSoLancet@e671.createIdleHandler$1");
                    return;
                }
                CopyOnWriteArrayList<String> copyOnWriteArrayList = (CopyOnWriteArrayList) LoadSoLancet.LJ;
                if (copyOnWriteArrayList.isEmpty()) {
                    C1C7U.LIZIZ("LoadSoLancet@e671.createIdleHandler$1");
                    return;
                }
                for (String str : copyOnWriteArrayList) {
                    if (LoadSoLancet.LJIIIIZZ.get()) {
                        C1C7U.LIZIZ("LoadSoLancet@e671.createIdleHandler$1");
                        return;
                    }
                    if (!LoadSoLancet.LJII.get()) {
                        C1C7U.LIZIZ("LoadSoLancet@e671.createIdleHandler$1");
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    Librarian.LJFF(str);
                    CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) LoadSoLancet.LJ;
                    if (copyOnWriteArrayList2.contains(str)) {
                        copyOnWriteArrayList2.remove(str);
                    }
                    LoadSoLancet.LJ(jUptimeMillis, str);
                }
                C1C7U.LIZIZ("LoadSoLancet@e671.createIdleHandler$1");
            }
        };
    }

    public static void LIZIZ(String str) {
        if (C08Q0.LIZIZ(C1BWL.LIZ(), 0, "key_idle_loadso") <= 0) {
            return;
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = LIZLLL;
        copyOnWriteArrayList.remove(str);
        AtomicBoolean atomicBoolean = LJIIIIZZ;
        if (atomicBoolean.get()) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) LJ;
        if (copyOnWriteArrayList2.isEmpty()) {
            atomicBoolean.set(true);
            HandlerThread handlerThread = LJFF;
            if (handlerThread != null) {
                if (LJI != null) {
                    LJI.removeMessages(0);
                    LJI.removeCallbacks(new ARunnableS83S0000000_3(12));
                }
                handlerThread.quitSafely();
                return;
            }
            return;
        }
        if (copyOnWriteArrayList2.contains(str)) {
            copyOnWriteArrayList2.remove(str);
        }
        if (copyOnWriteArrayList.isEmpty()) {
            if (LJI == null) {
                synchronized (LoadSoLancet.class) {
                    try {
                        if (LJI == null) {
                            LJI = LIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C786410Ut5.LJLJJI(0, 2L, LJI);
            LJII.set(true);
        }
    }

    public static void LIZJ(String str) {
        if (C08Q0.LIZIZ(C1BWL.LIZ(), 0, "key_idle_loadso") <= 0 || LIZJ.contains(str)) {
            return;
        }
        LJII.set(false);
        LIZLLL.add(str);
    }

    public static void LIZLLL(long j, String str) {
        int iLIZIZ;
        String name;
        Object obj;
        if (C08Q0.LIZIZ(C1BWL.LIZ(), 0, "resaltas_collect_load_so_event") <= 0) {
            return;
        }
        try {
            C08TH.LIZ.getClass();
            C08TH c08th = C08TI.LIZIZ;
            if (c08th == null || (iLIZIZ = C08Q0.LIZIZ(C1BWL.LIZ(), 50, "resaltas_collect_load_so_event_sample_rate")) <= 0) {
                return;
            }
            if (iLIZIZ < 100 && ThreadLocalRandom.current().nextInt(100) >= iLIZIZ) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            ConcurrentHashMap<String, Long> concurrentHashMap = LIZ;
            Long l = concurrentHashMap.get(str);
            if (l != null && jUptimeMillis - l.longValue() < 1000) {
                return;
            }
            concurrentHashMap.put(str, Long.valueOf(jUptimeMillis));
            long jUptimeMillis2 = SystemClock.uptimeMillis() - j;
            HashMap map = new HashMap(4);
            map.put("lib_name", str);
            map.put("cost_ms", Long.valueOf(jUptimeMillis2));
            map.put("success", Boolean.TRUE);
            try {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                name = "empty";
                if (abstractC1387200mCcLJ != null && (obj = abstractC1387200mCcLJ.LIZ) != null) {
                    name = obj.getClass().getName();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                name = "unknown";
            }
            map.put("top_page", name);
            c08th.LIZ("load_so", "result", map);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static void LJ(long j, String str) {
        if (C1150504el.LIZ().LJII) {
            long jUptimeMillis = SystemClock.uptimeMillis() - j;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load_so_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            long jCurrentTimeMillis = System.currentTimeMillis() - C1150504el.LIZ().LJJII;
            LIZJ.add(str);
            Set<String> set = LIZIZ;
            if (set.contains(strLIZIZ)) {
                return;
            }
            set.add(strLIZIZ);
            C202099145x c202099145xLIZ = C1150504el.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append("_from_boot");
            c202099145xLIZ.LJ(jCurrentTimeMillis, C2188811AlT.LIZIZ(sbLIZ2));
            C1150504el.LIZ().LJ(jUptimeMillis, strLIZIZ);
            C08TN.LIZ().LJFF(jUptimeMillis, strLIZIZ);
            C202098145w c202098145wLIZ = C08TN.LIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append("_from_boot");
            c202098145wLIZ.LJFF(jCurrentTimeMillis, C2188811AlT.LIZIZ(sbLIZ3));
            C1150504el.LIZ().LJ(jUptimeMillis, "load_so_total");
        }
    }
}

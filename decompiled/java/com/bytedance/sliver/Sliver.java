package com.bytedance.sliver;

import X.C0WP3;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C795670VJd;
import X.C795690VJf;
import X.EnumC795650VJb;
import X.InterfaceC790940V0y;
import X.InterfaceC795660VJc;
import X.InterfaceC795700VJg;
import X.InterfaceC795710VJh;
import Y.ARunnableS1S2210000_13;
import Y.ARunnableS82S0200000_13;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class Sliver {
    public static final boolean isArt;
    public static volatile boolean isInit;
    public static final InterfaceC795700VJg sDefaultExecutor;
    public static final InterfaceC795710VJh sDefaultLogger;
    public static InterfaceC795700VJg sExecutor;
    public static InterfaceC795710VJh sLogger;
    public static boolean sLoggerEnable;
    public static final Field threadPeerField;
    public static final Field threadPeerFieldDalvik;
    public static final Map<Thread, C795670VJd> cache = new ConcurrentHashMap(16);
    public static final Map<String, Long> mark = new ConcurrentHashMap(16);
    public static final List<InterfaceC795660VJc> sListenerList = new CopyOnWriteArrayList();

    public static void enableLog() {
        sLoggerEnable = true;
    }

    public static boolean isArt() {
        return true;
    }

    public static native void nClear(long j);

    public static native void nDump(long j, String str, long j2);

    public static native long[] nGetMethodStackTrace(Thread thread, long j);

    public static native String nGetStackTrace(Thread thread, long j);

    public static native String nGetStackTrace(long[] jArr);

    public static native String[] nGetStackTrace3(long[] jArr);

    public static native boolean nInit(int i, Method method, boolean z, boolean z2);

    public static native void nPause(long j);

    public static native void nResetSamplingMs(long j, int i);

    public static native void nResume(long j);

    public static native long nStart(Thread thread, long j, int i, int i2, int i3);

    public static native void nStop(long j);

    static {
        Field field;
        Field declaredField;
        InterfaceC795710VJh interfaceC795710VJh = new InterfaceC795710VJh() { // from class: X.0VJe
        };
        sDefaultLogger = interfaceC795710VJh;
        sLogger = interfaceC795710VJh;
        sLoggerEnable = false;
        InterfaceC795700VJg interfaceC795700VJg = new InterfaceC795700VJg() { // from class: X.0VJf
        };
        sDefaultExecutor = interfaceC795700VJg;
        sExecutor = interfaceC795700VJg;
        boolean zIsArt = isArt();
        isArt = zIsArt;
        Field declaredField2 = null;
        try {
            if (zIsArt) {
                declaredField = Thread.class.getDeclaredField("nativePeer");
            } else {
                declaredField = Thread.class.getDeclaredField("vmThread");
                try {
                    declaredField2 = Class.forName("java.lang.VMThread").getDeclaredField("vmData");
                    declaredField2.setAccessible(true);
                } catch (Throwable th) {
                    th = th;
                    field = declaredField2;
                    declaredField2 = declaredField;
                    TryCatchGuardChecker.doCheck(th);
                    threadPeerField = declaredField2;
                    threadPeerFieldDalvik = field;
                }
            }
            field = declaredField2;
            declaredField2 = declaredField;
            try {
                declaredField2.setAccessible(true);
                threadPeerField = declaredField2;
                threadPeerFieldDalvik = field;
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                threadPeerField = declaredField2;
                threadPeerFieldDalvik = field;
            }
        } catch (Throwable th3) {
            th = th3;
            field = declaredField2;
        }
    }

    public static synchronized boolean clearAll() {
        return SliverAllThreadSupport.clearAll();
    }

    public static synchronized boolean pauseAll() {
        return SliverAllThreadSupport.pauseAll();
    }

    public static synchronized boolean resumeAll() {
        return SliverAllThreadSupport.resumeAll();
    }

    public static synchronized boolean stopAll() {
        return SliverAllThreadSupport.stopAll();
    }

    public static boolean clear() {
        return clear(C786410Ut5.u3());
    }

    public static boolean loadLibrary() {
        try {
            INVOKESTATIC_com_bytedance_sliver_Sliver_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("sliver");
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            onError("sliver so load failed", th);
            return false;
        }
    }

    public static boolean pause() {
        return pause(C786410Ut5.u3());
    }

    public static boolean resume() {
        return resume(C786410Ut5.u3());
    }

    public static boolean stop() {
        return stop(C786410Ut5.u3());
    }

    public static boolean isInit() {
        return isInit;
    }

    public static void INVOKESTATIC_com_bytedance_sliver_Sliver_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static synchronized boolean clear(Thread thread) {
        if (!isInit) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(thread);
            sbLIZ.append(" clear failed, because sliver is not init");
            onError(C2188811AlT.LIZIZ(sbLIZ), new Throwable());
            return false;
        }
        C795670VJd c795670VJd = cache.get(thread);
        if (c795670VJd == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(thread);
            sbLIZ2.append(" clear failed, because thread is not sampling");
            onError(C2188811AlT.LIZIZ(sbLIZ2), new Throwable());
            return false;
        }
        InterfaceC795700VJg interfaceC795700VJg = sExecutor;
        ARunnableS82S0200000_13 aRunnableS82S0200000_13 = new ARunnableS82S0200000_13(thread, c795670VJd, 21);
        ((C795690VJf) interfaceC795700VJg).getClass();
        C0WP3.LIZJ(aRunnableS82S0200000_13);
        return true;
    }

    public static boolean dump(String str) {
        return dump(C786410Ut5.u3(), str);
    }

    public static synchronized boolean dumpAll(String str) {
        return dumpAll(str, false);
    }

    public static synchronized long[] getMethodStackTrace(Thread thread) {
        if (!init(false)) {
            return new long[0];
        }
        long threadPeer = getThreadPeer(thread);
        if (threadPeer == 0) {
            return new long[0];
        }
        return nGetMethodStackTrace(thread, threadPeer);
    }

    public static synchronized String getStackTrace(Thread thread) {
        if (!init(false)) {
            return "";
        }
        long threadPeer = getThreadPeer(thread);
        if (threadPeer == 0) {
            return "";
        }
        return nGetStackTrace(thread, threadPeer);
    }

    public static synchronized String[] getStackTraceArray(long[] jArr) {
        if (jArr != null) {
            if (jArr.length != 0) {
                return nGetStackTrace3(jArr);
            }
        }
        return null;
    }

    public static long getThreadPeer(Thread thread) {
        Field field;
        long jIntValue = 0;
        if (isArt) {
            Field field2 = threadPeerField;
            if (field2 != null) {
                try {
                    Object obj = field2.get(thread);
                    if (obj == null) {
                        return 0L;
                    }
                    jIntValue = ((Long) obj).longValue();
                    return jIntValue;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return jIntValue;
                }
            }
        } else {
            Field field3 = threadPeerField;
            if (field3 != null && (field = threadPeerFieldDalvik) != null) {
                try {
                    Object obj2 = field.get(field3.get(thread));
                    if (obj2 == null) {
                        return 0L;
                    }
                    jIntValue = ((Integer) obj2).intValue();
                    return jIntValue;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
        return jIntValue;
    }

    public static synchronized boolean init(boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i > 34) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not support api : ");
            sbLIZ.append(i);
            sbLIZ.append(", sliver support ");
            sbLIZ.append(19);
            sbLIZ.append("-");
            sbLIZ.append(34);
            onError(C2188811AlT.LIZIZ(sbLIZ), new Throwable());
            return false;
        }
        if (isInit) {
            onStep("sliver already init");
            return true;
        }
        if (!loadLibrary()) {
            return false;
        }
        try {
            method = Looper.class.getMethod("loop", new Class[0]);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            method = null;
        }
        if (!nInit(i, method, z, isArt)) {
            onError("sliver init failed, because native init error", new Throwable());
            return false;
        }
        isInit = true;
        onStep("sliver init success, protect is " + z);
        return true;
    }

    public static void mark(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mark.put(str, Long.valueOf(System.nanoTime()));
    }

    public static int mode2Int(EnumC795650VJb enumC795650VJb) {
        if (enumC795650VJb == EnumC795650VJb.RING || enumC795650VJb != EnumC795650VJb.NORMAL) {
            return 0;
        }
        return 1;
    }

    public static void onStep(String str) {
        if (!sLoggerEnable) {
            return;
        }
        sLogger.getClass();
    }

    public static synchronized boolean pause(Thread thread) {
        C795670VJd c795670VJd = cache.get(thread);
        if (c795670VJd == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(thread);
            sbLIZ.append(" pause failed, because thread is not sampling");
            onError(C2188811AlT.LIZIZ(sbLIZ), new Throwable());
            return false;
        }
        if (!c795670VJd.LIZIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(thread);
            sbLIZ2.append(" already pause");
            onStep(C2188811AlT.LIZIZ(sbLIZ2));
            return true;
        }
        nPause(c795670VJd.LIZ);
        c795670VJd.LIZIZ = false;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(thread);
        sbLIZ3.append(" pause success");
        onStep(C2188811AlT.LIZIZ(sbLIZ3));
        return true;
    }

    public static void registerSamplingListener(InterfaceC795660VJc interfaceC795660VJc) {
        List<InterfaceC795660VJc> list = sListenerList;
        if (list.contains(interfaceC795660VJc)) {
            return;
        }
        list.add(interfaceC795660VJc);
    }

    public static synchronized boolean resetSamplingMs(int i) {
        return resetSamplingMs(C786410Ut5.u3(), i);
    }

    public static synchronized boolean resume(Thread thread) {
        C795670VJd c795670VJd = cache.get(thread);
        if (c795670VJd == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(thread);
            sbLIZ.append(" resume failed, because thread is not sampling");
            onError(C2188811AlT.LIZIZ(sbLIZ), new Throwable());
            return false;
        }
        if (c795670VJd.LIZIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(thread);
            sbLIZ2.append(" already resume");
            onStep(C2188811AlT.LIZIZ(sbLIZ2));
            return true;
        }
        nResume(c795670VJd.LIZ);
        c795670VJd.LIZIZ = true;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(thread);
        sbLIZ3.append(" resume success");
        onStep(C2188811AlT.LIZIZ(sbLIZ3));
        return true;
    }

    public static void setExecutor(InterfaceC795700VJg interfaceC795700VJg) {
        if (interfaceC795700VJg != null) {
            sExecutor = interfaceC795700VJg;
        }
    }

    public static void setLogger(InterfaceC795710VJh interfaceC795710VJh) {
        if (interfaceC795710VJh != null) {
            enableLog();
            sLogger = interfaceC795710VJh;
        }
    }

    public static boolean start(int i) {
        return start(C786410Ut5.u3(), i, 100000, EnumC795650VJb.RING);
    }

    public static synchronized boolean stop(Thread thread) {
        if (!isInit) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(thread);
            sbLIZ.append(" stop failed, because sliver is not init");
            onError(C2188811AlT.LIZIZ(sbLIZ), new Throwable());
            return false;
        }
        C795670VJd c795670VJdRemove = cache.remove(thread);
        if (c795670VJdRemove == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(thread);
            sbLIZ2.append(" stop failed, because thread is not sampling");
            onError(C2188811AlT.LIZIZ(sbLIZ2), new Throwable());
            return true;
        }
        nStop(c795670VJdRemove.LIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(thread);
        sbLIZ3.append(" stop success");
        onStep(C2188811AlT.LIZIZ(sbLIZ3));
        return true;
    }

    public static void unRegisterSamplingListener(InterfaceC795660VJc interfaceC795660VJc) {
        sListenerList.remove(interfaceC795660VJc);
    }

    public static synchronized String getStackTrace(long[] jArr) {
        if (jArr != null) {
            if (jArr.length != 0) {
                return nGetStackTrace(jArr);
            }
        }
        return "";
    }

    public static boolean dump(String str, String str2) {
        return dump(C786410Ut5.u3(), str, str2);
    }

    public static synchronized boolean dumpAll(String str, boolean z) {
        return SliverAllThreadSupport.dumpAll(str, z);
    }

    public static void onError(String str, Throwable th) {
        if (!sLoggerEnable) {
            return;
        }
        sLogger.getClass();
    }

    public static synchronized boolean resetSamplingMs(Thread thread, int i) {
        if (!isInit) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(thread);
            sbLIZ.append(" reset sampling ms  failed, because sliver is not init");
            onError(C2188811AlT.LIZIZ(sbLIZ), new Throwable());
            return false;
        }
        C795670VJd c795670VJd = cache.get(thread);
        if (c795670VJd == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(thread);
            sbLIZ2.append(" reset sampling ms  failed, because thread is not sampling");
            onError(C2188811AlT.LIZIZ(sbLIZ2), new Throwable());
            return false;
        }
        nResetSamplingMs(c795670VJd.LIZ, i);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(thread);
        sbLIZ3.append(" reset sampling ms success");
        onStep(C2188811AlT.LIZIZ(sbLIZ3));
        return true;
    }

    public static boolean startAll(int i, int i2) {
        return startAll(i, i2, 50000, EnumC795650VJb.RING, null);
    }

    public static boolean dump(Thread thread, String str) {
        return dump(thread, str, false);
    }

    public static synchronized boolean dump(Thread thread, String str, boolean z) {
        return dump(thread, str, z, null);
    }

    public static synchronized void reportStack(Thread thread, long[] jArr, long j) {
        int i = 0;
        while (true) {
            List<InterfaceC795660VJc> list = sListenerList;
            if (i < list.size()) {
                ((InterfaceC795660VJc) ListProtector.get(list, i)).LIZ(thread, jArr);
                i++;
            }
        }
    }

    public static boolean dump(Thread thread, String str, String str2) {
        return dump(thread, str, false, str2);
    }

    public static synchronized boolean dump(Thread thread, String str, boolean z, String str2) {
        String str3;
        if (!isInit) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(thread);
            sbLIZ.append(" dump failed, because sliver is not init");
            onError(C2188811AlT.LIZIZ(sbLIZ), new Throwable());
            return false;
        }
        C795670VJd c795670VJd = cache.get(thread);
        if (c795670VJd == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(thread);
            sbLIZ2.append(" stop failed, because thread is not sampling");
            onError(C2188811AlT.LIZIZ(sbLIZ2), new Throwable());
            return false;
        }
        ARunnableS1S2210000_13 aRunnableS1S2210000_13 = new ARunnableS1S2210000_13(str2, c795670VJd, str, thread, z, 0);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(thread);
        sbLIZ3.append(" dump ");
        if (!z) {
            str3 = "async";
        } else {
            str3 = "sync";
        }
        sbLIZ3.append(str3);
        sbLIZ3.append(" start");
        onStep(C2188811AlT.LIZIZ(sbLIZ3));
        if (z) {
            aRunnableS1S2210000_13.run();
        } else {
            ((C795690VJf) sExecutor).getClass();
            C0WP3.LIZJ(aRunnableS1S2210000_13);
        }
        return true;
    }

    public static synchronized boolean start(Thread thread, int i, int i2, EnumC795650VJb enumC795650VJb) {
        if (SliverAllThreadSupport.isStart()) {
            onError("sliver start failed , because sliver all thread was started", new Throwable());
            return false;
        }
        if (!init(false)) {
            onError("sliver start failed , because sliver init failed", new Throwable());
            return false;
        }
        Map<Thread, C795670VJd> map = cache;
        if (map.containsKey(thread)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(thread);
            sbLIZ.append(" already sampling by sliver");
            onStep(C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        long threadPeer = getThreadPeer(thread);
        if (threadPeer == 0) {
            onError("sliver start failed , because can't get thread peer", new Throwable());
            return false;
        }
        long jNStart = nStart(thread, threadPeer, i, i2, mode2Int(enumC795650VJb));
        if (jNStart == 0) {
            onError("sliver start failed , because can't get native peer", new Throwable());
            return false;
        }
        C795670VJd c795670VJd = new C795670VJd();
        c795670VJd.LIZ = jNStart;
        c795670VJd.LIZIZ = true;
        map.put(thread, c795670VJd);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(thread);
        sbLIZ2.append(" sampling by sliver success");
        onStep(C2188811AlT.LIZIZ(sbLIZ2));
        return true;
    }

    public static synchronized boolean startAll(int i, int i2, int i3, EnumC795650VJb enumC795650VJb, InterfaceC790940V0y interfaceC790940V0y) {
        if (!cache.isEmpty()) {
            return false;
        }
        if (!init(false)) {
            return false;
        }
        return SliverAllThreadSupport.startAll(i, i2, i3, enumC795650VJb, interfaceC790940V0y);
    }
}

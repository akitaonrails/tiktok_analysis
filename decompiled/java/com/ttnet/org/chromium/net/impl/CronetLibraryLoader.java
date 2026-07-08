package com.ttnet.org.chromium.net.impl;

import J.N;
import X.AbstractC1499210p7H;
import X.C08VH;
import X.C0VSJ;
import X.C1497110p3t;
import X.C2163108dh;
import X.C786410Ut5;
import X.C787230UuP;
import android.content.Context;
import android.os.ConditionVariable;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import com.ttnet.org.chromium.net.impl.CronetLibraryLoader;

/* JADX INFO: loaded from: classes24.dex */
public class CronetLibraryLoader {
    public static volatile boolean LIZLLL;
    public static final Object LIZ = new Object();
    public static final HandlerThread LIZIZ = new HandlerThread("CronetInit");
    public static volatile boolean LIZJ = false;
    public static final ConditionVariable LJ = new ConditionVariable();

    public static void LIZIZ() throws Throwable {
        if (LIZLLL) {
            return;
        }
        C1497110p3t.LIZJ = System.nanoTime();
        NetworkChangeNotifier.init();
        NetworkChangeNotifier.LJFF.LJII(true, new AbstractC1499210p7H() { // from class: X.0p7C
            @Override // X.AbstractC1499210p7H
            public final void LIZ() {
            }

            @Override // X.AbstractC1499210p7H
            public final void LIZIZ(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
                this.LIZ = networkChangeNotifierAutoDetect;
                LIZJ();
            }
        });
        LJ.block();
        N.MyweRqSS();
        LIZLLL = true;
        C1497110p3t.LIZLLL = System.nanoTime();
    }

    public static void ensureInitializedFromNative() {
        synchronized (LIZ) {
            try {
                LIZJ = true;
                LJ.open();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZ(C787230UuP.LIZ, null);
    }

    public static String getDefaultUserAgent() {
        return C2163108dh.LIZ(C787230UuP.LIZ);
    }

    public static void LIZJ(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        String str = cronetEngineBuilderImpl.LJJIII;
        if (!TextUtils.isEmpty(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists() && !c0vsj.isDirectory()) {
                Object[] objArr = {str};
                C08VH.LIZIZ("cronet so load: %s", C08VH.LIZJ(objArr), objArr);
                System.load(str);
                return;
            }
        }
        if (cronetEngineBuilderImpl.LJJJI() != null) {
            cronetEngineBuilderImpl.LJJJI().loadLibrary("sscronet");
            return;
        }
        LoadSoLancet.LIZJ("sscronet");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("sscronet");
        LoadSoLancet.LJ(jUptimeMillis, "sscronet");
        LoadSoLancet.LIZLLL(jUptimeMillis, "sscronet");
        LoadSoLancet.LIZIZ("sscronet");
    }

    public static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Process.setThreadPriority(i);
    }

    public static void LIZ(Context context, CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        synchronized (LIZ) {
            try {
                if (!LIZLLL) {
                    C787230UuP.LIZ = context;
                    HandlerThread handlerThread = LIZIZ;
                    if (!handlerThread.isAlive()) {
                        handlerThread.start();
                    }
                    Runnable runnable = new Runnable() { // from class: X.0p5x
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CronetLibraryLoader@a7ce.ensureInitialized$1");
                            try {
                                CronetLibraryLoader.LIZIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CronetLibraryLoader@a7ce.ensureInitialized$1");
                        }
                    };
                    if (C786410Ut5.W2(handlerThread) == Looper.myLooper()) {
                        runnable.run();
                    } else {
                        C786410Ut5.LJJZZIII(new BPEAHandler(C786410Ut5.W2(handlerThread)), runnable);
                    }
                }
                if (!LIZJ) {
                    C1497110p3t.LIZ = System.nanoTime();
                    LIZJ(cronetEngineBuilderImpl);
                    C1497110p3t.LIZIZ = System.nanoTime();
                    if (!cronetEngineBuilderImpl.LJJIJIIJIL) {
                        if ("107.0.5273.2".equals(N.MVlvYo_c())) {
                            Object[] objArr = {"107.0.5273.2", System.getProperty("os.arch")};
                            C08VH.LIZIZ("Cronet version: %s, arch: %s", C08VH.LIZJ(objArr), objArr);
                        } else {
                            throw new RuntimeException(C786410Ut5.j4("Expected Cronet version number %s, actual version number %s.", new Object[]{"107.0.5273.2", N.MVlvYo_c()}));
                        }
                    }
                    LIZJ = true;
                    LJ.open();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

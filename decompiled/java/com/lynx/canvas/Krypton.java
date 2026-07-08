package com.lynx.canvas;

import X.C1288370jdD;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1288380jdE;
import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class Krypton {
    public static volatile Krypton LIZLLL;
    public volatile boolean LIZ;
    public Context LIZIZ;
    public final ConcurrentHashMap<String, InterfaceC1288380jdE> LIZJ = new ConcurrentHashMap<>();

    public native void nativeRegisterLogger(String str, long j);

    public static Krypton LIZIZ() {
        if (LIZLLL == null) {
            synchronized (Krypton.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new Krypton();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final synchronized void LIZ(Context context) {
        try {
            if (((ActivityManager) C786410Ut5.H2(context, "activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                if (this.LIZ) {
                    C1288370jdD.LIZLLL("Krypton", "Krypton has already been initialized");
                    return;
                }
                this.LIZIZ = context;
                if (!LIZJ("lynxbase", true)) {
                    return;
                }
                if (!LIZJ("krypton", true)) {
                    return;
                }
                C1288370jdD.LIZJ("Krypton", "Native Krypton Library load success ");
                this.LIZ = true;
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1288370jdD.LIZIZ("Krypton", "Krypton not support with device do not support ES3");
    }

    public static boolean LIZJ(String str, boolean z) {
        try {
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Native library load ");
            sbLIZ.append(str);
            sbLIZ.append(" success with System.loadLibrary");
            C1288370jdD.LIZJ("Krypton", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            if (z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Native library load ");
                sbLIZ2.append(str);
                sbLIZ2.append("from system with runtime exception ");
                sbLIZ2.append(e.getMessage());
                C1288370jdD.LIZIZ("Krypton", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return false;
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (z) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Native library load ");
                sbLIZ3.append(str);
                sbLIZ3.append("from system with error message ");
                sbLIZ3.append(e2.getMessage());
                C1288370jdD.LIZIZ("Krypton", C2188811AlT.LIZIZ(sbLIZ3));
            }
            return false;
        }
    }

    public static boolean triggerLoadLibrary(String str, boolean z) {
        LIZIZ().getClass();
        return LIZJ(str, z);
    }

    public static void LIZLLL(int i, String str, String str2) {
        CanvasFontRegistry.LIZ().LIZIZ(i, str, str2);
    }
}

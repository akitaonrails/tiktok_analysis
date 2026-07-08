package com.lynx.tasm.utils;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxEnv;

/* JADX INFO: loaded from: classes21.dex */
public class DisplayMetricsHolder {
    public static DisplayMetrics LIZ = null;
    public static DisplayMetrics LIZIZ = null;
    public static int LIZJ = -1;
    public static float LIZLLL = -1.0f;
    public static boolean LJ;
    public static boolean LJFF;

    public static native void nativeUpdateDevice(int i, int i2, float f);

    public static DisplayMetrics LIZIZ() {
        synchronized (DisplayMetricsHolder.class) {
            try {
                if (LIZIZ == null) {
                    return null;
                }
                DisplayMetrics displayMetrics = new DisplayMetrics();
                displayMetrics.setTo(LIZIZ);
                return displayMetrics;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static DisplayMetrics LIZJ() {
        synchronized (DisplayMetricsHolder.class) {
            try {
                if (LIZ == null) {
                    return null;
                }
                DisplayMetrics displayMetrics = new DisplayMetrics();
                displayMetrics.setTo(LIZ);
                return displayMetrics;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static DisplayMetrics LIZ(Context context) {
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        synchronized (DisplayMetricsHolder.class) {
            try {
                if (LIZ != null) {
                    displayMetrics = new DisplayMetrics();
                    displayMetrics.setTo(LIZ);
                } else {
                    displayMetrics = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (displayMetrics != null) {
            displayMetrics2.setTo(LIZJ());
        }
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        if (windowManager != null) {
            Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEg4jUdKSQVYySFyRcmgk4YS6KqLGzpftc2yfzVC0WczVw27blw==", null));
            if (displayLLILZIL != null) {
                displayLLILZIL.getRealMetrics(displayMetrics2);
            }
            return displayMetrics2;
        }
        throw new AssertionError("WindowManager is null!");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[PHI: r2
      0x006f: PHI (r2v2 boolean) = (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v4 boolean), (r2v1 boolean) binds: [B:15:0x0043, B:17:0x0051, B:19:0x0059, B:21:0x005d, B:31:0x0090, B:26:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(android.content.Context r5, java.lang.Float r6) {
        /*
            if (r5 != 0) goto L11
            java.lang.String r1 = "Lynx"
            java.lang.String r0 = "updateOrInitDisplayMetrics context parameter is null, fallback to updateOrInitDisplayMetrics by ApplicationContext"
            com.lynx.base.log.LynxLog.w(r1, r0)
            com.lynx.tasm.LynxEnv r0 = com.lynx.tasm.LynxEnv.inst()
            android.content.Context r5 = r0.getAppContext()
        L11:
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            if (r6 == 0) goto L21
            float r0 = r6.floatValue()
            r2.density = r0
        L21:
            java.lang.Class<com.lynx.tasm.utils.DisplayMetricsHolder> r1 = com.lynx.tasm.utils.DisplayMetricsHolder.class
            monitor-enter(r1)
            android.util.DisplayMetrics r0 = com.lynx.tasm.utils.DisplayMetricsHolder.LIZ     // Catch: java.lang.Throwable -> L93
            if (r0 != 0) goto L2f
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L93
            r0.<init>()     // Catch: java.lang.Throwable -> L93
            com.lynx.tasm.utils.DisplayMetricsHolder.LIZ = r0     // Catch: java.lang.Throwable -> L93
        L2f:
            android.util.DisplayMetrics r0 = com.lynx.tasm.utils.DisplayMetricsHolder.LIZ     // Catch: java.lang.Throwable -> L93
            r0.setTo(r2)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L93
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r4 = r0.getDisplayMetrics()
            android.util.DisplayMetrics r0 = LIZIZ()
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L6f
            int r1 = com.lynx.tasm.utils.DisplayMetricsHolder.LIZJ
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            if (r1 != r0) goto L6f
            float r1 = com.lynx.tasm.utils.DisplayMetricsHolder.LIZLLL
            float r0 = r4.scaledDensity
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L6f
            boolean r0 = com.lynx.tasm.utils.DisplayMetricsHolder.LJ
            if (r0 == 0) goto L6f
            android.util.DisplayMetrics r0 = com.lynx.tasm.utils.DisplayMetricsHolder.LIZIZ
            if (r0 == 0) goto L8d
            if (r6 == 0) goto L8d
            float r1 = r0.density
            float r0 = r6.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L8d
        L6f:
            LJ(r5, r6)
            com.lynx.tasm.utils.DisplayMetricsHolder.LJFF = r3
        L74:
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.scaledDensity
            com.lynx.tasm.utils.DisplayMetricsHolder.LIZLLL = r0
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            com.lynx.tasm.utils.DisplayMetricsHolder.LIZJ = r0
            return r2
        L8d:
            r2 = 0
            boolean r0 = com.lynx.tasm.utils.DisplayMetricsHolder.LJFF
            if (r0 == 0) goto L74
            goto L6f
        L93:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L93
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.utils.DisplayMetricsHolder.LIZLLL(android.content.Context, java.lang.Float):boolean");
    }

    public static void LJ(Context context, Float f) {
        DisplayMetrics displayMetricsLIZ = LIZ(context);
        if (f != null) {
            displayMetricsLIZ.density = f.floatValue();
        }
        boolean zIsNativeLibraryLoaded = LynxEnv.inst().isNativeLibraryLoaded();
        synchronized (DisplayMetricsHolder.class) {
            try {
                LIZIZ = displayMetricsLIZ;
                if (zIsNativeLibraryLoaded) {
                    LJ = true;
                    nativeUpdateDevice(displayMetricsLIZ.widthPixels, displayMetricsLIZ.heightPixels, displayMetricsLIZ.density);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

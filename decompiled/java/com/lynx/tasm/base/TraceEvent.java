package com.lynx.tasm.base;

import android.os.Trace;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes21.dex */
public class TraceEvent {
    public static final String[] LIZ = {"lynx", "vitals", "screenshot", "fps"};
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;

    public static native void nativeBeginSection(String str, String str2);

    public static native void nativeBeginSectionWithProps(String str, String str2, Map<String, String> map);

    public static native boolean nativeCategoryEnabled(String str);

    public static native void nativeCounter(String str, String str2, long j);

    public static native void nativeEndSection(String str, String str2);

    public static native void nativeEndSectionWithProps(String str, String str2, Map<String, String> map);

    public static native void nativeInstant(String str, String str2, long j, String str3);

    public static native void nativeInstantWithProps(String str, String str2, long j, Map<String, String> map);

    public static native boolean nativePerfettoTraceEnabled();

    public static native boolean nativeSystemTraceEnabled();

    public static boolean LJ() {
        if (!LIZLLL && LIZIZ) {
            LIZLLL = nativePerfettoTraceEnabled();
        }
        return LIZLLL;
    }

    public static boolean LJFF() {
        if (!LJ && LIZIZ) {
            LJ = nativeSystemTraceEnabled();
        }
        return LJ;
    }

    public static String LJIIIZ() {
        if (!TraceController.isNativeTracingOnly() && LIZJ && TraceController.isTracingStarted()) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append('#');
                for (int i = 0; i < 6; i++) {
                    sb.append(Integer.toHexString(new Random().nextInt(16)));
                }
                return sb.toString().toUpperCase();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return "#FF0000";
    }

    public static void LIZIZ(String str) {
        LIZLLL(str);
    }

    public static void LIZLLL(String str) {
        String str2 = LIZ[(int) 0];
        if (!TraceController.isNativeTracingOnly() && LIZJ) {
            if (LJ() && TraceController.isTracingStarted()) {
                nativeBeginSection(str2, str);
            } else {
                Trace.beginSection(str);
            }
        }
    }

    public static void LJII(String str) {
        LJI(0L, str);
    }

    public static void LIZJ(String str, Map<String, String> map) {
        LIZ(0L, str, map);
    }

    public static void LJI(long j, String str) {
        String str2 = LIZ[(int) j];
        if (!TraceController.isNativeTracingOnly() && LIZJ) {
            if (LJ() && TraceController.isTracingStarted()) {
                nativeEndSection(str2, str);
            } else {
                Trace.endSection();
            }
        }
    }

    public static void LJIIIIZZ(String str, Map map) {
        String str2 = LIZ[(int) 0];
        if (!TraceController.isNativeTracingOnly() && LIZJ) {
            if (LJ() && TraceController.isTracingStarted()) {
                nativeEndSectionWithProps(str2, str, map);
            } else {
                Trace.endSection();
            }
        }
    }

    public static void LJIIJ(long j, String str) {
        LJIIJJI(System.nanoTime() / 1000, LIZ[(int) j], str, LJIIIZ());
    }

    public static void LIZ(long j, String str, Map<String, String> map) {
        String str2 = LIZ[(int) j];
        if (!TraceController.isNativeTracingOnly() && LIZJ) {
            if (LJ() && TraceController.isTracingStarted()) {
                nativeBeginSectionWithProps(str2, str, map);
            } else {
                Trace.beginSection(str);
            }
        }
    }

    public static void LJIIL(long j, String str, Map<String, String> map) {
        LJIILJJIL(LIZ[(int) j], str, map);
    }

    public static void LJIILIIL(long j, Map map, String str) {
        if (LIZJ) {
            if (LJ() && TraceController.isTracingStarted()) {
                if (j <= 0) {
                    j = System.nanoTime() / 1000;
                }
                nativeInstantWithProps("lynx", str, j, map);
            } else {
                Trace.beginSection(str);
                Trace.endSection();
            }
        }
    }

    public static void LJIILJJIL(String str, String str2, Map<String, String> map) {
        if (LIZJ) {
            if (LJ() && TraceController.isTracingStarted()) {
                nativeInstantWithProps(str, str2, System.nanoTime() / 1000, map);
            } else {
                Trace.beginSection(str2);
                Trace.endSection();
            }
        }
    }

    public static void LJIIJJI(long j, String str, String str2, String str3) {
        if (LIZJ) {
            if (LJ() && TraceController.isTracingStarted()) {
                nativeInstant(str, str2, j, str3);
            } else {
                Trace.beginSection(str2);
                Trace.endSection();
            }
        }
    }
}

package com.bytedance.sdui.render.tasm.utils;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class DisplayMetricsHolder {
    public static DisplayMetrics LIZ;
    public static DisplayMetrics LIZIZ;

    public static native void nativeUpdateDevice(int i, int i2, float f, String str);

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
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (LIZJ() != null) {
            displayMetrics.setTo(LIZJ());
        }
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        if (windowManager != null) {
            C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyXYqsHhnMSdZ+6G6rfohWOYHXY6nOGORig7N+hcpV6JRT/+P+q6FDEIf7B", null)).getRealMetrics(displayMetrics);
            return displayMetrics;
        }
        throw new AssertionError("WindowManager is null!");
    }

    public static void LIZLLL(DisplayMetrics displayMetrics) {
        synchronized (DisplayMetricsHolder.class) {
            try {
                LIZIZ = displayMetrics;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJ(int i, int i2) {
        synchronized (DisplayMetricsHolder.class) {
            try {
                DisplayMetrics displayMetrics = LIZ;
                if (displayMetrics != null) {
                    displayMetrics.widthPixels = i;
                    displayMetrics.heightPixels = i2;
                }
                DisplayMetrics displayMetrics2 = LIZIZ;
                if (displayMetrics2 != null) {
                    displayMetrics2.widthPixels = i;
                    displayMetrics2.heightPixels = i2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

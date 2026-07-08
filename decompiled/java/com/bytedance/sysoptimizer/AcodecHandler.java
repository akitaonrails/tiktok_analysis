package com.bytedance.sysoptimizer;

import X.C08PL;
import X.C2112108Pf;
import android.content.Context;
import android.os.Build;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class AcodecHandler {
    public static boolean fixInitSprdSSense;
    public static boolean fixSetupNativeOptimized;
    public static volatile boolean mInit;

    public static native void fixAcodecMessage();

    public static native boolean fixSetupNativeWindowSizeFormatAndUsage();

    public static native boolean hookMediaCodecInitJni();

    public static boolean inAndroid4x() {
        return false;
    }

    public static boolean inAndroid5x() {
        return false;
    }

    public static synchronized void fixAcodecMessage(Context context) {
        if ((inAndroid4x() || inAndroid5x()) && SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            fixAcodecMessage();
        }
    }

    public static synchronized void fixInitSprdSSenseFunc(Context context) {
        if (fixInitSprdSSense) {
            return;
        }
        if (Build.VERSION.SDK_INT == 34 && SysOptimizer.loadOptimizerLibrary(context)) {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            try {
                hookMediaCodecInitJni();
                fixInitSprdSSense = true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static synchronized void fixSetupNativeWindowSizeFormatAndUsage(Context context) {
        if (fixSetupNativeOptimized) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i <= 34 && SysOptimizer.loadOptimizerLibrary(context)) {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            try {
                fixSetupNativeWindowSizeFormatAndUsage();
                fixSetupNativeOptimized = true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}

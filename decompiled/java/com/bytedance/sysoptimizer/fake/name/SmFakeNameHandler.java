package com.bytedance.sysoptimizer.fake.name;

import android.content.Context;
import android.os.Build;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class SmFakeNameHandler {
    public static String TAG = "SYSOPTIMIZER";
    public static volatile boolean inited;

    public static boolean inAndroid5x() {
        return false;
    }

    public static native void replace(int i);

    public static boolean shouldFix() {
        return inAndroid5x() && Build.MODEL.startsWith("SM-");
    }

    public static synchronized void start(Context context) {
        if (!shouldFix()) {
            return;
        }
        if (inited) {
            return;
        }
        inited = true;
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                replace(Build.VERSION.SDK_INT);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}

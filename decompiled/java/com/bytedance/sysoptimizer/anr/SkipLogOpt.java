package com.bytedance.sysoptimizer.anr;

import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class SkipLogOpt {
    public static String TAG = "SkippedLogOpt";
    public static boolean sOptimized;

    public static native boolean optimizeSkipLog(int i, Method method);

    public static synchronized void startOpt(Context context) {
        Method methodByPassHiddenApi;
        if (sOptimized) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 25) {
                try {
                    try {
                        if (i <= 30) {
                            methodByPassHiddenApi = getMethodByPassHiddenApi(Choreographer.class, " doFrame", Long.TYPE, Integer.TYPE);
                        } else if (i <= 33) {
                            methodByPassHiddenApi = getMethodByPassHiddenApi(Choreographer.class, "doFrame", Long.TYPE, Integer.TYPE, Class.forName("android.view.DisplayEventReceiver$VsyncEventData"));
                        }
                        if (optimizeSkipLog(i, methodByPassHiddenApi)) {
                            sOptimized = true;
                        } else {
                            sOptimized = false;
                        }
                    } catch (NoSuchMethodError e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (ClassNotFoundException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                } catch (UnsatisfiedLinkError e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
        }
    }

    public static Method getMethodByPassHiddenApi(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

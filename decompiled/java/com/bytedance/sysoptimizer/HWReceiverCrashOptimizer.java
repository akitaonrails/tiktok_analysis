package com.bytedance.sysoptimizer;

import android.content.ContextWrapper;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class HWReceiverCrashOptimizer {
    public static volatile boolean sHasFix;

    public static void fix(ContextWrapper contextWrapper) {
        if (Build.VERSION.SDK_INT == 23) {
            synchronized (HWReceiverCrashOptimizer.class) {
                try {
                    if (sHasFix) {
                        return;
                    }
                    sHasFix = true;
                    try {
                        Field declaredField = Class.forName("android.app.ContextImpl").getDeclaredField("mPackageInfo");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(contextWrapper.getBaseContext());
                        Field declaredField2 = Class.forName("android.app.LoadedApk").getDeclaredField("mReceiverResource");
                        declaredField2.setAccessible(true);
                        declaredField2.set(obj, null);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}

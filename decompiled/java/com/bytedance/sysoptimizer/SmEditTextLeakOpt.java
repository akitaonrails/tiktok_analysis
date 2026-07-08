package com.bytedance.sysoptimizer;

import android.app.Application;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class SmEditTextLeakOpt {
    public static final String TAG = SmEditTextLeakOpt.class.getName();

    public static void optimize(Application application) {
        try {
            "samsung".equalsIgnoreCase(Build.MANUFACTURER);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

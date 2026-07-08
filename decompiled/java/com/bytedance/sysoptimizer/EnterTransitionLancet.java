package com.bytedance.sysoptimizer;

import X.C2110908Ot;
import X.C2111008Ou;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class EnterTransitionLancet {
    public void onStop() {
        int i = C2110908Ot.LIZ;
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            int i2 = C2111008Ou.LIZ;
            try {
                ((Activity) new Object()).getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}

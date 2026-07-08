package com.bytedance.sysoptimizer;

import X.C08PL;
import X.C2112108Pf;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class BypassDexFileVerify {
    public static boolean sInited;

    public static native int bypassVerifyNative();

    public static boolean isTargetOSVersion() {
        int i = Build.VERSION.SDK_INT;
        return i >= 24 && i <= 27;
    }

    public static synchronized int bypassVerify(Context context) {
        int iBypassVerifyNative = -1;
        if (sInited) {
            return -1;
        }
        if (!isTargetOSVersion()) {
            return -1;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            try {
                iBypassVerifyNative = bypassVerifyNative();
                sInited = true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return iBypassVerifyNative;
    }
}

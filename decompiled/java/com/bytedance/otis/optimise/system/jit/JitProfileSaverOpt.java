package com.bytedance.otis.optimise.system.jit;

import X.C2105508Mr;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class JitProfileSaverOpt {
    public static int sInit;

    public static native void setProfileSaverOptionsNative(int i, int i2, int i3);

    public static boolean isVersionCompat() {
        int i = Build.VERSION.SDK_INT;
        return i >= 29 && i <= 34;
    }

    static {
        if (isVersionCompat()) {
            try {
                if (C2105508Mr.LIZ()) {
                    sInit = 1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                sInit = -1;
            }
        }
    }

    public static void setProfileSaverOptions(int i, int i2, int i3) {
        if (sInit > 0 && isVersionCompat() && i >= 0 && i2 >= 0 && i3 >= 0) {
            setProfileSaverOptionsNative(i, i2, i3);
        }
    }
}

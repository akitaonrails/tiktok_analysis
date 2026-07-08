package com.bytedance.sysoptimizer.fd;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultFdSetExpandHelper {
    public static native boolean hookJniMethods(Method method, Method method2, Method method3);

    public static native boolean hookLibc();

    public static native boolean hookQtiBoostFramework();

    public static boolean applyJavaCryptoExpandFdSet() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        try {
            Method method = null;
            Method method2 = null;
            Method method3 = null;
            for (Method method4 : Class.forName("com.android.org.conscrypt.NativeCrypto").getDeclaredMethods()) {
                if (method4.getName().equals("SSL_do_handshake")) {
                    if (method != null) {
                        return false;
                    }
                    method = method4;
                } else if (method4.getName().equals("SSL_read")) {
                    if (method2 != null) {
                        return false;
                    }
                    method2 = method4;
                } else if (!method4.getName().equals("SSL_write")) {
                    continue;
                } else {
                    if (method3 != null) {
                        return false;
                    }
                    method3 = method4;
                }
            }
            if (method == null || method2 == null || method3 == null) {
                return false;
            }
            return hookJniMethods(method, method2, method3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean applyLibcExpand() {
        return hookLibc();
    }

    public static boolean applyQtiBoostFrameworkExpand() {
        return hookQtiBoostFramework();
    }
}

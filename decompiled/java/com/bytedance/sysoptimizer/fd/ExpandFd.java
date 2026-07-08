package com.bytedance.sysoptimizer.fd;

import X.C08PL;
import X.C2112108Pf;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class ExpandFd {
    public static final AtomicBoolean mInitFlag = new AtomicBoolean(false);

    public static native boolean addExpandFdSetTarget(String str, String str2);

    public static native int expandKernelFdLimitNative();

    public static native boolean expandLibcFdLimitNative(int i);

    public static native boolean is64BitNative();

    public static synchronized boolean processTargetList(String str) {
        if (str != null) {
            if (str.trim().length() != 0) {
                if (!str.endsWith(";")) {
                    return false;
                }
                for (String str2 : str.split(";")) {
                    String[] strArrSplit = str2.split(":");
                    if (strArrSplit.length != 2) {
                        return false;
                    }
                    String str3 = strArrSplit[0];
                    String str4 = strArrSplit[1];
                    if (!str3.endsWith(".so")) {
                        return false;
                    }
                    addExpandFdSetTarget(str3, str4);
                }
                return true;
            }
        }
        return true;
    }

    public static synchronized boolean apply(Context context, boolean z, String str) {
        boolean z2 = true;
        if (mInitFlag.get()) {
            return true;
        }
        if (Build.VERSION.SDK_INT > 28) {
            return false;
        }
        try {
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                C2112108Pf c2112108Pf = new C2112108Pf();
                c2112108Pf.LIZ = C08PL.SHARED.value;
                c2112108Pf.LIZIZ = true;
                if (ShadowHook.init(c2112108Pf.LIZ()) == 0) {
                    try {
                        if (!is64BitNative()) {
                            return false;
                        }
                        int iExpandKernelFdLimitNative = expandKernelFdLimitNative();
                        mInitFlag.set(true);
                        if (iExpandKernelFdLimitNative == 0) {
                            return false;
                        }
                        if (z) {
                            return true;
                        }
                        if (!expandLibcFdLimitNative(iExpandKernelFdLimitNative)) {
                            return false;
                        }
                        boolean zApplyJavaCryptoExpandFdSet = DefaultFdSetExpandHelper.applyJavaCryptoExpandFdSet();
                        boolean zHookLibc = DefaultFdSetExpandHelper.hookLibc();
                        DefaultFdSetExpandHelper.hookQtiBoostFramework();
                        processTargetList(str);
                        if (!zApplyJavaCryptoExpandFdSet || !zHookLibc) {
                            z2 = false;
                        }
                        return z2;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return false;
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return false;
    }
}

package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class MTK_PVR_Optimizer {
    public static String TAG = "SYSOPTIMIZER";
    public static boolean mOptimized;
    public static boolean sAlwaysCatchSIGSEGV;
    public static boolean sCatchSIGSEGV;

    public static native void optimize();

    public static native void setCatchOption(boolean z);

    public static synchronized void enable(Context context) {
        boolean z;
        if (mOptimized) {
            return;
        }
        if (loadOptimizerOnNeed(context)) {
            try {
                if (!sAlwaysCatchSIGSEGV && !sCatchSIGSEGV) {
                    z = false;
                } else {
                    z = true;
                }
                setCatchOption(z);
                optimize();
                mOptimized = true;
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized void setAlwaysCatchSIGSEGV(boolean z) {
        boolean z2;
        if (sAlwaysCatchSIGSEGV == z) {
            return;
        }
        sAlwaysCatchSIGSEGV = z;
        if (mOptimized) {
            if (!z && !sCatchSIGSEGV) {
                z2 = false;
            } else {
                z2 = true;
            }
            setCatchOption(z2);
        }
    }

    public static synchronized void setCatchSIGSEGV(boolean z) {
        boolean z2;
        if (sCatchSIGSEGV == z) {
            return;
        }
        sCatchSIGSEGV = z;
        if (mOptimized) {
            if (!sAlwaysCatchSIGSEGV && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            setCatchOption(z2);
        }
    }
}

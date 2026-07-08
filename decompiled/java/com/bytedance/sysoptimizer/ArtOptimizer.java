package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ArtOptimizer {
    public static String TAG = "SYSOPTIMIZER";
    public static boolean mOptimized;

    public static native boolean disableDumpOatFile(int i);

    public static native boolean increaseSuspendTime(int i);

    public static synchronized boolean disableDumpOatFileForANR(Context context) {
        if (mOptimized) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        if (i != 29 || !SysOptimizer.loadOptimizerLibrary(context)) {
            return false;
        }
        try {
            boolean zDisableDumpOatFile = disableDumpOatFile(i);
            mOptimized = zDisableDumpOatFile;
            return zDisableDumpOatFile;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT > 23) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optSuspendTimeout(Context context) {
        if (mOptimized) {
            return true;
        }
        if (!loadOptimizerOnNeed(context)) {
            return false;
        }
        try {
            boolean zIncreaseSuspendTime = increaseSuspendTime(Build.VERSION.SDK_INT);
            mOptimized = zIncreaseSuspendTime;
            return zIncreaseSuspendTime;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}

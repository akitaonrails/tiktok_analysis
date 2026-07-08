package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class SysOptimizer {
    public static volatile boolean mOptimzerLibLoaded;
    public static ArrayList<UnsatisfiedLinkError> mLoadError = new ArrayList<>();
    public static boolean mHookRefreshed = false;

    public static native void refreshHook();

    public static native void reservedForJniOffset();

    public static synchronized void hookOptimizerEnable() {
        if (!mOptimzerLibLoaded || mHookRefreshed) {
            return;
        }
        try {
            refreshHook();
            mHookRefreshed = true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static ArrayList<UnsatisfiedLinkError> getLoadLibraryError() {
        return mLoadError;
    }

    public static void INVOKESTATIC_com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static boolean loadOptimizerLibrary(Context context) {
        if (mOptimzerLibLoaded) {
            return true;
        }
        synchronized (SysOptimizer.class) {
            try {
                if (mOptimzerLibLoaded) {
                    return true;
                }
                try {
                    try {
                        if (context != null) {
                            Librarian.LJI(context, "sysoptimizer");
                        } else {
                            INVOKESTATIC_com_bytedance_sysoptimizer_SysOptimizer_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("sysoptimizer");
                        }
                        mOptimzerLibLoaded = true;
                        return true;
                    } catch (UnsatisfiedLinkError e) {
                        TryCatchGuardChecker.doCheck(e);
                        mLoadError.add(e);
                        return false;
                    }
                } catch (OverlappingFileLockException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

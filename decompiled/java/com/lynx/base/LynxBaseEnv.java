package com.lynx.base;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes21.dex */
public class LynxBaseEnv {
    public static LynxBaseEnv sInstance;
    public volatile boolean mIsNativeLibraryLoaded;

    public static LynxBaseEnv inst() {
        if (sInstance == null) {
            synchronized (LynxBaseEnv.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new LynxBaseEnv();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public boolean isNativeLibraryLoaded() {
        return this.mIsNativeLibraryLoaded;
    }

    public static void INVOKESTATIC_com_lynx_base_LynxBaseEnv_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public synchronized boolean loadNativeTraceLibrary(IBaseNativeLibraryLoader iBaseNativeLibraryLoader) {
        if (this.mIsNativeLibraryLoaded) {
            return this.mIsNativeLibraryLoaded;
        }
        try {
            if (iBaseNativeLibraryLoader != null) {
                iBaseNativeLibraryLoader.loadLibrary("lynxbase");
            } else {
                INVOKESTATIC_com_lynx_base_LynxBaseEnv_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lynxbase");
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public boolean init(IBaseNativeLibraryLoader iBaseNativeLibraryLoader, boolean z) {
        if (!this.mIsNativeLibraryLoaded) {
            this.mIsNativeLibraryLoaded = loadNativeTraceLibrary(iBaseNativeLibraryLoader);
        }
        LynxLog.initLynxLog(z);
        LynxBaseTrace.init();
        return true;
    }
}

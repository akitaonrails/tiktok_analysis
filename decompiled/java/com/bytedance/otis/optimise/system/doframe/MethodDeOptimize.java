package com.bytedance.otis.optimise.system.doframe;

import X.C2188811AlT;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MethodDeOptimize {
    public static boolean sSoLoad;

    public static native void checkExecModeNative(Class<?> cls, String str, String str2, boolean z);

    public static native boolean deOptimizeNative(Class<?> cls, String str, String str2, boolean z);

    public static native boolean reOptimizeNative(Class<?> cls, String str, String str2, boolean z, boolean z2);

    public static native void searchEndMark();

    static {
        try {
            INVOKESTATIC_com_bytedance_otis_optimise_system_doframe_MethodDeOptimize_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("otisopt");
            sSoLoad = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean deOptimizeOnVsync() {
        if (Build.VERSION.SDK_INT <= 30) {
            return true;
        }
        if (sSoLoad) {
            return deOptimizeByName("android.view.Choreographer$FrameDisplayEventReceiver", "onVsync", "(JJILandroid/view/DisplayEventReceiver$VsyncEventData;)V", false);
        }
        return false;
    }

    public static void INVOKESTATIC_com_bytedance_otis_optimise_system_doframe_MethodDeOptimize_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static boolean reOptimizeOnVsync(boolean z) {
        if (Build.VERSION.SDK_INT <= 30) {
            return true;
        }
        if (!sSoLoad) {
            return false;
        }
        return reOptimizeByName("android.view.Choreographer$FrameDisplayEventReceiver", "onVsync", "(JJILandroid/view/DisplayEventReceiver$VsyncEventData;)V", false, z);
    }

    public static void checkExecMode(String str, String str2, String str3, boolean z) {
        if (!sSoLoad) {
            return;
        }
        try {
            checkExecModeNative(Class.forName(str), str2, str3, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean deOptimizeByName(String str, String str2, String str3, boolean z) {
        if (str != null && str2 != null && str3 != null) {
            try {
                searchEndMark();
                deOptimizeNative(Class.forName(str), str2, str3, z);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot be null for ");
        sbLIZ.append(str);
        sbLIZ.append(e3.d);
        sbLIZ.append(str2);
        sbLIZ.append(str3);
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static boolean reOptimizeByName(String str, String str2, String str3, boolean z) {
        return reOptimizeByName(str, str2, str3, z, true);
    }

    public static boolean reOptimizeByName(String str, String str2, String str3, boolean z, boolean z2) {
        if (str != null && str2 != null && str3 != null) {
            try {
                searchEndMark();
                return reOptimizeNative(Class.forName(str), str2, str3, z, z2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot be null for ");
        sbLIZ.append(str);
        sbLIZ.append(e3.d);
        sbLIZ.append(str2);
        sbLIZ.append(str3);
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }
}

package com.bytedance.qmi.vsync.jni;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MethodDeOptimize {
    public static final boolean LIZ;

    public static native boolean deOptimizeNative(Class<?> cls, String str, String str2, boolean z);

    public static native void searchEndMark();

    static {
        try {
            LoadSoLancet.LIZJ("qmiVsyncHook");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("qmiVsyncHook");
            LoadSoLancet.LJ(jUptimeMillis, "qmiVsyncHook");
            LoadSoLancet.LIZLLL(jUptimeMillis, "qmiVsyncHook");
            LoadSoLancet.LIZIZ("qmiVsyncHook");
            LIZ = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean LIZ() {
        if (Build.VERSION.SDK_INT <= 30) {
            return true;
        }
        if (!LIZ) {
            return false;
        }
        try {
            searchEndMark();
            deOptimizeNative(Class.forName("android.view.Choreographer$FrameDisplayEventReceiver"), "onVsync", "(JJILandroid/view/DisplayEventReceiver$VsyncEventData;)V", false);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}

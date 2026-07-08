package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public class MaliMemOptimizer {
    public static volatile boolean hasEnableEglSetDamageRegionKHRErrorSkip;
    public static volatile boolean hasEnableMaliEGLErrorSkip;
    public static volatile boolean hasEnableMaliGLErrorRegionSpaceSkip;
    public static volatile boolean hasEnableMaliGLErrorSkip;
    public static volatile boolean hasSetTimeMillsDelayed;

    public static native void enable_egl_error_skip(boolean z);

    public static native void enable_egl_set_damage_region_khr_error_skip(boolean z);

    public static native void enable_gl_error_region_space_skip();

    public static native void enable_gl_error_skip(boolean z);

    public static native void set_time_mills_delayed(int i, int i2);

    public static synchronized void enableMaliGLErrorRegionSpaceSkip(Context context) {
        if (hasEnableMaliGLErrorRegionSpaceSkip) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                enable_gl_error_region_space_skip();
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        }
        hasEnableMaliGLErrorRegionSpaceSkip = true;
    }

    public static synchronized void enableEglSetDamageRegionKHRErrorSkip(Context context, boolean z) {
        if (hasEnableEglSetDamageRegionKHRErrorSkip) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                enable_egl_set_damage_region_khr_error_skip(z);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        }
        hasEnableEglSetDamageRegionKHRErrorSkip = true;
    }

    public static synchronized void enableMaliEGLErrorSkip(Context context, boolean z) {
        if (hasEnableMaliEGLErrorSkip) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                enable_egl_error_skip(z);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        }
        hasEnableMaliEGLErrorSkip = true;
    }

    public static synchronized void enableMaliGLErrorSkip(Context context, boolean z) {
        if (hasEnableMaliGLErrorSkip) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                enable_gl_error_skip(z);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        }
        hasEnableMaliGLErrorSkip = true;
    }

    public static synchronized void setTimeMillsDelayed(int i, int i2, Context context) {
        if (hasSetTimeMillsDelayed) {
            return;
        }
        ByteHook.init();
        SysOptimizer.loadOptimizerLibrary(context);
        set_time_mills_delayed(i, i2);
        hasSetTimeMillsDelayed = true;
    }
}

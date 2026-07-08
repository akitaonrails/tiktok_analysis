package com.bytedance.sysoptimizer.perflock;

import X.C1C7U;
import X.C2179971ATj;
import X.C786410Ut5;
import android.content.Context;
import android.os.Handler;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.sysoptimizer.perflock.FrameworkPerfLock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class PerfLockBooster {
    public static Handler sExecuteHandler = null;
    public static boolean sFixQualUnTrustedAppAccessIssue = false;
    public static float sGlobalBoostControlLevel = 1.0f;
    public static int sGlobalExtendBoostEnableLevel;
    public static FrameworkPerfLock.PerfLockImpl sPerfLockImpl;

    public static class DevBoostRunable implements Runnable {
        public Context mContext;
        public String mParaString;
        public int[] mParas;
        public int mRadix;
        public int mTimeout;

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("PerfLockBooster$DevBoostRunable@231c.run");
            com_bytedance_sysoptimizer_perflock_PerfLockBooster$DevBoostRunable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("PerfLockBooster$DevBoostRunable@231c.run");
        }

        public void com_bytedance_sysoptimizer_perflock_PerfLockBooster$DevBoostRunable__run$___twin___() {
            int i;
            int i2;
            if (this.mContext == null) {
                return;
            }
            String str = this.mParaString;
            if (str != null && (i2 = this.mRadix) != -1) {
                this.mParas = PerfLockBooster.parseStringToIntArrayByRadix(str, i2);
            }
            int[] iArr = this.mParas;
            if (iArr == null || iArr.length <= 0 || (i = this.mTimeout) == -1) {
                return;
            }
            int i3 = (int) (i * PerfLockBooster.sGlobalBoostControlLevel);
            if (SysOptimizer.loadOptimizerLibrary(this.mContext)) {
                ByteHook.init();
                try {
                    PerfLockBooster.boost_dev_with_params(this.mParas, i3);
                } catch (NoSuchMethodError e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (UnsatisfiedLinkError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }

        public DevBoostRunable() {
            this.mTimeout = -1;
            this.mRadix = -1;
        }

        public static void com_bytedance_sysoptimizer_perflock_PerfLockBooster$DevBoostRunable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(DevBoostRunable devBoostRunable) {
            try {
                devBoostRunable.com_bytedance_sysoptimizer_perflock_PerfLockBooster$DevBoostRunable__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public DevBoostRunable(Context context, int[] iArr, int i) {
            this.mRadix = -1;
            this.mContext = context;
            this.mParas = iArr;
            this.mTimeout = i;
        }

        public DevBoostRunable(Context context, String str, int i, int i2) {
            this.mContext = context;
            this.mParaString = str;
            this.mRadix = i;
            this.mTimeout = i2;
        }
    }

    public static class FrameworkBoostRunable implements Runnable {
        public Context mContext;
        public String mParaString;
        public int mTimeout;
        public int mType;

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("PerfLockBooster$FrameworkBoostRunable@9ce6.run");
            com_bytedance_sysoptimizer_perflock_PerfLockBooster$FrameworkBoostRunable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("PerfLockBooster$FrameworkBoostRunable@9ce6.run");
        }

        public void com_bytedance_sysoptimizer_perflock_PerfLockBooster$FrameworkBoostRunable__run$___twin___() {
            if (this.mContext == null) {
                return;
            }
            int i = (int) (this.mTimeout * PerfLockBooster.sGlobalBoostControlLevel);
            String str = this.mParaString;
            int[] stringToIntArrayByRadix = str != null ? PerfLockBooster.parseStringToIntArrayByRadix(str, 16) : null;
            FrameworkPerfLock.PerfLockImpl perfLockImpl = PerfLockBooster.sPerfLockImpl;
            if (perfLockImpl != null) {
                perfLockImpl.invokePerfBoost(stringToIntArrayByRadix, i);
                return;
            }
            FrameworkPerfLock.PerfLockImpl perfLockImplByType = FrameworkPerfLock.getPerfLockImplByType(this.mType);
            PerfLockBooster.sPerfLockImpl = perfLockImplByType;
            if (perfLockImplByType == null || !perfLockImplByType.preparePerfParas(this.mContext)) {
                return;
            }
            PerfLockBooster.sPerfLockImpl.setExtendBoostEnable(PerfLockBooster.sGlobalExtendBoostEnableLevel);
            PerfLockBooster.sPerfLockImpl.invokePerfBoost(stringToIntArrayByRadix, i);
        }

        public FrameworkBoostRunable() {
            this.mType = -1;
            this.mTimeout = -1;
        }

        public static void com_bytedance_sysoptimizer_perflock_PerfLockBooster$FrameworkBoostRunable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(FrameworkBoostRunable frameworkBoostRunable) {
            try {
                frameworkBoostRunable.com_bytedance_sysoptimizer_perflock_PerfLockBooster$FrameworkBoostRunable__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public FrameworkBoostRunable(Context context, int i, String str, int i2) {
            this.mContext = context;
            this.mType = i;
            this.mParaString = str;
            this.mTimeout = i2;
        }
    }

    public static native int boos_mtk_with_params_by_perfservice(int[] iArr, int i);

    public static native int boost_dev_with_params(int[] iArr, int i);

    public static native int boost_mtk_dev_with_params(int[] iArr, int i);

    public static native boolean is_mtk_perfd_valid();

    public static native boolean is_mtk_perfservice_valid();

    public static native boolean is_qti_perfd_valid();

    public static native void release_perflock_handle(int i);

    public static boolean isExtendBoostEnable() {
        return sGlobalExtendBoostEnableLevel > 0;
    }

    public static boolean isMTKPerdValid(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return is_mtk_perfd_valid();
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            }
        }
        return false;
    }

    public static boolean isMTKPerfServiceValid(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return is_mtk_perfservice_valid();
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            }
        }
        return false;
    }

    public static boolean isQtiPerdValid(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return is_qti_perfd_valid();
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            }
        }
        return false;
    }

    public static void setGlobalExtendBoostLevel(int i) {
        sGlobalExtendBoostEnableLevel = i;
    }

    public static void setPerlockExecuteHandler(Handler handler) {
        sExecuteHandler = handler;
    }

    public static void setsFixQualUnTrustedAppAccessIssue(boolean z) {
        sFixQualUnTrustedAppAccessIssue = z;
    }

    public static void setsGlobalBoostControlLevel(float f) {
        sGlobalBoostControlLevel = f;
    }

    public static int[] parseStringToIntArrayByRadix(String str, int i) {
        String[] strArrSplit = str.split(",");
        int[] iArr = new int[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                iArr[i2] = CastIntegerProtector.parseInt(strArrSplit[i2], i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return iArr;
    }

    public static void releasePerflockHandle(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                release_perflock_handle(i);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static boolean awareEvent(Context context, int i, int i2) {
        if (sGlobalBoostControlLevel == 0.0f) {
            return false;
        }
        int[] iArr = {i};
        FrameworkPerfLock.PerfLockImpl perfLockImpl = sPerfLockImpl;
        if (perfLockImpl != null) {
            return perfLockImpl.invokePerfBoost(iArr, i2);
        }
        FrameworkPerfLock.PerfLockImpl perfLockImplByType = FrameworkPerfLock.getPerfLockImplByType(4);
        sPerfLockImpl = perfLockImplByType;
        if (perfLockImplByType == null || !perfLockImplByType.preparePerfParas(context)) {
            return false;
        }
        return sPerfLockImpl.invokePerfBoost(iArr, i2);
    }

    public static int boostDevWithParams(Context context, int[] iArr, int i) {
        float f = sGlobalBoostControlLevel;
        if (f == 0.0f) {
            return -1;
        }
        Handler handler = sExecuteHandler;
        if (handler != null) {
            C786410Ut5.LJL(handler, new DevBoostRunable(context, iArr, i));
            return 0;
        }
        int i2 = (int) (i * f);
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return boost_dev_with_params(iArr, i2);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return 0;
    }

    public static int boostMTKByPerfservice(Context context, int[] iArr, int i) {
        float f = sGlobalBoostControlLevel;
        if (f == 0.0f) {
            return -1;
        }
        int i2 = (int) (i * f);
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return boos_mtk_with_params_by_perfservice(iArr, i2);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return 0;
            }
        }
        return 0;
    }

    public static int boostMTKDEVWithParams(Context context, int[] iArr, int i) {
        float f = sGlobalBoostControlLevel;
        if (f == 0.0f) {
            return -1;
        }
        int i2 = (int) (i * f);
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return boost_mtk_dev_with_params(iArr, i2);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return 0;
            }
        }
        return 0;
    }

    public static boolean boostByFrameworkPerfLock(Context context, int i, String str, int i2) {
        int[] stringToIntArrayByRadix;
        float f = sGlobalBoostControlLevel;
        if (f == 0.0f) {
            return false;
        }
        Handler handler = sExecuteHandler;
        if (handler != null) {
            C786410Ut5.LJL(handler, new FrameworkBoostRunable(context, i, str, i2));
            return true;
        }
        int i3 = (int) (i2 * f);
        if (str != null) {
            stringToIntArrayByRadix = parseStringToIntArrayByRadix(str, 16);
        } else {
            stringToIntArrayByRadix = null;
        }
        FrameworkPerfLock.PerfLockImpl perfLockImpl = sPerfLockImpl;
        if (perfLockImpl != null) {
            return perfLockImpl.invokePerfBoost(stringToIntArrayByRadix, i3);
        }
        FrameworkPerfLock.PerfLockImpl perfLockImplByType = FrameworkPerfLock.getPerfLockImplByType(i);
        sPerfLockImpl = perfLockImplByType;
        if (perfLockImplByType == null || !perfLockImplByType.preparePerfParas(context)) {
            return false;
        }
        sPerfLockImpl.setExtendBoostEnable(sGlobalExtendBoostEnableLevel);
        return sPerfLockImpl.invokePerfBoost(stringToIntArrayByRadix, i3);
    }

    public static int boostDevWithParamsString(Context context, String str, int i, int i2) {
        float f = sGlobalBoostControlLevel;
        if (f == 0.0f) {
            return -1;
        }
        Handler handler = sExecuteHandler;
        if (handler != null) {
            C786410Ut5.LJL(handler, new DevBoostRunable(context, str, i, i2));
            return 0;
        }
        int i3 = (int) (i2 * f);
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                int[] stringToIntArrayByRadix = parseStringToIntArrayByRadix(str, i);
                if (stringToIntArrayByRadix != null && stringToIntArrayByRadix.length > 0) {
                    return boost_dev_with_params(stringToIntArrayByRadix, i3);
                }
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return 0;
    }
}

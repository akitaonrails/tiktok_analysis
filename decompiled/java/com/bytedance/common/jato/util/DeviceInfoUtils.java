package com.bytedance.common.jato.util;

import X.C0VSJ;
import X.C2104908Ml;
import android.os.Build;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class DeviceInfoUtils {
    public static int LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static final String LIZLLL;

    public static boolean LIZJ() {
        try {
            String str = LIZLLL;
            if (str != null && str.length() >= 1) {
                return CastIntegerProtector.parseInt(String.valueOf(str.charAt(0))) >= 2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return true;
    }

    public static native int nGetArtApexVersion();

    public static native long nGetMemSize();

    public static int LIZ() {
        int i = LIZJ;
        if (i > 0) {
            return i;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31) {
            LIZJ = i2;
        } else {
            LIZJ = nGetArtApexVersion();
        }
        return LIZJ;
    }

    public static synchronized boolean LIZLLL() {
        int i = LIZIZ;
        if (i != -1) {
            return i > 0;
        }
        try {
            if (LIZIZ("ro.kernel.qemu").equals("1")) {
                LIZIZ = 1;
            } else {
                LIZIZ = 0;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ = 0;
        }
        return LIZIZ > 0;
    }

    public static synchronized boolean LJ() {
        int i = LIZ;
        if (i != -1) {
            return i > 0;
        }
        if (new C0VSJ("/system/lib/arm/nb/libc.so").exists()) {
            LIZ = 1;
        } else {
            LIZ = 0;
        }
        return LIZ > 0;
    }

    static {
        C2104908Ml.LIZIZ();
        LIZ = -1;
        LIZIZ = -1;
        LIZJ = -1;
        LIZLLL = System.getProperty("java.vm.version", "");
    }

    public static synchronized String LIZIZ(String str) {
        Class<?> cls;
        cls = Class.forName("android.os.SystemProperties");
        return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
    }
}

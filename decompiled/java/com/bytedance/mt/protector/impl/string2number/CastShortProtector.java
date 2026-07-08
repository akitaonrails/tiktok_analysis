package com.bytedance.mt.protector.impl.string2number;

import X.C08FJ;
import X.C09EU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class CastShortProtector extends C08FJ<Short> {
    public static short parseShort(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Short.parseShort(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Short sh = (Short) C08FJ.tryProtect(th, Short.class);
                if (sh != null) {
                    return sh.shortValue();
                }
                throw th;
            }
        }
        return Short.parseShort(str);
    }

    public static Short valueOf(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Short.valueOf(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Short sh = (Short) C08FJ.tryProtect(th, Short.class);
                if (sh != null) {
                    return sh;
                }
                throw th;
            }
        }
        return Short.valueOf(str);
    }

    public static short parseShort(String str, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return Short.parseShort(str, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Short sh = (Short) C08FJ.tryProtect(th, Short.class);
                if (sh != null) {
                    return sh.shortValue();
                }
                throw th;
            }
        }
        return Short.parseShort(str, i);
    }

    public static Short valueOf(String str, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return Short.valueOf(str, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Short sh = (Short) C08FJ.tryProtect(th, Short.class);
                if (sh != null) {
                    return sh;
                }
                throw th;
            }
        }
        return Short.valueOf(str, i);
    }
}

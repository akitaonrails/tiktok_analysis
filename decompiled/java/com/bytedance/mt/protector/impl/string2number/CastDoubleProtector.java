package com.bytedance.mt.protector.impl.string2number;

import X.C08FJ;
import X.C09EU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class CastDoubleProtector extends C08FJ<Double> {
    public static double parseDouble(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Double.parseDouble(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Double d = (Double) C08FJ.tryProtect(th, Double.class);
                if (d != null) {
                    return d.doubleValue();
                }
                throw th;
            }
        }
        return Double.parseDouble(str);
    }

    public static Double valueOf(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Double.valueOf(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Double d = (Double) C08FJ.tryProtect(th, Double.class);
                if (d != null) {
                    return d;
                }
                throw th;
            }
        }
        return Double.valueOf(str);
    }
}

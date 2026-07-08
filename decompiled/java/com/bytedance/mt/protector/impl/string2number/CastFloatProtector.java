package com.bytedance.mt.protector.impl.string2number;

import X.C08FJ;
import X.C09EU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class CastFloatProtector extends C08FJ<Float> {
    public static float parseFloat(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Float.parseFloat(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Float f = (Float) C08FJ.tryProtect(th, Float.class);
                if (f != null) {
                    return f.floatValue();
                }
                throw th;
            }
        }
        return Float.parseFloat(str);
    }

    public static Float valueOf(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Float.valueOf(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Float f = (Float) C08FJ.tryProtect(th, Float.class);
                if (f != null) {
                    return f;
                }
                throw th;
            }
        }
        return Float.valueOf(str);
    }
}

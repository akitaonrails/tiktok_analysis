package com.bytedance.mt.protector.impl.color;

import X.C08FG;
import X.C08FI;
import X.C09EU;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ColorProtector extends C08FI {
    public static int parseColor(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Color.parseColor(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Integer num = (Integer) C08FI.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        return Color.parseColor(str);
    }

    public static int HSVToColor(int i, float[] fArr) {
        if (C09EU.LIZIZ()) {
            try {
                return Color.HSVToColor(i, fArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Integer num = (Integer) C08FI.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        return Color.HSVToColor(i, fArr);
    }

    public static void RGBToHSV(int i, int i2, int i3, float[] fArr) {
        if (C09EU.LIZIZ()) {
            try {
                Color.RGBToHSV(i, i2, i3, fArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C09EU.LIZ(C08FG.CAST_COLOR, th) != null) {
                    return;
                } else {
                    throw th;
                }
            }
        }
        Color.RGBToHSV(i, i2, i3, fArr);
    }
}

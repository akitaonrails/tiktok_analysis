package com.ss.android.ugc.aweme.ecommercebase.promotion.data.style;

import X.C09CT;
import X.C960203pA;
import android.content.Context;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes33.dex */
public final class LabelColor {

    @C09CT("dark")
    public final String dark;

    @C09CT("light")
    public final String light;

    public final Integer LIZ() {
        return LIZJ(this.light);
    }

    public static Integer LIZJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public LabelColor(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public final Integer LIZIZ(Context context, boolean z) {
        if (z && C960203pA.LIZIZ(context)) {
            Integer numLIZJ = LIZJ(this.dark);
            if (numLIZJ == null) {
                return LIZJ(this.light);
            }
            return numLIZJ;
        }
        return LIZJ(this.light);
    }
}

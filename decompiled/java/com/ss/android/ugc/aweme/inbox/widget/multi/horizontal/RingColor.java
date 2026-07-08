package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C09CT;
import X.C960203pA;
import android.content.Context;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class RingColor implements Serializable {

    @C09CT("dark_color")
    public final String darkColor;

    @C09CT("light_color")
    public final String lightColor;

    public RingColor() {
        this(null, null);
    }

    public static Integer LIZ(String str) {
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

    public RingColor(String str, String str2) {
        this.lightColor = str;
        this.darkColor = str2;
    }

    public final Integer parseColor(Context context, boolean z) {
        if (z && C960203pA.LIZIZ(context)) {
            Integer numLIZ = LIZ(this.darkColor);
            if (numLIZ == null) {
                return LIZ(this.lightColor);
            }
            return numLIZ;
        }
        return LIZ(this.lightColor);
    }
}

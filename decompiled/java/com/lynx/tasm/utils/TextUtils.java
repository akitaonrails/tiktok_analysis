package com.lynx.tasm.utils;

import X.C1298840ju6;
import X.C1311130kDv;
import X.C1312920kGo;
import X.C1316710kMv;
import android.text.StaticLayout;
import com.lynx.react.bridge.JavaOnlyMap;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes21.dex */
public class TextUtils {
    public static double getTextWidth(String str, String str2, String str3) {
        if (!str.isEmpty() && !str2.isEmpty()) {
            DecimalFormat decimalFormat = C1316710kMv.LIZ;
            if (C1312920kGo.LIZ(str2, C1311130kDv.LIZIZ(14.0f, 0.0f)) > 0.0f) {
                return C1311130kDv.LIZJ(C1316710kMv.LJIIJ(r1, str3).measureText(str));
            }
            return 0.0d;
        }
        return 0.0d;
    }

    public static String getFirstLineText(String str, String str2, String str3, String str4) {
        float fLIZ;
        if (!str.isEmpty() && !str2.isEmpty()) {
            DecimalFormat decimalFormat = C1316710kMv.LIZ;
            float fLIZ2 = C1312920kGo.LIZ(str2, C1311130kDv.LIZIZ(14.0f, 0.0f));
            if (android.text.TextUtils.isEmpty(str4)) {
                fLIZ = 0.0f;
            } else {
                fLIZ = C1312920kGo.LIZ(str4, C1311130kDv.LIZIZ(0.0f, 0.0f));
            }
            if (fLIZ2 > 0.0f && fLIZ >= 1.0f) {
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(str, 0, str.length(), C1316710kMv.LJIIJ(fLIZ2, str3), (int) Math.floor(fLIZ));
                builderObtain.setMaxLines(1);
                StaticLayout staticLayoutBuild = builderObtain.build();
                if (staticLayoutBuild.getLineCount() > 0) {
                    return str.substring(staticLayoutBuild.getLineStart(0), staticLayoutBuild.getLineEnd(0));
                }
                return "";
            }
            return "";
        }
        return "";
    }

    public static ByteBuffer getTextInfo(String str, String str2, String str3, String str4, int i) {
        JavaOnlyMap javaOnlyMapLJIIIIZZ = C1316710kMv.LJIIIIZZ(i, str, str2, str3, str4);
        C1298840ju6.LIZ.getClass();
        return C1298840ju6.LIZIZ(javaOnlyMapLJIIIIZZ);
    }
}

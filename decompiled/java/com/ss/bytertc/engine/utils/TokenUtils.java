package com.ss.bytertc.engine.utils;

import X.C2188811AlT;
import X.C786410Ut5;
import android.util.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class TokenUtils {
    public static String buildToken(String str, String str2, String str3, String str4) {
        if (str != null && !str.isEmpty()) {
            if (!str.contains("Basic")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Bearer ");
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Basic ");
        sbLIZ2.append(Base64.encodeToString(C786410Ut5.j4("%s:%s:%s", new Object[]{str2, str3, str4}).getBytes(), 2));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}

package com.facebook.soloader;

import X.C2188811AlT;
import android.os.Trace;

/* JADX INFO: loaded from: classes4.dex */
public class Api18TraceUtils {
    public static void LIZ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        sbLIZ.append(str3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(str2.substring(0, length));
            sbLIZ2.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        Trace.beginSection(strLIZIZ);
    }
}

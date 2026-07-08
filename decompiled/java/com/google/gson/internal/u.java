package com.google.gson.internal;

import X.C2188811AlT;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class u {
    public static DateFormat LIZ(int i, int i2) {
        String str;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "M/d/yy";
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Unknown DateFormat style: ");
                        sbLIZ2.append(i);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else {
                    str = "MMM d, yyyy";
                }
            } else {
                str = "MMMM d, yyyy";
            }
        } else {
            str = "EEEE, MMMM d, yyyy";
        }
        sbLIZ.append(str);
        sbLIZ.append(" ");
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str2 = "h:mm a";
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Unknown DateFormat style: ");
                    sbLIZ3.append(i2);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            } else {
                str2 = "h:mm:ss a";
            }
        } else {
            str2 = "h:mm:ss a z";
        }
        sbLIZ.append(str2);
        return new SimpleDateFormat(C2188811AlT.LIZIZ(sbLIZ), Locale.US);
    }
}

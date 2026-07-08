package com.google.gson.internal;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class p {
    public static final int LIZ;

    static {
        int i;
        String[] strArrSplit;
        String property = System.getProperty("java.version");
        try {
            strArrSplit = property.split("[._]");
            i = Integer.parseInt(strArrSplit[0]);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i == 1) {
            if (strArrSplit.length > 1) {
                i = Integer.parseInt(strArrSplit[1]);
            }
            LIZ = i;
        }
        if (i == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < property.length(); i2++) {
                    char cCharAt = property.charAt(i2);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb.append(cCharAt);
                }
                i = Integer.parseInt(sb.toString());
            } catch (NumberFormatException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (i == -1) {
            i = 6;
        }
        LIZ = i;
    }
}

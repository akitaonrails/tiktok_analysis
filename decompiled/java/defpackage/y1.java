package defpackage;

import X.C2188811AlT;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(long j, long j2, String str) {
        String string = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        if ('0' == string.charAt(string.length() - 1)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string.substring(0, string.length() - 2));
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(string);
        sbLIZ2.append(str);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}

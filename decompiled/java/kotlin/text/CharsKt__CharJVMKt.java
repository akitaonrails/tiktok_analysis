package kotlin.text;

import X.C2188811AlT;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public class CharsKt__CharJVMKt {
    public static int checkRadix(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("radix ");
        sbLIZ.append(i);
        sbLIZ.append(" was not in valid range ");
        sbLIZ.append(new IntRange(2, 36));
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}

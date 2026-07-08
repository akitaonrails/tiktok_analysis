package ms.bd.o;

import X.C2188811AlT;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class t extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    public t(String str, String[] strArr, String[] strArr2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Could not find '");
        sbLIZ.append(str);
        sbLIZ.append("'. Looked for: ");
        sbLIZ.append(Arrays.toString(strArr));
        sbLIZ.append(", but only found: ");
        sbLIZ.append(Arrays.toString(strArr2));
        sbLIZ.append(ttpobfuscated.e3.d);
        super(C2188811AlT.LIZIZ(sbLIZ));
    }
}

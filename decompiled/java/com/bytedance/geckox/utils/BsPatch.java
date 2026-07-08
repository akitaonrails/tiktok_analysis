package com.bytedance.geckox.utils;

import X.C0VSJ;
import X.C0X9F;
import X.C2188811AlT;
import X.C2222108nD;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes4.dex */
public class BsPatch {
    public static native int patch(String str, String str2, String str3);

    static {
        C2222108nD.LIZ("geckox_bspatch");
    }

    public static void LIZ(File file, File file2, File file3, String str) throws FileNotFoundException {
        if (file.exists()) {
            if (file2.exists()) {
                C0X9F.LIZLLL(file3);
                C0VSJ c0vsj = new C0VSJ(file3, str);
                c0vsj.delete();
                int iPatch = patch(file.getAbsolutePath(), c0vsj.getAbsolutePath(), file2.getAbsolutePath());
                if (iPatch == 0) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("patch merged failed, code：");
                sbLIZ.append(iPatch);
                sbLIZ.append(" full:");
                sbLIZ.append(file.getAbsolutePath());
                sbLIZ.append(" patch:");
                sbLIZ.append(file2.getAbsolutePath());
                sbLIZ.append(" dest:");
                sbLIZ.append(c0vsj.getAbsolutePath());
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("patch package not exist：");
            sbLIZ2.append(file2.getAbsolutePath());
            throw new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("full package not exist：");
        sbLIZ3.append(file.getAbsolutePath());
        throw new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ3));
    }
}

package com.ss.android.ugc.aweme.utils;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2188811AlT;
import X.C2333809Cm;
import com.google.gson.TypeAdapter;
import com.google.gson.s;

/* JADX INFO: loaded from: classes4.dex */
public class ReplaceLineEndAdapter extends TypeAdapter<String> {
    @Override // com.google.gson.TypeAdapter
    public final String read(C09CU c09cu) {
        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
        int i = C2333809Cm.LIZ[c09d6LJJLIIIJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                String strLJJJZ = c09cu.LJJJZ();
                if (strLJJJZ.contains("\r\n")) {
                    return strLJJJZ.replaceAll("\r\n", "\n");
                }
                return strLJJJZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("expect STRING, but got ");
            sbLIZ.append(c09d6LJJLIIIJ.name());
            sbLIZ.append(" at ");
            sbLIZ.append(c09cu.LJIILLIIL());
            throw new s(C2188811AlT.LIZIZ(sbLIZ));
        }
        c09cu.LJJJJJL();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, String str) {
        c09dl.LJJJJJ(str);
    }
}

package com.bytedance.live.render.utils;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2188811AlT;
import X.C2334209Cq;
import com.google.gson.TypeAdapter;
import com.google.gson.o;

/* JADX INFO: loaded from: classes4.dex */
public class BooleanTypeAdapter extends TypeAdapter<Boolean> {
    @Override // com.google.gson.TypeAdapter
    public final Boolean read(C09CU c09cu) {
        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
        int i = C2334209Cq.LIZ[c09d6LJJLIIIJ.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (c09cu.LJJIZ() == 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected BOOLEAN or NUMBER but was ");
                sbLIZ.append(c09d6LJJLIIIJ);
                throw new o(C2188811AlT.LIZIZ(sbLIZ));
            }
            c09cu.LJJJJJL();
            return null;
        }
        return Boolean.valueOf(c09cu.LJJ());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LJJJ(bool2);
        }
    }
}

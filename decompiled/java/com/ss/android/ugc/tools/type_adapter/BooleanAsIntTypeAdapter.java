package com.ss.android.ugc.tools.type_adapter;

import X.C09C5;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.TypeAdapter;
import com.google.gson.s;

/* JADX INFO: loaded from: classes4.dex */
public final class BooleanAsIntTypeAdapter extends TypeAdapter<Integer> {
    @Override // com.google.gson.TypeAdapter
    public final Integer read(C09CU c09cu) {
        int i;
        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
        if (c09d6LJJLIIIJ == null) {
            i = -1;
        } else {
            i = C09C5.LIZ[c09d6LJJLIIIJ.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (Boolean.parseBoolean(c09cu.LJJJZ())) {
                            return 1;
                        }
                        return 0;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expected BOOLEAN or NUMBER but was ");
                    sbLIZ.append(c09d6LJJLIIIJ);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                try {
                    try {
                        return Integer.valueOf(c09cu.LJJIZ());
                    } catch (NumberFormatException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        throw new s(e);
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                }
            } else {
                c09cu.LJJJJJL();
                return null;
            }
        } else {
            if (c09cu.LJJ()) {
                return 1;
            }
            return 0;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Integer num) {
        Integer num2 = num;
        if (num2 == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LJJJJ(num2);
        }
    }
}

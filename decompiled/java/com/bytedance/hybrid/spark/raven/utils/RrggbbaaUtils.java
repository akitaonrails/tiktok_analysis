package com.bytedance.hybrid.spark.raven.utils;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2095008Iq;
import X.C2332409By;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class RrggbbaaUtils extends TypeAdapter<Integer> {
    @Override // com.google.gson.TypeAdapter
    public final Integer read(C09CU c09cu) throws IOException {
        int i;
        int iLJJIZ;
        String string;
        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
        if (c09d6LJJLIIIJ == null) {
            i = -1;
        } else {
            i = C2332409By.LIZ[c09d6LJJLIIIJ.ordinal()];
        }
        if (i != 1) {
            iLJJIZ = 0;
            if (i != 2) {
                if (i != 3) {
                    c09cu.LJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                String strLJJJZ = c09cu.LJJJZ();
                if (strLJJJZ != null && (string = a0.LJLIIIL(strLJJJZ).toString()) != null) {
                    if (u.LJJIIJZLJL(string, "#", false)) {
                        string = string.substring(1);
                    }
                    int length = string.length();
                    if (length != 6) {
                        if (length == 8) {
                            Long lLJIIL = C2095008Iq.LJIIL(16, string);
                            if (lLJIIL != null) {
                                long jLongValue = lLJIIL.longValue();
                                iLJJIZ = (((int) (255 & jLongValue)) << 24) | (((int) (jLongValue >>> 8)) & 16777215);
                            } else {
                                return 0;
                            }
                        }
                    } else {
                        Integer numLJIIJ = C2095008Iq.LJIIJ(16, string);
                        if (numLJIIJ != null) {
                            iLJJIZ = numLJIIJ.intValue();
                        }
                    }
                } else {
                    return 0;
                }
            }
        } else {
            iLJJIZ = c09cu.LJJIZ();
        }
        return Integer.valueOf(iLJJIZ);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Integer num) {
        Integer num2 = num;
        if (num2 != null) {
            c09dl.LJJJJ(num2);
        } else {
            c09dl.LJIJJ();
        }
    }
}

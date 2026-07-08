package com.ss.android.ugc.aweme.utils;

import X.C09C2;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2095008Iq;
import X.C2332609Ca;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class IntKeyMapAdapter extends TypeAdapter<Object> {
    public final TypeAdapter<Object> LIZ = C09C2.LIZ().LJIIJ(Object.class);

    @Override // com.google.gson.TypeAdapter
    public final Object read(C09CU c09cu) {
        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
        if (c09d6LJJLIIIJ != null) {
            int i = C2332609Ca.LIZ[c09d6LJJLIIIJ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String strLJJJZ = c09cu.LJJJZ();
                        if (!a0.LJJIJ(strLJJJZ, '.') && !a0.LJJIJ(strLJJJZ, 'e') && !a0.LJJIJ(strLJJJZ, 'E')) {
                            long j = CastLongProtector.parseLong(strLJJJZ);
                            if (-2147483648L <= j && j <= 2147483647L) {
                                return Integer.valueOf((int) j);
                            }
                            return Long.valueOf(j);
                        }
                        return Double.valueOf(CastDoubleProtector.parseDouble(strLJJJZ));
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    c09cu.LIZ();
                    while (c09cu.LJIIZILJ()) {
                        Object obj = read(c09cu);
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                    }
                    c09cu.LJI();
                    return arrayList;
                }
            } else {
                HashMap map = new HashMap();
                c09cu.LIZIZ();
                while (c09cu.LJIIZILJ()) {
                    String strLJJJJ = c09cu.LJJJJ();
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(strLJJJJ);
                    Object obj2 = strLJJJJ;
                    if (numLJIIJJI != null) {
                        obj2 = numLJIIJJI;
                    }
                    Object obj3 = read(c09cu);
                    if (obj3 != null) {
                        map.put(obj2, obj3);
                    }
                }
                c09cu.LJII();
                return map;
            }
        }
        return this.LIZ.read(c09cu);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Object obj) {
        this.LIZ.write(c09dl, obj);
    }
}

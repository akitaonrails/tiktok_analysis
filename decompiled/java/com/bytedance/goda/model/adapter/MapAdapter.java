package com.bytedance.goda.model.adapter;

import X.C051O;
import X.C09CU;
import X.C09D6;
import X.C09DD;
import X.C09DL;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class MapAdapter extends TypeAdapter<Object> {
    public final TypeAdapter<Object> LIZ;

    public MapAdapter() {
        Gson gson = C051O.LIZ;
        this.LIZ = C051O.LIZ.LJIIJ(Object.class);
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(C09CU c09cu) {
        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
        if (c09d6LJJLIIIJ != null) {
            int i = C09DD.LIZ[c09d6LJJLIIIJ.ordinal()];
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
                    Object obj2 = read(c09cu);
                    if (obj2 != null) {
                        map.put(strLJJJJ, obj2);
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

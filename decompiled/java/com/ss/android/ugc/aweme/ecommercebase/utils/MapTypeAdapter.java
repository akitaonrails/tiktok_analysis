package com.ss.android.ugc.aweme.ecommercebase.utils;

import X.C08JS;
import X.C09CL;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2188811AlT;
import X.C2341109Fh;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class MapTypeAdapter extends TypeAdapter<Object> {
    public final TypeAdapter<Object> LIZ = C08JS.LIZIZ().LJIIJ(Object.class);

    @Override // com.google.gson.TypeAdapter
    public final Object read(C09CU c09cu) {
        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
        if (c09d6LJJLIIIJ != null) {
            int i = C09CL.LIZ[c09d6LJJLIIIJ.ordinal()];
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
                        } else {
                            C2341109Fh.LIZ.getClass();
                            C2341109Fh.LIZJ("array element should not be null");
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
                    } else {
                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('\"');
                        sbLIZ.append(strLJJJJ);
                        sbLIZ.append("\" should not be null");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c2341109Fh.getClass();
                        C2341109Fh.LIZJ(strLIZIZ);
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

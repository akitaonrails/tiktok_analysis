package com.bytedance.goda.v2.model.adapter;

import X.C04D2;
import X.C04DJ;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C09FK;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS88S1000000_3;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class MapAnyAdapter extends TypeAdapter<Object> {
    public final TypeAdapter<Object> LIZ;

    public MapAnyAdapter() {
        Gson gson = C04DJ.LIZ;
        this.LIZ = C04DJ.LIZ.LJIIJ(Object.class);
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(C09CU c09cu) {
        int i;
        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
        if (c09d6LJJLIIIJ == null) {
            i = -1;
        } else {
            i = C09FK.LIZ[c09d6LJJLIIIJ.ordinal()];
        }
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    try {
                        return this.LIZ.read(c09cu);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C04D2.LIZ(e);
                        return Unit.LIZ;
                    }
                }
                try {
                    String strLJJJZ = c09cu.LJJJZ();
                    if (!a0.LJJIJ(strLJJJZ, '.') && !a0.LJJIJ(strLJJJZ, 'e') && !a0.LJJIJ(strLJJJZ, 'E')) {
                        long j = CastLongProtector.parseLong(strLJJJZ);
                        if (-2147483648L > j || j > 2147483647L) {
                            z = false;
                        }
                        if (z) {
                            return Integer.valueOf((int) j);
                        }
                        return Long.valueOf(j);
                    }
                    return Double.valueOf(CastDoubleProtector.parseDouble(strLJJJZ));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C04D2.LIZ(e2);
                    return Unit.LIZ;
                }
            }
            try {
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
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C04D2.LIZ(e3);
                return Unit.LIZ;
            }
        }
        try {
            HashMap map = new HashMap();
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                Object obj2 = read(c09cu);
                if (obj2 != null) {
                    map.put(strLJJJJ, obj2);
                } else {
                    new AwS88S1000000_3(strLJJJJ, 0);
                }
            }
            c09cu.LJII();
            return map;
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            C04D2.LIZ(e4);
            return Unit.LIZ;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Object obj) {
        try {
            this.LIZ.write(c09dl, obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C04D2.LIZ(e);
        }
    }
}

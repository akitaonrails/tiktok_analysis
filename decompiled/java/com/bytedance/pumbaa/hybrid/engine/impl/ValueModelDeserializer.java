package com.bytedance.pumbaa.hybrid.engine.impl;

import X.C15438062q;
import X.C822370WNv;
import X.C822380WNw;
import X.EnumC822390WNx;
import com.bytedance.pumbaa.hybrid.engine.api.model.ValueModel;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class ValueModelDeserializer implements j<ValueModel> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.google.gson.j
    public final ValueModel deserialize(k kVar, Type type, i iVar) {
        String strLJIL;
        Number numberLJIJ;
        h hVar;
        k kVarLJJIIZ;
        String strLJIL2;
        n nVarLJIILIIL = kVar.LJIILIIL();
        C822380WNw c822380WNw = EnumC822390WNx.Companion;
        k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("type");
        Object objValueOf = 0;
        objValueOf = 0;
        objValueOf = 0;
        objValueOf = 0;
        objValueOf = 0;
        objValueOf = 0;
        objValueOf = 0;
        if (kVarLJJIIZ2 != null) {
            strLJIL = kVarLJJIIZ2.LJIL();
        } else {
            strLJIL = null;
        }
        String str = "";
        if (strLJIL == null) {
            strLJIL = "";
        }
        c822380WNw.getClass();
        EnumC822390WNx enumC822390WNxLIZ = C822380WNw.LIZ(strLJIL);
        k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("sub_type");
        if (kVarLJJIIZ3 != null && (strLJIL2 = kVarLJJIIZ3.LJIL()) != null) {
            str = strLJIL2;
        }
        EnumC822390WNx enumC822390WNxLIZ2 = C822380WNw.LIZ(str);
        int[] iArr = C822370WNv.LIZ;
        int i = iArr[enumC822390WNxLIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5 && (kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("value")) != null) {
                            objValueOf = kVarLJJIIZ.LJIL();
                        }
                    } else {
                        k kVarLJJIIZ4 = nVarLJIILIIL.LJJIIZ("value");
                        if (kVarLJJIIZ4 != null) {
                            objValueOf = Boolean.valueOf(kVarLJJIIZ4.LJ());
                        }
                    }
                } else {
                    k kVarLJJIIZ5 = nVarLJIILIIL.LJJIIZ("value");
                    if (kVarLJJIIZ5 == null || (hVar = kVarLJJIIZ5.LJIIL()) == null) {
                        hVar = new h();
                    }
                    int i2 = iArr[enumC822390WNxLIZ2.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (iVar != null) {
                                objValueOf = ((TreeTypeAdapter.a) iVar).LIZ(hVar, List.class);
                            }
                        } else {
                            objValueOf = new ArrayList(C15438062q.LJIJJ(hVar, 10));
                            Iterator<k> it2 = hVar.iterator();
                            while (it2.hasNext()) {
                                objValueOf.add(it2.next().LJIL());
                            }
                        }
                    } else {
                        objValueOf = new ArrayList(C15438062q.LJIJJ(hVar, 10));
                        Iterator<k> it3 = hVar.iterator();
                        while (it3.hasNext()) {
                            objValueOf.add(Integer.valueOf(it3.next().LJIJ().intValue()));
                        }
                    }
                }
            } else {
                k kVarLJJIIZ6 = nVarLJIILIIL.LJJIIZ("value");
                if (kVarLJJIIZ6 != null) {
                    objValueOf = kVarLJJIIZ6.LJIL();
                }
            }
        } else {
            k kVarLJJIIZ7 = nVarLJIILIIL.LJJIIZ("value");
            if (kVarLJJIIZ7 != null && (numberLJIJ = kVarLJJIIZ7.LJIJ()) != null) {
                objValueOf = Integer.valueOf(numberLJIJ.intValue());
            }
        }
        return new ValueModel(enumC822390WNxLIZ, objValueOf, enumC822390WNxLIZ2);
    }
}

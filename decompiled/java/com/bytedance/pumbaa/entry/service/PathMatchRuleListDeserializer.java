package com.bytedance.pumbaa.entry.service;

import X.C13BV;
import X.C1885207Zy;
import X.C2188811AlT;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PathMatchRuleListDeserializer implements j<List<? extends PathMatchRule>> {
    @Override // com.google.gson.j
    public final List<? extends PathMatchRule> deserialize(k kVar, Type type, i iVar) {
        if (!(kVar instanceof m) && (kVar instanceof h)) {
            h hVarLJIIL = kVar.LJIIL();
            ArrayList arrayList = new ArrayList(hVarLJIIL.size());
            for (k kVar2 : hVarLJIIL) {
                kVar2.getClass();
                if (!(kVar2 instanceof m)) {
                    if ((kVar2 instanceof q) && (kVar2.LJIILJJIL().LL instanceof String)) {
                        arrayList.add(C1885207Zy.LIZ(kVar2.LJIL()));
                    } else if (kVar2 instanceof n) {
                        arrayList.add(((TreeTypeAdapter.a) iVar).LIZ(kVar2.LJIILIIL(), PathMatchRule.class));
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("path/domain rule list item must be string or object: ");
                        sbLIZ.append(kVar2);
                        throw new o(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}

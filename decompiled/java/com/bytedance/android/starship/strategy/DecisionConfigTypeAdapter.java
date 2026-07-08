package com.bytedance.android.starship.strategy;

import X.C1308170k99;
import X.EnumC1308150k97;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public final class DecisionConfigTypeAdapter implements r<EnumC1308150k97>, j<EnumC1308150k97> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        Integer value;
        EnumC1308150k97 enumC1308150k97 = (EnumC1308150k97) obj;
        if (enumC1308150k97 != null) {
            value = enumC1308150k97.getValue();
        } else {
            value = null;
        }
        return new q((Number) value);
    }

    @Override // com.google.gson.j
    public final /* bridge */ /* synthetic */ EnumC1308150k97 deserialize(k kVar, Type type, i iVar) {
        int iLJIIJJI;
        C1308170k99 c1308170k99 = EnumC1308150k97.Companion;
        if (kVar != null) {
            iLJIIJJI = kVar.LJIIJJI();
        } else {
            iLJIIJJI = 0;
        }
        c1308170k99.getClass();
        EnumC1308150k97 enumC1308150k97 = EnumC1308150k97.valueMap.get(Integer.valueOf(iLJIIJJI));
        if (enumC1308150k97 == null) {
            return EnumC1308150k97.UNKNOWN;
        }
        return enumC1308150k97;
    }
}

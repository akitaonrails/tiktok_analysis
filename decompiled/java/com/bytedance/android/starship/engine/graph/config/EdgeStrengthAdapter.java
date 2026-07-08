package com.bytedance.android.starship.engine.graph.config;

import X.C13LQ;
import X.EnumC1308140k96;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public final class EdgeStrengthAdapter implements r<EnumC1308140k96>, j<EnumC1308140k96> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        Integer numValueOf;
        EnumC1308140k96 enumC1308140k96 = (EnumC1308140k96) obj;
        if (enumC1308140k96 != null) {
            numValueOf = Integer.valueOf(enumC1308140k96.ordinal());
        } else {
            numValueOf = null;
        }
        return new q((Number) numValueOf);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0k96, java.lang.Object] */
    @Override // com.google.gson.j
    public final EnumC1308140k96 deserialize(k kVar, Type type, i iVar) {
        ?? LJJIIZ = C13LQ.LJJIIZ(kVar.LJIIJJI(), EnumC1308140k96.values());
        if (LJJIIZ == 0) {
            return EnumC1308140k96.STRONG;
        }
        return LJJIIZ;
    }
}

package com.bytedance.android.starship.engine.graph.config;

import X.C13LQ;
import X.EnumC1307400k7u;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public final class NodeTypeAdapter implements r<EnumC1307400k7u>, j<EnumC1307400k7u> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        Integer numValueOf;
        EnumC1307400k7u enumC1307400k7u = (EnumC1307400k7u) obj;
        if (enumC1307400k7u != null) {
            numValueOf = Integer.valueOf(enumC1307400k7u.ordinal());
        } else {
            numValueOf = null;
        }
        return new q((Number) numValueOf);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0k7u, java.lang.Object] */
    @Override // com.google.gson.j
    public final EnumC1307400k7u deserialize(k kVar, Type type, i iVar) {
        ?? LJJIIZ = C13LQ.LJJIIZ(kVar.LJIIJJI(), EnumC1307400k7u.values());
        if (LJJIIZ == 0) {
            return EnumC1307400k7u.UNKNOWN;
        }
        return LJJIIZ;
    }
}

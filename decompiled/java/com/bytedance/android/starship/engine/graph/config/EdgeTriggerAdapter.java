package com.bytedance.android.starship.engine.graph.config;

import X.C13LQ;
import X.EnumC1307550k89;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public final class EdgeTriggerAdapter implements r<EnumC1307550k89>, j<EnumC1307550k89> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        Integer numValueOf;
        EnumC1307550k89 enumC1307550k89 = (EnumC1307550k89) obj;
        if (enumC1307550k89 != null) {
            numValueOf = Integer.valueOf(enumC1307550k89.ordinal());
        } else {
            numValueOf = null;
        }
        return new q((Number) numValueOf);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0k89, java.lang.Object] */
    @Override // com.google.gson.j
    public final EnumC1307550k89 deserialize(k kVar, Type type, i iVar) {
        ?? LJJIIZ = C13LQ.LJJIIZ(kVar.LJIIJJI(), EnumC1307550k89.values());
        if (LJJIIZ == 0) {
            return EnumC1307550k89.PROACTIVE;
        }
        return LJJIIZ;
    }
}

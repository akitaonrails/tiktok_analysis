package com.bytedance.android.starship.engine.graph.config;

import X.C13LQ;
import X.EnumC587600N2w;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes14.dex */
public final class CloudDecisionSourceAdapter implements r<EnumC587600N2w>, j<EnumC587600N2w> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        Integer numValueOf;
        EnumC587600N2w enumC587600N2w = (EnumC587600N2w) obj;
        if (enumC587600N2w != null) {
            numValueOf = Integer.valueOf(enumC587600N2w.ordinal());
        } else {
            numValueOf = null;
        }
        return new q((Number) numValueOf);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0N2w, java.lang.Object] */
    @Override // com.google.gson.j
    public final EnumC587600N2w deserialize(k kVar, Type type, i iVar) {
        ?? LJJIIZ = C13LQ.LJJIIZ(kVar.LJIIJJI(), EnumC587600N2w.values());
        if (LJJIIZ == 0) {
            return EnumC587600N2w.DEFAULT;
        }
        return LJJIIZ;
    }
}

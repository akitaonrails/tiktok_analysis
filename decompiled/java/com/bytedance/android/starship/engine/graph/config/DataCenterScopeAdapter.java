package com.bytedance.android.starship.engine.graph.config;

import X.C13LQ;
import X.EnumC1307710k8P;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public final class DataCenterScopeAdapter implements r<EnumC1307710k8P>, j<EnumC1307710k8P> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        Integer numValueOf;
        EnumC1307710k8P enumC1307710k8P = (EnumC1307710k8P) obj;
        if (enumC1307710k8P != null) {
            numValueOf = Integer.valueOf(enumC1307710k8P.ordinal());
        } else {
            numValueOf = null;
        }
        return new q((Number) numValueOf);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0k8P, java.lang.Object] */
    @Override // com.google.gson.j
    public final EnumC1307710k8P deserialize(k kVar, Type type, i iVar) {
        ?? LJJIIZ = C13LQ.LJJIIZ(kVar.LJIIJJI(), EnumC1307710k8P.values());
        if (LJJIIZ == 0) {
            return EnumC1307710k8P.UNKNOWN;
        }
        return LJJIIZ;
    }
}

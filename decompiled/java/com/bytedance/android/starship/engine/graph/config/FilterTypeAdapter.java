package com.bytedance.android.starship.engine.graph.config;

import X.C13LQ;
import X.EnumC1308000k8s;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public final class FilterTypeAdapter implements r<EnumC1308000k8s>, j<EnumC1308000k8s> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        Integer numValueOf;
        EnumC1308000k8s enumC1308000k8s = (EnumC1308000k8s) obj;
        if (enumC1308000k8s != null) {
            numValueOf = Integer.valueOf(enumC1308000k8s.ordinal());
        } else {
            numValueOf = null;
        }
        return new q((Number) numValueOf);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0k8s, java.lang.Object] */
    @Override // com.google.gson.j
    public final EnumC1308000k8s deserialize(k kVar, Type type, i iVar) {
        ?? LJJIIZ = C13LQ.LJJIIZ(kVar.LJIIJJI(), EnumC1308000k8s.values());
        if (LJJIIZ == 0) {
            return EnumC1308000k8s.NONE;
        }
        return LJJIIZ;
    }
}

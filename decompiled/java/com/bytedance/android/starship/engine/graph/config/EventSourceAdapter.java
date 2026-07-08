package com.bytedance.android.starship.engine.graph.config;

import X.C13LQ;
import X.EnumC1308010k8t;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public final class EventSourceAdapter implements r<EnumC1308010k8t>, j<EnumC1308010k8t> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        Integer numValueOf;
        EnumC1308010k8t enumC1308010k8t = (EnumC1308010k8t) obj;
        if (enumC1308010k8t != null) {
            numValueOf = Integer.valueOf(enumC1308010k8t.ordinal());
        } else {
            numValueOf = null;
        }
        return new q((Number) numValueOf);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0k8t, java.lang.Object] */
    @Override // com.google.gson.j
    public final EnumC1308010k8t deserialize(k kVar, Type type, i iVar) {
        ?? LJJIIZ = C13LQ.LJJIIZ(kVar.LJIIJJI(), EnumC1308010k8t.values());
        if (LJJIIZ == 0) {
            return EnumC1308010k8t.CUSTOM;
        }
        return LJJIIZ;
    }
}

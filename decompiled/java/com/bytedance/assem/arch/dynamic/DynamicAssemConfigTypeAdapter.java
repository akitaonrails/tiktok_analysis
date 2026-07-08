package com.bytedance.assem.arch.dynamic;

import X.C13IQ;
import X.C13LE;
import X.C2097608Jq;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class DynamicAssemConfigTypeAdapter implements r<C13IQ<? extends DynamicAssem>>, j<C13IQ<? extends DynamicAssem>> {
    public static final Map<String, C13IQ<? extends DynamicAssem>> LIZ = C2097608Jq.LJIIJ(new Pair("com.bytedance.assem.arch.dynamic.DynamicAssem", C13LE.LIZ(DynamicAssem.class)));

    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        return new q(((C13IQ) obj).LIZLLL());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.13IQ<? extends com.bytedance.assem.arch.dynamic.DynamicAssem>, java.lang.Object] */
    @Override // com.google.gson.j
    public final C13IQ<? extends DynamicAssem> deserialize(k kVar, Type type, i iVar) {
        return ((LinkedHashMap) LIZ).get(kVar.LJIL());
    }
}

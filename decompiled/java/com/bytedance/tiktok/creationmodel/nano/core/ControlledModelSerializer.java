package com.bytedance.tiktok.creationmodel.nano.core;

import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.k;
import com.google.gson.r;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes35.dex */
public final class ControlledModelSerializer implements r<Controlled<?, ?>> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        return aVar.LIZIZ(((Controlled) obj)._value);
    }
}

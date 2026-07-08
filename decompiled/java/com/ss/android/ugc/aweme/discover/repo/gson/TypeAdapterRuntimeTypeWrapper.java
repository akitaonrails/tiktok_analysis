package com.ss.android.ugc.aweme.discover.repo.gson;

import X.C09CU;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes4.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {
    public final Gson LIZ;
    public final TypeAdapter<T> LIZIZ;
    public final Type LIZJ;

    @Override // com.google.gson.TypeAdapter
    public final T read(C09CU c09cu) {
        return this.LIZIZ.read(c09cu);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, T t) {
        TypeAdapter typeAdapterLJIIIZ = this.LIZIZ;
        Type type = this.LIZJ;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.LIZJ) {
            typeAdapterLJIIIZ = this.LIZ.LJIIIZ(TypeToken.get(type));
            if (typeAdapterLJIIIZ instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter typeAdapter = this.LIZIZ;
                if (!(typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapterLJIIIZ = typeAdapter;
                }
            }
        }
        typeAdapterLJIIIZ.write(c09dl, t);
    }

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.LIZ = gson;
        this.LIZIZ = typeAdapter;
        this.LIZJ = type;
    }
}

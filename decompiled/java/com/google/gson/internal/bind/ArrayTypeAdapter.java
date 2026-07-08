package com.google.gson.internal.bind;

import X.C09CQ;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {
    public static final v LIZJ = new v() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.v
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Type genericComponentType;
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType)) {
                if ((type instanceof Class) && ((Class) type).isArray()) {
                    genericComponentType = ((Class) type).getComponentType();
                } else {
                    return null;
                }
            } else {
                genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            }
            return new ArrayTypeAdapter(gson, gson.LJIIIZ(TypeToken.get(genericComponentType)), com.google.gson.internal.b.LJFF(genericComponentType));
        }
    };
    public final Class<E> LIZ;
    public final TypeAdapter<E> LIZIZ;

    @Override // com.google.gson.TypeAdapter
    public final Object read(C09CU c09cu) {
        int i = 0;
        Object objNewInstance = null;
        if (C09CQ.LIZJ) {
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
            } else {
                ArrayList arrayList = new ArrayList();
                c09cu.LIZ();
                while (c09cu.LJIIZILJ()) {
                    arrayList.add(this.LIZIZ.read(c09cu));
                }
                c09cu.LJI();
                int size = arrayList.size();
                objNewInstance = Array.newInstance((Class<?>) this.LIZ, size);
                while (i < size) {
                    Array.set(objNewInstance, i, arrayList.get(i));
                    i++;
                }
            }
        } else {
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            c09cu.LIZ();
            while (c09cu.LJIIZILJ()) {
                arrayList2.add(this.LIZIZ.read(c09cu));
            }
            c09cu.LJI();
            int size2 = arrayList2.size();
            Class<E> cls = this.LIZ;
            if (cls.isPrimitive()) {
                objNewInstance = Array.newInstance((Class<?>) cls, size2);
                while (i < size2) {
                    Array.set(objNewInstance, i, arrayList2.get(i));
                    i++;
                }
            } else {
                return arrayList2.toArray((Object[]) Array.newInstance((Class<?>) cls, size2));
            }
        }
        return objNewInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Object obj) {
        if (obj == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZIZ();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.LIZIZ.write(c09dl, (E) Array.get(obj, i));
        }
        c09dl.LJI();
    }

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.LIZIZ = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.LIZ = cls;
    }
}

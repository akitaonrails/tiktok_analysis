package com.google.gson.internal.bind;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2188811AlT;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.h;
import com.google.gson.internal.q;
import com.google.gson.internal.t;
import com.google.gson.internal.w;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.v;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes4.dex */
public final class MapTypeAdapterFactory implements v {
    public final h LL;
    public final boolean LLILLJJLI;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {
        public final TypeAdapter<K> LIZ;
        public final TypeAdapter<V> LIZIZ;
        public final t<? extends Map<K, V>> LIZJ;

        @Override // com.google.gson.TypeAdapter
        public final Object read(C09CU c09cu) {
            C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
            if (c09d6LJJLIIIJ == C09D6.NULL) {
                c09cu.LJJJJJL();
                return null;
            }
            Map<K, V> mapLIZ = this.LIZJ.LIZ();
            if (c09d6LJJLIIIJ == C09D6.BEGIN_ARRAY) {
                c09cu.LIZ();
                while (c09cu.LJIIZILJ()) {
                    c09cu.LIZ();
                    K k = this.LIZ.read(c09cu);
                    if (mapLIZ.put(k, this.LIZIZ.read(c09cu)) == null) {
                        c09cu.LJI();
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("duplicate key: ");
                        sbLIZ.append(k);
                        throw new s(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                c09cu.LJI();
                return mapLIZ;
            }
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                q.LIZ.LIZ(c09cu);
                K k2 = this.LIZ.read(c09cu);
                if (mapLIZ.put(k2, this.LIZIZ.read(c09cu)) != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("duplicate key: ");
                    sbLIZ2.append(k2);
                    throw new s(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            c09cu.LJII();
            return mapLIZ;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, Object obj) {
            String strLJIL;
            boolean z;
            Map map = (Map) obj;
            if (map == null) {
                c09dl.LJIJJ();
                return;
            }
            if (!MapTypeAdapterFactory.this.LLILLJJLI) {
                c09dl.LIZLLL();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c09dl.LJIILLIIL(String.valueOf(entry.getKey()));
                    this.LIZIZ.write(c09dl, entry.getValue());
                }
                c09dl.LJII();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z2 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                k jsonTree = this.LIZ.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                jsonTree.getClass();
                if (!(jsonTree instanceof com.google.gson.h) && !(jsonTree instanceof n)) {
                    z = false;
                } else {
                    z = true;
                }
                z2 |= z;
            }
            if (z2) {
                c09dl.LIZIZ();
                int size = arrayList.size();
                while (i < size) {
                    c09dl.LIZIZ();
                    w.LIZIZ((k) arrayList.get(i), c09dl);
                    this.LIZIZ.write(c09dl, (V) arrayList2.get(i));
                    c09dl.LJI();
                    i++;
                }
                c09dl.LJI();
                return;
            }
            c09dl.LIZLLL();
            int size2 = arrayList.size();
            while (i < size2) {
                k kVar = (k) arrayList.get(i);
                kVar.getClass();
                if (kVar instanceof com.google.gson.q) {
                    com.google.gson.q qVarLJIILJJIL = kVar.LJIILJJIL();
                    Object obj2 = qVarLJIILJJIL.LL;
                    if (obj2 instanceof Number) {
                        strLJIL = String.valueOf(qVarLJIILJJIL.LJIJ());
                    } else if (obj2 instanceof Boolean) {
                        strLJIL = Boolean.toString(qVarLJIILJJIL.LJ());
                    } else if (obj2 instanceof String) {
                        strLJIL = qVarLJIILJJIL.LJIL();
                    } else {
                        throw new AssertionError();
                    }
                } else if (kVar instanceof m) {
                    strLJIL = "null";
                } else {
                    throw new AssertionError();
                }
                c09dl.LJIILLIIL(strLJIL);
                this.LIZIZ.write(c09dl, (V) arrayList2.get(i));
                i++;
            }
            c09dl.LJII();
        }

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, t<? extends Map<K, V>> tVar) {
            this.LIZ = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.LIZIZ = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.LIZJ = tVar;
        }
    }

    public MapTypeAdapterFactory(h hVar, boolean z) {
        this.LL = hVar;
        this.LLILLJJLI = z;
    }

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type[] actualTypeArguments;
        TypeAdapter<Boolean> typeAdapterLJIIIZ;
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Class<?> clsLJFF = com.google.gson.internal.b.LJFF(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type typeLJI = com.google.gson.internal.b.LJI(type, clsLJFF, Map.class);
            if (typeLJI instanceof ParameterizedType) {
                actualTypeArguments = ((ParameterizedType) typeLJI).getActualTypeArguments();
            } else {
                actualTypeArguments = new Type[]{Object.class, Object.class};
            }
        }
        Type type2 = actualTypeArguments[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            typeAdapterLJIIIZ = gson.LJIIIZ(TypeToken.get(type2));
        } else {
            typeAdapterLJIIIZ = TypeAdapters.LIZJ;
        }
        return new Adapter(gson, actualTypeArguments[0], typeAdapterLJIIIZ, actualTypeArguments[1], gson.LJIIIZ(TypeToken.get(actualTypeArguments[1])), this.LL.LIZ(typeToken));
    }
}

package com.google.gson.internal.bind;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.h;
import com.google.gson.internal.t;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements v {
    public final h LL;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        public final TypeAdapter<E> LIZ;
        public final t<? extends Collection<E>> LIZIZ;

        @Override // com.google.gson.TypeAdapter
        public final Object read(C09CU c09cu) {
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
                return null;
            }
            Collection<E> collectionLIZ = this.LIZIZ.LIZ();
            c09cu.LIZ();
            while (c09cu.LJIIZILJ()) {
                collectionLIZ.add(this.LIZ.read(c09cu));
            }
            c09cu.LJI();
            return collectionLIZ;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, Object obj) {
            Collection collection = (Collection) obj;
            if (collection == null) {
                c09dl.LJIJJ();
                return;
            }
            c09dl.LIZIZ();
            Iterator<E> it2 = collection.iterator();
            while (it2.hasNext()) {
                this.LIZ.write(c09dl, it2.next());
            }
            c09dl.LJI();
        }

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, t<? extends Collection<E>> tVar) {
            this.LIZ = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.LIZIZ = tVar;
        }
    }

    public CollectionTypeAdapterFactory(h hVar) {
        this.LL = hVar;
    }

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeLIZLLL = com.google.gson.internal.b.LIZLLL(type, rawType);
        return new Adapter(gson, typeLIZLLL, gson.LJIIIZ(TypeToken.get(typeLIZLLL)), this.LL.LIZ(typeToken));
    }
}

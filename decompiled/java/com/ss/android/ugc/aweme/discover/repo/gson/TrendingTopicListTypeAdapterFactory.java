package com.ss.android.ugc.aweme.discover.repo.gson;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.v;
import com.ss.android.ugc.aweme.discover.model.LazyDeserializeItem;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class TrendingTopicListTypeAdapterFactory implements v {

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        public final TypeAdapter<E> LIZ;
        public final Boolean LIZIZ = Boolean.FALSE;
        public final int LIZJ;

        @Override // com.google.gson.TypeAdapter
        public final Object read(C09CU c09cu) {
            System.currentTimeMillis();
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            c09cu.LIZ();
            Boolean bool = Boolean.FALSE;
            int i = 0;
            if (!this.LIZIZ.booleanValue()) {
                E e = this.LIZ.read(c09cu);
                if (e instanceof TrendingTopic) {
                    bool = Boolean.TRUE;
                    i = 1;
                }
                arrayList.add(e);
                while (c09cu.LJIIZILJ()) {
                    if (!bool.booleanValue()) {
                        e = this.LIZ.read(c09cu);
                        arrayList.add(e);
                    } else if (this.LIZJ <= i) {
                        c09cu.LJJZ();
                    } else {
                        try {
                            e = this.LIZ.read(c09cu);
                            if (i == this.LIZJ - 1 && c09cu.LJIIZILJ() && (e instanceof LazyDeserializeItem)) {
                                ((LazyDeserializeItem) e).setNeedToBeSupplied(true);
                            }
                        } catch (s e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        arrayList.add(e);
                        i++;
                    }
                }
            } else {
                while (c09cu.LJIIZILJ()) {
                    int i2 = this.LIZJ;
                    if (i2 == Integer.MAX_VALUE) {
                        c09cu.LJJZ();
                    } else {
                        if (i2 > i) {
                            c09cu.LJJZ();
                            i++;
                        }
                        arrayList.add(this.LIZ.read(c09cu));
                    }
                }
            }
            c09cu.LJI();
            return arrayList;
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

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter) {
            this.LIZJ = Integer.MAX_VALUE;
            this.LIZJ = 0;
            this.LIZ = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
        }
    }

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        System.currentTimeMillis();
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeLIZLLL = b.LIZLLL(type, rawType);
        if (!TrendingTopic.class.equals(typeLIZLLL)) {
            return null;
        }
        return new Adapter(gson, typeLIZLLL, gson.LJIIIZ(TypeToken.get(typeLIZLLL)));
    }
}

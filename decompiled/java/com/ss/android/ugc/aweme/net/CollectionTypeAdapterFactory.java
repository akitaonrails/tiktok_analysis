package com.ss.android.ugc.aweme.net;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!Collection.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        final TypeAdapter<T> typeAdapterLJIIJJI = gson.LJIIJJI(this, typeToken);
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.net.CollectionTypeAdapterFactory.1
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.Collection] */
            /* JADX WARN: Type inference failed for: r2v2, types: [T, java.util.ArrayList, java.util.List] */
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                ?? r2 = (T) ((Collection) typeAdapterLJIIJJI.read(c09cu));
                if (r2 instanceof ArrayList) {
                    ?? r22 = (T) ((ArrayList) r2);
                    for (int size = r22.size() - 1; size >= 0; size--) {
                        if (ListProtector.get(r22, size) == null) {
                            ListProtector.remove(r22, size);
                        }
                    }
                    return r22;
                }
                Iterator it2 = r2.iterator();
                while (it2.hasNext()) {
                    if (it2.next() == null) {
                        it2.remove();
                    }
                }
                return r2;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) {
                if (t == null) {
                    c09dl.LJIJJ();
                } else {
                    typeAdapterLJIIJJI.write(c09dl, t);
                }
            }
        };
    }
}

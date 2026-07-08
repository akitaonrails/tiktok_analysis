package com.ss.android.ugc.aweme.ecommerce.proto;

import X.C09CU;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ExcludeEmptyTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        final TypeAdapter<T> typeAdapterLJIIJJI;
        if (gson != null) {
            typeAdapterLJIIJJI = gson.LJIIJJI(this, typeToken);
        } else {
            typeAdapterLJIIJJI = null;
        }
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.ecommerce.proto.ExcludeEmptyTypeAdapterFactory.create.1
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                TypeAdapter<T> typeAdapter = typeAdapterLJIIJJI;
                if (typeAdapter != null) {
                    return typeAdapter.read(c09cu);
                }
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) {
                if (t == null) {
                    if (c09dl != null) {
                        c09dl.LJIJJ();
                        return;
                    }
                    return;
                }
                if ((t instanceof Collection) && ((Collection) t).isEmpty()) {
                    if (c09dl != null) {
                        c09dl.LJIJJ();
                    }
                } else if ((t instanceof Map) && ((Map) t).isEmpty()) {
                    if (c09dl != null) {
                        c09dl.LJIJJ();
                    }
                } else {
                    TypeAdapter<T> typeAdapter = typeAdapterLJIIJJI;
                    if (typeAdapter != null) {
                        typeAdapter.write(c09dl, t);
                    }
                }
            }
        };
    }
}

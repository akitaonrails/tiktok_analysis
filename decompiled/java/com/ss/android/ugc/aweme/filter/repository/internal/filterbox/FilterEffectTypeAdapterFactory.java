package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import X.C09CU;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.effectplatform.FilterEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class FilterEffectTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!Intrinsics.LJFF(typeToken.getRawType(), Effect.class)) {
            return null;
        }
        final TypeAdapter<T> typeAdapterLJIIJJI = gson.LJIIJJI(this, TypeToken.get(FilterEffect.class));
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterEffectTypeAdapterFactory.create.1
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                return (T) typeAdapterLJIIJJI.read(c09cu);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) {
                typeAdapterLJIIJJI.write(c09dl, t);
            }
        };
    }
}

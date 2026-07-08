package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import X.C09CU;
import X.C09DL;
import X.C20266714Rt;
import X.C20266814Ru;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class FilterBoxEffectNetListResponseTypeAdapter implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!Intrinsics.LJFF(typeToken.getRawType(), C20266714Rt.class)) {
            return null;
        }
        e eVar = new e();
        ((ArrayList) eVar.LJ).add(new FilterEffectTypeAdapterFactory());
        final TypeAdapter<T> typeAdapterLJIIJ = eVar.LIZ().LJIIJ(C20266814Ru.class);
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxEffectNetListResponseTypeAdapter.create.1
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                return (T) typeAdapterLJIIJ.read(c09cu);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) {
                typeAdapterLJIIJ.write(c09dl, t);
            }
        };
    }
}

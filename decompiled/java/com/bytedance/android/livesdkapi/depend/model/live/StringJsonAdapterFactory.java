package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CU;
import X.C09DL;
import X.C2335009Cy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;

/* JADX INFO: loaded from: classes.dex */
public class StringJsonAdapterFactory implements v {

    /* JADX INFO: loaded from: classes4.dex */
    public static class Adapter<T> extends TypeAdapter<T> {
        public final Gson LIZ;
        public final TypeToken<T> LIZIZ;

        @Override // com.google.gson.TypeAdapter
        public final T read(C09CU c09cu) {
            int i = C2335009Cy.LIZ[c09cu.LJJLIIIJ().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return (T) GsonProtectorUtils.fromJson(this.LIZ, c09cu, this.LIZIZ.getType());
                }
                return (T) GsonProtectorUtils.fromJson(this.LIZ, c09cu.LJJJZ(), this.LIZIZ.getType());
            }
            c09cu.LJJJJJL();
            return null;
        }

        public Adapter(Gson gson, TypeToken<T> typeToken) {
            this.LIZ = gson;
            this.LIZIZ = typeToken;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, T t) {
            c09dl.LJJJJJ(GsonProtectorUtils.toJson(this.LIZ, t));
        }
    }

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return new Adapter(gson, typeToken);
    }
}

package com.ss.android.ugc.aweme.net;

import X.AbstractC2126608Uu;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.v;

/* JADX INFO: loaded from: classes4.dex */
public final class ModelCheckerTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!AbstractC2126608Uu.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        AbstractC2126608Uu.initRequiredFieldMap(typeToken.getRawType());
        final TypeAdapter<T> typeAdapterLJIIJJI = gson.LJIIJJI(this, typeToken);
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.net.ModelCheckerTypeAdapterFactory.1
            /* JADX WARN: Type inference failed for: r0v3, types: [T, X.08Uu] */
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                ?? r0 = (T) ((AbstractC2126608Uu) typeAdapterLJIIJJI.read(c09cu));
                try {
                    r0.checkValid();
                    return r0;
                } catch (o e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw new s(th);
                }
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

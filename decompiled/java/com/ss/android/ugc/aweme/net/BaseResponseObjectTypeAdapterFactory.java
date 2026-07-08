package com.ss.android.ugc.aweme.net;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C0XIR;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes4.dex */
public class BaseResponseObjectTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!BaseResponse.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        final TypeAdapter<T> typeAdapterLJIIJJI = gson.LJIIJJI(this, typeToken);
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory.1
            /* JADX WARN: Type inference failed for: r1v3, types: [T, com.ss.android.ugc.aweme.base.api.BaseResponse] */
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) throws Throwable {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                try {
                    ?? r1 = (T) ((BaseResponse) typeAdapterLJIIJJI.read(c09cu));
                    BaseResponse.ServerTimeExtra serverTimeExtra = r1.extra;
                    return r1;
                } catch (o e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (e.getCause() instanceof C0XIR) {
                        throw e.getCause();
                    }
                    throw e;
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

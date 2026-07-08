package com.ss.android.ugc.aweme.network.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;

/* JADX INFO: loaded from: classes31.dex */
public final class BaseResponseTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType;
        final TypeAdapter<T> typeAdapterLJIIJJI = null;
        if (typeToken == null || (rawType = typeToken.getRawType()) == null || !BaseResponse.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (gson != null) {
            typeAdapterLJIIJJI = gson.LJIIJJI(this, typeToken);
        }
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.network.model.BaseResponseTypeAdapterFactory.create.1
            /* JADX WARN: Type inference failed for: r1v13 */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v4, types: [T] */
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                T t;
                ?? r1;
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                TypeAdapter<T> typeAdapter = typeAdapterLJIIJJI;
                if (typeAdapter != null) {
                    t = typeAdapter.read(c09cu);
                } else {
                    t = (T) null;
                }
                if (t instanceof BaseResponse) {
                    BaseResponse baseResponse = (T) ((BaseResponse) t);
                    r1 = baseResponse;
                    if (baseResponse != null) {
                        try {
                            baseResponse.checkValid();
                            r1 = baseResponse;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                } else {
                    r1 = (T) null;
                }
                if (((??[OBJECT, ARRAY]) r1) instanceof Object) {
                    return (T) r1;
                }
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) {
                if (t == null) {
                    c09dl.LJIJJ();
                    return;
                }
                TypeAdapter<T> typeAdapter = typeAdapterLJIIJJI;
                if (typeAdapter == null) {
                    return;
                }
                typeAdapter.write(c09dl, t);
            }
        };
    }
}

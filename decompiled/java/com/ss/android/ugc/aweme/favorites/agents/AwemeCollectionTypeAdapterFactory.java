package com.ss.android.ugc.aweme.favorites.agents;

import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes31.dex */
public final class AwemeCollectionTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        final TypeAdapter<T> typeAdapterLJIIJJI = null;
        if (typeToken == null || !Aweme.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        if (gson != null) {
            typeAdapterLJIIJJI = gson.LJIIJJI(this, typeToken);
        }
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.favorites.agents.AwemeCollectionTypeAdapterFactory.create.1
            /* JADX WARN: Removed duplicated region for block: B:31:0x006b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[RETURN] */
            @Override // com.google.gson.TypeAdapter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final T read(X.C09CU r13) throws java.lang.Throwable {
                /*
                    r12 = this;
                    java.lang.String r3 = "aweme aid is null"
                    java.lang.String r2 = "aweme is null"
                    r5 = 0
                    if (r13 == 0) goto L13
                    X.09D6 r1 = r13.LJJLIIIJ()
                Lb:
                    X.09D6 r0 = X.C09D6.NULL
                    if (r1 != r0) goto L15
                    r13.LJJJJJL()
                    return r5
                L13:
                    r1 = r5
                    goto Lb
                L15:
                    com.google.gson.TypeAdapter<T> r0 = r1     // Catch: com.google.gson.o -> L6d
                    if (r0 == 0) goto L24
                    java.lang.Object r4 = r0.read(r13)     // Catch: com.google.gson.o -> L6d
                L1d:
                    boolean r0 = r4 instanceof com.ss.android.ugc.aweme.feed.model.Aweme     // Catch: com.google.gson.o -> L6d
                    if (r0 == 0) goto L29
                    com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4     // Catch: com.google.gson.o -> L6d
                    goto L26
                L24:
                    r4 = r5
                    goto L1d
                L26:
                    if (r4 == 0) goto L2a
                    goto L33
                L29:
                    r4 = r5
                L2a:
                    X.0O5Y r0 = X.C0O5Y.LIZ     // Catch: com.google.gson.o -> L6d
                    r0.getClass()     // Catch: com.google.gson.o -> L6d
                    X.C0O5Y.LJ(r2, r2)     // Catch: com.google.gson.o -> L6d
                    goto L67
                L33:
                    java.lang.String r0 = r4.getAid()     // Catch: com.google.gson.o -> L6d
                    if (r0 != 0) goto L41
                    X.0O5Y r0 = X.C0O5Y.LIZ     // Catch: com.google.gson.o -> L6d
                    r0.getClass()     // Catch: com.google.gson.o -> L6d
                    X.C0O5Y.LJ(r3, r3)     // Catch: com.google.gson.o -> L6d
                L41:
                    java.lang.String r0 = r4.getAid()     // Catch: com.google.gson.o -> L6d
                    if (r0 == 0) goto L67
                    java.lang.Class<com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState> r6 = com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState.class
                    r7 = 0
                    r10 = 14
                    r11 = 0
                    r8 = r7
                    r9 = r7
                    java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)     // Catch: com.google.gson.o -> L6d
                    com.ss.android.ugc.aweme.state.ability.IState r3 = (com.ss.android.ugc.aweme.state.ability.IState) r3     // Catch: com.google.gson.o -> L6d
                    if (r3 == 0) goto L67
                    java.lang.String r2 = r4.getAid()     // Catch: com.google.gson.o -> L6d
                    boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isCollected(r4)     // Catch: com.google.gson.o -> L6d
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: com.google.gson.o -> L6d
                    r0 = 1
                    r3.syncState(r2, r1, r0)     // Catch: com.google.gson.o -> L6d
                L67:
                    boolean r0 = r4 instanceof java.lang.Object     // Catch: com.google.gson.o -> L6d
                    if (r0 == 0) goto L6c
                    return r4
                L6c:
                    return r5
                L6d:
                    r1 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                    java.lang.Throwable r0 = r1.getCause()
                    if (r0 == 0) goto L80
                    boolean r0 = r0 instanceof X.C0XIR
                    if (r0 == 0) goto L80
                    java.lang.Throwable r0 = r1.getCause()
                    throw r0
                L80:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.agents.AwemeCollectionTypeAdapterFactory.AnonymousClass1.read(X.09CU):java.lang.Object");
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) {
                if (t == null) {
                    if (c09dl != null) {
                        c09dl.LJIJJ();
                    }
                } else {
                    TypeAdapter<T> typeAdapter = typeAdapterLJIIJJI;
                    if (typeAdapter == null) {
                        return;
                    }
                    typeAdapter.write(c09dl, t);
                }
            }
        };
    }
}

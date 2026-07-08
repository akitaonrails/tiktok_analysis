package com.google.gson.internal.bind;

import X.C09CS;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.h;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements v {
    public final h LL;

    public JsonAdapterAnnotationTypeAdapterFactory(h hVar) {
        this.LL = hVar;
    }

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        C09CS c09cs = (C09CS) typeToken.getRawType().getAnnotation(C09CS.class);
        if (c09cs == null) {
            return null;
        }
        return LIZ(this.LL, gson, typeToken, c09cs);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.gson.TypeAdapter LIZ(com.google.gson.internal.h r7, com.google.gson.Gson r8, com.google.gson.reflect.TypeToken r9, X.C09CS r10) {
        /*
            java.lang.Class r0 = r10.value()
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r0)
            com.google.gson.internal.t r0 = r7.LIZ(r0)
            java.lang.Object r3 = r0.LIZ()
            boolean r0 = r3 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L23
            com.google.gson.TypeAdapter r3 = (com.google.gson.TypeAdapter) r3
        L16:
            if (r3 == 0) goto L22
        L18:
            boolean r0 = r10.nullSafe()
            if (r0 == 0) goto L22
            com.google.gson.TypeAdapter r3 = r3.nullSafe()
        L22:
            return r3
        L23:
            boolean r0 = r3 instanceof com.google.gson.v
            r7 = r9
            r6 = r8
            if (r0 == 0) goto L30
            com.google.gson.v r3 = (com.google.gson.v) r3
            com.google.gson.TypeAdapter r3 = r3.create(r6, r7)
            goto L16
        L30:
            boolean r1 = r3 instanceof com.google.gson.r
            if (r1 != 0) goto L67
            boolean r0 = r3 instanceof com.google.gson.j
            if (r0 != 0) goto L67
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r1.append(r0)
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = " as a @JsonAdapter for "
            r1.append(r0)
            java.lang.String r0 = r7.toString()
            r1.append(r0)
            java.lang.String r0 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L67:
            r5 = 0
            if (r1 == 0) goto L7b
            r4 = r3
            com.google.gson.r r4 = (com.google.gson.r) r4
        L6d:
            boolean r0 = r3 instanceof com.google.gson.j
            if (r0 == 0) goto L74
            r5 = r3
            com.google.gson.j r5 = (com.google.gson.j) r5
        L74:
            com.google.gson.internal.bind.TreeTypeAdapter r3 = new com.google.gson.internal.bind.TreeTypeAdapter
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L18
        L7b:
            r4 = r5
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.LIZ(com.google.gson.internal.h, com.google.gson.Gson, com.google.gson.reflect.TypeToken, X.09CS):com.google.gson.TypeAdapter");
    }
}

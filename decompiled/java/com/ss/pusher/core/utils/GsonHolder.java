package com.ss.pusher.core.utils;

import com.google.gson.Gson;
import com.google.gson.a;
import com.google.gson.b;
import com.google.gson.e;
import com.google.gson.j;

/* JADX INFO: loaded from: classes4.dex */
public final class GsonHolder {
    public static final Gson LIZ;

    static {
        e eVar = new e();
        eVar.LIZIZ(8, 128, 64);
        eVar.LJIIL = false;
        eVar.LJ(new a() { // from class: X.09C9
            @Override // com.google.gson.a
            public final boolean shouldSkipClass(Class<?> cls) {
                return false;
            }

            @Override // com.google.gson.a
            public final boolean shouldSkipField(b bVar) {
                if (bVar.LIZ(C09CT.class) == null) {
                    return true;
                }
                return false;
            }
        });
        eVar.LIZJ(new j<Boolean>() { // from class: com.ss.pusher.core.utils.GsonHolder$gson$2
            /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
            @Override // com.google.gson.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean deserialize(com.google.gson.k r6, java.lang.reflect.Type r7, com.google.gson.i r8) {
                /*
                    r5 = this;
                    boolean r0 = r6 instanceof com.google.gson.q
                    java.lang.String r4 = "Invalid boolean value: "
                    if (r0 == 0) goto L55
                    com.google.gson.q r3 = r6.LJIILJJIL()
                    java.lang.Object r1 = r3.LL
                    boolean r0 = r1 instanceof java.lang.Boolean
                    if (r0 == 0) goto L19
                    boolean r0 = r3.LJ()
                L14:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L19:
                    boolean r0 = r1 instanceof java.lang.Number
                    r2 = 1
                    if (r0 == 0) goto L26
                    int r0 = r3.LJIIJJI()
                    if (r0 == 0) goto L3f
                L24:
                    r0 = 1
                    goto L14
                L26:
                    boolean r0 = r1 instanceof java.lang.String
                    if (r0 == 0) goto L41
                    java.lang.String r1 = r3.LJIL()
                    java.lang.String r0 = "true"
                    boolean r0 = kotlin.text.u.LJIJI(r1, r0, r2)
                    if (r0 != 0) goto L24
                    java.lang.String r0 = "1"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L3f
                    goto L24
                L3f:
                    r0 = 0
                    goto L14
                L41:
                    java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
                    r0.append(r4)
                    r0.append(r6)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
                    r1.<init>(r0)
                    throw r1
                L55:
                    com.google.gson.o r1 = new com.google.gson.o
                    java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
                    r0.append(r4)
                    r0.append(r6)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.pusher.core.utils.GsonHolder$gson$2.deserialize(com.google.gson.k, java.lang.reflect.Type, com.google.gson.i):java.lang.Object");
            }
        }, Boolean.TYPE);
        LIZ = eVar.LIZ();
    }
}

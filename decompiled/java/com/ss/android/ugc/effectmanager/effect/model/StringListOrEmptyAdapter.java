package com.ss.android.ugc.effectmanager.effect.model;

import com.google.gson.j;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StringListOrEmptyAdapter implements j<List<? extends String>> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    @Override // com.google.gson.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<? extends java.lang.String> deserialize(com.google.gson.k r6, java.lang.reflect.Type r7, com.google.gson.i r8) {
        /*
            r5 = this;
            r3 = 0
            if (r6 == 0) goto L76
            boolean r0 = r6 instanceof com.google.gson.m
            if (r0 != 0) goto L76
            boolean r0 = r6 instanceof com.google.gson.h     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L39
            com.google.gson.h r0 = r6.LJIIL()     // Catch: java.lang.Throwable -> L61
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L61
            r4.<init>()     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L61
        L18:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L61
            com.google.gson.k r1 = (com.google.gson.k) r1     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L32
            boolean r0 = r1 instanceof com.google.gson.q     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L2b
            r1 = r3
        L2b:
            if (r1 == 0) goto L32
            java.lang.String r0 = r1.LJIL()     // Catch: java.lang.Throwable -> L61
            goto L33
        L32:
            r0 = r3
        L33:
            if (r0 == 0) goto L18
            r4.add(r0)     // Catch: java.lang.Throwable -> L61
            goto L18
        L39:
            boolean r0 = r6 instanceof com.google.gson.q     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L57
            com.google.gson.q r0 = r6.LJIILJJIL()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r0 = r0.LL     // Catch: java.lang.Throwable -> L61
            boolean r0 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L57
            java.lang.String r1 = r6.LJIL()     // Catch: java.lang.Throwable -> L61
            boolean r0 = kotlin.text.a0.LJJJIL(r1)     // Catch: java.lang.Throwable -> L61
            r0 = r0 ^ 1
            if (r0 != 0) goto L54
            r1 = r3
        L54:
            if (r1 == 0) goto L57
            goto L59
        L57:
            r4 = r3
            goto L5d
        L59:
            java.util.List r4 = java.util.Collections.singletonList(r1)     // Catch: java.lang.Throwable -> L61
        L5d:
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L61
            goto L6d
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
        L6d:
            boolean r0 = X.C189200o6.m7isFailureimpl(r4)
            if (r0 != 0) goto L74
            r3 = r4
        L74:
            java.util.List r3 = (java.util.List) r3
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.StringListOrEmptyAdapter.deserialize(com.google.gson.k, java.lang.reflect.Type, com.google.gson.i):java.util.List");
    }
}

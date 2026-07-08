package com.ss.android.ugc.aweme.amazon.service;

import X.C1703480uQk;

/* JADX INFO: loaded from: classes17.dex */
public final class AmazonCheckoutAdServiceImpl implements IAmazonCheckoutAdService {
    @Override // com.ss.android.ugc.aweme.amazon.service.IAmazonCheckoutAdService
    public final Object LIZ(C1703480uQk c1703480uQk) {
        return LIZIZ(c1703480uQk);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1058360deE
            if (r0 == 0) goto L21
            r3 = r7
            X.0deE r3 = (X.C1058360deE) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r5 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            goto L44
        L21:
            X.0deE r3 = new X.0deE
            r3.<init>(r6, r7)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r5)
            X.0CPm r0 = X.InterfaceC315270CXl.LIZ     // Catch: java.lang.Exception -> L80
            r0.getClass()     // Catch: java.lang.Exception -> L80
            X.0CXl r0 = X.C313200CPm.LIZ()     // Catch: java.lang.Exception -> L80
            r3.LLILLL = r1     // Catch: java.lang.Exception -> L80
            java.lang.Object r5 = r0.LIZIZ(r3)     // Catch: java.lang.Exception -> L80
            if (r5 != r2) goto L47
            return r2
        L44:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L80
        L47:
            com.ss.android.ugc.aweme.amazon.model.AmazonTokenRemoveResponse r5 = (com.ss.android.ugc.aweme.amazon.model.AmazonTokenRemoveResponse) r5     // Catch: java.lang.Exception -> L80
            java.lang.Integer r0 = r5.statusCode     // Catch: java.lang.Exception -> L80
            if (r0 == 0) goto L76
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L80
            if (r0 != 0) goto L76
            X.0dBp r0 = X.C1040750dBp.LIZ     // Catch: java.lang.Exception -> L80
            r0.getClass()     // Catch: java.lang.Exception -> L80
            X.0cKh r3 = X.C1040750dBp.LJJIIZI     // Catch: java.lang.Exception -> L80
        L5a:
            X.0dBY r2 = new X.0dBY     // Catch: java.lang.Exception -> L80
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L80
            r2.<init>(r0)     // Catch: java.lang.Exception -> L80
            kotlin.jvm.internal.AwS595S0100000_16 r1 = new kotlin.jvm.internal.AwS595S0100000_16     // Catch: java.lang.Exception -> L80
            r0 = 63
            r1.<init>(r5, r0)     // Catch: java.lang.Exception -> L80
            r2.log(r3, r1)     // Catch: java.lang.Exception -> L80
            java.lang.Integer r0 = r5.statusCode     // Catch: java.lang.Exception -> L80
            if (r0 == 0) goto L84
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L80
            if (r0 != 0) goto L84
            goto L7e
        L76:
            X.0dBp r0 = X.C1040750dBp.LIZ     // Catch: java.lang.Exception -> L80
            r0.getClass()     // Catch: java.lang.Exception -> L80
            X.0cKh r3 = X.C1040750dBp.LJJIJ     // Catch: java.lang.Exception -> L80
            goto L5a
        L7e:
            r4 = 1
            goto L84
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L84:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.amazon.service.AmazonCheckoutAdServiceImpl.LIZIZ(X.05Vn):java.lang.Object");
    }
}

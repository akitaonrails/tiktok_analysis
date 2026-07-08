package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor;

import X.InterfaceC1904907d9;

/* JADX INFO: loaded from: classes4.dex */
public final class GecNetInterceptor implements InterfaceC1904907d9 {
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[Catch: all -> 0x007b, TryCatch #7 {all -> 0x007b, blocks: (B:30:0x0057, B:32:0x005d, B:33:0x0061, B:35:0x0065), top: B:60:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065 A[Catch: all -> 0x007b, TryCatch #7 {all -> 0x007b, blocks: (B:30:0x0057, B:32:0x005d, B:33:0x0061, B:35:0x0065), top: B:60:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    @Override // X.InterfaceC1904907d9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0X52<?> intercept(X.InterfaceC841770X0l r11) throws java.lang.Exception {
        /*
            r10 = this;
            r0 = r11
            X.0ozp r0 = (X.C1494590ozp) r0
            com.bytedance.retrofit2.client.Request r1 = r0.LIZJ
            java.lang.String r0 = r1.getUrl()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r5 = r0.getEncodedPath()
            java.lang.String r3 = ""
            if (r5 != 0) goto L16
            r5 = r3
        L16:
            r2 = 0
            X.0ozp r11 = (X.C1494590ozp) r11     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L48
            X.0X52 r1 = r11.LIZ(r1)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L48
            boolean r8 = r1.LIZJ()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L40
            java.lang.String r7 = X.C2371709Rb.LIZ(r1)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L43
            X.08fh r0 = r1.LIZ     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L7f
            int r4 = r0.LIZIZ     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L7f
            java.lang.String r6 = r0.LIZJ     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L7d
            if (r6 != 0) goto L2e
            r6 = r3
        L2e:
            kotlin.Pair[] r9 = new kotlin.Pair[r2]
            X.C2371709Rb.LIZJ(r4, r5, r6, r7, r8, r9)
            return r1
        L34:
            r1 = move-exception
            goto L4c
        L36:
            r1 = move-exception
            r4 = 0
            goto L4c
        L39:
            r1 = move-exception
            r8 = 0
            goto L3d
        L3c:
            r1 = move-exception
        L3d:
            r4 = 0
            r7 = r3
            goto L4c
        L40:
            r0 = move-exception
            r8 = 0
            goto L44
        L43:
            r0 = move-exception
        L44:
            r7 = r3
            r4 = 0
            r6 = r7
            goto L82
        L48:
            r1 = move-exception
            r4 = 0
            r8 = 0
            r7 = r3
        L4c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = r0.getName()     // Catch: java.lang.Throwable -> L7d
            java.lang.Integer r0 = X.C2371809Rc.LIZ(r1)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L6d
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> L7b
        L61:
            boolean r0 = r1 instanceof X.C1494690ozz     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L75
            r0 = r1
            X.0ozz r0 = (X.C1494690ozz) r0     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = r0.getTraceCode()     // Catch: java.lang.Throwable -> L7b
            goto L71
        L6d:
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L61
        L71:
            if (r0 == 0) goto L74
            r3 = r0
        L74:
            r7 = r3
        L75:
            kotlin.Pair[] r9 = new kotlin.Pair[r2]
            X.C2371709Rb.LIZJ(r4, r5, r6, r7, r8, r9)
            throw r1
        L7b:
            r0 = move-exception
            goto L82
        L7d:
            r0 = move-exception
            goto L81
        L7f:
            r0 = move-exception
            r4 = 0
        L81:
            r6 = r3
        L82:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r0 = move-exception
            goto L82
        L88:
            kotlin.Pair[] r9 = new kotlin.Pair[r2]
            X.C2371709Rb.LIZJ(r4, r5, r6, r7, r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor.intercept(X.0X0l):X.0X52");
    }
}

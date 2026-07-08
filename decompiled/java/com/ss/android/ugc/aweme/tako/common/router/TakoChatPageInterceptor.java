package com.ss.android.ugc.aweme.tako.common.router;

import X.C1976907ol;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

/* JADX INFO: loaded from: classes29.dex */
public final class TakoChatPageInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055 A[ORIG_RETURN, RETURN] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L23
            android.net.Uri r1 = r6.getUri()
            if (r1 == 0) goto L24
            java.lang.String r0 = r1.getHost()
        Ld:
            java.lang.String r3 = "tako"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            r2 = 1
            if (r0 == 0) goto L26
            java.lang.String r1 = r1.getPath()
            java.lang.String r0 = "/host"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L26
            return r2
        L23:
            r1 = r4
        L24:
            r0 = r4
            goto Ld
        L26:
            X.01GW r0 = X.C1099504Rt.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L55
            if (r6 == 0) goto L53
            android.net.Uri r1 = r6.getUri()
            if (r1 == 0) goto L40
            java.lang.String r4 = r1.getHost()
        L40:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r3)
            if (r0 == 0) goto L55
            java.lang.String r1 = r1.getPath()
            java.lang.String r0 = "/ai_bot"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L55
            return r2
        L53:
            r1 = r4
            goto L40
        L55:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.common.router.TakoChatPageInterceptor.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0084 A[PHI: r2
      0x0084: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:52:0x0082, B:50:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r8, com.bytedance.router.RouteIntent r9) {
        /*
            r7 = this;
            r6 = 0
            if (r9 == 0) goto L14
            android.content.Intent r0 = r9.getExtra()
            if (r0 == 0) goto L14
            android.os.Bundle r5 = r0.getExtras()     // Catch: java.lang.Exception -> L10
            if (r5 == 0) goto L15
            goto L17
        L10:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L14:
            r5 = r6
        L15:
            r0 = r6
            goto L1d
        L17:
            java.lang.String r0 = "tako_enter_param"
            java.io.Serializable r0 = r5.getSerializable(r0)
        L1d:
            r1 = 0
            if (r0 == 0) goto L21
            return r1
        L21:
            if (r9 == 0) goto La1
            android.net.Uri r0 = r9.getUri()
            if (r0 == 0) goto La1
            if (r8 == 0) goto La1
            android.net.Uri r4 = r9.getUri()
            if (r5 == 0) goto L6e
            java.util.Set r0 = r5.keySet()
        L35:
            java.lang.String r3 = ""
            if (r5 == 0) goto L77
            if (r0 == 0) goto L77
            if (r4 == 0) goto L6c
            android.net.Uri$Builder r4 = r4.buildUpon()
        L41:
            java.util.Iterator r2 = r0.iterator()
        L45:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r5.get(r1)     // Catch: java.lang.Exception -> L58 java.lang.OutOfMemoryError -> L5d
            if (r0 != 0) goto L62
            goto L61
        L58:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L61
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L61:
            r0 = r3
        L62:
            if (r4 == 0) goto L45
            java.lang.String r0 = r0.toString()
            r4.appendQueryParameter(r1, r0)
            goto L45
        L6c:
            r4 = r6
            goto L41
        L6e:
            r0 = r6
            goto L35
        L70:
            if (r4 == 0) goto L76
            android.net.Uri r6 = r4.build()
        L76:
            r4 = r6
        L77:
            if (r4 == 0) goto L81
            java.lang.String r0 = "enter_from"
            java.lang.String r2 = X.C1862500yZE.LIZIZ(r4, r0)
            if (r2 != 0) goto L84
        L81:
            r2 = r3
            if (r4 == 0) goto L8d
        L84:
            java.lang.String r0 = "enter_method"
            java.lang.String r0 = X.C1862500yZE.LIZIZ(r4, r0)
            if (r0 == 0) goto L8d
            r3 = r0
        L8d:
            kotlin.jvm.internal.AwS606S0100000_27 r1 = new kotlin.jvm.internal.AwS606S0100000_27
            r0 = 9
            r1.<init>(r4, r0)
            X.14EG r0 = new X.14EG
            r0.<init>(r2, r3)
            r1.invoke(r0)
            r0.LJII(r8)
            r0 = 1
            return r0
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.common.router.TakoChatPageInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}

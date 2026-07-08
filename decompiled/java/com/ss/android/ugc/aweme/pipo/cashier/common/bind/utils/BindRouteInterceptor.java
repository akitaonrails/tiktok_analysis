package com.ss.android.ugc.aweme.pipo.cashier.common.bind.utils;

import X.C1976907ol;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class BindRouteInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        if (!Intrinsics.LJFF(host, "pipo") || !u.LJIIZILJ(routeIntent.getPath(), "/cashier/bind_result", false)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[PHI: r4
      0x0073: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v6 java.lang.String) binds: [B:25:0x0070, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[PHI: r4 r7
      0x0077: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v5 java.lang.String) binds: [B:28:0x0074, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:28:0x0074, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r9, com.bytedance.router.RouteIntent r10) throws org.json.JSONException {
        /*
            r8 = this;
            r5 = 0
            if (r10 == 0) goto L6f
            android.net.Uri r1 = r10.getUri()
            if (r1 == 0) goto L6f
            java.lang.String r0 = "bind_request_id"
            java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
        Lf:
            android.net.Uri r1 = r10.getUri()
            if (r1 == 0) goto L73
            java.lang.String r0 = "payment_status"
            java.lang.String r7 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
        L1b:
            android.net.Uri r1 = r10.getUri()
            if (r1 == 0) goto L77
            java.lang.String r0 = "error_code"
            java.lang.String r6 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
        L27:
            android.net.Uri r1 = r10.getUri()
            if (r1 == 0) goto L33
            java.lang.String r0 = "error_content"
            java.lang.String r5 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
        L33:
            java.lang.String r0 = "Cashier"
            X.0uZC r2 = X.C1708710uZB.LIZ(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "BindRouteInterceptor onInterceptRoute"
            r1.append(r0)
            java.lang.String r0 = " invoke for bindId: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 4
            r2.LIZ(r0, r1)
            r3 = 0
            r2 = 1
            if (r4 == 0) goto L95
            int r0 = r4.length()
            if (r0 == 0) goto L95
            java.lang.String r0 = "succeed"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L7b
            X.0uYN r0 = X.C1708220uYO.LIZLLL
            r0.getClass()
            X.C1708210uYN.LIZ(r4, r1, r1, r2)
            return r2
        L6f:
            r4 = r5
            if (r10 == 0) goto L73
            goto Lf
        L73:
            r7 = r5
            if (r10 == 0) goto L77
            goto L1b
        L77:
            r6 = r5
            if (r10 == 0) goto L33
            goto L27
        L7b:
            java.lang.String r0 = "success"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L8c
            X.0uYN r0 = X.C1708220uYO.LIZLLL
            r0.getClass()
            X.C1708210uYN.LIZ(r4, r1, r1, r2)
            return r2
        L8c:
            X.0uYN r0 = X.C1708220uYO.LIZLLL
            r0.getClass()
            X.C1708210uYN.LIZ(r4, r6, r5, r3)
            return r2
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.common.bind.utils.BindRouteInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}

package com.ss.android.ugc.aweme.pipo.cashier.common.pay.utils;

import X.C1976907ol;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class PayRouteInterceptor implements IInterceptor {
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
        if (!Intrinsics.LJFF(host, "pipo") || !u.LJIIZILJ(routeIntent.getPath(), "/cashier/pay_result", false)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[PHI: r9
      0x0015: PHI (r9v4 java.lang.String) = (r9v0 java.lang.String), (r9v5 java.lang.String) binds: [B:9:0x0013, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[PHI: r9
      0x0023: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String), (r9v4 java.lang.String) binds: [B:9:0x0013, B:11:0x0019, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057 A[PHI: r5
      0x0057: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:30:0x0054, B:21:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[PHI: r4 r5
      0x005b: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:33:0x0058, B:24:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v4 java.lang.String) binds: [B:33:0x0058, B:24:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r16, com.bytedance.router.RouteIntent r17) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.common.pay.utils.PayRouteInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}

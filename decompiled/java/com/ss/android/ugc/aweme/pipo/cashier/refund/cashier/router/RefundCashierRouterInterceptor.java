package com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.router;

import X.C1976907ol;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundCashierRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        String path = null;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        if (Intrinsics.LJFF(host, "pipo")) {
            if (routeIntent != null) {
                path = routeIntent.getPath();
            }
            if (Intrinsics.LJFF(path, "/cashier/refund_page")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062 A[PHI: r8
      0x0062: PHI (r8v4 java.lang.String) = (r8v0 java.lang.String), (r8v5 java.lang.String) binds: [B:29:0x0060, B:27:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a A[PHI: r8
      0x006a: PHI (r8v3 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String) binds: [B:29:0x0060, B:31:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086 A[PHI: r11
      0x0086: PHI (r11v15 java.lang.String) = (r11v0 java.lang.String), (r11v16 java.lang.String) binds: [B:43:0x0084, B:41:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e A[PHI: r11
      0x008e: PHI (r11v14 java.lang.String) = (r11v0 java.lang.String), (r11v15 java.lang.String) binds: [B:43:0x0084, B:45:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092 A[PHI: r11 r12
      0x0092: PHI (r11v1 java.lang.String) = (r11v14 java.lang.String), (r11v15 java.lang.String) binds: [B:47:0x0090, B:45:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r12v0 java.lang.String) = (r12v13 java.lang.String), (r12v14 java.lang.String) binds: [B:47:0x0090, B:45:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a A[PHI: r11 r12
      0x009a: PHI (r11v13 java.lang.String) = (r11v1 java.lang.String), (r11v14 java.lang.String) binds: [B:49:0x0098, B:47:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r12v12 java.lang.String) = (r12v0 java.lang.String), (r12v13 java.lang.String) binds: [B:49:0x0098, B:47:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e A[PHI: r11 r12 r13
      0x009e: PHI (r11v12 java.lang.String) = (r11v1 java.lang.String), (r11v13 java.lang.String) binds: [B:49:0x0098, B:51:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r12v11 java.lang.String) = (r12v0 java.lang.String), (r12v12 java.lang.String) binds: [B:49:0x0098, B:51:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r13v11 java.lang.String) = (r13v0 java.lang.String), (r13v12 java.lang.String) binds: [B:49:0x0098, B:51:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6 A[PHI: r11 r12 r13
      0x00a6: PHI (r11v2 java.lang.String) = (r11v12 java.lang.String), (r11v13 java.lang.String) binds: [B:53:0x00a4, B:51:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r12v1 java.lang.String) = (r12v11 java.lang.String), (r12v12 java.lang.String) binds: [B:53:0x00a4, B:51:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r13v1 java.lang.String) = (r13v11 java.lang.String), (r13v12 java.lang.String) binds: [B:53:0x00a4, B:51:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa A[PHI: r11 r12 r13 r14
      0x00aa: PHI (r11v11 java.lang.String) = (r11v2 java.lang.String), (r11v12 java.lang.String) binds: [B:55:0x00a8, B:53:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r12v10 java.lang.String) = (r12v1 java.lang.String), (r12v11 java.lang.String) binds: [B:55:0x00a8, B:53:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r13v10 java.lang.String) = (r13v1 java.lang.String), (r13v11 java.lang.String) binds: [B:55:0x00a8, B:53:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r14v9 java.lang.String) = (r14v0 java.lang.String), (r14v10 java.lang.String) binds: [B:55:0x00a8, B:53:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2 A[PHI: r11 r12 r13 r14
      0x00b2: PHI (r11v10 java.lang.String) = (r11v2 java.lang.String), (r11v11 java.lang.String) binds: [B:55:0x00a8, B:57:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b2: PHI (r12v9 java.lang.String) = (r12v1 java.lang.String), (r12v10 java.lang.String) binds: [B:55:0x00a8, B:57:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b2: PHI (r13v9 java.lang.String) = (r13v1 java.lang.String), (r13v10 java.lang.String) binds: [B:55:0x00a8, B:57:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b2: PHI (r14v8 java.lang.String) = (r14v0 java.lang.String), (r14v9 java.lang.String) binds: [B:55:0x00a8, B:57:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6 A[PHI: r11 r12 r13 r14 r15
      0x00b6: PHI (r11v3 java.lang.String) = (r11v10 java.lang.String), (r11v11 java.lang.String) binds: [B:59:0x00b4, B:57:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r12v2 java.lang.String) = (r12v9 java.lang.String), (r12v10 java.lang.String) binds: [B:59:0x00b4, B:57:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r13v2 java.lang.String) = (r13v9 java.lang.String), (r13v10 java.lang.String) binds: [B:59:0x00b4, B:57:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r14v1 java.lang.String) = (r14v8 java.lang.String), (r14v9 java.lang.String) binds: [B:59:0x00b4, B:57:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r15v0 java.lang.String) = (r15v7 java.lang.String), (r15v8 java.lang.String) binds: [B:59:0x00b4, B:57:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be A[PHI: r11 r12 r13 r14 r15
      0x00be: PHI (r11v9 java.lang.String) = (r11v3 java.lang.String), (r11v10 java.lang.String) binds: [B:61:0x00bc, B:59:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r12v8 java.lang.String) = (r12v2 java.lang.String), (r12v9 java.lang.String) binds: [B:61:0x00bc, B:59:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r13v8 java.lang.String) = (r13v2 java.lang.String), (r13v9 java.lang.String) binds: [B:61:0x00bc, B:59:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r14v7 java.lang.String) = (r14v1 java.lang.String), (r14v8 java.lang.String) binds: [B:61:0x00bc, B:59:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r15v6 java.lang.String) = (r15v0 java.lang.String), (r15v7 java.lang.String) binds: [B:61:0x00bc, B:59:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2 A[PHI: r11 r12 r13 r14 r15 r16
      0x00c2: PHI (r11v8 java.lang.String) = (r11v3 java.lang.String), (r11v9 java.lang.String) binds: [B:61:0x00bc, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r12v7 java.lang.String) = (r12v2 java.lang.String), (r12v8 java.lang.String) binds: [B:61:0x00bc, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r13v7 java.lang.String) = (r13v2 java.lang.String), (r13v8 java.lang.String) binds: [B:61:0x00bc, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r14v6 java.lang.String) = (r14v1 java.lang.String), (r14v7 java.lang.String) binds: [B:61:0x00bc, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r15v5 java.lang.String) = (r15v0 java.lang.String), (r15v6 java.lang.String) binds: [B:61:0x00bc, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r16v5 java.lang.String) = (r16v0 java.lang.String), (r16v6 java.lang.String) binds: [B:61:0x00bc, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca A[PHI: r11 r12 r13 r14 r15 r16
      0x00ca: PHI (r11v4 java.lang.String) = (r11v8 java.lang.String), (r11v9 java.lang.String) binds: [B:65:0x00c8, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r12v3 java.lang.String) = (r12v7 java.lang.String), (r12v8 java.lang.String) binds: [B:65:0x00c8, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r13v3 java.lang.String) = (r13v7 java.lang.String), (r13v8 java.lang.String) binds: [B:65:0x00c8, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r14v2 java.lang.String) = (r14v6 java.lang.String), (r14v7 java.lang.String) binds: [B:65:0x00c8, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r15v1 java.lang.String) = (r15v5 java.lang.String), (r15v6 java.lang.String) binds: [B:65:0x00c8, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r16v1 java.lang.String) = (r16v5 java.lang.String), (r16v6 java.lang.String) binds: [B:65:0x00c8, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce A[PHI: r1 r11 r12 r13 r14 r15 r16
      0x00ce: PHI (r1v15 java.lang.String) = (r1v9 java.lang.String), (r1v17 java.lang.String) binds: [B:67:0x00cc, B:65:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r11v7 java.lang.String) = (r11v4 java.lang.String), (r11v8 java.lang.String) binds: [B:67:0x00cc, B:65:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r12v6 java.lang.String) = (r12v3 java.lang.String), (r12v7 java.lang.String) binds: [B:67:0x00cc, B:65:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r13v6 java.lang.String) = (r13v3 java.lang.String), (r13v7 java.lang.String) binds: [B:67:0x00cc, B:65:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r14v5 java.lang.String) = (r14v2 java.lang.String), (r14v6 java.lang.String) binds: [B:67:0x00cc, B:65:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r15v4 java.lang.String) = (r15v1 java.lang.String), (r15v5 java.lang.String) binds: [B:67:0x00cc, B:65:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r16v4 java.lang.String) = (r16v1 java.lang.String), (r16v5 java.lang.String) binds: [B:67:0x00cc, B:65:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0 A[PHI: r1 r11 r12 r13 r14 r15 r16 r19
      0x00e0: PHI (r1v14 java.lang.String) = (r1v9 java.lang.String), (r1v15 java.lang.String) binds: [B:67:0x00cc, B:72:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r11v6 java.lang.String) = (r11v4 java.lang.String), (r11v7 java.lang.String) binds: [B:67:0x00cc, B:72:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r12v5 java.lang.String) = (r12v3 java.lang.String), (r12v6 java.lang.String) binds: [B:67:0x00cc, B:72:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r13v5 java.lang.String) = (r13v3 java.lang.String), (r13v6 java.lang.String) binds: [B:67:0x00cc, B:72:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r14v4 java.lang.String) = (r14v2 java.lang.String), (r14v5 java.lang.String) binds: [B:67:0x00cc, B:72:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r15v3 java.lang.String) = (r15v1 java.lang.String), (r15v4 java.lang.String) binds: [B:67:0x00cc, B:72:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r16v3 java.lang.String) = (r16v1 java.lang.String), (r16v4 java.lang.String) binds: [B:67:0x00cc, B:72:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r19v2 java.lang.String) = (r19v0 java.lang.String), (r19v3 java.lang.String) binds: [B:67:0x00cc, B:72:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r22, com.bytedance.router.RouteIntent r23) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.router.RefundCashierRouterInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}

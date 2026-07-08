package com.ss.android.ugc.aweme.detail.route;

import X.C01GW;
import X.C1976907ol;
import X.C452501pT;
import X.InterfaceC21392018ne;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.detail.ui.saf.WithoutShellDetailSafRootFragment;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class DetailRouterInterceptor implements IInterceptor {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(98));

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0005  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r6) {
        /*
            r5 = this;
            r4 = 0
            r3 = 0
            if (r6 == 0) goto L5
            goto L7
        L5:
            r2 = r3
            goto L19
        L7:
            android.net.Uri r0 = r6.getUri()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L5
            java.util.List r0 = r0.getPathSegments()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L5
            java.lang.Object r2 = X.C13LP.LJJJLZIJ(r4, r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3c
        L19:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L29
            android.net.Uri r0 = r6.getUri()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L29
            java.lang.String r3 = r0.getHost()     // Catch: java.lang.Throwable -> L3c
        L29:
            r1.append(r3)     // Catch: java.lang.Throwable -> L3c
            r0 = 47
            r1.append(r0)     // Catch: java.lang.Throwable -> L3c
            r1.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L3c
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L3c
            goto L48
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L48:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L5d
            if (r1 == 0) goto L5d
            X.01GW r0 = r5.LL
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r1)
            return r0
        L5d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.route.DetailRouterInterceptor.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    public static void LIZ(WithoutShellDetailSafRootFragment withoutShellDetailSafRootFragment, InterfaceC21392018ne interfaceC21392018ne) {
        withoutShellDetailSafRootFragment.aS(new AwS603S0100000_24(interfaceC21392018ne, 451));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r25, com.bytedance.router.RouteIntent r26) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.route.DetailRouterInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}

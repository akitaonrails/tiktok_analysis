package com.bytedance.pipo.ttpay.recharge.util;

import X.C1976907ol;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class RechargeInterceptor implements IInterceptor {
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
        return Intrinsics.LJFF(host, "pipo");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r9, com.bytedance.router.RouteIntent r10) {
        /*
            r8 = this;
            r6 = 0
            if (r10 == 0) goto L9c
            java.lang.String r1 = r10.getPath()
            java.lang.String r0 = "/recharge"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9c
            android.content.Intent r0 = r10.getExtra()
            r2 = 0
            if (r0 == 0) goto L21
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L21
            goto L23
        L1d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L21:
            r1 = r2
            goto L29
        L23:
            java.lang.String r0 = "ui_type"
            java.lang.String r1 = r1.getString(r0)
        L29:
            java.lang.String r0 = "HALF_PAGE"
            boolean r0 = kotlin.text.u.LJIJI(r1, r0, r6)
            if (r0 == 0) goto L9c
            java.lang.String r0 = com.bytedance.pipo.ttpay.recharge.RechargeFragment._pnsPageId
            X.0umP r0 = X.C1717770unn.LIZIZ()
            X.0mCc r0 = r0.LIZJ()
            if (r0 == 0) goto L48
            androidx.fragment.app.FragmentManager r4 = r0.LJ()
        L41:
            android.content.Intent r0 = r10.getExtra()
            if (r0 == 0) goto L53
            goto L4a
        L48:
            r4 = r2
            goto L41
        L4a:
            android.os.Bundle r2 = r0.getExtras()     // Catch: java.lang.Exception -> L4f
            goto L53
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L53:
            if (r9 == 0) goto L9c
            if (r4 == 0) goto L9c
            com.bytedance.pipo.ttpay.recharge.RechargeFragment r1 = new com.bytedance.pipo.ttpay.recharge.RechargeFragment
            r1.<init>()
            r1.setArguments(r2)
            X.0mIc r7 = new X.0mIc
            r7.<init>(r6, r6)
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r7.LIZ
            r0.LLJJIJIIJIL = r6
            r0.LLJJIJI = r1
            r5 = 1
            r7.LJIIIIZZ(r5)
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r7.LIZ
            r0.LLJLILLLLZIIL = r6
            X.0uus r0 = X.C1717770unn.LIZJ()
            X.0uuq r0 = r0.LJIIZILJ()
            int r0 = r0.LIZ(r9)
            double r2 = (double) r0
            r0 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r2 = r2 * r0
            int r1 = (int) r2
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r7.LIZ
            r0.LLJJL = r1
            r0 = 2131886994(0x7f120392, float:1.9408583E38)
            r7.LIZLLL(r0, r6)
            com.bytedance.tux.sheet.sheet.TuxSheet r1 = r7.LIZ
            r1.LLILLL = r5
            r1.LLJLL = r5
            java.lang.String r0 = "recharge_fragment"
            r1.show(r4, r0)
            r6 = 1
        L9c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.ttpay.recharge.util.RechargeInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}

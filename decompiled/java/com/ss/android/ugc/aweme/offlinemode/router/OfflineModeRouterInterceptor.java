package com.ss.android.ugc.aweme.offlinemode.router;

import X.AbstractC848400XPy;
import X.C0C64;
import X.C0XQ7;
import X.C1976907ol;
import X.C625820Oge;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r7) {
        /*
            r6 = this;
            r2 = 0
            if (r7 == 0) goto L96
            android.net.Uri r5 = r7.getUri()
            if (r5 == 0) goto L96
            java.lang.String r1 = r5.getHost()
            if (r1 != 0) goto L10
            return r2
        L10:
            java.lang.String r3 = r5.getPath()
            java.lang.String r0 = "aweme"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L96
            r1 = 1
            if (r3 == 0) goto L96
            java.lang.String r0 = "/detail"
            boolean r0 = kotlin.text.a0.LJJIIZI(r3, r0, r2)
            if (r0 != r1) goto L96
            java.lang.String r1 = "video_type"
            java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r5, r1)
            r3 = 0
            if (r4 != 0) goto L56
            android.content.Intent r0 = r7.getExtra()
            if (r0 == 0) goto L55
            android.os.Bundle r0 = r0.getExtras()     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L55
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.OutOfMemoryError -> L47 java.lang.Exception -> L51
            if (r0 == 0) goto L55
            java.lang.String r4 = r0.toString()
            goto L56
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L55
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L55
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L55:
            r4 = r3
        L56:
            java.lang.String r1 = "video_from"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r5, r1)
            if (r0 != 0) goto L7f
            android.content.Intent r0 = r7.getExtra()
            if (r0 == 0) goto L85
            android.os.Bundle r0 = r0.getExtras()     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L85
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L75 java.lang.OutOfMemoryError -> L81
            if (r0 == 0) goto L85
            java.lang.String r3 = r0.toString()
            goto L85
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L85
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L85
        L7f:
            r3 = r0
            goto L85
        L81:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L85:
            java.lang.String r0 = "50"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L96
            java.lang.String r0 = "from_offline_mode"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L96
            r2 = 1
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinemode.router.OfflineModeRouterInterceptor.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "offline_mode_router_interceptor", true) != 1) {
            return false;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || !C625820Oge.LIZ()) {
            return true;
        }
        return false;
    }
}

package com.ss.android.ugc.aweme.ecommerce.ug.trending.router;

import X.C0XQS;
import X.C0XQT;
import X.C1776060wJo;
import X.C1976907ol;
import android.app.Activity;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ECTrendingRouterInterceptor implements IInterceptor {
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
        if (Intrinsics.LJFF(host, "ec")) {
            if (Intrinsics.LJFF(routeIntent.getPath(), "/trending_feed") || Intrinsics.LJFF(routeIntent.getPath(), "/auction_feed")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LIZ(Activity activity, Function0<Unit> function0) {
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            if (!iAccountService.LJIIJ().isLogin()) {
                ILoginService iLoginServiceLIZJ = iAccountService.LIZJ();
                C0XQS c0xqs = new C0XQS();
                c0xqs.LIZ = activity;
                iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
                C1776060wJo c1776060wJo = new C1776060wJo(function0, 2);
                IAccountService iAccountService2 = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                if (iAccountService2 != null) {
                    iAccountService2.LJIILL(c1776060wJo);
                    return;
                }
                return;
            }
            function0.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r19, com.bytedance.router.RouteIntent r20) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.trending.router.ECTrendingRouterInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}

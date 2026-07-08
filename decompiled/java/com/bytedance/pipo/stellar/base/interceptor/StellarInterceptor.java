package com.bytedance.pipo.stellar.base.interceptor;

import X.C0PEM;
import X.C1717780uno;
import X.C1776140wJw;
import X.C1976907ol;
import X.C23250099c;
import X.C817503Hh;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarInterceptor implements IInterceptor {
    public final C1776140wJw LL = new C1776140wJw(CoroutineExceptionHandler.LJJLIL, 0);

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

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String url;
        if (routeIntent != null && Intrinsics.LJFF(routeIntent.getPath(), "/stellar/resolver") && (url = routeIntent.getUrl()) != null && url.length() != 0) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ.plus(this.LL), null, new C1717780uno(url, null), 2);
        }
        return false;
    }
}

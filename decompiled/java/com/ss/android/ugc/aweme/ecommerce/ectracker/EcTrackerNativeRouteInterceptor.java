package com.ss.android.ugc.aweme.ecommerce.ectracker;

import X.C1976907ol;
import X.C848510XQj;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckIntegrateImpl;

/* JADX INFO: loaded from: classes14.dex */
public final class EcTrackerNativeRouteInterceptor implements IInterceptor {
    public static final EcTrackerNativeRouteInterceptor LL = new EcTrackerNativeRouteInterceptor();

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent != null && (url = routeIntent.getUrl()) != null && SmartCheckIntegrateImpl.LIZLLL().LIZ(routeIntent.getUrl())) {
            C848510XQj.LIZ.getClass();
            C848510XQj.LIZ(url);
            return false;
        }
        return false;
    }
}

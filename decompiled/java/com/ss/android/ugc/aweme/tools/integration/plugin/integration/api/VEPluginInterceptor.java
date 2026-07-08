package com.ss.android.ugc.aweme.tools.integration.plugin.integration.api;

import X.C1976907ol;
import X.C535670Kzd;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

/* JADX INFO: loaded from: classes4.dex */
public class VEPluginInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (context != null && routeIntent != null) {
            return !C535670Kzd.LIZ().LIZJ(context, "router", true);
        }
        return false;
    }
}

package com.ss.android.ugc.aweme.ecommerce.ug.deeplink.router;

import X.C1768580w7k;
import X.C1976907ol;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        C1768580w7k c1768580w7k = C1768580w7k.LIZ;
        Uri uri2 = null;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        c1768580w7k.getClass();
        if (!C1768580w7k.LIZIZ(uri)) {
            if (routeIntent != null) {
                uri2 = routeIntent.getUri();
            }
            if (!C1768580w7k.LIZJ(uri2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        Uri uriLIZ;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            C1768580w7k.LIZ.getClass();
            if ((C1768580w7k.LIZIZ(uri) || C1768580w7k.LIZJ(uri)) && (uriLIZ = C1768580w7k.LIZ(uri, false, false)) != null) {
                C1768580w7k.LIZLLL(context, uriLIZ);
                return true;
            }
        }
        return false;
    }
}

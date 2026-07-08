package com.ss.android.ugc.aweme.ecommerce.router;

import X.C1976907ol;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomHybridInterceptor implements IInterceptor {
    public static final Uri LL = UriProtector.parse("aweme://echybrid");

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            String scheme = uri.getScheme();
            Uri uri2 = LL;
            if (TextUtils.equals(scheme, uri2.getScheme()) && TextUtils.equals(uri.getAuthority(), uri2.getAuthority()) && TextUtils.equals(uri.getPath(), uri2.getPath())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r18, com.bytedance.router.RouteIntent r19) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.router.EcomHybridInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}

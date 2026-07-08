package com.ss.android.ugc.aweme.search.entry.core.viewmodel;

import X.C1976907ol;
import X.C2188811AlT;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

/* JADX INFO: loaded from: classes4.dex */
public final class SearchInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        String path;
        String host2;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path2 = null;
        if (routeIntent != null && (uri4 = routeIntent.getUri()) != null) {
            host = uri4.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
            path = uri3.getPath();
        } else {
            path = null;
        }
        sbLIZ.append(path);
        if (!TextUtils.equals(C2188811AlT.LIZIZ(sbLIZ), "search")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
                host2 = uri2.getHost();
            } else {
                host2 = null;
            }
            sbLIZ2.append(host2);
            if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
                path2 = uri.getPath();
            }
            sbLIZ2.append(path2);
            if (!TextUtils.equals(C2188811AlT.LIZIZ(sbLIZ2), "search/")) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r13, com.bytedance.router.RouteIntent r14) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.entry.core.viewmodel.SearchInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}

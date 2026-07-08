package com.ss.android.ugc.aweme.tako.common.utils;

import X.C1976907ol;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class TakoSmartRouterInterceptor implements IInterceptor {
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
        String host;
        String path;
        String path2;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        String path3 = null;
        if (routeIntent != null && (uri4 = routeIntent.getUri()) != null) {
            host = uri4.getHost();
        } else {
            host = null;
        }
        if (Intrinsics.LJFF("tako", host)) {
            if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
                path = uri3.getPath();
            } else {
                path = null;
            }
            if (!Intrinsics.LJFF("/host", path)) {
                if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
                    path2 = uri2.getPath();
                } else {
                    path2 = null;
                }
                if (!Intrinsics.LJFF("/ai_bot", path2)) {
                    if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
                        path3 = uri.getPath();
                    }
                    if (Intrinsics.LJFF("/share/page", path3)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }
}

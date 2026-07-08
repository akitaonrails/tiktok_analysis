package com.ss.android.ugc.aweme.poi.detail.container;

import X.C1976907ol;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailPageInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        Uri uri2;
        String string2;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null && (string = uri.toString()) != null && a0.LJJIIZI(string, "aweme://poi/detail", false) && (uri2 = routeIntent.getUri()) != null && (string2 = uri2.toString()) != null && !a0.LJJIIZI(string2, "aweme://poi/new_detail", false)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06b7  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r60, com.bytedance.router.RouteIntent r61) {
        /*
            Method dump skipped, instruction units count: 2247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.PoiDetailPageInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}

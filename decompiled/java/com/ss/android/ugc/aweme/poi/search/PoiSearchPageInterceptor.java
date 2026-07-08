package com.ss.android.ugc.aweme.poi.search;

import X.C1976907ol;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class PoiSearchPageInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !a0.LJJIIZI(string, "//poi/search", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Intent extra;
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            extra.putExtra("page_start_ts", System.currentTimeMillis());
            return false;
        }
        return false;
    }
}

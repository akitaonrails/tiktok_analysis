package com.ss.android.ugc.aweme.poi;

import X.C1976907ol;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class PoiDefaultPrfTrackInterceptor implements IInterceptor {
    public static final List<String> LL = new ArrayList();

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        for (String str : (ArrayList) LL) {
            if (routeIntent != null && (uri = routeIntent.getUri()) != null && (string = uri.toString()) != null && a0.LJJIIZI(string, str, false)) {
                return true;
            }
        }
        return false;
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

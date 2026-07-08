package com.ss.android.ugc.aweme.search.entry.core.viewmodel;

import X.C0CNO;
import X.C1976907ol;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchRootPageNodeInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent == null || (url = routeIntent.getUrl()) == null || !a0.LJJIIZI(url, "aweme://main", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        C0CNO.LIZLLL(0L, AFwS196S0000000_10.get$arr$(190));
        return false;
    }
}

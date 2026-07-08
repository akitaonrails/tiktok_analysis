package com.ss.android.ugc.aweme.inbox.tablet.router;

import X.C19252910Tv;
import X.C1976907ol;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

/* JADX INFO: loaded from: classes29.dex */
public final class TabletInboxInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        return C19252910Tv.LIZIZ.LIZLLL().LJIIL().LIZJ(routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        return C19252910Tv.LIZIZ.LIZLLL().LJIIL().LJIIIIZZ(routeIntent);
    }
}

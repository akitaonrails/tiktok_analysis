package com.ss.android.ugc.aweme.poi.videopublish.retag;

import X.C1525005y4;
import X.C1976907ol;
import X.C23250099c;
import X.C817503Hh;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class PoiRequestAwemeInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !a0.LJJIIZI(string, "//poi/requestAweme", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1525005y4(context, routeIntent, null), 3);
        return true;
    }
}

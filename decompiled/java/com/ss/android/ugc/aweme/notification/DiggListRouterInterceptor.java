package com.ss.android.ugc.aweme.notification;

import X.C1720106oR;
import X.C1976907ol;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C262000AOo;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class DiggListRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("matchInterceptRules path = ");
        String host2 = null;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        C1720106oR.LJI("DiggListRouterInterceptor", C2188811AlT.LIZIZ(sbLIZ));
        if (routeIntent != null) {
            host2 = routeIntent.getHost();
        }
        if (Intrinsics.LJFF(host2, "digglist")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String url;
        if (C262000AOo.LIZIZ && matchInterceptRules(routeIntent) && routeIntent != null && (url = routeIntent.getUrl()) != null) {
            String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(url, "diggType", "digg_type", false), "awemeId", "aweme_id", false), "refId", "ref_id", false), "isNew", "is_new", false), "coverURL", "cover_url", false), "lastReadTime", "last_read_time", false);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInterceptRoute replaceResult = ");
            sbLIZ.append(strLJJIFFI);
            C1720106oR.LJI("DiggListRouterInterceptor", C2188811AlT.LIZIZ(sbLIZ));
            routeIntent.setUrl(strLJJIFFI);
        }
        return false;
    }
}

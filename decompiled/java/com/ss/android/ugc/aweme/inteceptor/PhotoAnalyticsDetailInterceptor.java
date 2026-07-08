package com.ss.android.ugc.aweme.inteceptor;

import X.C1976907ol;
import X.C2188811AlT;
import X.C2241508qL;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PhotoAnalyticsDetailInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String scheme;
        String host;
        Uri uri;
        Uri uri2;
        Uri uri3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path = null;
        if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
            scheme = uri3.getScheme();
        } else {
            scheme = null;
        }
        sbLIZ.append(scheme);
        sbLIZ.append("://");
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            host = uri2.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            path = uri.getPath();
        }
        sbLIZ.append(path);
        return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "aweme://photo_analytics");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle extras;
        Intent extra;
        Intent extra2;
        if (((Boolean) C2241508qL.LIZ.getValue()).booleanValue()) {
            if (routeIntent != null && (extra2 = routeIntent.getExtra()) != null) {
                extra2.putExtra("video_from", "from_photo_analytics_detail");
                extra2.putExtra("refer", "analytics");
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aweme/detail");
            if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                try {
                    extras = extra.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    extras = null;
                }
            } else {
                extras = null;
            }
            smartRouteBuildRoute.withParam(extras);
            smartRouteBuildRoute.open();
            return true;
        }
        return false;
    }
}

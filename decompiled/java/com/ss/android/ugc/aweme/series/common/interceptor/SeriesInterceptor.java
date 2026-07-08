package com.ss.android.ugc.aweme.series.common.interceptor;

import X.C1976907ol;
import X.C2188811AlT;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SeriesInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        boolean z;
        String scheme;
        String host;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Intent extra;
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null && extra.getBooleanExtra("has_not_been_intercepted", false)) {
            z = true;
        } else {
            z = false;
        }
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
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int iHashCode = strLIZIZ.hashCode();
        if (iHashCode != -951796768) {
            if (iHashCode != 43577964) {
                if (iHashCode != 196682080 || !strLIZIZ.equals("aweme://paidcontent/collections/detail")) {
                    return false;
                }
            } else if (!strLIZIZ.equals("aweme://paidcontent/collections/detail/reviews")) {
                return false;
            }
        } else if (!strLIZIZ.equals("aweme://paidcontent/collections")) {
            return false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String scheme;
        String host;
        String path;
        SmartRoute smartRouteBuildRoute;
        Intent extra;
        Intent extra2;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Intent extra3;
        Intent extra4;
        String string = UUID.randomUUID().toString();
        if (routeIntent != null && (extra4 = routeIntent.getExtra()) != null) {
            extra4.putExtra("ttrc_session_id", string);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (routeIntent != null && (extra3 = routeIntent.getExtra()) != null) {
            extra3.putExtra("ttrc_session_start_time", jElapsedRealtime);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Bundle extras = null;
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
        } else {
            path = null;
        }
        sbLIZ.append(path);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(strLIZIZ, "aweme://paidcontent/collections/detail/reviews")) {
            smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://paidcontent/collections/detail");
            if (routeIntent != null && (extra2 = routeIntent.getExtra()) != null) {
                try {
                    extras = extra2.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            smartRouteBuildRoute.withParam(extras);
            smartRouteBuildRoute.withParam("review_details", true);
        } else {
            smartRouteBuildRoute = SmartRouter.buildRoute(context, strLIZIZ);
            if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                try {
                    extras = extra.getExtras();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            smartRouteBuildRoute.withParam(extras);
        }
        smartRouteBuildRoute.withParam("has_not_been_intercepted", true);
        smartRouteBuildRoute.open();
        return true;
    }
}

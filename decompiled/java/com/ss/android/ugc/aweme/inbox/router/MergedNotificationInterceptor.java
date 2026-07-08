package com.ss.android.ugc.aweme.inbox.router;

import X.C0ZC2;
import X.C13LQ;
import X.C1720106oR;
import X.C1976907ol;
import X.C2188811AlT;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;

/* JADX INFO: loaded from: classes29.dex */
public final class MergedNotificationInterceptor implements IInterceptor {
    public static final Set<String> LL = C13LQ.LJLIIL(new String[]{"user/inbox/follower", "inbox/followers"});
    public static final Set<String> LLILLJJLI = C13LQ.LJLIIL(new String[]{"user/notification", "inbox/activity", "user/inbox/follower", "inbox/followers"});

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public static String LIZ(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String host = uri.getHost();
            String str = "";
            if (host == null) {
                host = "";
            }
            sbLIZ.append(host);
            String path = uri.getPath();
            if (path != null) {
                str = path;
            }
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String strLIZ = LIZ(routeIntent);
        if (strLIZ == null) {
            return false;
        }
        return LLILLJJLI.contains(strLIZ);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String strLIZ;
        Intent extra;
        if (!C0ZC2.LIZ() || (strLIZ = LIZ(routeIntent)) == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("intercepting route: ");
        Uri uri = null;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        }
        sbLIZ.append(uri);
        C1720106oR.LJI("MergedNotificationInterceptor", C2188811AlT.LIZIZ(sbLIZ));
        boolean zContains = LL.contains(strLIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://inbox/merged_activity_followers");
        smartRouteBuildRoute.withParam("default_tab", zContains ? 1 : 0);
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            try {
                Bundle extras = extra.getExtras();
                if (extras != null) {
                    smartRouteBuildRoute.withParam(extras);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        smartRouteBuildRoute.open();
        return true;
    }
}

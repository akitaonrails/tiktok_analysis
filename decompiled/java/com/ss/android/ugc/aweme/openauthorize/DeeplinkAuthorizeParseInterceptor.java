package com.ss.android.ugc.aweme.openauthorize;

import X.C1976907ol;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class DeeplinkAuthorizeParseInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String path;
        if (routeIntent == null || (path = routeIntent.getPath()) == null || !a0.LJJIIZI(path, "aweme://v2/authorize", false)) {
            return false;
        }
        return true;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Intent extra;
        if (context == null || routeIntent == null || (extra = routeIntent.getExtra()) == null || LIZ(extra, "client_key") == null) {
            return false;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://v2/authorize");
        smartRouteBuildRoute.withParam("_bytedance_params_client_key", LIZ(extra, "client_key"));
        smartRouteBuildRoute.withParam("_bytedance_params_scope", LIZ(extra, "scope"));
        smartRouteBuildRoute.withParam("_bytedance_params_state", LIZ(extra, "state"));
        smartRouteBuildRoute.withParam("_bytedance_params_redirect_uri", LIZ(extra, "redirect_uri"));
        smartRouteBuildRoute.withParam("_bytedance_params_response_type", LIZ(extra, "response_type"));
        smartRouteBuildRoute.withParam("_bytedance_params_source", "web");
        smartRouteBuildRoute.open();
        return true;
    }
}

package com.ss.android.ugc.aweme.compliance.common.hydrogen;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.RewriteManager;
import com.bytedance.router.util.Util;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public final class HydrogenInterceptor extends RewriteManager {
    @Override // com.bytedance.router.interceptor.RewriteManager, com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Object obj;
        Uri.Builder builderBuildUpon = UriProtector.parse(Util.getRouteUrl(routeIntent.getUrl())).buildUpon();
        Intent extra = routeIntent.getExtra();
        if (extra != null) {
            try {
                Bundle extras = extra.getExtras();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        try {
                            obj = extras.get(str);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            obj = null;
                        } catch (OutOfMemoryError e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            obj = null;
                        }
                        builderBuildUpon.appendQueryParameter(str, String.valueOf(obj));
                    }
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        SmartRouter.buildRoute(context, builderBuildUpon.build().toString()).open();
        return true;
    }
}

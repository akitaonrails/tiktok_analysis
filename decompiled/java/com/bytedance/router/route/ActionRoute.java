package com.bytedance.router.route;

import android.content.Context;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes33.dex */
public class ActionRoute extends BaseRoute {
    public IRouteAction mMethodRoute;

    public ActionRoute(Class cls) {
        try {
            this.mMethodRoute = (IRouteAction) cls.newInstance();
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // com.bytedance.router.route.IRoute
    public void open(Context context) {
        String url;
        OpenResultCallback callback;
        if (this.mMethodRoute != null && (url = getUrl()) != null) {
            Object objOpen = this.mMethodRoute.open(context, url, getParams());
            RouteIntent routeIntent = getRouteIntent();
            if (routeIntent != null && (callback = routeIntent.getCallback()) != null) {
                callback.onActionResult(objOpen);
            }
            RouteManager.getInstance().getRouteCallbackProxy().onSuccess();
        }
    }
}

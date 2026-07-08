package com.bytedance.router.route;

import X.C2188811AlT;
import X.C786410Ut5;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.MultiRouteIntent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RoutesConfig;
import com.bytedance.router.fragment.FragmentNavigationRouteIntent;
import com.bytedance.router.saf.SAFNavigationRoute;
import com.bytedance.router.saf.SAFRouteIntent;
import com.bytedance.router.util.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes33.dex */
public class RouteFactory {
    public static boolean isSchemeLegal(String str, RoutesConfig routesConfig) {
        if (str.equals(routesConfig.getScheme())) {
            return true;
        }
        String[] otherSchemes = routesConfig.getOtherSchemes();
        if (otherSchemes != null && otherSchemes.length > 0) {
            for (String str2 : otherSchemes) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static BaseRoute createRoute(RouteIntent routeIntent, String str, RoutesConfig routesConfig) {
        if (routeIntent instanceof MultiRouteIntent) {
            return new MultiRoute();
        }
        if (routeIntent instanceof FragmentNavigationRouteIntent) {
            return new FragmentNavigationRoute();
        }
        if (routeIntent instanceof SAFRouteIntent) {
            return new SAFNavigationRoute();
        }
        String url = routeIntent.getUrl();
        if (TextUtils.isEmpty(url)) {
            Logger.e("RouteFactory#createRoute url is null!!!");
            return null;
        }
        Uri uri = UriProtector.parse(url);
        if (!uri.isHierarchical()) {
            Logger.e("RouteFactory#createRoute url is not illegal!!!");
            return null;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            Logger.e("RouteFactory#createRoute scheme is null!!!");
            return null;
        }
        String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            Logger.e("RouteFactory#createRoute host is null!!!");
            return null;
        }
        if (!isSchemeLegal(scheme, routesConfig)) {
            Logger.e(C786410Ut5.j4("RouteFactory#createRoute router cannot support this scheme protocol: %s\nRouteConfig:\n%s", new Object[]{routeIntent.getUrl(), routesConfig.toString()}));
            return null;
        }
        if (host.startsWith("bt.")) {
            Class<? extends BaseRoute> routeClass = routesConfig.getRouteClass(host);
            if (routeClass == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RouteFactory#createRoute there is no route for this host: ");
                sbLIZ.append(host);
                Logger.e(C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            try {
                return routeClass.newInstance();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Logger.e("RouteFactory#createRoute routeClass new instance exception!!!");
                return null;
            }
        }
        try {
            Class<?> cls = Class.forName(str);
            if (cls != null) {
                if (Service.class.isAssignableFrom(cls)) {
                    return new ServiceRoute();
                }
                if (BroadcastReceiver.class.isAssignableFrom(cls)) {
                    return new BroadcastRoute();
                }
                if (IRouteAction.class.isAssignableFrom(cls)) {
                    return new ActionRoute(cls);
                }
            }
        } catch (ClassNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return new ActivityRoute();
    }
}

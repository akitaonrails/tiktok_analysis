package com.bytedance.router.route;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteMapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes33.dex */
public abstract class BaseRoute implements IRoute {
    public RouteIntent mRouteIntent;
    public RouteMapper mRouteMapper;
    public String mUrl = "";
    public Uri mUri = UriProtector.parse("");

    public Intent getComponent(Context context) {
        return null;
    }

    @Override // com.bytedance.router.route.IRoute
    public String getHost() {
        return this.mUri.getHost();
    }

    @Override // com.bytedance.router.route.IRoute
    public Bundle getParams() {
        RouteIntent routeIntent = this.mRouteIntent;
        return (routeIntent == null || routeIntent.getExtra() == null) ? new Bundle() : INVOKEVIRTUAL_com_bytedance_router_route_BaseRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this.mRouteIntent.getExtra());
    }

    @Override // com.bytedance.router.route.IRoute
    public String getPath() {
        return this.mUri.getPath();
    }

    @Override // com.bytedance.router.route.IRoute
    public String getScheme() {
        return this.mUri.getScheme();
    }

    public String getTargetClass() {
        RouteIntent routeIntent = this.mRouteIntent;
        return routeIntent != null ? getTargetClass(this.mUrl, routeIntent.isExternalType()) : "";
    }

    public RouteIntent getRouteIntent() {
        return this.mRouteIntent;
    }

    @Override // com.bytedance.router.route.IRoute
    public String getUrl() {
        return this.mUrl;
    }

    public static Bundle INVOKEVIRTUAL_com_bytedance_router_route_BaseRoute_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public String getTargetClass(String str, boolean z) {
        RouteMapper routeMapper = this.mRouteMapper;
        if (routeMapper != null) {
            return routeMapper.getTargetClass(str, z);
        }
        return "";
    }

    public void init(RouteIntent routeIntent, RouteMapper routeMapper) {
        this.mRouteIntent = routeIntent;
        String url = routeIntent.getUrl();
        this.mUrl = url;
        this.mUri = UriProtector.parse(url);
        this.mRouteMapper = routeMapper;
    }
}

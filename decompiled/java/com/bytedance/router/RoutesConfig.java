package com.bytedance.router;

import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.router.route.BaseRoute;
import com.bytedance.router.route.BroadcastRoute;
import com.bytedance.router.route.ServiceRoute;
import com.bytedance.router.util.Logger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class RoutesConfig {
    public Set<String> mOtherSchemeSet;
    public String[] mOtherSchemes = new String[0];
    public Map<String, Class<? extends BaseRoute>> mRouteMap;
    public String mScheme;

    public static RoutesConfig defaultConfig() {
        RoutesConfig routesConfig = new RoutesConfig("snssdk143");
        routesConfig.withOtherSchemes(RouterConstant.DEFAULT_HISTORY_SCHEME);
        routesConfig.withSupportRoute("bt.service", ServiceRoute.class);
        routesConfig.withSupportRoute("bt.broadcast", BroadcastRoute.class);
        return routesConfig;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("scheme:");
        sb.append(this.mScheme);
        sb.append("\nother schemes: ");
        String[] strArr = this.mOtherSchemes;
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(',');
            }
            sb.append("\n");
        }
        Map<String, Class<? extends BaseRoute>> map = this.mRouteMap;
        int size = map != null ? map.size() : 0;
        sb.append(C786410Ut5.j4("other supported routes: %s routes\n", new Object[]{Integer.valueOf(size)}));
        if (size > 0) {
            for (Map.Entry<String, Class<? extends BaseRoute>> entry : this.mRouteMap.entrySet()) {
                sb.append("\t");
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue().getName());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public String[] getOtherSchemes() {
        return this.mOtherSchemes;
    }

    public String getScheme() {
        return this.mScheme;
    }

    public RoutesConfig(String str) {
        this.mScheme = str;
        HashMap map = new HashMap();
        this.mRouteMap = map;
        map.put("bt.service", ServiceRoute.class);
        this.mRouteMap.put("bt.broadcast", BroadcastRoute.class);
    }

    public Class<? extends BaseRoute> getRouteClass(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mRouteMap.get(str);
    }

    public boolean supportScheme(String str) {
        if (str == null || str.length() == 0 || str.equals(this.mScheme)) {
            return true;
        }
        Set<String> set = this.mOtherSchemeSet;
        if (set != null && set.contains(str)) {
            return true;
        }
        return false;
    }

    public RoutesConfig withOtherSchemes(String[] strArr) {
        this.mOtherSchemes = strArr;
        if (strArr != null && strArr.length != 0) {
            Set<String> set = this.mOtherSchemeSet;
            if (set != null) {
                set.clear();
            } else {
                this.mOtherSchemeSet = new HashSet();
            }
            this.mOtherSchemeSet.addAll(Arrays.asList(strArr));
            return this;
        }
        this.mOtherSchemeSet = null;
        return this;
    }

    public RoutesConfig withSupportRoute(String str, Class<? extends BaseRoute> cls) {
        if (!TextUtils.isEmpty(str) && cls != null) {
            if (this.mRouteMap == null) {
                this.mRouteMap = new HashMap();
            }
            this.mRouteMap.put(str, cls);
            return this;
        }
        Logger.w("RoutesConfig#withHostRoute() host or routeClass is null!!!");
        return this;
    }
}

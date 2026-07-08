package com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory;

import X.C1976907ol;
import X.C2188811AlT;
import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory.WatchHistorySchemeSetting;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class WatchHistoryInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        Uri uri2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path = null;
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
        return a0.LJJIIZI(C2188811AlT.LIZIZ(sbLIZ), "watch/history", false);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Object value;
        Double d;
        Map map;
        Set<Map.Entry> setEntrySet;
        Object value2;
        Double d2;
        Object value3;
        Double d3;
        if (context == null) {
            return false;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        WatchHistorySchemeSetting.ActivityCenterSettingModel activityCenterSettingModel = WatchHistorySchemeSetting.LIZ;
        WatchHistorySchemeSetting.ActivityCenterSettingModel activityCenterSettingModel2 = (WatchHistorySchemeSetting.ActivityCenterSettingModel) settingsManagerLIZLLL.LJIIIIZZ("activity_center_entrance", WatchHistorySchemeSetting.ActivityCenterSettingModel.class, activityCenterSettingModel);
        if (activityCenterSettingModel2 != null) {
            activityCenterSettingModel = activityCenterSettingModel2;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(String.valueOf(activityCenterSettingModel.url.get("wh"))).buildUpon();
        Iterator<T> it2 = activityCenterSettingModel.urlQuery.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object value4 = entry.getValue();
            if ((value4 instanceof Double) && (d3 = (Double) value4) != null) {
                value3 = Integer.valueOf((int) d3.doubleValue());
            } else {
                value3 = entry.getValue();
            }
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), value3.toString());
        }
        Object obj = activityCenterSettingModel.specialUrlQuery.get("nativeFallback");
        if ((obj instanceof Map) && (map = (Map) obj) != null && (setEntrySet = map.entrySet()) != null) {
            for (Map.Entry entry2 : setEntrySet) {
                Object value5 = entry2.getValue();
                if ((value5 instanceof Double) && (d2 = (Double) value5) != null) {
                    value2 = Integer.valueOf((int) d2.doubleValue());
                } else {
                    value2 = entry2.getValue();
                }
                builderBuildUpon.appendQueryParameter(String.valueOf(entry2.getKey()), String.valueOf(value2));
            }
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview");
        smartRouteBuildRoute.withParam("url", builderBuildUpon.toString());
        Iterator<T> it3 = activityCenterSettingModel.schemaQuery.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            Object value6 = entry3.getValue();
            if ((value6 instanceof Double) && (d = (Double) value6) != null) {
                value = Integer.valueOf((int) d.doubleValue());
            } else {
                value = entry3.getValue();
            }
            smartRouteBuildRoute.withParam((String) entry3.getKey(), value.toString());
        }
        smartRouteBuildRoute.open();
        return true;
    }
}

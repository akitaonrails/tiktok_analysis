package com.bytedance.router.monitor;

import X.C19719512Dh;
import X.C2097608Jq;
import X.C2188811AlT;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.Constants;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class RouterMonitor {
    public static String currentRouteId;
    public static RouterMonitorListener mRouterMonitorListener;
    public static final RouterMonitor INSTANCE = new RouterMonitor();
    public static Map<String, RouteInfo> routeInfoMap = new LinkedHashMap();

    private final String generateRouteId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(String.valueOf(System.currentTimeMillis()));
        sbLIZ.append("-");
        sbLIZ.append(UUID.randomUUID().toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final JSONObject formatRouteLog(RouteInfo routeInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Constants.Companion companion = Constants.Companion;
        jSONObject.put(companion.getKEY_URL(), routeInfo.getUrl());
        jSONObject.put(companion.getKEY_SCHEME(), routeInfo.getScheme());
        jSONObject.put(companion.getKEY_HOST(), routeInfo.getHost());
        jSONObject.put(companion.getKEY_PATH(), routeInfo.getPath());
        jSONObject.put(companion.getKEY_TOTAL_DURATION(), routeInfo.getTotalDuration());
        jSONObject.put(companion.getKEY_LOG_VERSION(), companion.getLOG_VERSION());
        jSONObject.put(companion.getKEY_TARGET_CLASS(), routeInfo.getTargetClass());
        jSONObject.put(companion.getKEY_PARAMS(), new JSONObject(C2097608Jq.LJIIZILJ(routeInfo.getParams())));
        jSONObject.put(companion.getKEY_DURATIONS(), new JSONObject(C2097608Jq.LJIIZILJ(routeInfo.getDurations())));
        jSONObject.put(companion.getKEY_URL_CHANGE_LOG(), new JSONObject(C2097608Jq.LJIIZILJ(routeInfo.getUrlChangeLog())));
        return jSONObject;
    }

    private final void stopAllMeasureDuration(String str) {
        RouteInfo routeInfo;
        Map<String, Long> durations;
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null && (durations = routeInfo.getDurations()) != null) {
            for (String str2 : durations.keySet()) {
                Long l = durations.get(str2);
                if (l != null && l.longValue() < 0) {
                    INSTANCE.stopMeasureDuration(str, str2);
                }
            }
        }
    }

    public final RouteInfo getRouteInfo(String str) {
        if (str == null) {
            return null;
        }
        return routeInfoMap.get(str);
    }

    public final void init(Application application) {
        application.registerActivityLifecycleCallbacks(new MonitorActivityLifecycleListener());
    }

    public final void reportSuccess(String str) {
        RouteInfo routeInfo = routeInfoMap.get(str);
        if (routeInfo != null) {
            routeInfo.setTotalDuration(System.currentTimeMillis() - routeInfo.getStartTime());
            RouterMonitor routerMonitor = INSTANCE;
            routerMonitor.stopAllMeasureDuration(str);
            JSONObject routeLog = routerMonitor.formatRouteLog(routeInfo);
            RouterMonitorListener routerMonitorListener = mRouterMonitorListener;
            if (routerMonitorListener != null) {
                Constants.Companion companion = Constants.Companion;
                int status_success = companion.getSTATUS_SUCCESS();
                JSONObject jSONObject = new JSONObject();
                String key_category_route_host_path = companion.getKEY_CATEGORY_ROUTE_HOST_PATH();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(routeInfo.getHost());
                sbLIZ.append(routeInfo.getPath());
                jSONObject.put(key_category_route_host_path, C2188811AlT.LIZIZ(sbLIZ));
                jSONObject.put(companion.getKEY_CATEGORY_ROUTE_SCHEME(), routeInfo.getScheme());
                jSONObject.put(companion.getKEY_CATEGORY_ROUTE_STATUS(), companion.getSTATUS_SUCCESS());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(companion.getKEY_METRIC_TOTAL_DURATION(), routeInfo.getTotalDuration());
                jSONObject2.put(companion.getKEY_METRIC_INTERCEPTOR_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_INTERCEPTOR_DURATION()));
                jSONObject2.put(companion.getKEY_METRIC_OPEN_ROUTE_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_OPEN_ROUTE_DURATION()));
                jSONObject2.put(companion.getKEY_METRIC_OPEN_PAGE_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_OPEN_PAGE_DURATION()));
                routerMonitorListener.onReport(status_success, jSONObject, jSONObject2, routeLog);
            }
            Map<String, RouteInfo> map = routeInfoMap;
            if (map != null) {
                C19719512Dh.LIZJ(map).remove(str);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
    }

    public final void setRouterMonitorListener(RouterMonitorListener routerMonitorListener) {
        mRouterMonitorListener = routerMonitorListener;
    }

    public final String startRoute(String str) {
        if (str != null) {
            String strGenerateRouteId = INSTANCE.generateRouteId();
            RouteInfo routeInfo = new RouteInfo(System.currentTimeMillis(), str);
            Uri uri = UriProtector.parse(str);
            String host = uri.getHost();
            String str2 = "";
            if (host == null) {
                host = "";
            }
            routeInfo.setHost(host);
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            routeInfo.setPath(path);
            String scheme = uri.getScheme();
            if (scheme != null) {
                str2 = scheme;
            }
            routeInfo.setScheme(str2);
            routeInfoMap.put(strGenerateRouteId, routeInfo);
            currentRouteId = strGenerateRouteId;
            return strGenerateRouteId;
        }
        return null;
    }

    public static Object INVOKEVIRTUAL_com_bytedance_router_monitor_RouterMonitor_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public final void collectExtra(String str, String str2) {
        RouteInfo routeInfo;
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null) {
            routeInfo.setExtraInfo(str2);
        }
    }

    public final void collectParams(String str, Bundle bundle) {
        if (str != null && bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objINVOKEVIRTUAL_com_bytedance_router_monitor_RouterMonitor_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_bytedance_router_monitor_RouterMonitor_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str2);
                if (objINVOKEVIRTUAL_com_bytedance_router_monitor_RouterMonitor_com_ss_android_ugc_aweme_lancet_IntentLancet_get != null) {
                    INSTANCE.collectParam(str, str2, objINVOKEVIRTUAL_com_bytedance_router_monitor_RouterMonitor_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
                }
            }
        }
    }

    public final void markRouterJump(Intent intent, String str) {
        if (intent != null) {
            Constants.Companion companion = Constants.Companion;
            intent.putExtra(companion.getKEY_ROUTER_JUMP_MARK(), true);
            intent.putExtra(companion.getKEY_CATEGORY_ROUTE_HOST_PATH(), str);
        }
    }

    public final void reportFail(String str, String str2) {
        RouteInfo routeInfo = routeInfoMap.get(str);
        if (routeInfo != null) {
            routeInfo.setErrorMsg(str2);
            routeInfo.setTotalDuration(System.currentTimeMillis() - routeInfo.getStartTime());
            RouterMonitor routerMonitor = INSTANCE;
            routerMonitor.stopAllMeasureDuration(str);
            JSONObject routeLog = routerMonitor.formatRouteLog(routeInfo);
            Constants.Companion companion = Constants.Companion;
            routeLog.put(companion.getKEY_ERROR_MSG(), str2);
            RouterMonitorListener routerMonitorListener = mRouterMonitorListener;
            if (routerMonitorListener != null) {
                int status_fail = companion.getSTATUS_FAIL();
                JSONObject jSONObject = new JSONObject();
                String key_category_route_host_path = companion.getKEY_CATEGORY_ROUTE_HOST_PATH();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(routeInfo.getHost());
                sbLIZ.append(routeInfo.getPath());
                jSONObject.put(key_category_route_host_path, C2188811AlT.LIZIZ(sbLIZ));
                jSONObject.put(companion.getKEY_CATEGORY_ROUTE_SCHEME(), routeInfo.getScheme());
                jSONObject.put(companion.getKEY_CATEGORY_ROUTE_STATUS(), companion.getSTATUS_FAIL());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(companion.getKEY_METRIC_TOTAL_DURATION(), routeInfo.getTotalDuration());
                jSONObject2.put(companion.getKEY_METRIC_INTERCEPTOR_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_INTERCEPTOR_DURATION()));
                jSONObject2.put(companion.getKEY_METRIC_OPEN_ROUTE_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_OPEN_ROUTE_DURATION()));
                jSONObject2.put(companion.getKEY_METRIC_OPEN_PAGE_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_OPEN_PAGE_DURATION()));
                routerMonitorListener.onReport(status_fail, jSONObject, jSONObject2, routeLog);
            }
            Map<String, RouteInfo> map = routeInfoMap;
            if (map != null) {
                C19719512Dh.LIZJ(map).remove(str);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
    }

    public final void reportIntercepted(String str, String str2) throws JSONException {
        RouteInfo routeInfo;
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null) {
            routeInfo.setTotalDuration(System.currentTimeMillis() - routeInfo.getStartTime());
            RouterMonitor routerMonitor = INSTANCE;
            routerMonitor.stopAllMeasureDuration(str);
            JSONObject routeLog = routerMonitor.formatRouteLog(routeInfo);
            Constants.Companion companion = Constants.Companion;
            routeLog.put(companion.getKEY_INTERCEPTED_BY(), str2);
            RouterMonitorListener routerMonitorListener = mRouterMonitorListener;
            if (routerMonitorListener != null) {
                int status_intercepted = companion.getSTATUS_INTERCEPTED();
                JSONObject jSONObject = new JSONObject();
                String key_category_route_host_path = companion.getKEY_CATEGORY_ROUTE_HOST_PATH();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(routeInfo.getHost());
                sbLIZ.append(routeInfo.getPath());
                jSONObject.put(key_category_route_host_path, C2188811AlT.LIZIZ(sbLIZ));
                jSONObject.put(companion.getKEY_CATEGORY_ROUTE_SCHEME(), routeInfo.getScheme());
                jSONObject.put(companion.getKEY_CATEGORY_ROUTE_STATUS(), companion.getSTATUS_INTERCEPTED());
                jSONObject.put(companion.getKEY_INTERCEPTED_BY(), str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(companion.getKEY_METRIC_TOTAL_DURATION(), routeInfo.getTotalDuration());
                jSONObject2.put(companion.getKEY_METRIC_INTERCEPTOR_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_INTERCEPTOR_DURATION()));
                jSONObject2.put(companion.getKEY_METRIC_OPEN_ROUTE_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_OPEN_ROUTE_DURATION()));
                jSONObject2.put(companion.getKEY_METRIC_OPEN_PAGE_DURATION(), routeInfo.getDurations().get(companion.getKEY_METRIC_OPEN_PAGE_DURATION()));
                routerMonitorListener.onReport(status_intercepted, jSONObject, jSONObject2, routeLog);
            }
            routeInfoMap.remove(str);
        }
    }

    public final void startMeasureDuration(String str, String str2) {
        RouteInfo routeInfo;
        Map<String, Long> durations;
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null && (durations = routeInfo.getDurations()) != null) {
            durations.put(str2, Long.valueOf(-System.currentTimeMillis()));
        }
    }

    public final void stopMeasureDuration(String str, String str2) {
        RouteInfo routeInfo;
        Map<String, Long> durations;
        Long l;
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null && (durations = routeInfo.getDurations()) != null && (l = durations.get(str2)) != null) {
            long jLongValue = l.longValue();
            if (l.longValue() > 0) {
                return;
            }
            durations.put(str2, Long.valueOf(System.currentTimeMillis() + jLongValue));
        }
    }

    public final void targetClass(String str, String str2) {
        RouteInfo routeInfo;
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null) {
            routeInfo.setTargetClass(str2);
        }
    }

    public final void collectParam(String str, String str2, Object obj) {
        RouteInfo routeInfo;
        Map<String, Object> params;
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null && (params = routeInfo.getParams()) != null) {
            params.put(str2, obj);
        }
    }

    public final void reportIfUrlChanged(String str, String str2, String str3) {
        RouteInfo routeInfo;
        if (str != null && (routeInfo = routeInfoMap.get(str)) != null && (!Intrinsics.LJFF(routeInfo.getUrl(), str2))) {
            Uri uri = UriProtector.parse(str2);
            Map<String, String> urlChangeLog = routeInfo.getUrlChangeLog();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(routeInfo.getUrl());
            sbLIZ.append(" => ");
            sbLIZ.append(str2);
            urlChangeLog.put(str3, C2188811AlT.LIZIZ(sbLIZ));
            routeInfo.setUrl(str2);
            String host = uri.getHost();
            String str4 = "";
            if (host == null) {
                host = "";
            }
            routeInfo.setHost(host);
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            routeInfo.setPath(path);
            String scheme = uri.getScheme();
            if (scheme != null) {
                str4 = scheme;
            }
            routeInfo.setScheme(str4);
        }
    }

    public final void reportPageJump(String str, boolean z, String str2) {
        RouterMonitorListener routerMonitorListener;
        if (str != null && (routerMonitorListener = mRouterMonitorListener) != null) {
            routerMonitorListener.onReportPageJump(z, str, str2);
        }
    }
}

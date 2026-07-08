package com.bytedance.router;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.annotation.Version;
import com.bytedance.router.mapping.ExternalSmartRouter$$Mapping;
import com.bytedance.router.mapping.SmartRouter$$Mapping;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes33.dex */
public class RouteMapper {
    public Context mContext;
    public final Map<String, List<String>> mExternalRouteInterceptorMap;
    public final Map<String, String> mExternalRouteMap;
    public final ExternalSmartRouter$$Mapping mExternalSmartRouter$$Mapping;
    public IMappingInitializer mIMappingInitializer;
    public final AtomicBoolean mIsInited;
    public Map<String, String> mOriginMap;
    public final Map<String, List<String>> mRouteInterceptorMap;
    public Map<String, String> mRouteMap;
    public final Object mRouteMapLock = new Object();
    public final Map<String, String> mRouteVersionMap;
    public final SmartRouter$$Mapping mSmartRouter$$Mapping;
    public final List<String> mTestUrlList;

    private void initRouteMap() {
        synchronized (this.mRouteMapLock) {
            try {
                if (!this.mIsInited.get()) {
                    this.mSmartRouter$$Mapping.init(this.mRouteMap);
                    this.mSmartRouter$$Mapping.initVersionMap(this.mRouteVersionMap);
                    this.mExternalSmartRouter$$Mapping.init(this.mExternalRouteMap);
                    this.mSmartRouter$$Mapping.initInterceptorMap(this.mRouteInterceptorMap);
                    this.mExternalSmartRouter$$Mapping.initInterceptorMap(this.mExternalRouteInterceptorMap);
                    this.mIsInited.set(true);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public RouteMapper() {
        SmartRouter$$Mapping smartRouter$$Mapping = new SmartRouter$$Mapping();
        this.mSmartRouter$$Mapping = smartRouter$$Mapping;
        ExternalSmartRouter$$Mapping externalSmartRouter$$Mapping = new ExternalSmartRouter$$Mapping();
        this.mExternalSmartRouter$$Mapping = externalSmartRouter$$Mapping;
        this.mIsInited = new AtomicBoolean(false);
        this.mRouteMap = new HashMap(smartRouter$$Mapping.getMapSize() + 1, 1.0f);
        this.mRouteVersionMap = new HashMap(smartRouter$$Mapping.getMapSize() + 1, 1.0f);
        this.mExternalRouteMap = new HashMap(externalSmartRouter$$Mapping.getMapSize() + 1, 1.0f);
        this.mRouteInterceptorMap = new HashMap();
        this.mExternalRouteInterceptorMap = new HashMap();
        this.mTestUrlList = new ArrayList();
    }

    public Map<String, String> getExternalRouteMap() {
        return this.mExternalRouteMap;
    }

    public Map<String, String> getRouteMap() {
        return this.mRouteMap;
    }

    public List<String> getTestUrlList() {
        return this.mTestUrlList;
    }

    public void init(Context context) {
        Logger.d("RouteMapper#init RouteMapper");
        this.mContext = context;
        if (!this.mIsInited.get()) {
            initRouteMap();
        }
        Logger.d(C786410Ut5.j4("RouteMapper#loadMappingByRouter routes: %d .", new Object[]{Integer.valueOf(this.mRouteMap.size())}));
        Logger.d(C786410Ut5.j4("RouteMapper#loadMappingByRouter routes: %d .", new Object[]{Integer.valueOf(this.mExternalRouteMap.size())}));
    }

    public void setCustomInitializer(IMappingInitializer iMappingInitializer) {
        this.mIMappingInitializer = iMappingInitializer;
    }

    public void updateMapping(Map<String, String> map) {
        synchronized (this.mRouteMapLock) {
            try {
                if (this.mOriginMap == null) {
                    HashMap map2 = new HashMap();
                    this.mOriginMap = map2;
                    map2.putAll(this.mRouteMap);
                    this.mRouteMap.putAll(map);
                } else {
                    HashMap map3 = new HashMap();
                    map3.putAll(this.mOriginMap);
                    map3.putAll(map);
                    this.mRouteMap = map3;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private String getRouteInfoByUriAndMap(String str, Map<String, String> map) {
        String realRouteUrl = Util.getRealRouteUrl(str);
        String str2 = map.get(realRouteUrl);
        if (TextUtils.isEmpty(str2) && realRouteUrl != null && realRouteUrl.endsWith("/") && realRouteUrl.length() > 1) {
            realRouteUrl = realRouteUrl.substring(0, realRouteUrl.length() - 1);
            str2 = map.get(realRouteUrl);
        }
        if (TextUtils.isEmpty(str2)) {
            realRouteUrl = Util.getRouteUrl(str);
            str2 = map.get(realRouteUrl);
        }
        if (TextUtils.isEmpty(str2) && realRouteUrl != null && realRouteUrl.endsWith("/") && realRouteUrl.length() > 1) {
            str2 = map.get(realRouteUrl.substring(0, realRouteUrl.length() - 1));
        }
        if (str2 != null) {
            return str2;
        }
        return "";
    }

    public List<String> getInterceptorList(String str, boolean z) {
        if (z) {
            if (this.mExternalRouteInterceptorMap == null) {
                return null;
            }
            return this.mExternalRouteInterceptorMap.get(Util.getRealRouteUrl(str));
        }
        if (this.mRouteInterceptorMap == null) {
            return null;
        }
        return this.mRouteInterceptorMap.get(Util.getRealRouteUrl(str));
    }

    public Version getRouteVersion(String str, boolean z) {
        if (z) {
            return null;
        }
        String routeInfoByUriAndMap = getRouteInfoByUriAndMap(str, this.mRouteVersionMap);
        if (TextUtils.isEmpty(routeInfoByUriAndMap)) {
            return null;
        }
        for (Version version : Version.values()) {
            if (String.valueOf(version.getVersionCode()).equals(routeInfoByUriAndMap)) {
                return version;
            }
        }
        return null;
    }

    public String getTargetClass(String str, boolean z) {
        String routeInfoByUriAndMap;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (z) {
            routeInfoByUriAndMap = getRouteInfoByUriAndMap(str, this.mExternalRouteMap);
        } else {
            routeInfoByUriAndMap = getRouteInfoByUriAndMap(str, this.mRouteMap);
        }
        if (TextUtils.isEmpty(routeInfoByUriAndMap) && !this.mIsInited.get()) {
            initRouteMap();
            if (z) {
                routeInfoByUriAndMap = getRouteInfoByUriAndMap(str, this.mExternalRouteMap);
            } else {
                routeInfoByUriAndMap = getRouteInfoByUriAndMap(str, this.mRouteMap);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RouteMapper#getTargetClass url: ");
        sbLIZ.append(str);
        sbLIZ.append("  |  targetClass: ");
        sbLIZ.append(routeInfoByUriAndMap);
        sbLIZ.append("  |  isExternal: ");
        sbLIZ.append(z);
        Logger.d(C2188811AlT.LIZIZ(sbLIZ));
        if (routeInfoByUriAndMap == null) {
            return "";
        }
        return routeInfoByUriAndMap;
    }
}

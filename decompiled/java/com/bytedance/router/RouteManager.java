package com.bytedance.router;

import X.C2188811AlT;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.annotation.Version;
import com.bytedance.router.fragment.FragmentNavigationRouteIntent;
import com.bytedance.router.fragment.PopOp;
import com.bytedance.router.fragment.PushOp;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.IInterceptorProvider;
import com.bytedance.router.listener.IRouteIntentInterceptor;
import com.bytedance.router.listener.RouteCallbackProxy;
import com.bytedance.router.monitor.Constants;
import com.bytedance.router.monitor.RouterMonitor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.plugin.SupportPluginCallback;
import com.bytedance.router.route.ActivityRoute;
import com.bytedance.router.route.BaseRoute;
import com.bytedance.router.route.IRoute;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.router.route.RouteFactory;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes33.dex */
public class RouteManager {
    public Boolean alReadyInit;
    public IRouterInjectInitializer iRouterInjectInitializer;
    public Context mContext;
    public InterceptManager mInterceptManager;
    public RouteCallbackProxy mRouteCallbackProxy;
    public IRouteIntentInterceptor mRouteIntentInterceptor;
    public RouteMapper mRouteMapper;
    public RoutesConfig mRoutesConfig;
    public SupportPluginCallback mSupportPluginCallback;

    public static class SingleBuilder {
        public static RouteManager sInstance = new RouteManager();
    }

    public static class StartupLock {
        public static ReentrantLock lock = new ReentrantLock();

        public static class SingletonHolder {
            public static final StartupLock INSTANCE = new StartupLock();
        }

        public void lock() {
            lock.lock();
        }

        public void unlock() {
            lock.unlock();
        }

        public StartupLock() {
        }

        public static StartupLock getInstance() {
            return SingletonHolder.INSTANCE;
        }
    }

    private void tryInit() {
        Context context;
        if (this.alReadyInit.booleanValue()) {
            return;
        }
        try {
            StartupLock.getInstance().lock();
            if (this.alReadyInit.booleanValue() || (context = this.mContext) == null) {
                StartupLock.getInstance().unlock();
                return;
            }
            this.mRouteMapper.init(context);
            this.mInterceptManager.initInterceptors();
            IRouterInjectInitializer iRouterInjectInitializer = this.iRouterInjectInitializer;
            if (iRouterInjectInitializer != null) {
                iRouterInjectInitializer.injectInitialize();
            }
            this.alReadyInit = Boolean.TRUE;
            StartupLock.getInstance().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StartupLock.getInstance().unlock();
            throw th;
        }
    }

    public List<String> getTestUrlList() {
        return this.mRouteMapper.getTestUrlList();
    }

    public RouteManager() {
        this.mRoutesConfig = RoutesConfig.defaultConfig();
        this.alReadyInit = Boolean.FALSE;
        this.iRouterInjectInitializer = null;
        this.mRouteMapper = new RouteMapper();
        this.mInterceptManager = new InterceptManager();
        this.mRouteCallbackProxy = new RouteCallbackProxy();
    }

    public Map<String, String> getExternalRouteMap() {
        tryInit();
        return this.mRouteMapper.getExternalRouteMap();
    }

    public Map<String, String> getRouteMap() {
        tryInit();
        return this.mRouteMapper.getRouteMap();
    }

    public static final RouteManager getInstance() {
        return SingleBuilder.sInstance;
    }

    public Context getContext() {
        return this.mContext;
    }

    public RouteCallbackProxy getRouteCallbackProxy() {
        return this.mRouteCallbackProxy;
    }

    public RoutesConfig getRoutesConfig() {
        return this.mRoutesConfig;
    }

    private void callbackFragmentNavigationRouteIntent(FragmentNavigationRouteIntent fragmentNavigationRouteIntent) {
        PushOp pushOp = fragmentNavigationRouteIntent.getPushOp();
        if (pushOp != null) {
            String targetClass = this.mRouteMapper.getTargetClass(pushOp.getUrl(), false);
            if (targetClass != null && !targetClass.isEmpty()) {
                this.mRouteCallbackProxy.onMatched(pushOp.getUrl());
            } else {
                this.mRouteCallbackProxy.onMissed(pushOp.getUrl());
            }
        }
    }

    private boolean checkLegality(RouteIntent routeIntent) {
        IRouteIntentInterceptor iRouteIntentInterceptor = this.mRouteIntentInterceptor;
        if (iRouteIntentInterceptor != null && iRouteIntentInterceptor.onIntercept(routeIntent)) {
            return false;
        }
        if (routeIntent instanceof FragmentNavigationRouteIntent) {
            return true;
        }
        String url = routeIntent.getUrl();
        if (Util.isLegalUrl(url, this.mRoutesConfig)) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RouteManager#checkLegality originUrl is illegal: ");
        sbLIZ.append(url);
        sbLIZ.append(". \n");
        sbLIZ.append(this.mRoutesConfig.toString());
        Logger.e(C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    private String completeUrl(String str) {
        if (!Util.isLegalUrl(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RouteManager#RouteIntent-outputUrl is illegal and url is : ");
            sbLIZ.append(str);
            Logger.e(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (str == null) {
            return null;
        }
        return Util.completeUrl(this.mRoutesConfig.getScheme(), str);
    }

    private RouteIntent processFragmentNavigationRouteIntent(FragmentNavigationRouteIntent fragmentNavigationRouteIntent) {
        PushOp pushOp = fragmentNavigationRouteIntent.getPushOp();
        PopOp popOp = fragmentNavigationRouteIntent.getPopOp();
        if (pushOp != null) {
            fragmentNavigationRouteIntent.setUrl(completeUrl(pushOp.getUrl()));
        }
        if (popOp != null) {
            fragmentNavigationRouteIntent.setUrl(completeUrl(popOp.getUrl()));
        }
        return fragmentNavigationRouteIntent;
    }

    private RouteIntent processRouteIntent(RouteIntent routeIntent) {
        if (routeIntent instanceof FragmentNavigationRouteIntent) {
            FragmentNavigationRouteIntent fragmentNavigationRouteIntent = (FragmentNavigationRouteIntent) routeIntent;
            processFragmentNavigationRouteIntent(fragmentNavigationRouteIntent);
            return fragmentNavigationRouteIntent;
        }
        routeIntent.setUrl(completeUrl(routeIntent.getUrl()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RouteManager#processRouteIntent originUlr: ");
        sbLIZ.append(routeIntent.getOriginUrl());
        Logger.d(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("RouteManager#processRouteIntent outputUlr: ");
        sbLIZ2.append(routeIntent.getUrl());
        Logger.d(C2188811AlT.LIZIZ(sbLIZ2));
        return routeIntent;
    }

    public void addGlobalResultCallback(OpenResultCallback openResultCallback) {
        this.mRouteCallbackProxy.addCallback(openResultCallback);
    }

    public void addInterceptor(IInterceptor iInterceptor) {
        this.mInterceptManager.addInterceptor(iInterceptor);
    }

    public void addInterceptroProvider(IInterceptorProvider iInterceptorProvider) {
        this.mInterceptManager.addInterceptorProvider(iInterceptorProvider);
    }

    public void addLastInterceptor(IInterceptor iInterceptor) {
        this.mInterceptManager.addLastInterceptor(iInterceptor);
    }

    public boolean canOpen(String str) {
        return canOpen(str, false);
    }

    public Version getRouteVersion(RouteIntent routeIntent) {
        if (routeIntent == null) {
            return null;
        }
        tryInit();
        return this.mRouteMapper.getRouteVersion(routeIntent.getUrl(), routeIntent.isExternalType());
    }

    public void init(Context context) {
        this.mContext = context;
    }

    public void injectInitializer(IRouterInjectInitializer iRouterInjectInitializer) {
        this.iRouterInjectInitializer = iRouterInjectInitializer;
    }

    public void removeGlobalResultCallback(OpenResultCallback openResultCallback) {
        this.mRouteCallbackProxy.removeCallback(openResultCallback);
    }

    public void removeInterceptor(IInterceptor iInterceptor) {
        this.mInterceptManager.removeInterceptor(iInterceptor);
    }

    public void removeLastInterceptor(IInterceptor iInterceptor) {
        this.mInterceptManager.removeLastInterceptor(iInterceptor);
    }

    public void setConfig(RoutesConfig routesConfig) {
        this.mRoutesConfig = routesConfig;
    }

    public void setCustomInitializer(IMappingInitializer iMappingInitializer) {
        this.mRouteMapper.setCustomInitializer(iMappingInitializer);
    }

    public void setRewriteMap(Map<String, String> map) {
        this.mInterceptManager.getRewriteManager().setRewriteMap(map);
    }

    public void setRouteIntentInterceptor(IRouteIntentInterceptor iRouteIntentInterceptor) {
        this.mRouteIntentInterceptor = iRouteIntentInterceptor;
    }

    public void setSupportPluginCallback(SupportPluginCallback supportPluginCallback) {
        this.mSupportPluginCallback = supportPluginCallback;
    }

    public void setTempResultCallback(OpenResultCallback openResultCallback) {
        this.mRouteCallbackProxy.setTempCallback(openResultCallback);
    }

    private IRoute getRoute(Context context, RouteIntent routeIntent) {
        List<String> interceptorList;
        if (!checkLegality(routeIntent)) {
            RouterMonitor.INSTANCE.reportFail(routeIntent.getRouteId(), "OriginUrl is illegal");
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchSmartRouteFailed(routeIntent.getRouteId());
            this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "OriginUrl is illegal");
            return null;
        }
        if (routeIntent.getNeedIntercept()) {
            RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
            String routeId = routeIntent.getRouteId();
            Constants.Companion companion = Constants.Companion;
            routerMonitor.startMeasureDuration(routeId, companion.getKEY_METRIC_INTERCEPTOR_DURATION());
            if (this.mInterceptManager.processRouteIntent(context, routeIntent)) {
                this.mRouteCallbackProxy.onIntercept(routeIntent.getUrl());
                this.mRouteCallbackProxy.onSuccess(routeIntent.getExtra());
                return null;
            }
            routerMonitor.stopMeasureDuration(routeIntent.getRouteId(), companion.getKEY_METRIC_INTERCEPTOR_DURATION());
        }
        processRouteIntent(routeIntent);
        if (routeIntent.getNeedIntercept() && (interceptorList = this.mRouteMapper.getInterceptorList(routeIntent.getUrl(), routeIntent.isExternalType())) != null && this.mInterceptManager.processAssignInterceptor(context, interceptorList, routeIntent)) {
            this.mRouteCallbackProxy.onIntercept(routeIntent.getUrl());
            this.mRouteCallbackProxy.onSuccess();
            return null;
        }
        if (routeIntent instanceof FragmentNavigationRouteIntent) {
            callbackFragmentNavigationRouteIntent((FragmentNavigationRouteIntent) routeIntent);
            return getRoute(routeIntent, (String) null);
        }
        String targetClass = this.mRouteMapper.getTargetClass(routeIntent.getUrl(), routeIntent.isExternalType());
        if (TextUtils.isEmpty(targetClass)) {
            this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "Not support the route");
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchSmartRouteFailed(routeIntent.getRouteId());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RouteManager#open cannot find the routeUri with ");
            sbLIZ.append(routeIntent.getUrl());
            Logger.w(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (TextUtils.isEmpty(targetClass)) {
            this.mRouteCallbackProxy.onMissed(routeIntent.getOriginUrl());
        } else {
            this.mRouteCallbackProxy.onMatched(routeIntent.getUrl());
            RouterMonitor.INSTANCE.targetClass(routeIntent.getRouteId(), targetClass);
        }
        IRoute route = getRoute(routeIntent, targetClass);
        if (route == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("RouteManager#Not support the route with url：");
            sbLIZ2.append(routeIntent.getUrl());
            Logger.e(C2188811AlT.LIZIZ(sbLIZ2));
            this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "Not support the route");
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchSmartRouteFailed(routeIntent.getRouteId());
            return null;
        }
        return route;
    }

    public void addAssignInterceptor(String str, IInterceptor iInterceptor) {
        this.mInterceptManager.addAssignInterceptor(str, iInterceptor);
    }

    public Intent buildIntent(Context context, RouteIntent routeIntent) {
        tryInit();
        if (routeIntent.getCallback() != null) {
            this.mRouteCallbackProxy.setTempCallback(routeIntent.getCallback());
        }
        if (!checkLegality(routeIntent)) {
            RouterMonitor.INSTANCE.reportFail(routeIntent.getRouteId(), "OriginUrl is illegal");
            this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "OriginUrl is illegal");
            return null;
        }
        RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
        String routeId = routeIntent.getRouteId();
        Constants.Companion companion = Constants.Companion;
        routerMonitor.startMeasureDuration(routeId, companion.getKEY_METRIC_INTERCEPTOR_DURATION());
        if (this.mInterceptManager.processRouteIntent(context, routeIntent)) {
            this.mRouteCallbackProxy.onIntercept(routeIntent.getUrl());
            this.mRouteCallbackProxy.onSuccess();
            return null;
        }
        routerMonitor.stopMeasureDuration(routeIntent.getRouteId(), companion.getKEY_METRIC_INTERCEPTOR_DURATION());
        processRouteIntent(routeIntent);
        List<String> interceptorList = this.mRouteMapper.getInterceptorList(routeIntent.getUrl(), routeIntent.isExternalType());
        if (interceptorList != null && this.mInterceptManager.processAssignInterceptor(context, interceptorList, routeIntent)) {
            this.mRouteCallbackProxy.onIntercept(routeIntent.getUrl());
            this.mRouteCallbackProxy.onSuccess();
            return null;
        }
        String targetClass = this.mRouteMapper.getTargetClass(routeIntent.getUrl(), routeIntent.isExternalType());
        if (TextUtils.isEmpty(targetClass)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RouteManager#buildIntent cannot find the routeUri with ");
            sbLIZ.append(routeIntent.getUrl());
            Logger.w(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (TextUtils.isEmpty(targetClass)) {
            routerMonitor.reportFail(routeIntent.getRouteId(), "buildIntent: TargetClass is null");
            this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "TargetClass is null");
            return null;
        }
        try {
            if (IRouteAction.class.isAssignableFrom(Class.forName(targetClass))) {
                return null;
            }
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            if (routeIntent.getRouteId() != null) {
                RouterMonitor routerMonitor2 = RouterMonitor.INSTANCE;
                String routeId2 = routeIntent.getRouteId();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("buildIntent: ");
                sbLIZ2.append(e.getMessage());
                routerMonitor2.reportFail(routeId2, C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (routeIntent.getExtra() != null) {
            routeIntent.getExtra().setComponent(new ComponentName(context.getPackageName(), targetClass));
        }
        this.mRouteCallbackProxy.onSuccess();
        return routeIntent.getExtra();
    }

    public boolean canOpen(String str, boolean z) {
        tryInit();
        if (TextUtils.isEmpty(str)) {
            Logger.w("SmartRoute#url is null!!!");
            return false;
        }
        if (!Util.isLegalUrl(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SmartRoute#url is illegal and url is ");
            sbLIZ.append(str);
            Logger.w(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        String realRouteUrl = Util.getRealRouteUrl(str);
        if (realRouteUrl == null) {
            realRouteUrl = "";
        }
        String rewriteUrl = this.mInterceptManager.getRewriteManager().getRewriteUrl(realRouteUrl);
        if (!TextUtils.isEmpty(rewriteUrl)) {
            realRouteUrl = rewriteUrl;
        }
        String scheme = UriProtector.parse(realRouteUrl).getScheme();
        if (TextUtils.isEmpty(scheme)) {
            scheme = UriProtector.parse(str).getScheme();
        }
        if (!this.mRoutesConfig.supportScheme(scheme)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SmartRouter not supports this scheme: ");
            sbLIZ2.append(scheme);
            Logger.w(C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        if (!this.mRoutesConfig.supportScheme(scheme)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("SmartRouter not supports this scheme: ");
            sbLIZ3.append(scheme);
            Logger.w(C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        if (TextUtils.isEmpty(this.mRouteMapper.getTargetClass(realRouteUrl, z)) && !this.mInterceptManager.whetherIntercept(str)) {
            return false;
        }
        return true;
    }

    public void fragmentNavigation(Context context, RouteIntent routeIntent) {
        tryInit();
        open(context, routeIntent);
    }

    public void open(Context context, RouteIntent routeIntent) {
        OpenResultCallback callback;
        tryInit();
        if (routeIntent != null && (callback = routeIntent.getCallback()) != null) {
            this.mRouteCallbackProxy.setTempCallback(callback);
        }
        IRoute route = getRoute(context, routeIntent);
        if (route == null) {
            if (routeIntent != null) {
                RouterMonitor.INSTANCE.reportFail(routeIntent.getRouteId(), "getRoute failed");
                return;
            } else {
                RouterMonitor.INSTANCE.reportFail("null", "getRoute failed");
                return;
            }
        }
        if (routeIntent != null) {
            try {
                RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
                String routeId = routeIntent.getRouteId();
                Constants.Companion companion = Constants.Companion;
                routerMonitor.startMeasureDuration(routeId, companion.getKEY_METRIC_OPEN_ROUTE_DURATION());
                route.open(context);
                routerMonitor.stopMeasureDuration(routeIntent.getRouteId(), companion.getKEY_METRIC_OPEN_ROUTE_DURATION());
                routerMonitor.reportSuccess(routeIntent.getRouteId());
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchSmartRouteSuccess(routeIntent.getRouteId());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Logger.e("Please check the scheme and its mapping class!!!");
                RouterMonitor routerMonitor2 = RouterMonitor.INSTANCE;
                String routeId2 = routeIntent.getRouteId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(e.getMessage());
                sbLIZ.append(" : Please check the scheme and its mapping class!!!");
                routerMonitor2.reportFail(routeId2, C2188811AlT.LIZIZ(sbLIZ));
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchSmartRouteFailed(routeIntent.getRouteId());
                this.mRouteCallbackProxy.onFail(routeIntent.getOriginUrl(), "Please check the scheme and its mapping class!");
            }
        }
    }

    public void openMulti(Context context, MultiRouteIntent multiRouteIntent) {
        tryInit();
        ArrayList<RouteIntent> routeIntents = multiRouteIntent.getRouteIntents();
        ArrayList arrayList = new ArrayList();
        if (multiRouteIntent.getCallback() != null) {
            this.mRouteCallbackProxy.setMultiTempCallback(multiRouteIntent.getCallback());
        }
        for (RouteIntent routeIntent : routeIntents) {
            routeIntent.setNeedIntercept(false);
            IRoute route = getRoute(context, routeIntent);
            if (route != null) {
                if (route instanceof ActivityRoute) {
                    arrayList.add(route);
                } else {
                    throw new IllegalArgumentException("Now only Activity route is supported");
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.mRouteCallbackProxy.onEmpty();
            return;
        }
        multiRouteIntent.getRoutes().addAll(arrayList);
        IRoute route2 = getRoute(multiRouteIntent, (String) null);
        if (route2 != null) {
            route2.open(context);
        }
    }

    public void putRewriteValue(String str, String str2) {
        this.mInterceptManager.getRewriteManager().addRewriteValue(str, str2);
    }

    public void safNavigation(Context context, RouteIntent routeIntent) {
        tryInit();
        open(context, routeIntent);
    }

    private IRoute getRoute(RouteIntent routeIntent, String str) {
        BaseRoute baseRouteCreateRoute = RouteFactory.createRoute(routeIntent, str, this.mRoutesConfig);
        if (baseRouteCreateRoute != null) {
            baseRouteCreateRoute.init(routeIntent, this.mRouteMapper);
        }
        return baseRouteCreateRoute;
    }
}

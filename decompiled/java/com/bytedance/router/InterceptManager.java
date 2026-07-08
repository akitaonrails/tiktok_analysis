package com.bytedance.router;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.IInterceptorProvider;
import com.bytedance.router.interceptor.RewriteManager;
import com.bytedance.router.mapping.SmartRouterInterceptor;
import com.bytedance.router.monitor.RouterMonitor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes33.dex */
public class InterceptManager {
    public IInterceptorProvider interceptorProvider;
    public volatile boolean mInterceptorProviderIsInited;
    public RewriteManager mRewriteManager;
    public SmartRouterInterceptor mSmartRouterInterceptor;
    public AtomicBoolean mIsInited = new AtomicBoolean(false);
    public List<IInterceptor> mInterceptors = new LinkedList();
    public List<IInterceptor> mLastInterceptors = new LinkedList();
    public Map<String, IInterceptor> mAssignInterceptors = new HashMap();

    public void initInterceptors() {
        if (!this.mIsInited.get()) {
            ArrayList arrayList = new ArrayList();
            this.mSmartRouterInterceptor.initInterceptors(arrayList);
            synchronized (this) {
                try {
                    this.mInterceptors.addAll(arrayList);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            HashMap map = new HashMap();
            this.mSmartRouterInterceptor.initAssignInterceptors(map);
            this.mAssignInterceptors.putAll(map);
        }
        this.mIsInited.set(true);
    }

    public InterceptManager() {
        if (this.mRewriteManager == null) {
            this.mRewriteManager = new RewriteManager();
        }
        synchronized (this) {
            try {
                this.mInterceptors.add(this.mRewriteManager);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.mSmartRouterInterceptor = new SmartRouterInterceptor();
    }

    public RewriteManager getRewriteManager() {
        return this.mRewriteManager;
    }

    public void addInterceptor(IInterceptor iInterceptor) {
        if (iInterceptor == null) {
            return;
        }
        synchronized (this) {
            try {
                this.mInterceptors.add(iInterceptor);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void addInterceptorProvider(IInterceptorProvider iInterceptorProvider) {
        if (iInterceptorProvider == null) {
            return;
        }
        this.interceptorProvider = iInterceptorProvider;
    }

    public void addLastInterceptor(IInterceptor iInterceptor) {
        if (iInterceptor == null) {
            return;
        }
        synchronized (this) {
            try {
                this.mLastInterceptors.add(iInterceptor);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void removeInterceptor(IInterceptor iInterceptor) {
        if (iInterceptor == null) {
            return;
        }
        synchronized (this) {
            try {
                this.mInterceptors.remove(iInterceptor);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void removeLastInterceptor(IInterceptor iInterceptor) {
        if (iInterceptor == null) {
            return;
        }
        synchronized (this) {
            try {
                this.mLastInterceptors.remove(iInterceptor);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public boolean whetherIntercept(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.mInterceptorProviderIsInited) {
                    IInterceptorProvider iInterceptorProvider = this.interceptorProvider;
                    if (iInterceptorProvider != null) {
                        this.mInterceptors.addAll(iInterceptorProvider.getInterceptors());
                    }
                    this.mInterceptorProviderIsInited = true;
                }
                RouteIntent routeIntentBuild = new RouteIntent.Builder(str).build();
                Iterator it2 = new ArrayList(this.mInterceptors).iterator();
                while (it2.hasNext()) {
                    if (((IInterceptor) it2.next()).shouldHandleRoute(routeIntentBuild)) {
                        return true;
                    }
                }
                Iterator it3 = new ArrayList(this.mLastInterceptors).iterator();
                while (it3.hasNext()) {
                    if (((IInterceptor) it3.next()).shouldHandleRoute(routeIntentBuild)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void addAssignInterceptor(String str, IInterceptor iInterceptor) {
        if (!TextUtils.isEmpty(str) && iInterceptor != null) {
            synchronized (this) {
                try {
                    this.mAssignInterceptors.put(str, iInterceptor);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public boolean processRouteIntent(Context context, RouteIntent routeIntent) {
        boolean zOnInterceptRoute;
        boolean zOnInterceptRoute2;
        IInterceptor iInterceptor;
        RouterMonitor routerMonitor;
        if (routeIntent == null) {
            return true;
        }
        synchronized (this) {
            try {
                if (!this.mInterceptorProviderIsInited) {
                    IInterceptorProvider iInterceptorProvider = this.interceptorProvider;
                    if (iInterceptorProvider != null) {
                        this.mInterceptors.addAll(iInterceptorProvider.getInterceptors());
                    }
                    this.mInterceptorProviderIsInited = true;
                }
                Iterator it2 = new ArrayList(this.mInterceptors).iterator();
                do {
                    zOnInterceptRoute = false;
                    if (it2.hasNext()) {
                        iInterceptor = (IInterceptor) it2.next();
                        routerMonitor = RouterMonitor.INSTANCE;
                        routerMonitor.startMeasureDuration(routeIntent.getRouteId(), iInterceptor.getClass().getSimpleName());
                        if (iInterceptor.matchInterceptRules(routeIntent)) {
                            zOnInterceptRoute = iInterceptor.onInterceptRoute(context, routeIntent);
                            routerMonitor.reportIfUrlChanged(routeIntent.getRouteId(), routeIntent.getUrl(), iInterceptor.getClass().getSimpleName());
                        }
                        routerMonitor.stopMeasureDuration(routeIntent.getRouteId(), iInterceptor.getClass().getSimpleName());
                    } else {
                        for (IInterceptor iInterceptor2 : new ArrayList(this.mLastInterceptors)) {
                            RouterMonitor routerMonitor2 = RouterMonitor.INSTANCE;
                            routerMonitor2.startMeasureDuration(routeIntent.getRouteId(), iInterceptor2.getClass().getSimpleName());
                            if (iInterceptor2.matchInterceptRules(routeIntent)) {
                                zOnInterceptRoute2 = iInterceptor2.onInterceptRoute(context, routeIntent);
                                routerMonitor2.reportIfUrlChanged(routeIntent.getRouteId(), routeIntent.getUrl(), iInterceptor2.getClass().getSimpleName());
                            } else {
                                zOnInterceptRoute2 = false;
                            }
                            routerMonitor2.stopMeasureDuration(routeIntent.getRouteId(), iInterceptor2.getClass().getSimpleName());
                            if (zOnInterceptRoute2) {
                                routerMonitor2.reportIntercepted(routeIntent.getRouteId(), iInterceptor2.getClass().getSimpleName());
                                RouterPageMonitor.INSTANCE.getDispatcher().dispatchSmartRouteIntercepted(routeIntent.getRouteId(), iInterceptor2.getClass().getSimpleName());
                                return true;
                            }
                        }
                        return false;
                    }
                } while (!zOnInterceptRoute);
                routerMonitor.reportIntercepted(routeIntent.getRouteId(), iInterceptor.getClass().getSimpleName());
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchSmartRouteIntercepted(routeIntent.getRouteId(), iInterceptor.getClass().getSimpleName());
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public boolean processAssignInterceptor(Context context, List<String> list, RouteIntent routeIntent) {
        if (routeIntent == null) {
            return true;
        }
        synchronized (this) {
            try {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    IInterceptor iInterceptor = this.mAssignInterceptors.get(it2.next());
                    if (iInterceptor != null) {
                        RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
                        routerMonitor.startMeasureDuration(routeIntent.getRouteId(), iInterceptor.getClass().getSimpleName());
                        if (iInterceptor.onInterceptRoute(context, routeIntent)) {
                            routerMonitor.stopMeasureDuration(routeIntent.getRouteId(), iInterceptor.getClass().getSimpleName());
                            routerMonitor.reportIntercepted(routeIntent.getRouteId(), iInterceptor.getClass().getSimpleName());
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchSmartRouteIntercepted(routeIntent.getRouteId(), iInterceptor.getClass().getSimpleName());
                            return true;
                        }
                        routerMonitor.stopMeasureDuration(routeIntent.getRouteId(), iInterceptor.getClass().getSimpleName());
                    }
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

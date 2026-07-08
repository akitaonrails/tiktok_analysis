package com.ss.android.ugc.aweme.framework.services;

import X.C2188811AlT;
import X.C786570UtL;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.framework.services.utils.KotlinReflectHelperKt;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ServiceManager {
    public final String TAG;
    public volatile boolean checkDynamicProxyInWhiteList;
    public final ConcurrentHashMap<Class<?>, Set<ServiceProvider<?>>> classServiceProviderConcurrentHashMap;
    public final List<String> dynamicProxyBlackList;
    public Set<String> dynamicProxyWhiteList;
    public volatile boolean enableDetailLog;
    public volatile boolean enableDynamicProxyDefault;
    public volatile boolean enableForceDowngradeForOfflineService;
    public final Map<Class<?>, Map<String, ServiceProvider<?>>> groupServiceProviderConcurrentHashMap;
    public final Set<String> legacyServiceSet;

    public static final class Holder {
        public static final ServiceManager INSTANCE = new ServiceManager();
    }

    private void logIfEnable(String str) {
    }

    public ServiceManager() {
        this.classServiceProviderConcurrentHashMap = new ConcurrentHashMap<>();
        this.groupServiceProviderConcurrentHashMap = new ConcurrentHashMap();
        this.legacyServiceSet = new ConcurrentHashMap().keySet();
        this.dynamicProxyBlackList = Arrays.asList("com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService", "com.ss.android.ugc.aweme.service.IDebugKitRegService", "com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService", "com.ss.android.ugc.aweme.wavepublish.dm.service.IDM2CreativeService");
        this.TAG = "PluggableCheck";
        this.enableDetailLog = false;
        this.enableDynamicProxyDefault = true;
        this.enableForceDowngradeForOfflineService = false;
        this.checkDynamicProxyInWhiteList = false;
        this.dynamicProxyWhiteList = new HashSet();
    }

    public static ServiceManager get() {
        return Holder.INSTANCE;
    }

    public Map<Class<?>, Map<String, ServiceProvider<?>>> getGroupServiceProviderMap() {
        return this.groupServiceProviderConcurrentHashMap;
    }

    public ConcurrentHashMap getServiceProviderMap() {
        return this.classServiceProviderConcurrentHashMap;
    }

    private IAabDelegate getAabDelegate(String str) {
        return KotlinReflectHelperKt.reflectObjectClass(str);
    }

    private <T> T getLegacyService(Class<T> cls) {
        if (!this.legacyServiceSet.contains(cls.getName())) {
            return null;
        }
        Iterator it2 = ConfigLoader.iterator(cls);
        if (!it2.hasNext()) {
            return null;
        }
        return (T) it2.next();
    }

    public void addLegacyService(String str) {
        this.legacyServiceSet.add(str);
    }

    public <T> Set<T> getLegacyServices(Class<T> cls) {
        C786570UtL c786570UtL = (Set<T>) Collections.synchronizedSet(new LinkedHashSet());
        if (!this.legacyServiceSet.contains(cls.getName())) {
            return c786570UtL;
        }
        Iterator it2 = ConfigLoader.iterator(cls);
        while (it2.hasNext()) {
            c786570UtL.add(it2.next());
        }
        return c786570UtL;
    }

    public <T> T getService(Class<T> cls) {
        return (T) getService(cls, false);
    }

    public <T> T getServiceForReal(Class<T> cls) {
        return (T) getService(cls, false, this.enableDynamicProxyDefault, true);
    }

    public <T> Set<T> getServices(Class<T> cls) {
        return getServices(cls, false);
    }

    public void setCheckDynamicProxyInWhiteList(boolean z) {
        this.checkDynamicProxyInWhiteList = z;
    }

    public void setDynamicProxyEnableDefault(boolean z) {
        this.enableDynamicProxyDefault = z;
    }

    public void setDynamicProxyWhiteList(Set<String> set) {
        this.dynamicProxyWhiteList = set;
    }

    public void setEnableDetailLog(boolean z) {
        this.enableDetailLog = z;
    }

    public void addLegacyService(Set<String> set) {
        this.legacyServiceSet.addAll(set);
    }

    public <T> Binding bind(Class<T> cls, ServiceProvider<T> serviceProvider) {
        return new Binding(this, cls, serviceProvider);
    }

    public <T> void bindDowngradeImpl(Class<T> cls, ServiceProvider<T> serviceProvider) {
        bindDowngradeImpl(cls, serviceProvider, true);
    }

    public <T> T getService(Class<T> cls, boolean z) {
        return (T) getService(cls, z, this.enableDynamicProxyDefault);
    }

    public <T> T getServiceByGroup(Class<T> cls, String str) {
        Map<String, ServiceProvider<?>> map = this.groupServiceProviderConcurrentHashMap.get(cls);
        if (map != null && map.containsKey(str)) {
            return (T) map.get(str).get();
        }
        return null;
    }

    public <T> Set<T> getServices(Class<T> cls, boolean z) {
        Set<T> staticServiceImplSet;
        Set<ServiceProvider<?>> set = this.classServiceProviderConcurrentHashMap.get(cls);
        if (set != null && !set.isEmpty()) {
            C786570UtL c786570UtL = (Set<T>) Collections.synchronizedSet(new LinkedHashSet());
            Iterator<ServiceProvider<?>> it2 = set.iterator();
            while (it2.hasNext()) {
                c786570UtL.add(it2.next().get());
            }
            if (z && (staticServiceImplSet = StaticServiceImplManager.getInstance().getStaticServiceImplSet(cls)) != null && !staticServiceImplSet.isEmpty()) {
                c786570UtL.addAll(staticServiceImplSet);
            }
            return c786570UtL;
        }
        Set<T> staticServiceImplSet2 = StaticServiceImplManager.getInstance().getStaticServiceImplSet(cls);
        if (staticServiceImplSet2 != null && !staticServiceImplSet2.isEmpty()) {
            return staticServiceImplSet2;
        }
        return getLegacyServices(cls);
    }

    public <T> GroupBinding bind(Class<T> cls, String str, ServiceProvider<T> serviceProvider) {
        return new GroupBinding(this.groupServiceProviderConcurrentHashMap, cls, str, serviceProvider);
    }

    public <T> void bindDowngradeImpl(Class<T> cls, ServiceProvider<T> serviceProvider, boolean z) {
        if (z) {
            serviceProvider = new SingletonProvider(serviceProvider);
        }
        DowngradeImplManager.getInstance().bindDowngradeImpl(cls, serviceProvider);
    }

    public <T> T getService(Class<T> cls, boolean z, boolean z2) {
        return (T) getService(cls, z, z2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getService(Class<T> cls, boolean z, boolean z2, boolean z3) {
        T t;
        Set<ServiceProvider<?>> set = this.classServiceProviderConcurrentHashMap.get(cls);
        if (set != null && !set.isEmpty() && !z && (t = (T) ((ServiceProvider) set.toArray()[0]).get()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Get DynamicBind service ");
            sbLIZ.append(t.getClass().getName());
            sbLIZ.append(" for ");
            sbLIZ.append(cls.getName());
            logIfEnable(C2188811AlT.LIZIZ(sbLIZ));
            return t;
        }
        String name = cls.getName();
        Object serviceFromAabDelegate = StaticServiceImplManager.getInstance().getServiceFromAabDelegate(name);
        if (serviceFromAabDelegate != null) {
            return (T) checkOfflineServiceDowngradeAndDynamicProxy(serviceFromAabDelegate, z2, cls, name, "AabDelegate");
        }
        Object staticServiceImpl = StaticServiceImplManager.getInstance().getStaticServiceImpl(cls, name);
        if (staticServiceImpl != null) {
            return (T) checkOfflineServiceDowngradeAndDynamicProxy(staticServiceImpl, z2, cls, name, "ServiceImpl");
        }
        if (z3) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("RealImpl for ");
            sbLIZ2.append(name);
            sbLIZ2.append(" not found");
            logIfEnable(C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
        Object legacyService = getLegacyService(cls);
        if (legacyService != null) {
            return (T) checkOfflineServiceDowngradeAndDynamicProxy(legacyService, z2, cls, name, "LegacyConfig");
        }
        return (T) checkOfflineServiceDowngradeAndDynamicProxy(legacyService, z2, cls, name, null);
    }

    private <T> T checkOfflineServiceDowngradeAndDynamicProxy(T t, boolean z, Class<T> cls, String str, String str2) {
        if ((t == null || (this.enableForceDowngradeForOfflineService && StaticServiceImplManager.getOfflineServices().contains(t.getClass().getName()))) && (t = (T) DowngradeImplManager.getInstance().getDowngradeImpl(cls)) != null) {
            str2 = "DowngradeImpl";
        }
        boolean zContains = z & (!this.dynamicProxyBlackList.contains(str));
        if (this.checkDynamicProxyInWhiteList) {
            zContains &= this.dynamicProxyWhiteList.contains(str);
        }
        if (t == null) {
            if (zContains) {
                new DynamicProxy();
                t = (T) DynamicProxy.get(cls);
                if (t != null) {
                    str2 = "DynamicProxy";
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Service for ");
            sbLIZ.append(str);
            sbLIZ.append(" not found");
            logIfEnable(C2188811AlT.LIZIZ(sbLIZ));
            return t;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Get ");
        sbLIZ2.append(str2);
        sbLIZ2.append(" service ");
        sbLIZ2.append(t.getClass().getName());
        sbLIZ2.append(" for ");
        sbLIZ2.append(str);
        logIfEnable(C2188811AlT.LIZIZ(sbLIZ2));
        return t;
    }
}

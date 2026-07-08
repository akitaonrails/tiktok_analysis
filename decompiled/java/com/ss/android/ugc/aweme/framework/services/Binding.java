package com.ss.android.ugc.aweme.framework.services;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Binding<T> {
    public Class<T> klass;
    public ServiceManager serviceManager;
    public ServiceProvider<T> serviceProvider;

    public Binding<T> asSingleton() {
        Set set = this.serviceManager.classServiceProviderConcurrentHashMap.get(this.klass);
        ServiceProvider<T> serviceProvider = this.serviceProvider;
        if (!(serviceProvider instanceof SingletonProvider)) {
            set.remove(serviceProvider);
            SingletonProvider singletonProvider = new SingletonProvider(this.serviceProvider);
            this.serviceProvider = singletonProvider;
            set.add(singletonProvider);
        }
        return this;
    }

    public Binding(ServiceManager serviceManager, Class<T> cls, ServiceProvider<T> serviceProvider) {
        this.serviceManager = serviceManager;
        this.klass = cls;
        this.serviceProvider = serviceProvider;
        Set<ServiceProvider<?>> set = serviceManager.classServiceProviderConcurrentHashMap.get(cls);
        if (set == null) {
            Set<ServiceProvider<?>> setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
            setSynchronizedSet.add(serviceProvider);
            serviceManager.classServiceProviderConcurrentHashMap.put(cls, setSynchronizedSet);
            return;
        }
        set.add(serviceProvider);
    }
}

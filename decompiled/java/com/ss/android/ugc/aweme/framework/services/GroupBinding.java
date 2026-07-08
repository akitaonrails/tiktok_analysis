package com.ss.android.ugc.aweme.framework.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupBinding<T> {
    public Map<Class<?>, Map<String, ServiceProvider<?>>> classProviderMaps;
    public String groupName;
    public Class<T> klass;
    public ServiceProvider<T> serviceProvider;

    public GroupBinding<T> asSingleton() {
        if (!(this.serviceProvider instanceof SingletonProvider)) {
            Map map = this.classProviderMaps.get(this.klass);
            map.remove(this.serviceProvider);
            SingletonProvider singletonProvider = new SingletonProvider(this.serviceProvider);
            this.serviceProvider = singletonProvider;
            map.put(this.groupName, singletonProvider);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupBinding(Map<Class<?>, Map<String, ServiceProvider<?>>> map, Class<T> cls, String str, ServiceProvider<T> serviceProvider) {
        this.classProviderMaps = map;
        this.groupName = str;
        this.klass = cls;
        this.serviceProvider = serviceProvider;
        Map<String, ServiceProvider<?>> mapSynchronizedMap = map.get(cls);
        if (mapSynchronizedMap == null) {
            mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
            this.classProviderMaps.put(cls, mapSynchronizedMap);
        }
        mapSynchronizedMap.put(str, serviceProvider);
    }
}

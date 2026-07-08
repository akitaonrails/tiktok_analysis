package com.ss.android.ugc.aweme.framework.services;

/* JADX INFO: loaded from: classes3.dex */
public class SingletonProvider<T> implements ServiceProvider<T> {
    public volatile T service;
    public ServiceProvider<T> serviceProvider;

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public synchronized T get() {
        if (this.service == null) {
            this.service = this.serviceProvider.get();
        }
        return this.service;
    }

    public SingletonProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}

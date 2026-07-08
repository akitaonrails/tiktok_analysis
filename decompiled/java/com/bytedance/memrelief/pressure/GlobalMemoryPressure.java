package com.bytedance.memrelief.pressure;

import X.C09Q3;
import X.InterfaceC1603810rpz;

/* JADX INFO: loaded from: classes25.dex */
public final class GlobalMemoryPressure {
    public final MemoryPressure delegate;

    public C09Q3 getJavaMemoryLevel() {
        return this.delegate.getJavaMemoryLevel();
    }

    public C09Q3 getNativeMemoryLevel() {
        return this.delegate.getNativeMemoryLevel();
    }

    public void registerMemoryLevelChangeListener(InterfaceC1603810rpz interfaceC1603810rpz) {
        this.delegate.registerMemoryLevelChangeListener(interfaceC1603810rpz);
    }

    public void start() {
        this.delegate.start();
    }

    public void stop() {
        this.delegate.stop();
    }

    public void unregisterMemoryLevelChangeListener(InterfaceC1603810rpz interfaceC1603810rpz) {
        this.delegate.unregisterMemoryLevelChangeListener(interfaceC1603810rpz);
    }

    public final EwmaMemoryPressure getJavaImpl() {
        return this.delegate.getJavaImpl();
    }

    public final EwmaMemoryPressure getNativeImpl() {
        return this.delegate.getNativeImpl();
    }

    public GlobalMemoryPressure(MemoryPressure memoryPressure) {
        this.delegate = memoryPressure;
    }
}

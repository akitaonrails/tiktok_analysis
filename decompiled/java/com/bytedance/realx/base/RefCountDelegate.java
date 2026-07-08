package com.bytedance.realx.base;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public class RefCountDelegate implements RefCounted {
    public final AtomicInteger refCount = new AtomicInteger(1);
    public final Runnable releaseCallback;

    @Override // com.bytedance.realx.base.RefCounted
    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    @Override // com.bytedance.realx.base.RefCounted
    public void retain() {
        this.refCount.incrementAndGet();
    }

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }
}

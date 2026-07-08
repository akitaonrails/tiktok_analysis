package com.ss.bytertc.engine.mediaio;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public class RefObject {
    public final AtomicInteger refCount = new AtomicInteger(1);
    public final Runnable releaseCallback;

    public boolean hasReleaseCallback() {
        return this.releaseCallback != null;
    }

    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    public void retain() {
        this.refCount.incrementAndGet();
    }

    public RefObject(Runnable runnable) {
        this.releaseCallback = runnable;
    }
}

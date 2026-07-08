package com.bytedance.vcloud.strategy.drm;

import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public class DrmFuture<T> {
    public volatile DrmCallback<T> callback;
    public final CountDownLatch latch = new CountDownLatch(1);
    public final AtomicReference<T> result = new AtomicReference<>();
    public final AtomicReference<Throwable> error = new AtomicReference<>();
    public volatile boolean callbackNotified = false;

    public interface DrmCallback<T> {
        void onComplete(T t);

        void onError(Throwable th);
    }

    private void notifyCallback() {
        if (this.callback == null || this.callbackNotified || !isDone()) {
            return;
        }
        this.callbackNotified = true;
        if (this.error.get() != null) {
            this.callback.onError(this.error.get());
        } else {
            this.callback.onComplete(this.result.get());
        }
    }

    public T get() {
        try {
            this.latch.await();
            if (this.error.get() == null) {
                return this.result.get();
            }
            throw new RuntimeException(this.error.get());
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
            throw new RuntimeException(e);
        }
    }

    public boolean isDone() {
        return this.latch.getCount() == 0;
    }

    public void complete(T t) {
        this.result.set(t);
        this.latch.countDown();
        notifyCallback();
    }

    public void completeExceptionally(Throwable th) {
        this.error.set(th);
        this.latch.countDown();
        notifyCallback();
    }

    public void setCallback(DrmCallback<T> drmCallback) {
        this.callback = drmCallback;
        if (isDone()) {
            notifyCallback();
        }
    }
}

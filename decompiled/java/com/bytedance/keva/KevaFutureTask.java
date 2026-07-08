package com.bytedance.keva;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes24.dex */
public class KevaFutureTask<V> extends FutureTask<V> {
    public KevaFutureTask(Callable<V> callable) {
        super(callable);
    }

    @Override // java.util.concurrent.FutureTask
    public void set(V v) {
        super.set(v);
    }

    @Override // java.util.concurrent.FutureTask
    public void setException(Throwable th) {
        super.setException(th);
    }
}

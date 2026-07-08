package com.ttkmedia.datacenter.common;

import X.C822650WOx;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class DCThreadPool {
    public static ThreadPoolExecutor mExecutorInstance;
    public static volatile ExecutorService mExtExecutorInstance;

    public static synchronized ExecutorService getExecutorInstance() {
        ExecutorService executorService;
        if (mExtExecutorInstance != null) {
            executorService = mExtExecutorInstance;
        } else {
            if (mExecutorInstance == null) {
                mExecutorInstance = new C822650WOx(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
            }
            executorService = mExecutorInstance;
        }
        return executorService;
    }

    public static synchronized Future<String> addTask(Callable<String> callable) {
        return getExecutorInstance().submit(callable);
    }

    public static synchronized void setExecutorInstance(ExecutorService executorService) {
        mExtExecutorInstance = executorService;
    }

    public static synchronized void addTask(Runnable runnable) {
        getExecutorInstance().submit(runnable);
    }
}

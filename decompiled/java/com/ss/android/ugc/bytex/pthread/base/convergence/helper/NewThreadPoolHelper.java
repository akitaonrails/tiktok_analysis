package com.ss.android.ugc.bytex.pthread.base.convergence.helper;

import X.C822650WOx;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class NewThreadPoolHelper {
    public static final NewThreadPoolHelper INSTANCE = new NewThreadPoolHelper();

    public final ThreadPoolExecutor newThreadPool(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return new C822650WOx(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }
}

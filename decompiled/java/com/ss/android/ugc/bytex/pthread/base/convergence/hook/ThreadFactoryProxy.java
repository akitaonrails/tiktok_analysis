package com.ss.android.ugc.bytex.pthread.base.convergence.hook;

import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import com.ss.android.ugc.bytex.pthread.base.convergence.monitor.ThreadStartMonitor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes14.dex */
public final class ThreadFactoryProxy implements ThreadFactory {
    public static final Companion Companion = new Companion();
    public final ThreadFactory mDelegate;
    public final int mEnableType;

    public static final class Companion {
        public final ThreadFactory proxy(ThreadFactory threadFactory, int i) {
            return (threadFactory == null || (threadFactory instanceof ThreadFactoryProxy)) ? threadFactory : new ThreadFactoryProxy(threadFactory, i);
        }
    }

    public ThreadFactoryProxy(ThreadFactory threadFactory, int i) {
        this.mDelegate = threadFactory;
        this.mEnableType = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.mDelegate.newThread(runnable);
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (superThreadPool.isEnable(this.mEnableType)) {
            return new ThreadProxy(threadNewThread, false);
        }
        if (superThreadPool.getEnableNewMonitor()) {
            ThreadStartMonitor.INSTANCE.onNewThreadCountMonitor();
        }
        return threadNewThread;
    }
}

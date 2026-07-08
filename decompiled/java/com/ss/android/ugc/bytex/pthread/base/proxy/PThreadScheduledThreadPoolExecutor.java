package com.ss.android.ugc.bytex.pthread.base.proxy;

import X.C0WP0;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadFactoryProxy;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class PThreadScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor {
    public PThreadScheduledThreadPoolExecutor(int i) {
        super(i, ThreadFactoryProxy.Companion.proxy(Executors.defaultThreadFactory(), 8));
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (superThreadPool.isEnable(8) && !allowsCoreThreadTimeOut() && superThreadPool.getAllowAllCoreThreadTimeOut()) {
            super.setKeepAliveTime(superThreadPool.getEnableBlockFetchTask() ? 30L : superThreadPool.getScheduledThreadPoolMaxKeepAliveTime(), TimeUnit.MILLISECONDS);
            super.allowCoreThreadTimeOut(true);
        }
    }

    public PThreadScheduledThreadPoolExecutor(int i, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, ThreadFactoryProxy.Companion.proxy(Executors.defaultThreadFactory(), 8), rejectedExecutionHandler);
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (superThreadPool.isEnable(8) && !allowsCoreThreadTimeOut() && superThreadPool.getAllowAllCoreThreadTimeOut()) {
            super.setKeepAliveTime(superThreadPool.getEnableBlockFetchTask() ? 30L : superThreadPool.getScheduledThreadPoolMaxKeepAliveTime(), TimeUnit.MILLISECONDS);
            super.allowCoreThreadTimeOut(true);
        }
    }

    public PThreadScheduledThreadPoolExecutor(int i, ThreadFactory threadFactory) {
        super(i, ThreadFactoryProxy.Companion.proxy(threadFactory, 8));
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (superThreadPool.isEnable(8) && !allowsCoreThreadTimeOut() && superThreadPool.getAllowAllCoreThreadTimeOut()) {
            super.setKeepAliveTime(superThreadPool.getEnableBlockFetchTask() ? 30L : superThreadPool.getScheduledThreadPoolMaxKeepAliveTime(), TimeUnit.MILLISECONDS);
            super.allowCoreThreadTimeOut(true);
        }
    }

    public PThreadScheduledThreadPoolExecutor(int i, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, ThreadFactoryProxy.Companion.proxy(threadFactory, 8), rejectedExecutionHandler);
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (superThreadPool.isEnable(8) && !allowsCoreThreadTimeOut() && superThreadPool.getAllowAllCoreThreadTimeOut()) {
            super.setKeepAliveTime(superThreadPool.getEnableBlockFetchTask() ? 30L : superThreadPool.getScheduledThreadPoolMaxKeepAliveTime(), TimeUnit.MILLISECONDS);
            super.allowCoreThreadTimeOut(true);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void allowCoreThreadTimeOut(boolean z) {
        try {
            SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
            if (superThreadPool.isEnable(8)) {
                z = !superThreadPool.getEnableBlockFetchTask() || z;
            }
            super.allowCoreThreadTimeOut(z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public boolean allowsCoreThreadTimeOut() {
        return false;
    }

    public ScheduledFuture<?> com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor__schedule$___twin___(Runnable runnable, long j, TimeUnit timeUnit) {
        return super.schedule(runnable, j, timeUnit);
    }

    public <V> ScheduledFuture<V> com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor__schedule$___twin___(Callable<V> callable, long j, TimeUnit timeUnit) {
        return super.schedule(callable, j, timeUnit);
    }

    public ScheduledFuture<?> com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor__scheduleAtFixedRate$___twin___(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    public ScheduledFuture<?> com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor__scheduleWithFixedDelay$___twin___(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        super.execute(runnable);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadScheduledThreadPoolExecutorLancet_schedule(this, runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadScheduledThreadPoolExecutorLancet_schedule(this, callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadScheduledThreadPoolExecutorLancet_scheduleAtFixedRate(this, runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadScheduledThreadPoolExecutorLancet_scheduleWithFixedDelay(this, runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setKeepAliveTime(long j, TimeUnit timeUnit) {
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (!superThreadPool.isEnable(8) || superThreadPool.getEnableBlockFetchTask()) {
            super.setKeepAliveTime(j, timeUnit);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setThreadFactory(ThreadFactory threadFactory) {
        super.setThreadFactory(ThreadFactoryProxy.Companion.proxy(threadFactory, 8));
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return super.submit(runnable);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return super.submit(runnable, t);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return super.submit(callable);
    }

    public static ScheduledFuture com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadScheduledThreadPoolExecutorLancet_schedule(PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor, Runnable runnable, long j, TimeUnit timeUnit) {
        if (!C0WP0.LIZ(runnable)) {
            return pThreadScheduledThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor__schedule$___twin___(runnable, j, timeUnit);
        }
        throw new UnsupportedOperationException("not support yet");
    }

    public static ScheduledFuture com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadScheduledThreadPoolExecutorLancet_schedule(PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor, Callable callable, long j, TimeUnit timeUnit) {
        if (!C0WP0.LIZIZ(callable)) {
            return pThreadScheduledThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor__schedule$___twin___(callable, j, timeUnit);
        }
        throw new UnsupportedOperationException("not support yet");
    }

    public static ScheduledFuture com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadScheduledThreadPoolExecutorLancet_scheduleAtFixedRate(PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor, Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!C0WP0.LIZ(runnable)) {
            return pThreadScheduledThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor__scheduleAtFixedRate$___twin___(runnable, j, j2, timeUnit);
        }
        throw new UnsupportedOperationException("not support yet");
    }

    public static ScheduledFuture com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadScheduledThreadPoolExecutorLancet_scheduleWithFixedDelay(PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor, Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!C0WP0.LIZ(runnable)) {
            return pThreadScheduledThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadScheduledThreadPoolExecutor__scheduleWithFixedDelay$___twin___(runnable, j, j2, timeUnit);
        }
        throw new UnsupportedOperationException("not support yet");
    }
}

package com.ss.android.ugc.bytex.pthread.base;

import X.C822660WOy;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class PThreadExecutorsUtils {
    public static volatile PThreadPoolExecutorInject pThreadPoolExecutorInject;
    public static volatile IRunnableMonitor runnableMonitor;

    public static class DelegatedExecutorService extends AbstractExecutorService {
        public final ExecutorService e;

        public DelegatedExecutorService(ExecutorService executorService) {
            this.e = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.e.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.e.execute(runnable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.e.invokeAll(collection);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
            return this.e.invokeAll(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return (T) this.e.invokeAny(collection);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
            return (T) this.e.invokeAny(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.e.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.e.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            this.e.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            return this.e.shutdownNow();
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.e.submit(runnable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            return this.e.submit(runnable, t);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.e.submit(callable);
        }
    }

    public static class DelegatedScheduledExecutorService extends DelegatedExecutorService implements ScheduledExecutorService {
        public final ScheduledExecutorService e;

        public DelegatedScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.e = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.e.schedule(runnable, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            return this.e.schedule(callable, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.e.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.e.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }
    }

    public static class FinalizableDelegatedExecutorService extends DelegatedExecutorService {
        public FinalizableDelegatedExecutorService(ExecutorService executorService) {
            super(executorService);
        }

        public void finalize() {
            super.shutdown();
        }
    }

    public static ExecutorService newCachedThreadPool() {
        return new PThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
    }

    public static ExecutorService newCachedThreadPool(ThreadFactory threadFactory) {
        return new PThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public static ExecutorService newFixedThreadPool(int i) {
        return new PThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static ExecutorService newFixedThreadPool(int i, ThreadFactory threadFactory) {
        return new PThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i) {
        return new PThreadScheduledThreadPoolExecutor(i);
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i, ThreadFactory threadFactory) {
        return new PThreadScheduledThreadPoolExecutor(i, threadFactory);
    }

    public static ExecutorService newSingleThreadExecutor() {
        return new FinalizableDelegatedExecutorService(new PThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()));
    }

    public static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory) {
        return new FinalizableDelegatedExecutorService(new PThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory));
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor() {
        return new DelegatedScheduledExecutorService(new C822660WOy(1));
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(ThreadFactory threadFactory) {
        return new DelegatedScheduledExecutorService(new C822660WOy(1, threadFactory));
    }
}

package com.ss.android.ugc.bytex.pthread.base.proxy;

import X.C0WP0;
import X.C1BCA;
import X.C2099408Ki;
import X.C822670WOz;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.queuemonitor.impl.ThreadPoolCollector;
import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.BlockingQueueProxy;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadFactoryProxy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class PThreadPoolExecutor extends ThreadPoolExecutor {
    public static final Companion Companion = new Companion();

    public static final class Companion {
    }

    public PThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        super(i, i2, j, timeUnit, (BlockingQueue<Runnable>) BlockingQueueProxy.Companion.proxy(blockingQueue), ThreadFactoryProxy.Companion.proxy(Executors.defaultThreadFactory(), 2));
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (superThreadPool.isEnable(2) && !allowsCoreThreadTimeOut() && superThreadPool.getAllowAllCoreThreadTimeOut()) {
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long jMax = Math.max(30L, getKeepAliveTime(timeUnit2));
            setKeepAliveTime(jMax < 1 ? 1L : jMax, timeUnit2);
            try {
                allowCoreThreadTimeOut(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public PThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, BlockingQueueProxy.Companion.proxy(blockingQueue), ThreadFactoryProxy.Companion.proxy(Executors.defaultThreadFactory(), 2), rejectedExecutionHandler);
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (superThreadPool.isEnable(2) && !allowsCoreThreadTimeOut() && superThreadPool.getAllowAllCoreThreadTimeOut()) {
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long jMax = Math.max(30L, getKeepAliveTime(timeUnit2));
            setKeepAliveTime(jMax < 1 ? 1L : jMax, timeUnit2);
            try {
                allowCoreThreadTimeOut(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public PThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, (BlockingQueue<Runnable>) BlockingQueueProxy.Companion.proxy(blockingQueue), ThreadFactoryProxy.Companion.proxy(threadFactory, 2));
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (superThreadPool.isEnable(2) && !allowsCoreThreadTimeOut() && superThreadPool.getAllowAllCoreThreadTimeOut()) {
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long jMax = Math.max(30L, getKeepAliveTime(timeUnit2));
            setKeepAliveTime(jMax < 1 ? 1L : jMax, timeUnit2);
            try {
                allowCoreThreadTimeOut(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public PThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, BlockingQueueProxy.Companion.proxy(blockingQueue), ThreadFactoryProxy.Companion.proxy(threadFactory, 2), rejectedExecutionHandler);
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        if (superThreadPool.isEnable(2) && !allowsCoreThreadTimeOut() && superThreadPool.getAllowAllCoreThreadTimeOut()) {
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long jMax = Math.max(30L, getKeepAliveTime(timeUnit2));
            setKeepAliveTime(jMax < 1 ? 1L : jMax, timeUnit2);
            try {
                allowCoreThreadTimeOut(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void allowCoreThreadTimeOut(boolean z) {
        try {
            SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
            if (superThreadPool.isEnable(2)) {
                z = !superThreadPool.getEnableBlockFetchTask() || z;
            }
            super.allowCoreThreadTimeOut(z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadPoolExecutorLancet_beforeExecute(this, thread, runnable);
    }

    public void com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__beforeExecute$___twin___(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
    }

    public void com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__execute$___twin___(Runnable runnable) {
        super.execute(runnable);
    }

    public Future<?> com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___(Runnable runnable) {
        return super.submit(runnable);
    }

    public <T> Future<T> com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___(Runnable runnable, T t) {
        return super.submit(runnable, t);
    }

    public <T> Future<T> com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___(Callable<T> callable) {
        return super.submit(callable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadPoolExecutorLancet_execute(this, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void finalize() {
        super.finalize();
        shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public BlockingQueue<Runnable> getQueue() {
        BlockingQueue<Runnable> queue = super.getQueue();
        return queue instanceof BlockingQueueProxy ? ((BlockingQueueProxy) queue).getDelegate$threadpool_plugin_base_release() : queue;
    }

    public final boolean isWorkQueueEmpty() {
        return getQueue().isEmpty();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void setThreadFactory(ThreadFactory threadFactory) {
        super.setThreadFactory(ThreadFactoryProxy.Companion.proxy(threadFactory, 2));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadPoolExecutorLancet_submit(this, runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadPoolExecutorLancet_submit(this, runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadPoolExecutorLancet_submit(this, callable);
    }

    public static void com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadPoolExecutorLancet_execute(PThreadPoolExecutor pThreadPoolExecutor, Runnable runnable) throws NoSuchMethodException {
        if (ThreadPoolCollector.enableMonitor() && C822670WOz.LIZ.get() == null) {
            ThreadPoolCollector.onTaskSubmit(pThreadPoolExecutor, runnable);
            try {
                if (C0WP0.LIZ(runnable)) {
                    C1BCA.LJJIIJZLJL(runnable);
                    return;
                } else {
                    pThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__execute$___twin___(runnable);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (th instanceof RejectedExecutionException) {
                    C2099408Ki.LIZ(pThreadPoolExecutor, runnable);
                }
                throw th;
            }
        }
        try {
            if (C0WP0.LIZ(runnable)) {
                C1BCA.LJJIIJZLJL(runnable);
            } else {
                pThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__execute$___twin___(runnable);
            }
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public static Future com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadPoolExecutorLancet_submit(PThreadPoolExecutor pThreadPoolExecutor, Runnable runnable) {
        if (ThreadPoolCollector.enableMonitor()) {
            ThreadLocal<Boolean> threadLocal = C822670WOz.LIZ;
            threadLocal.set(Boolean.TRUE);
            ThreadPoolCollector.onTaskSubmit(pThreadPoolExecutor, runnable);
            try {
                try {
                    if (!C0WP0.LIZ(runnable)) {
                        Future<?> futureCom_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___ = pThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___(runnable);
                        threadLocal.remove();
                        return futureCom_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___;
                    }
                    throw new UnsupportedOperationException("not support yet");
                } catch (RejectedExecutionException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2099408Ki.LIZ(pThreadPoolExecutor, runnable);
                    throw e;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C822670WOz.LIZ.remove();
                throw th;
            }
        }
        if (!C0WP0.LIZ(runnable)) {
            return pThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___(runnable);
        }
        throw new UnsupportedOperationException("not support yet");
    }

    public static Future com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadPoolExecutorLancet_submit(PThreadPoolExecutor pThreadPoolExecutor, Callable callable) {
        if (ThreadPoolCollector.enableMonitor()) {
            ThreadLocal<Boolean> threadLocal = C822670WOz.LIZ;
            threadLocal.set(Boolean.TRUE);
            ThreadPoolCollector.onTaskSubmit(pThreadPoolExecutor, callable);
            try {
                try {
                    if (!C0WP0.LIZIZ(callable)) {
                        Future futureCom_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___ = pThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___(callable);
                        threadLocal.remove();
                        return futureCom_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___;
                    }
                    throw new UnsupportedOperationException("not support yet");
                } catch (RejectedExecutionException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2099408Ki.LIZ(pThreadPoolExecutor, callable);
                    throw e;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C822670WOz.LIZ.remove();
                throw th;
            }
        }
        if (!C0WP0.LIZIZ(callable)) {
            return pThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___(callable);
        }
        throw new UnsupportedOperationException("not support yet");
    }

    public static void com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadPoolExecutorLancet_beforeExecute(PThreadPoolExecutor pThreadPoolExecutor, Thread thread, Runnable runnable) {
        if (ThreadPoolCollector.enableMonitor()) {
            ThreadPoolCollector.onBeforeTaskRun(pThreadPoolExecutor, runnable);
        }
        pThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__beforeExecute$___twin___(thread, runnable);
    }

    public static Future com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor_com_ss_android_ugc_aweme_lancet_schedule_PThreadPoolExecutorLancet_submit(PThreadPoolExecutor pThreadPoolExecutor, Runnable runnable, Object obj) {
        if (ThreadPoolCollector.enableMonitor()) {
            ThreadLocal<Boolean> threadLocal = C822670WOz.LIZ;
            threadLocal.set(Boolean.TRUE);
            ThreadPoolCollector.onTaskSubmit(pThreadPoolExecutor, runnable);
            try {
                try {
                    if (!C0WP0.LIZ(runnable)) {
                        Future futureCom_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___ = pThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___(runnable, obj);
                        threadLocal.remove();
                        return futureCom_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___;
                    }
                    throw new UnsupportedOperationException("not support yet");
                } catch (RejectedExecutionException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2099408Ki.LIZ(pThreadPoolExecutor, runnable);
                    throw e;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C822670WOz.LIZ.remove();
                throw th;
            }
        }
        if (!C0WP0.LIZ(runnable)) {
            return pThreadPoolExecutor.com_ss_android_ugc_bytex_pthread_base_proxy_PThreadPoolExecutor__submit$___twin___(runnable, obj);
        }
        throw new UnsupportedOperationException("not support yet");
    }
}

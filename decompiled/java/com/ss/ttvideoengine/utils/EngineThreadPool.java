package com.ss.ttvideoengine.utils;

import X.C1471660oOq;
import X.C2188811AlT;
import X.C822650WOx;
import X.RunnableC741900T8i;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class EngineThreadPool {
    public static volatile boolean mEnableLockOptimize;
    public static volatile ExecutorService mExecutorInstance;
    public static Deque<RunnableC741900T8i> mReadyRunnables = new ArrayDeque();
    public static Deque<RunnableC741900T8i> mRunningRunnables = new ArrayDeque();
    public static volatile boolean mEnableThreadPoolOptimize = true;

    public static int getPoolSize() {
        return 0;
    }

    public static void _promoteRunnable() {
        if (mReadyRunnables.size() > 0) {
            Iterator<RunnableC741900T8i> it2 = mReadyRunnables.iterator();
            if (it2.hasNext()) {
                RunnableC741900T8i next = it2.next();
                it2.remove();
                mRunningRunnables.add(next);
                mExecutorInstance.execute(next);
            }
        }
    }

    public static ExecutorService getExecutorInstance() {
        if (mExecutorInstance == null) {
            synchronized (EngineThreadPool.class) {
                try {
                    if (mExecutorInstance == null) {
                        if (mEnableThreadPoolOptimize) {
                            C1471660oOq.LIZJ("EngineThreadPool", "mEnableThreadPoolOptimize true");
                            C822650WOx c822650WOx = new C822650WOx(5, 5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                            c822650WOx.allowCoreThreadTimeOut(true);
                            mExecutorInstance = c822650WOx;
                        } else {
                            mExecutorInstance = new C822650WOx(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mExecutorInstance;
    }

    public static void shutdown() {
        if (mExecutorInstance != null) {
            mExecutorInstance.shutdown();
        }
    }

    public static synchronized void _finished(RunnableC741900T8i runnableC741900T8i) {
        mRunningRunnables.remove(runnableC741900T8i);
        _promoteRunnable();
    }

    public static Future addExecuteTask(Runnable runnable) {
        Future futureAddExecuteTaskInternal;
        if (mEnableLockOptimize) {
            return addExecuteTaskInternal(runnable);
        }
        synchronized (EngineThreadPool.class) {
            try {
                futureAddExecuteTaskInternal = addExecuteTaskInternal(runnable);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return futureAddExecuteTaskInternal;
    }

    public static Future addExecuteTaskInternal(final Runnable runnable) {
        if (runnable == null) {
            return null;
        }
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        if (mEnableThreadPoolOptimize) {
            return mExecutorInstance.submit(runnable);
        }
        synchronized (EngineThreadPool.class) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("running:");
                sbLIZ.append(mRunningRunnables.size());
                sbLIZ.append(", ready:");
                sbLIZ.append(mReadyRunnables.size());
                C1471660oOq.LIZJ("EngineThreadPool", C2188811AlT.LIZIZ(sbLIZ));
                Runnable runnable2 = new Runnable(runnable) { // from class: X.0T8i
                    public final Runnable LL;

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("EngineThreadPool$AsyncRunnable@66b9.run");
                        try {
                            this.LL.run();
                            EngineThreadPool._finished(this);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("EngineThreadPool$AsyncRunnable@66b9.run");
                    }

                    {
                        this.LL = runnable;
                    }
                };
                if (mRunningRunnables.size() >= 5) {
                    mReadyRunnables.add((RunnableC741900T8i) runnable2);
                    return null;
                }
                mRunningRunnables.add((RunnableC741900T8i) runnable2);
                return mExecutorInstance.submit(runnable2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void setExecutorInstance(ExecutorService executorService) {
        synchronized (EngineThreadPool.class) {
            try {
                mExecutorInstance = executorService;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static synchronized void setOptimizeEnabled(boolean z) {
        mEnableThreadPoolOptimize = z;
    }

    public static void setOptimizeLock(boolean z) {
        mEnableLockOptimize = z;
    }

    public static void setExecutorInstance(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (EngineThreadPool.class) {
            try {
                mExecutorInstance = threadPoolExecutor;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static Future addExecuteTaskSync(Runnable runnable, long j) {
        Future futureAddExecuteTaskSyncInternal;
        if (mEnableLockOptimize) {
            return addExecuteTaskSyncInternal(runnable, j);
        }
        synchronized (EngineThreadPool.class) {
            try {
                futureAddExecuteTaskSyncInternal = addExecuteTaskSyncInternal(runnable, j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return futureAddExecuteTaskSyncInternal;
    }

    public static Future addExecuteTaskSyncInternal(Runnable runnable, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addExecuteTaskSync timeout:");
        sbLIZ.append(j);
        C1471660oOq.LIZJ("EngineThreadPool", C2188811AlT.LIZIZ(sbLIZ));
        Future futureAddExecuteTaskInternal = addExecuteTaskInternal(runnable);
        if (futureAddExecuteTaskInternal != null) {
            try {
                futureAddExecuteTaskInternal.get(j, TimeUnit.MILLISECONDS);
                return futureAddExecuteTaskInternal;
            } catch (InterruptedException | ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                C1471660oOq.LIZIZ("EngineThreadPool", "set surface time out");
            }
        }
        return futureAddExecuteTaskInternal;
    }
}

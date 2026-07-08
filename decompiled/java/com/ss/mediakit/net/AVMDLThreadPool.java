package com.ss.mediakit.net;

import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C822650WOx;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class AVMDLThreadPool {
    public static volatile ThreadPoolExecutor mExecutorInstance;
    public static Deque<AsyncRunnable> mReadyRunnables = new ArrayDeque();
    public static Deque<AsyncRunnable> mRunningRunnables = new ArrayDeque();

    public static class AsyncRunnable implements Runnable {
        public Runnable mRunnable;

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("AVMDLThreadPool$AsyncRunnable@bf16.run");
            com_ss_mediakit_net_AVMDLThreadPool$AsyncRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("AVMDLThreadPool$AsyncRunnable@bf16.run");
        }

        public void com_ss_mediakit_net_AVMDLThreadPool$AsyncRunnable__run$___twin___() {
            this.mRunnable.run();
            AVMDLThreadPool._finished(this);
        }

        public AsyncRunnable(Runnable runnable) {
            this.mRunnable = runnable;
        }

        public static void com_ss_mediakit_net_AVMDLThreadPool$AsyncRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AsyncRunnable asyncRunnable) {
            try {
                asyncRunnable.com_ss_mediakit_net_AVMDLThreadPool$AsyncRunnable__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public static void _promoteRunnable() {
        if (mReadyRunnables.size() > 0) {
            Iterator<AsyncRunnable> it2 = mReadyRunnables.iterator();
            if (it2.hasNext()) {
                AsyncRunnable next = it2.next();
                it2.remove();
                mRunningRunnables.add(next);
                mExecutorInstance.execute(next);
            }
        }
    }

    public static ThreadPoolExecutor getExecutorInstance() {
        if (mExecutorInstance == null) {
            synchronized (AVMDLThreadPool.class) {
                try {
                    if (mExecutorInstance == null) {
                        mExecutorInstance = new C822650WOx(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mExecutorInstance;
    }

    public static int getPoolSize() {
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        return mExecutorInstance.getPoolSize();
    }

    public static void shutdown() {
        if (mExecutorInstance != null) {
            mExecutorInstance.shutdown();
        }
    }

    public static synchronized void _finished(AsyncRunnable asyncRunnable) {
        mRunningRunnables.remove(asyncRunnable);
        _promoteRunnable();
    }

    public static synchronized Future addExecuteTask(Runnable runnable) {
        if (runnable == null) {
            return null;
        }
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addExecuteTask,cur thread num:");
        sbLIZ.append(getPoolSize());
        AVMDLLog.d("AVMDLThreadPool", C2188811AlT.LIZIZ(sbLIZ));
        AsyncRunnable asyncRunnable = new AsyncRunnable(runnable);
        if (mRunningRunnables.size() >= 64) {
            mReadyRunnables.add(asyncRunnable);
            return null;
        }
        mRunningRunnables.add(asyncRunnable);
        return mExecutorInstance.submit(asyncRunnable);
    }

    public static void setExecutorInstance(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (AVMDLThreadPool.class) {
            try {
                mExecutorInstance = threadPoolExecutor;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

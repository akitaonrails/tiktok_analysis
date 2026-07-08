package com.ss.bduploader.net;

import X.C822650WOx;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class BDUploadThreadPool {
    public static volatile ThreadPoolExecutor mExecutorInstance;

    public static ThreadPoolExecutor getExecutorInstance() {
        if (mExecutorInstance == null) {
            synchronized (BDUploadThreadPool.class) {
                try {
                    if (mExecutorInstance == null) {
                        mExecutorInstance = new C822650WOx(3, Integer.MAX_VALUE, 300L, TimeUnit.SECONDS, new SynchronousQueue());
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

    public static Future addExecuteTask(Runnable runnable) {
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        return mExecutorInstance.submit(runnable);
    }
}

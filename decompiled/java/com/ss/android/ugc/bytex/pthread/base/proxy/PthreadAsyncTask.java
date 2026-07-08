package com.ss.android.ugc.bytex.pthread.base.proxy;

import android.os.AsyncTask;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public abstract class PthreadAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public static ThreadPoolExecutor THREAD_POOL_EXECUTOR_V2 = new PThreadPoolExecutor(15, 15, 3, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("PthreadAsyncTask"));

    public static void execute(Runnable runnable) {
        THREAD_POOL_EXECUTOR_V2.execute(runnable);
    }

    public static void setMaxAsyncTaskThreadCount(int i) {
        THREAD_POOL_EXECUTOR_V2.setCorePoolSize(i);
        THREAD_POOL_EXECUTOR_V2.setMaximumPoolSize(i);
    }

    public final AsyncTask<Params, Progress, Result> execute1(Params... paramsArr) {
        return executeOnExecutor(THREAD_POOL_EXECUTOR_V2, paramsArr);
    }
}

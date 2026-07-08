package com.ss.android.ugc.bytex.pthread.base.convergence;

import com.ss.android.ugc.bytex.pthread.base.convergence.executor.DefaultThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.convergence.executor.IExecutor;
import com.ss.android.ugc.bytex.pthread.base.convergence.external.ThreadLifecycleObserver;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;

/* JADX INFO: loaded from: classes14.dex */
public final class SuperThreadPool {
    public static boolean enableMonitor;
    public static boolean enableNewMonitor;
    public static int enableThreadGroupOptType;
    public static boolean enableThreadProxyPriority;
    public static boolean forceSetPriority;
    public static volatile int mEnable;
    public static ThreadLifecycleObserver threadLifecycleObserver;
    public static final SuperThreadPool INSTANCE = new SuperThreadPool();
    public static IExecutor mExecutor = new DefaultThreadPoolExecutor();
    public static long minDispatchDelay = 20;
    public static boolean enableBlockFetchTask = true;
    public static boolean allowAllCoreThreadTimeOut = true;
    public static boolean enablePriority = true;
    public static long scheduledThreadPoolMaxKeepAliveTime = 10;

    public final void execute(Runnable runnable) {
        mExecutor.execute(runnable);
    }

    public final boolean getAllowAllCoreThreadTimeOut() {
        return allowAllCoreThreadTimeOut;
    }

    public final boolean getEnableBlockFetchTask() {
        return enableBlockFetchTask;
    }

    public final boolean getEnableMonitor() {
        return enableMonitor;
    }

    public final boolean getEnableNewMonitor() {
        return enableNewMonitor;
    }

    public final boolean getEnablePriority() {
        return enablePriority;
    }

    public final int getEnableThreadGroupOptType() {
        return enableThreadGroupOptType;
    }

    public final boolean getEnableThreadProxyPriority() {
        return enableThreadProxyPriority;
    }

    public final boolean getForceSetPriority() {
        return forceSetPriority;
    }

    public final long getMinDispatchDelay() {
        return minDispatchDelay;
    }

    public final long getScheduledThreadPoolMaxKeepAliveTime() {
        return scheduledThreadPoolMaxKeepAliveTime;
    }

    public final ThreadLifecycleObserver getThreadLifecycleObserver() {
        return threadLifecycleObserver;
    }

    public final boolean isEnable(int i) {
        return (mEnable & i) == i;
    }

    public final void setAllowAllCoreThreadTimeOut(boolean z) {
        allowAllCoreThreadTimeOut = z;
    }

    public final void setEnableBlockFetchTask(boolean z) {
        enableBlockFetchTask = z;
    }

    public final void setEnableMonitor(boolean z) {
        enableMonitor = z;
    }

    public final void setEnableNewMonitor(boolean z) {
        enableNewMonitor = z;
    }

    public final void setEnablePriority(boolean z) {
        enablePriority = z;
    }

    public final void setEnableThreadGroupOptType(int i) {
        enableThreadGroupOptType = i;
    }

    public final void setEnableThreadProxyPriority(boolean z) {
        enableThreadProxyPriority = z;
    }

    public final void setEnableType(int i) {
        mEnable = i;
    }

    public final void setExecutor(IExecutor iExecutor) {
        mExecutor = iExecutor;
    }

    public final void setForceSetPriority(boolean z) {
        forceSetPriority = z;
    }

    public final void setMaxAsyncTaskThreadCount(int i) {
        PthreadAsyncTask.setMaxAsyncTaskThreadCount(i);
    }

    public final void setMinDispatchDelay(long j) {
        minDispatchDelay = j;
    }

    public final void setScheduledThreadPoolMaxKeepAliveTime(long j) {
        scheduledThreadPoolMaxKeepAliveTime = j;
    }

    public final void setThreadLifecycleObserver(ThreadLifecycleObserver threadLifecycleObserver2) {
        threadLifecycleObserver = threadLifecycleObserver2;
    }
}

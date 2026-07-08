package com.ss.android.ugc.bytex.pthread.base.convergence.helper;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import com.ss.android.ugc.bytex.pthread.base.convergence.external.ThreadLifecycleObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public final class ThreadWorker implements Runnable {
    public final Function1<Thread, Unit> callback;
    public final Thread delegate;
    public final boolean skipSetPriority;

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadWorker(Thread thread, boolean z, Function1<? super Thread, Unit> function1) {
        this.delegate = thread;
        this.skipSetPriority = z;
        this.callback = function1;
    }

    @Override // java.lang.Runnable
    public void run() throws IllegalAccessException {
        SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
        ThreadLifecycleObserver threadLifecycleObserver = superThreadPool.getThreadLifecycleObserver();
        Thread threadCurrentThread = Thread.currentThread();
        int priority = this.delegate.getPriority();
        try {
            threadCurrentThread.setName(this.delegate.getName());
            if (!this.skipSetPriority && superThreadPool.getEnablePriority() && (superThreadPool.getForceSetPriority() || threadCurrentThread.getPriority() != priority)) {
                threadCurrentThread.setPriority(priority);
            }
            if (threadLifecycleObserver != null) {
                threadLifecycleObserver.onAttach(threadCurrentThread, this.delegate);
            }
            this.callback.invoke(threadCurrentThread);
            ThreadLocalCleaner.INSTANCE.clear();
            if (threadLifecycleObserver != null) {
                threadLifecycleObserver.onDetach(threadCurrentThread, this.delegate);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ThreadLocalCleaner.INSTANCE.clear();
            if (threadLifecycleObserver != null) {
                threadLifecycleObserver.onDetach(threadCurrentThread, this.delegate);
            }
            throw th;
        }
    }
}

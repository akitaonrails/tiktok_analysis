package com.ss.android.ugc.bytex.pthread.base.convergence.hook;

import java.lang.Thread;

/* JADX INFO: loaded from: classes14.dex */
public final class ThreadMethodProxy {
    public static final ThreadMethodProxy INSTANCE = new ThreadMethodProxy();

    public static final int countStackFrames(Thread thread) {
        Thread attachThread;
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            thread = attachThread;
        }
        return thread.countStackFrames();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final IThreadProxy getProxy(Thread thread) {
        if (thread instanceof IThreadProxyProvider) {
            return ((IThreadProxyProvider) thread).getProxy();
        }
        if (thread instanceof IThreadProxy) {
            return (IThreadProxy) thread;
        }
        return null;
    }

    public static final StackTraceElement[] getStackTrace(Thread thread) {
        Thread attachThread;
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            thread = attachThread;
        }
        return thread.getStackTrace();
    }

    public static final Thread.State getState(Thread thread) {
        Thread attachThread;
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            thread = attachThread;
        }
        return thread.getState();
    }

    public static final boolean isAlive(Thread thread) {
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        return proxy != null ? proxy.isRealAlive() : thread.isAlive();
    }

    public static final void join(Thread thread) throws InterruptedException {
        Thread attachThread;
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            thread = attachThread;
        }
        thread.join();
    }

    public static final void join(Thread thread, long j) throws InterruptedException {
        Thread attachThread;
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            thread = attachThread;
        }
        thread.join(j);
    }

    public static final void join(Thread thread, long j, int i) throws InterruptedException {
        Thread attachThread;
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            thread = attachThread;
        }
        thread.join(j, i);
    }

    public static final void setName(Thread thread, String str) {
        Thread attachThread;
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            attachThread.setName(str);
        }
        thread.setName(str);
    }

    public static final void setPriority(Thread thread, int i) {
        Thread attachThread;
        IThreadProxy proxy = INSTANCE.getProxy(thread);
        if (proxy != null && (attachThread = proxy.getAttachThread()) != null) {
            attachThread.setPriority(i);
        }
        thread.setPriority(i);
    }
}

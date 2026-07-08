package com.ss.android.ugc.bytex.pthread.base.proxy;

import X.C01GW;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC2217461Bqa;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxy;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxyProvider;

/* JADX INFO: loaded from: classes14.dex */
public class PthreadThread extends Thread implements IThreadProxyProvider {
    public static final /* synthetic */ InterfaceC2217461Bqa[] $$delegatedProperties;
    public final C01GW mThreadProxy$delegate;
    public Runnable task;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C13LE.LIZ(PthreadThread.class), "mThreadProxy", "getMThreadProxy()Ljava/lang/Thread;");
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PthreadThread() {
        this.mThreadProxy$delegate = C452501pT.LIZIZ(new PthreadThread$mThreadProxy$2(this));
    }

    public PthreadThread(Runnable runnable) {
        super(runnable);
        this.mThreadProxy$delegate = C452501pT.LIZIZ(new PthreadThread$mThreadProxy$2(this));
        setTask(runnable);
    }

    public PthreadThread(Runnable runnable, String str) {
        super(runnable, str);
        this.mThreadProxy$delegate = C452501pT.LIZIZ(new PthreadThread$mThreadProxy$2(this));
        setTask(runnable);
    }

    public PthreadThread(String str) {
        super(str);
        this.mThreadProxy$delegate = C452501pT.LIZIZ(new PthreadThread$mThreadProxy$2(this));
    }

    public PthreadThread(ThreadGroup threadGroup, Runnable runnable) {
        super(threadGroup, runnable);
        this.mThreadProxy$delegate = C452501pT.LIZIZ(new PthreadThread$mThreadProxy$2(this));
        setTask(runnable);
    }

    public PthreadThread(ThreadGroup threadGroup, Runnable runnable, String str) {
        super(threadGroup, runnable, str);
        this.mThreadProxy$delegate = C452501pT.LIZIZ(new PthreadThread$mThreadProxy$2(this));
        setTask(runnable);
    }

    public PthreadThread(ThreadGroup threadGroup, Runnable runnable, String str, long j) {
        super(threadGroup, runnable, str, j);
        this.mThreadProxy$delegate = C452501pT.LIZIZ(new PthreadThread$mThreadProxy$2(this));
        setTask(runnable);
    }

    public PthreadThread(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
        this.mThreadProxy$delegate = C452501pT.LIZIZ(new PthreadThread$mThreadProxy$2(this));
    }

    private final Thread getMThreadProxy() {
        C01GW c01gw = this.mThreadProxy$delegate;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = $$delegatedProperties;
        return (Thread) c01gw.getValue();
    }

    public synchronized void com_ss_android_ugc_bytex_pthread_base_proxy_PthreadThread__start$___twin___() {
        Thread mThreadProxy = getMThreadProxy();
        if (mThreadProxy != null) {
            mThreadProxy.start();
        } else {
            super.start();
        }
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxyProvider
    public IThreadProxy getProxy() {
        Object mThreadProxy = getMThreadProxy();
        if (!(mThreadProxy instanceof IThreadProxy)) {
            mThreadProxy = null;
        }
        return (IThreadProxy) mThreadProxy;
    }

    public final Runnable getScheduleTask() {
        return getTask();
    }

    public Runnable getTask() {
        return this.task;
    }

    @Override // java.lang.Thread
    public void interrupt() {
        Thread mThreadProxy = getMThreadProxy();
        if (mThreadProxy != null) {
            mThreadProxy.interrupt();
        } else {
            super.interrupt();
        }
    }

    @Override // java.lang.Thread
    public boolean isInterrupted() {
        Thread mThreadProxy = getMThreadProxy();
        return mThreadProxy != null ? mThreadProxy.isInterrupted() : super.isInterrupted();
    }

    public void setTask(Runnable runnable) {
        this.task = runnable;
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        com_ss_android_ugc_bytex_pthread_base_proxy_PthreadThread_com_ss_android_ugc_aweme_lancet_schedule_PthreadThreadLancet_start(this);
    }

    public static void com_ss_android_ugc_bytex_pthread_base_proxy_PthreadThread_com_ss_android_ugc_aweme_lancet_schedule_PthreadThreadLancet_start(PthreadThread pthreadThread) {
        pthreadThread.com_ss_android_ugc_bytex_pthread_base_proxy_PthreadThread__start$___twin___();
    }
}

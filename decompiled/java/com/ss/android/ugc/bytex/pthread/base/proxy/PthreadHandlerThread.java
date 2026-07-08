package com.ss.android.ugc.bytex.pthread.base.proxy;

import X.C01GW;
import X.C13LE;
import X.C1C7U;
import X.C2179971ATj;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC2217461Bqa;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxy;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxyProvider;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class PthreadHandlerThread extends HandlerThread implements IThreadProxyProvider {
    public static final /* synthetic */ InterfaceC2217461Bqa[] $$delegatedProperties;
    public final Object mLock;
    public Looper mLooper;
    public int mPriority;
    public final C01GW mThreadProxy$delegate;
    public int mTid;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C13LE.LIZ(PthreadHandlerThread.class), "mThreadProxy", "getMThreadProxy()Ljava/lang/Thread;");
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PthreadHandlerThread(String str) {
        super(str);
        this.mTid = -1;
        this.mLock = new Object();
        this.mThreadProxy$delegate = C452501pT.LIZIZ(new AwS557S0100000_13(this, 132));
    }

    public PthreadHandlerThread(String str, int i) {
        super(str, i);
        this.mTid = -1;
        this.mLock = new Object();
        this.mThreadProxy$delegate = C452501pT.LIZIZ(new AwS557S0100000_13(this, 132));
    }

    private final Thread getMThreadProxy() {
        C01GW c01gw = this.mThreadProxy$delegate;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = $$delegatedProperties;
        return (Thread) c01gw.getValue();
    }

    public void com_ss_android_ugc_bytex_pthread_base_proxy_PthreadHandlerThread__run$___twin___() {
        this.mTid = Process.myTid();
        Looper.prepare();
        synchronized (this.mLock) {
            try {
                this.mLooper = Looper.myLooper();
                this.mLock.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Process.setThreadPriority(this.mPriority);
        onLooperPrepared();
        Looper.loop();
        this.mTid = -1;
    }

    @Override // android.os.HandlerThread
    public Looper getLooper() {
        Looper looper = this.mLooper;
        if (looper != null) {
            return looper;
        }
        synchronized (this.mLock) {
            try {
                if (this.mLooper == null) {
                    this.mLock.wait();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Looper looper2 = this.mLooper;
        if (looper2 == null) {
            Intrinsics.LJIIL();
        }
        return looper2;
    }

    public final Looper getMLooper() {
        return this.mLooper;
    }

    public final int getMTid() {
        return this.mTid;
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxyProvider
    public IThreadProxy getProxy() {
        Object mThreadProxy = getMThreadProxy();
        if (!(mThreadProxy instanceof IThreadProxy)) {
            mThreadProxy = null;
        }
        return (IThreadProxy) mThreadProxy;
    }

    @Override // android.os.HandlerThread
    public int getThreadId() {
        return this.mTid;
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

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        C1C7U.LIZ("PthreadHandlerThread@da0.run");
        com_ss_android_ugc_bytex_pthread_base_proxy_PthreadHandlerThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        C1C7U.LIZIZ("PthreadHandlerThread@da0.run");
    }

    public final void setMLooper(Looper looper) {
        this.mLooper = looper;
    }

    public final void setMTid(int i) {
        this.mTid = i;
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        Thread mThreadProxy = getMThreadProxy();
        if (mThreadProxy != null) {
            mThreadProxy.start();
        } else {
            super.start();
        }
    }

    public static void com_ss_android_ugc_bytex_pthread_base_proxy_PthreadHandlerThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(PthreadHandlerThread pthreadHandlerThread) {
        try {
            pthreadHandlerThread.com_ss_android_ugc_bytex_pthread_base_proxy_PthreadHandlerThread__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }
}

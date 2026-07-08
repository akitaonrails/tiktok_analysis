package com.ss.android.ugc.bytex.pthread.base.convergence.hook;

import X.C2188811AlT;
import X.C238400w2;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import com.ss.android.ugc.bytex.pthread.base.convergence.helper.ThreadGroupUtils;
import com.ss.android.ugc.bytex.pthread.base.convergence.helper.ThreadWorker;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS379S0200000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class ThreadProxy extends BPEAThread implements IThreadProxy {
    public static final Companion Companion = new Companion();
    public volatile Thread mAttachThread;
    public final Thread mDelegate;
    public final AtomicInteger mRunState;
    public final boolean mSkipSetPriority;

    public static final class Companion {
    }

    public ThreadProxy(Thread thread, boolean z) {
        super(ThreadGroupUtils.INSTANCE.getCacheThreadGroup(), "");
        this.mDelegate = thread;
        this.mSkipSetPriority = z;
        if (SuperThreadPool.INSTANCE.getEnableThreadProxyPriority() && getPriority() != thread.getPriority()) {
            setPriority(thread.getPriority());
        }
        this.mRunState = new AtomicInteger(0);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxy
    public Thread getAttachThread() {
        return this.mAttachThread;
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread, java.lang.Thread
    public void interrupt() {
        Thread thread = this.mAttachThread;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread, java.lang.Thread
    public boolean isInterrupted() {
        Thread thread = this.mAttachThread;
        if (thread != null) {
            return thread.isInterrupted();
        }
        return false;
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.hook.IThreadProxy
    public boolean isRealAlive() {
        return this.mRunState.get() > 0;
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread, java.lang.Thread
    public synchronized void start() {
        if (this.mRunState.compareAndSet(0, 1)) {
            C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = 0L;
            SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
            if (superThreadPool.getEnableMonitor()) {
                c238400w2.element = System.currentTimeMillis();
            }
            superThreadPool.execute(new ThreadWorker(this.mDelegate, this.mSkipSetPriority, new AwS379S0200000_13(this, c238400w2, 5)));
        }
    }

    @Override // java.lang.Thread
    public String toString() {
        if (SuperThreadPool.INSTANCE.getEnableThreadGroupOptType() <= 0) {
            return super.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Thread[");
        sbLIZ.append(getName());
        sbLIZ.append(',');
        sbLIZ.append(getPriority());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

package com.ss.android.ugc.bytex.thread_rename.base;

import X.C2188811AlT;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultThreadFactory implements ThreadFactory {
    public final ThreadGroup group;
    public final String namePrefix;
    public final AtomicInteger threadNumber = new AtomicInteger(1);

    public DefaultThreadFactory(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.group = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.namePrefix = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.group;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.namePrefix);
        sbLIZ.append(this.threadNumber.getAndIncrement());
        BPEAThread bPEAThread = new BPEAThread(threadGroup, runnable, C2188811AlT.LIZIZ(sbLIZ), 0L);
        if (bPEAThread.isDaemon()) {
            bPEAThread.setDaemon(false);
        }
        if (bPEAThread.getPriority() != 5) {
            ThreadMethodProxy.setPriority(bPEAThread, 5);
        }
        return bPEAThread;
    }
}

package com.ss.android.ugc.bytex.pthread.base.convergence.monitor;

/* JADX INFO: loaded from: classes14.dex */
public final class ThreadStartMonitor implements IThreadStartMonitor {
    public static final ThreadStartMonitor INSTANCE = new ThreadStartMonitor();
    public static IThreadStartMonitor delegate;

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.monitor.IThreadStartMonitor
    public void onNewThreadCountMonitor() {
        IThreadStartMonitor iThreadStartMonitor = delegate;
        if (iThreadStartMonitor != null) {
            iThreadStartMonitor.onNewThreadCountMonitor();
        }
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.monitor.IThreadStartMonitor
    public void onNewThreadMonitor(long j, String str) {
        IThreadStartMonitor iThreadStartMonitor = delegate;
        if (iThreadStartMonitor != null) {
            iThreadStartMonitor.onNewThreadMonitor(j, str);
        }
    }

    public final void setDelegate(IThreadStartMonitor iThreadStartMonitor) {
        delegate = iThreadStartMonitor;
    }
}
